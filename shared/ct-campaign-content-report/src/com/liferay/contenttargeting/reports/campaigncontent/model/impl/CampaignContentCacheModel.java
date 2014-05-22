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

package com.liferay.contenttargeting.reports.campaigncontent.model.impl;

import com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CampaignContent in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CampaignContent
 * @generated
 */
public class CampaignContentCacheModel implements CacheModel<CampaignContent>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", campaignId=");
		sb.append(campaignId);
		sb.append(", className=");
		sb.append(className);
		sb.append(", classPK=");
		sb.append(classPK);
		sb.append(", eventType=");
		sb.append(eventType);
		sb.append(", count=");
		sb.append(count);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CampaignContent toEntityModel() {
		CampaignContentImpl campaignContentImpl = new CampaignContentImpl();

		campaignContentImpl.setId(id);
		campaignContentImpl.setCampaignId(campaignId);

		if (className == null) {
			campaignContentImpl.setClassName(StringPool.BLANK);
		}
		else {
			campaignContentImpl.setClassName(className);
		}

		campaignContentImpl.setClassPK(classPK);

		if (eventType == null) {
			campaignContentImpl.setEventType(StringPool.BLANK);
		}
		else {
			campaignContentImpl.setEventType(eventType);
		}

		campaignContentImpl.setCount(count);

		if (createDate == Long.MIN_VALUE) {
			campaignContentImpl.setCreateDate(null);
		}
		else {
			campaignContentImpl.setCreateDate(new Date(createDate));
		}

		campaignContentImpl.resetOriginalValues();

		return campaignContentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		campaignId = objectInput.readLong();
		className = objectInput.readUTF();
		classPK = objectInput.readLong();
		eventType = objectInput.readUTF();
		count = objectInput.readInt();
		createDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(campaignId);

		if (className == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(className);
		}

		objectOutput.writeLong(classPK);

		if (eventType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eventType);
		}

		objectOutput.writeInt(count);
		objectOutput.writeLong(createDate);
	}

	public long id;
	public long campaignId;
	public String className;
	public long classPK;
	public String eventType;
	public int count;
	public long createDate;
}