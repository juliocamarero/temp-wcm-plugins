/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.contenttargeting.portlet;

import com.liferay.contenttargeting.NoSuchUserSegmentException;
import com.liferay.contenttargeting.model.UserSegment;
import com.liferay.contenttargeting.service.UserSegmentLocalServiceUtil;
import com.liferay.contenttargeting.service.UserSegmentServiceUtil;
import com.liferay.contenttargeting.util.WebKeys;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.freemarker.FreeMarkerPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author Eduardo Garcia
 */
public class ContentTargetingPortlet extends FreeMarkerPortlet {

	public void addUserSegment(ActionRequest request, ActionResponse response)
		throws Exception {

		String name = ParamUtil.getString(request, "name");
		String description = ParamUtil.getString(request, "description");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			UserSegment.class.getName(), request);

		try {
			UserSegmentServiceUtil.addUserSegment(
				name, description, serviceContext);

			String redirect = ParamUtil.getString(request, "redirect");

			response.sendRedirect(redirect);
		}
		catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());

			if (e instanceof PrincipalException) {
				response.setRenderParameter(
					"mvcPath", "/html/user_segment/edit_user_segment.ftl");
			}
			else {
				response.setRenderParameter("mvcPath", "/error.ftl");
			}
		}
	}

	@Override
	public void render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		try {
			getUserSegment(renderRequest);
		}
		catch (Exception e) {
			if (e instanceof NoSuchUserSegmentException ||
				e instanceof PrincipalException) {

				SessionErrors.add(renderRequest, e.getClass());
			}
			else {
				throw new PortletException(e);
			}
		}

		super.render(renderRequest, renderResponse);
	}

	protected void getUserSegment(PortletRequest portletRequest)
		throws Exception {

		long userSegmentId = ParamUtil.getLong(portletRequest, "userSegmentId");

		if (userSegmentId <= 0) {
			return;
		}

		UserSegment userSegment = UserSegmentLocalServiceUtil.getUserSegment(
			userSegmentId);

		portletRequest.setAttribute(WebKeys.USER_SEGMENT, userSegment);
	}

}