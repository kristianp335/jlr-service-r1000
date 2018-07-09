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

package com.liferay.kris.jlr.r1000.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link R1000}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see R1000
 * @generated
 */
@ProviderType
public class R1000Wrapper implements R1000, ModelWrapper<R1000> {
	public R1000Wrapper(R1000 r1000) {
		_r1000 = r1000;
	}

	@Override
	public Class<?> getModelClass() {
		return R1000.class;
	}

	@Override
	public String getModelClassName() {
		return R1000.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("r1000Id", getR1000Id());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("period", getPeriod());
		attributes.put("dealer", getDealer());
		attributes.put("partCategory", getPartCategory());
		attributes.put("repairCount", getRepairCount());
		attributes.put("visitCount", getVisitCount());
		attributes.put("conCode", getConCode());
		attributes.put("percentage", getPercentage());
		attributes.put("percentage1", getPercentage1());
		attributes.put("percentage2", getPercentage2());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long r1000Id = (Long)attributes.get("r1000Id");

		if (r1000Id != null) {
			setR1000Id(r1000Id);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String period = (String)attributes.get("period");

		if (period != null) {
			setPeriod(period);
		}

		String dealer = (String)attributes.get("dealer");

		if (dealer != null) {
			setDealer(dealer);
		}

		String partCategory = (String)attributes.get("partCategory");

		if (partCategory != null) {
			setPartCategory(partCategory);
		}

		Integer repairCount = (Integer)attributes.get("repairCount");

		if (repairCount != null) {
			setRepairCount(repairCount);
		}

		Integer visitCount = (Integer)attributes.get("visitCount");

		if (visitCount != null) {
			setVisitCount(visitCount);
		}

		String conCode = (String)attributes.get("conCode");

		if (conCode != null) {
			setConCode(conCode);
		}

		Integer percentage = (Integer)attributes.get("percentage");

		if (percentage != null) {
			setPercentage(percentage);
		}

		Integer percentage1 = (Integer)attributes.get("percentage1");

		if (percentage1 != null) {
			setPercentage1(percentage1);
		}

		Integer percentage2 = (Integer)attributes.get("percentage2");

		if (percentage2 != null) {
			setPercentage2(percentage2);
		}
	}

	@Override
	public R1000 toEscapedModel() {
		return new R1000Wrapper(_r1000.toEscapedModel());
	}

	@Override
	public R1000 toUnescapedModel() {
		return new R1000Wrapper(_r1000.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _r1000.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _r1000.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _r1000.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _r1000.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<R1000> toCacheModel() {
		return _r1000.toCacheModel();
	}

	@Override
	public int compareTo(R1000 r1000) {
		return _r1000.compareTo(r1000);
	}

	/**
	* Returns the percentage of this r1000.
	*
	* @return the percentage of this r1000
	*/
	@Override
	public int getPercentage() {
		return _r1000.getPercentage();
	}

	/**
	* Returns the percentage1 of this r1000.
	*
	* @return the percentage1 of this r1000
	*/
	@Override
	public int getPercentage1() {
		return _r1000.getPercentage1();
	}

	/**
	* Returns the percentage2 of this r1000.
	*
	* @return the percentage2 of this r1000
	*/
	@Override
	public int getPercentage2() {
		return _r1000.getPercentage2();
	}

	/**
	* Returns the repair count of this r1000.
	*
	* @return the repair count of this r1000
	*/
	@Override
	public int getRepairCount() {
		return _r1000.getRepairCount();
	}

	/**
	* Returns the visit count of this r1000.
	*
	* @return the visit count of this r1000
	*/
	@Override
	public int getVisitCount() {
		return _r1000.getVisitCount();
	}

	@Override
	public int hashCode() {
		return _r1000.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _r1000.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new R1000Wrapper((R1000)_r1000.clone());
	}

	/**
	* Returns the con code of this r1000.
	*
	* @return the con code of this r1000
	*/
	@Override
	public java.lang.String getConCode() {
		return _r1000.getConCode();
	}

	/**
	* Returns the dealer of this r1000.
	*
	* @return the dealer of this r1000
	*/
	@Override
	public java.lang.String getDealer() {
		return _r1000.getDealer();
	}

	/**
	* Returns the part category of this r1000.
	*
	* @return the part category of this r1000
	*/
	@Override
	public java.lang.String getPartCategory() {
		return _r1000.getPartCategory();
	}

	/**
	* Returns the period of this r1000.
	*
	* @return the period of this r1000
	*/
	@Override
	public java.lang.String getPeriod() {
		return _r1000.getPeriod();
	}

	/**
	* Returns the user name of this r1000.
	*
	* @return the user name of this r1000
	*/
	@Override
	public java.lang.String getUserName() {
		return _r1000.getUserName();
	}

	/**
	* Returns the user uuid of this r1000.
	*
	* @return the user uuid of this r1000
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _r1000.getUserUuid();
	}

	/**
	* Returns the uuid of this r1000.
	*
	* @return the uuid of this r1000
	*/
	@Override
	public java.lang.String getUuid() {
		return _r1000.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _r1000.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _r1000.toXmlString();
	}

	/**
	* Returns the create date of this r1000.
	*
	* @return the create date of this r1000
	*/
	@Override
	public Date getCreateDate() {
		return _r1000.getCreateDate();
	}

	/**
	* Returns the modified date of this r1000.
	*
	* @return the modified date of this r1000
	*/
	@Override
	public Date getModifiedDate() {
		return _r1000.getModifiedDate();
	}

	/**
	* Returns the company ID of this r1000.
	*
	* @return the company ID of this r1000
	*/
	@Override
	public long getCompanyId() {
		return _r1000.getCompanyId();
	}

	/**
	* Returns the group ID of this r1000.
	*
	* @return the group ID of this r1000
	*/
	@Override
	public long getGroupId() {
		return _r1000.getGroupId();
	}

	/**
	* Returns the primary key of this r1000.
	*
	* @return the primary key of this r1000
	*/
	@Override
	public long getPrimaryKey() {
		return _r1000.getPrimaryKey();
	}

	/**
	* Returns the r1000 ID of this r1000.
	*
	* @return the r1000 ID of this r1000
	*/
	@Override
	public long getR1000Id() {
		return _r1000.getR1000Id();
	}

	/**
	* Returns the user ID of this r1000.
	*
	* @return the user ID of this r1000
	*/
	@Override
	public long getUserId() {
		return _r1000.getUserId();
	}

	@Override
	public void persist() {
		_r1000.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_r1000.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this r1000.
	*
	* @param companyId the company ID of this r1000
	*/
	@Override
	public void setCompanyId(long companyId) {
		_r1000.setCompanyId(companyId);
	}

	/**
	* Sets the con code of this r1000.
	*
	* @param conCode the con code of this r1000
	*/
	@Override
	public void setConCode(java.lang.String conCode) {
		_r1000.setConCode(conCode);
	}

	/**
	* Sets the create date of this r1000.
	*
	* @param createDate the create date of this r1000
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_r1000.setCreateDate(createDate);
	}

	/**
	* Sets the dealer of this r1000.
	*
	* @param dealer the dealer of this r1000
	*/
	@Override
	public void setDealer(java.lang.String dealer) {
		_r1000.setDealer(dealer);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_r1000.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_r1000.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_r1000.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this r1000.
	*
	* @param groupId the group ID of this r1000
	*/
	@Override
	public void setGroupId(long groupId) {
		_r1000.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this r1000.
	*
	* @param modifiedDate the modified date of this r1000
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_r1000.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_r1000.setNew(n);
	}

	/**
	* Sets the part category of this r1000.
	*
	* @param partCategory the part category of this r1000
	*/
	@Override
	public void setPartCategory(java.lang.String partCategory) {
		_r1000.setPartCategory(partCategory);
	}

	/**
	* Sets the percentage of this r1000.
	*
	* @param percentage the percentage of this r1000
	*/
	@Override
	public void setPercentage(int percentage) {
		_r1000.setPercentage(percentage);
	}

	/**
	* Sets the percentage1 of this r1000.
	*
	* @param percentage1 the percentage1 of this r1000
	*/
	@Override
	public void setPercentage1(int percentage1) {
		_r1000.setPercentage1(percentage1);
	}

	/**
	* Sets the percentage2 of this r1000.
	*
	* @param percentage2 the percentage2 of this r1000
	*/
	@Override
	public void setPercentage2(int percentage2) {
		_r1000.setPercentage2(percentage2);
	}

	/**
	* Sets the period of this r1000.
	*
	* @param period the period of this r1000
	*/
	@Override
	public void setPeriod(java.lang.String period) {
		_r1000.setPeriod(period);
	}

	/**
	* Sets the primary key of this r1000.
	*
	* @param primaryKey the primary key of this r1000
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_r1000.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_r1000.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the r1000 ID of this r1000.
	*
	* @param r1000Id the r1000 ID of this r1000
	*/
	@Override
	public void setR1000Id(long r1000Id) {
		_r1000.setR1000Id(r1000Id);
	}

	/**
	* Sets the repair count of this r1000.
	*
	* @param repairCount the repair count of this r1000
	*/
	@Override
	public void setRepairCount(int repairCount) {
		_r1000.setRepairCount(repairCount);
	}

	/**
	* Sets the user ID of this r1000.
	*
	* @param userId the user ID of this r1000
	*/
	@Override
	public void setUserId(long userId) {
		_r1000.setUserId(userId);
	}

	/**
	* Sets the user name of this r1000.
	*
	* @param userName the user name of this r1000
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_r1000.setUserName(userName);
	}

	/**
	* Sets the user uuid of this r1000.
	*
	* @param userUuid the user uuid of this r1000
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_r1000.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this r1000.
	*
	* @param uuid the uuid of this r1000
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_r1000.setUuid(uuid);
	}

	/**
	* Sets the visit count of this r1000.
	*
	* @param visitCount the visit count of this r1000
	*/
	@Override
	public void setVisitCount(int visitCount) {
		_r1000.setVisitCount(visitCount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof R1000Wrapper)) {
			return false;
		}

		R1000Wrapper r1000Wrapper = (R1000Wrapper)obj;

		if (Objects.equals(_r1000, r1000Wrapper._r1000)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _r1000.getStagedModelType();
	}

	@Override
	public R1000 getWrappedModel() {
		return _r1000;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _r1000.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _r1000.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_r1000.resetOriginalValues();
	}

	private final R1000 _r1000;
}