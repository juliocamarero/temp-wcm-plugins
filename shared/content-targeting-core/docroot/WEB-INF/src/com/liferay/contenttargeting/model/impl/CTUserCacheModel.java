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

import com.liferay.contenttargeting.model.CTUser;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CTUser in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CTUser
 * @generated
 */
public class CTUserCacheModel implements CacheModel<CTUser>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", CTUserId=");
		sb.append(CTUserId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", lastIp=");
		sb.append(lastIp);
		sb.append(", typeSettings=");
		sb.append(typeSettings);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CTUser toEntityModel() {
		CTUserImpl ctUserImpl = new CTUserImpl();

		if (uuid == null) {
			ctUserImpl.setUuid(StringPool.BLANK);
		}
		else {
			ctUserImpl.setUuid(uuid);
		}

		ctUserImpl.setCTUserId(CTUserId);
		ctUserImpl.setGroupId(groupId);
		ctUserImpl.setCompanyId(companyId);
		ctUserImpl.setUserId(userId);

		if (userName == null) {
			ctUserImpl.setUserName(StringPool.BLANK);
		}
		else {
			ctUserImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ctUserImpl.setCreateDate(null);
		}
		else {
			ctUserImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ctUserImpl.setModifiedDate(null);
		}
		else {
			ctUserImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (lastIp == null) {
			ctUserImpl.setLastIp(StringPool.BLANK);
		}
		else {
			ctUserImpl.setLastIp(lastIp);
		}

		if (typeSettings == null) {
			ctUserImpl.setTypeSettings(StringPool.BLANK);
		}
		else {
			ctUserImpl.setTypeSettings(typeSettings);
		}

		ctUserImpl.resetOriginalValues();

		return ctUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		CTUserId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		lastIp = objectInput.readUTF();
		typeSettings = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(CTUserId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (lastIp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastIp);
		}

		if (typeSettings == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeSettings);
		}
	}

	public String uuid;
	public long CTUserId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String lastIp;
	public String typeSettings;
}