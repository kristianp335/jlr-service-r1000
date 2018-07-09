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

package com.liferay.kris.jlr.r1000.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.kris.jlr.r1000.model.R1000;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing R1000 in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see R1000
 * @generated
 */
@ProviderType
public class R1000CacheModel implements CacheModel<R1000>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof R1000CacheModel)) {
			return false;
		}

		R1000CacheModel r1000CacheModel = (R1000CacheModel)obj;

		if (r1000Id == r1000CacheModel.r1000Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, r1000Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", r1000Id=");
		sb.append(r1000Id);
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
		sb.append(", period=");
		sb.append(period);
		sb.append(", dealer=");
		sb.append(dealer);
		sb.append(", partCategory=");
		sb.append(partCategory);
		sb.append(", repairCount=");
		sb.append(repairCount);
		sb.append(", visitCount=");
		sb.append(visitCount);
		sb.append(", conCode=");
		sb.append(conCode);
		sb.append(", percentage=");
		sb.append(percentage);
		sb.append(", percentage1=");
		sb.append(percentage1);
		sb.append(", percentage2=");
		sb.append(percentage2);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public R1000 toEntityModel() {
		R1000Impl r1000Impl = new R1000Impl();

		if (uuid == null) {
			r1000Impl.setUuid(StringPool.BLANK);
		}
		else {
			r1000Impl.setUuid(uuid);
		}

		r1000Impl.setR1000Id(r1000Id);
		r1000Impl.setGroupId(groupId);
		r1000Impl.setCompanyId(companyId);
		r1000Impl.setUserId(userId);

		if (userName == null) {
			r1000Impl.setUserName(StringPool.BLANK);
		}
		else {
			r1000Impl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			r1000Impl.setCreateDate(null);
		}
		else {
			r1000Impl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			r1000Impl.setModifiedDate(null);
		}
		else {
			r1000Impl.setModifiedDate(new Date(modifiedDate));
		}

		if (period == null) {
			r1000Impl.setPeriod(StringPool.BLANK);
		}
		else {
			r1000Impl.setPeriod(period);
		}

		if (dealer == null) {
			r1000Impl.setDealer(StringPool.BLANK);
		}
		else {
			r1000Impl.setDealer(dealer);
		}

		if (partCategory == null) {
			r1000Impl.setPartCategory(StringPool.BLANK);
		}
		else {
			r1000Impl.setPartCategory(partCategory);
		}

		r1000Impl.setRepairCount(repairCount);
		r1000Impl.setVisitCount(visitCount);

		if (conCode == null) {
			r1000Impl.setConCode(StringPool.BLANK);
		}
		else {
			r1000Impl.setConCode(conCode);
		}

		r1000Impl.setPercentage(percentage);
		r1000Impl.setPercentage1(percentage1);
		r1000Impl.setPercentage2(percentage2);

		r1000Impl.resetOriginalValues();

		return r1000Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		r1000Id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		period = objectInput.readUTF();
		dealer = objectInput.readUTF();
		partCategory = objectInput.readUTF();

		repairCount = objectInput.readInt();

		visitCount = objectInput.readInt();
		conCode = objectInput.readUTF();

		percentage = objectInput.readInt();

		percentage1 = objectInput.readInt();

		percentage2 = objectInput.readInt();
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

		objectOutput.writeLong(r1000Id);

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

		if (period == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(period);
		}

		if (dealer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dealer);
		}

		if (partCategory == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(partCategory);
		}

		objectOutput.writeInt(repairCount);

		objectOutput.writeInt(visitCount);

		if (conCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(conCode);
		}

		objectOutput.writeInt(percentage);

		objectOutput.writeInt(percentage1);

		objectOutput.writeInt(percentage2);
	}

	public String uuid;
	public long r1000Id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String period;
	public String dealer;
	public String partCategory;
	public int repairCount;
	public int visitCount;
	public String conCode;
	public int percentage;
	public int percentage1;
	public int percentage2;
}