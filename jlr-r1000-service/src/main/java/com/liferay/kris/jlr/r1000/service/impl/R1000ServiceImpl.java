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

package com.liferay.kris.jlr.r1000.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.kris.jlr.r1000.model.R1000;
import com.liferay.kris.jlr.r1000.service.base.R1000ServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

/**
 * The implementation of the r1000 remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.kris.jlr.r1000.service.R1000Service} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see R1000ServiceBaseImpl
 * @see com.liferay.kris.jlr.r1000.service.R1000ServiceUtil
 */
@ProviderType
public class R1000ServiceImpl extends R1000ServiceBaseImpl {
	
	
	public List<R1000> getR1000(ServiceContext serviceContext) {
		long userId = serviceContext.getUserId();
		DynamicQuery dynamicQuery = super.getR1000LocalService().dynamicQuery();		
		dynamicQuery.add(RestrictionsFactoryUtil.eq("userId", userId));
		int endValue = 100;
		int startValue = 0;
		List<R1000> warrantyData = super.getR1000LocalService().dynamicQuery(dynamicQuery, startValue, endValue);
		return warrantyData;
	}
	
	public String deleteR1000(long r1000Id) {
		try {
			super.getR1000LocalService().deleteR1000(r1000Id);
			return "success";
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failed";
		}
		
	}
	
	@Override
	public String addR1000(ServiceContext serviceContext, String period, String dealer, String partCategory, int repairCount, int visitCount, String conCode, int percentage, int percentage1, int percentage2) {
		String derivedUserName = "";
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long userId = serviceContext.getUserId();
		User user;
		try {
			user = UserLocalServiceUtil.getUser(userId);
			derivedUserName = user.getFirstName() + " " + user.getLastName();
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Date today = new Date();	
		
		//build the query ApiAiData object
		R1000 r1000 = super.r1000LocalService.createR1000(CounterLocalServiceUtil.increment(R1000.class.getName()));
		r1000.setGroupId(groupId);
		r1000.setCompanyId(companyId);
		r1000.setUserId(userId);
		r1000.setCreateDate(today);
		r1000.setModifiedDate(today);
		r1000.setUserName(derivedUserName);
		r1000.setPeriod(period);
		r1000.setDealer(dealer);
		r1000.setPartCategory(partCategory);
		r1000.setRepairCount(repairCount);
		r1000.setVisitCount(visitCount);
		r1000.setConCode(conCode);
		r1000.setPercentage(percentage);
		r1000.setPercentage1(percentage1);
		r1000.setPercentage2(percentage2);		
			
		super.getR1000LocalService().addR1000(r1000);			
			
		return "success";			
		
	}
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.kris.jlr.r1000.service.R1000ServiceUtil} to access the r1000 remote service.
	 */
}