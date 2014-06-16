/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.contenttargeting.hook.filter;

import com.liferay.anonymoususers.model.AnonymousUser;
import com.liferay.anonymoususers.util.AnonymousUsersManager;
import com.liferay.contenttargeting.api.model.RulesEngine;
import com.liferay.contenttargeting.api.model.UserSegmentSimulator;
import com.liferay.contenttargeting.model.UserSegment;
import com.liferay.contenttargeting.service.UserSegmentLocalServiceUtil;
import com.liferay.contenttargeting.util.ContentTargetingUtil;
import com.liferay.contenttargeting.util.WebKeys;
import com.liferay.osgi.util.service.ServiceTrackerUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.LayoutSet;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * @author Eudaldo Alonso
 */
public class UserSegmentFilter implements Filter {

	public void destroy() {
	}

	@Override
	public void doFilter(
			ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain filterChain)
		throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest)servletRequest;

		HttpServletResponse response = (HttpServletResponse)servletResponse;

		long[] userSegmentsIds = getUserSegmentIds(request, response);

		if (ArrayUtil.isNotEmpty(userSegmentsIds)) {
			request.setAttribute(WebKeys.USER_SEGMENT_IDS, userSegmentsIds);
		}

		filterChain.doFilter(servletRequest, servletResponse);
	}

	public long[] getMatchesUserSegmentIds(
			long[] groupIds, AnonymousUser anonymousUser)
		throws Exception {

		if (ArrayUtil.isEmpty(groupIds)) {
			return null;
		}

		List<Long> userSegmentIds = new ArrayList<Long>();

		List<UserSegment> userSegments =
			UserSegmentLocalServiceUtil.getUserSegments(groupIds);

		for (UserSegment userSegment : userSegments) {
			if (matches(anonymousUser, userSegment)) {
				userSegmentIds.add(userSegment.getUserSegmentId());
			}
		}

		return ArrayUtil.toLongArray(userSegmentIds);
	}

	@Override
	public void init(FilterConfig filterConfig) {
		_intiAnonymousUserManager();
		_intiRulesEngine();
	}

	public boolean matches(AnonymousUser anonymousUser, UserSegment userSegment)
		throws Exception {

		if (_rulesEngine == null) {
			_intiRulesEngine();
		}

		return _rulesEngine.matches(
			anonymousUser, userSegment.getRuleInstances());
	}

	protected long[] getGroupIds(HttpServletRequest request)
		throws PortalException, SystemException {

		String pathInfo = request.getPathInfo();

		int pos = pathInfo.indexOf(CharPool.SLASH, 1);

		String friendlyURL = null;

		if (pos != -1) {
			friendlyURL = pathInfo.substring(0, pos);
		}
		else if (pathInfo.length() > 1) {
			friendlyURL = pathInfo;
		}

		long groupId = 0;

		if (!Validator.isNull(friendlyURL)) {
			long companyId = PortalUtil.getCompanyId(request);

			try {
				Group group = GroupLocalServiceUtil.getFriendlyURLGroup(
					companyId, friendlyURL);

				groupId = group.getGroupId();
			}
			catch (Exception e) {
				if (_log.isWarnEnabled()) {
					_log.warn(e);
				}
			}
		}

		if (groupId == 0) {
			LayoutSet layoutSet = (LayoutSet)request.getAttribute(
					"VIRTUAL_HOST_LAYOUT_SET");

			if (layoutSet == null) {
				return null;
			}

			groupId = layoutSet.getGroupId();
		}

		return ContentTargetingUtil.getAncestorsAndCurrentGroupIds(groupId);
	}

	protected long[] getUserSegmentIds(
		HttpServletRequest request, HttpServletResponse response) {

		if (_userSegmentSimulator == null) {
			_initUserSegmentSimulator();
		}

		long[] userSegmentsIds = _userSegmentSimulator.getUserSegmentIds(
			request, response);

		if (userSegmentsIds != null) {
			request.setAttribute(WebKeys.IS_SIMULATED_USER_SEGMENTS, true);

			return userSegmentsIds;
		}

		if (_anonymousUsersManager == null) {
			_intiAnonymousUserManager();
		}

		try {
			AnonymousUser anonymousUser =
				_anonymousUsersManager.getAnonymousUser(request, response);

			long[] groupIds = getGroupIds(request);

			return getMatchesUserSegmentIds(groupIds, anonymousUser);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private void _initUserSegmentSimulator() {
		Bundle bundle = FrameworkUtil.getBundle(getClass());

		_userSegmentSimulator = ServiceTrackerUtil.getService(
			UserSegmentSimulator.class, bundle.getBundleContext());
	}

	private void _intiAnonymousUserManager() {
		Bundle bundle = FrameworkUtil.getBundle(getClass());

		_anonymousUsersManager = ServiceTrackerUtil.getService(
			AnonymousUsersManager.class, bundle.getBundleContext());
	}

	private void _intiRulesEngine() {
		Bundle bundle = FrameworkUtil.getBundle(getClass());

		_rulesEngine = ServiceTrackerUtil.getService(
			RulesEngine.class, bundle.getBundleContext());
	}

	private static Log _log = LogFactoryUtil.getLog(UserSegmentFilter.class);

	private AnonymousUsersManager _anonymousUsersManager;
	private RulesEngine _rulesEngine;
	private UserSegmentSimulator _userSegmentSimulator;

}