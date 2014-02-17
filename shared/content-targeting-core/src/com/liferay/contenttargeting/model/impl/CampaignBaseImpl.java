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

package com.liferay.contenttargeting.model.impl;

import com.liferay.contenttargeting.model.Campaign;
import com.liferay.contenttargeting.service.CampaignLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Campaign service. Represents a row in the &quot;CT_Campaign&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CampaignImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CampaignImpl
 * @see com.liferay.contenttargeting.model.Campaign
 * @generated
 */
public abstract class CampaignBaseImpl extends CampaignModelImpl
	implements Campaign {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a campaign model instance should use the {@link Campaign} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CampaignLocalServiceUtil.addCampaign(this);
		}
		else {
			CampaignLocalServiceUtil.updateCampaign(this);
		}
	}
}