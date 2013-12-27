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

package com.liferay.contenttargeting.service.impl;

import aQute.bnd.annotation.component.Component;
import com.liferay.contenttargeting.model.UserSegment;
import com.liferay.contenttargeting.service.base.UserSegmentServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the user segment remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.contenttargeting.service.UserSegmentService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.contenttargeting.service.base.UserSegmentServiceBaseImpl
 * @see com.liferay.contenttargeting.service.UserSegmentServiceUtil
 */
public class UserSegmentServiceImpl extends UserSegmentServiceBaseImpl {

	@Override
	public UserSegment addUserSegment(
			String name, String description, ServiceContext serviceContext)
		throws PortalException, SystemException {

		return userSegmentLocalService.addUserSegment(
			getUserId(), name, description, serviceContext);
	}

}