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

package com.liferay.contenttargeting.service.http;

import com.liferay.contenttargeting.service.UserSegmentServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.contenttargeting.service.UserSegmentServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.contenttargeting.model.UserSegmentSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.contenttargeting.model.UserSegment}, that is translated to a
 * {@link com.liferay.contenttargeting.model.UserSegmentSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserSegmentServiceHttp
 * @see com.liferay.contenttargeting.model.UserSegmentSoap
 * @see com.liferay.contenttargeting.service.UserSegmentServiceUtil
 * @generated
 */
public class UserSegmentServiceSoap {
	public static com.liferay.contenttargeting.model.UserSegmentSoap addUserSegment(
		long userId, java.lang.String name, java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.contenttargeting.model.UserSegment returnValue = UserSegmentServiceUtil.addUserSegment(userId,
					name, description, serviceContext);

			return com.liferay.contenttargeting.model.UserSegmentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.contenttargeting.model.UserSegmentSoap deleteUserSegment(
		long userSegmentId) throws RemoteException {
		try {
			com.liferay.contenttargeting.model.UserSegment returnValue = UserSegmentServiceUtil.deleteUserSegment(userSegmentId);

			return com.liferay.contenttargeting.model.UserSegmentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.contenttargeting.model.UserSegmentSoap[] getUserSegments(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.liferay.contenttargeting.model.UserSegment> returnValue =
				UserSegmentServiceUtil.getUserSegments(groupId);

			return com.liferay.contenttargeting.model.UserSegmentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static long getUserSegmentsCount(long groupId)
		throws RemoteException {
		try {
			long returnValue = UserSegmentServiceUtil.getUserSegmentsCount(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.contenttargeting.model.UserSegmentSoap updateUserSegment(
		long userSegmentId, java.lang.String name,
		java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.contenttargeting.model.UserSegment returnValue = UserSegmentServiceUtil.updateUserSegment(userSegmentId,
					name, description, serviceContext);

			return com.liferay.contenttargeting.model.UserSegmentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(UserSegmentServiceSoap.class);
}