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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the R1000 service. Represents a row in the &quot;JLR_R1000&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.kris.jlr.r1000.model.impl.R1000ModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.kris.jlr.r1000.model.impl.R1000Impl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see R1000
 * @see com.liferay.kris.jlr.r1000.model.impl.R1000Impl
 * @see com.liferay.kris.jlr.r1000.model.impl.R1000ModelImpl
 * @generated
 */
@ProviderType
public interface R1000Model extends BaseModel<R1000>, GroupedModel, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a r1000 model instance should use the {@link R1000} interface instead.
	 */

	/**
	 * Returns the primary key of this r1000.
	 *
	 * @return the primary key of this r1000
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this r1000.
	 *
	 * @param primaryKey the primary key of this r1000
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this r1000.
	 *
	 * @return the uuid of this r1000
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this r1000.
	 *
	 * @param uuid the uuid of this r1000
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the r1000 ID of this r1000.
	 *
	 * @return the r1000 ID of this r1000
	 */
	public long getR1000Id();

	/**
	 * Sets the r1000 ID of this r1000.
	 *
	 * @param r1000Id the r1000 ID of this r1000
	 */
	public void setR1000Id(long r1000Id);

	/**
	 * Returns the group ID of this r1000.
	 *
	 * @return the group ID of this r1000
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this r1000.
	 *
	 * @param groupId the group ID of this r1000
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this r1000.
	 *
	 * @return the company ID of this r1000
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this r1000.
	 *
	 * @param companyId the company ID of this r1000
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this r1000.
	 *
	 * @return the user ID of this r1000
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this r1000.
	 *
	 * @param userId the user ID of this r1000
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this r1000.
	 *
	 * @return the user uuid of this r1000
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this r1000.
	 *
	 * @param userUuid the user uuid of this r1000
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this r1000.
	 *
	 * @return the user name of this r1000
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this r1000.
	 *
	 * @param userName the user name of this r1000
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this r1000.
	 *
	 * @return the create date of this r1000
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this r1000.
	 *
	 * @param createDate the create date of this r1000
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this r1000.
	 *
	 * @return the modified date of this r1000
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this r1000.
	 *
	 * @param modifiedDate the modified date of this r1000
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the period of this r1000.
	 *
	 * @return the period of this r1000
	 */
	@AutoEscape
	public String getPeriod();

	/**
	 * Sets the period of this r1000.
	 *
	 * @param period the period of this r1000
	 */
	public void setPeriod(String period);

	/**
	 * Returns the dealer of this r1000.
	 *
	 * @return the dealer of this r1000
	 */
	@AutoEscape
	public String getDealer();

	/**
	 * Sets the dealer of this r1000.
	 *
	 * @param dealer the dealer of this r1000
	 */
	public void setDealer(String dealer);

	/**
	 * Returns the part category of this r1000.
	 *
	 * @return the part category of this r1000
	 */
	@AutoEscape
	public String getPartCategory();

	/**
	 * Sets the part category of this r1000.
	 *
	 * @param partCategory the part category of this r1000
	 */
	public void setPartCategory(String partCategory);

	/**
	 * Returns the repair count of this r1000.
	 *
	 * @return the repair count of this r1000
	 */
	public int getRepairCount();

	/**
	 * Sets the repair count of this r1000.
	 *
	 * @param repairCount the repair count of this r1000
	 */
	public void setRepairCount(int repairCount);

	/**
	 * Returns the visit count of this r1000.
	 *
	 * @return the visit count of this r1000
	 */
	public int getVisitCount();

	/**
	 * Sets the visit count of this r1000.
	 *
	 * @param visitCount the visit count of this r1000
	 */
	public void setVisitCount(int visitCount);

	/**
	 * Returns the con code of this r1000.
	 *
	 * @return the con code of this r1000
	 */
	@AutoEscape
	public String getConCode();

	/**
	 * Sets the con code of this r1000.
	 *
	 * @param conCode the con code of this r1000
	 */
	public void setConCode(String conCode);

	/**
	 * Returns the percentage of this r1000.
	 *
	 * @return the percentage of this r1000
	 */
	public int getPercentage();

	/**
	 * Sets the percentage of this r1000.
	 *
	 * @param percentage the percentage of this r1000
	 */
	public void setPercentage(int percentage);

	/**
	 * Returns the percentage1 of this r1000.
	 *
	 * @return the percentage1 of this r1000
	 */
	public int getPercentage1();

	/**
	 * Sets the percentage1 of this r1000.
	 *
	 * @param percentage1 the percentage1 of this r1000
	 */
	public void setPercentage1(int percentage1);

	/**
	 * Returns the percentage2 of this r1000.
	 *
	 * @return the percentage2 of this r1000
	 */
	public int getPercentage2();

	/**
	 * Sets the percentage2 of this r1000.
	 *
	 * @param percentage2 the percentage2 of this r1000
	 */
	public void setPercentage2(int percentage2);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(R1000 r1000);

	@Override
	public int hashCode();

	@Override
	public CacheModel<R1000> toCacheModel();

	@Override
	public R1000 toEscapedModel();

	@Override
	public R1000 toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}