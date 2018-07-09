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

package com.liferay.kris.jlr.r1000.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.kris.jlr.r1000.model.R1000;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the r1000 service. This utility wraps {@link com.liferay.kris.jlr.r1000.service.persistence.impl.R1000PersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see R1000Persistence
 * @see com.liferay.kris.jlr.r1000.service.persistence.impl.R1000PersistenceImpl
 * @generated
 */
@ProviderType
public class R1000Util {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(R1000 r1000) {
		getPersistence().clearCache(r1000);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<R1000> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<R1000> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<R1000> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<R1000> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static R1000 update(R1000 r1000) {
		return getPersistence().update(r1000);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static R1000 update(R1000 r1000, ServiceContext serviceContext) {
		return getPersistence().update(r1000, serviceContext);
	}

	/**
	* Returns all the r1000s where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching r1000s
	*/
	public static List<R1000> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the r1000s where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @return the range of matching r1000s
	*/
	public static List<R1000> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the r1000s where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching r1000s
	*/
	public static List<R1000> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<R1000> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the r1000s where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching r1000s
	*/
	public static List<R1000> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<R1000> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first r1000 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public static R1000 findByUuid_First(java.lang.String uuid,
		OrderByComparator<R1000> orderByComparator)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first r1000 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public static R1000 fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<R1000> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last r1000 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public static R1000 findByUuid_Last(java.lang.String uuid,
		OrderByComparator<R1000> orderByComparator)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last r1000 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public static R1000 fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<R1000> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the r1000s before and after the current r1000 in the ordered set where uuid = &#63;.
	*
	* @param r1000Id the primary key of the current r1000
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next r1000
	* @throws NoSuchR1000Exception if a r1000 with the primary key could not be found
	*/
	public static R1000[] findByUuid_PrevAndNext(long r1000Id,
		java.lang.String uuid, OrderByComparator<R1000> orderByComparator)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence()
				   .findByUuid_PrevAndNext(r1000Id, uuid, orderByComparator);
	}

	/**
	* Removes all the r1000s where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of r1000s where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching r1000s
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the r1000 where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchR1000Exception} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public static R1000 findByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the r1000 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public static R1000 fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the r1000 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public static R1000 fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the r1000 where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the r1000 that was removed
	*/
	public static R1000 removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of r1000s where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching r1000s
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the r1000s where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching r1000s
	*/
	public static List<R1000> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the r1000s where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @return the range of matching r1000s
	*/
	public static List<R1000> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the r1000s where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching r1000s
	*/
	public static List<R1000> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<R1000> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the r1000s where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching r1000s
	*/
	public static List<R1000> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<R1000> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first r1000 in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public static R1000 findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<R1000> orderByComparator)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first r1000 in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public static R1000 fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<R1000> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last r1000 in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public static R1000 findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<R1000> orderByComparator)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last r1000 in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public static R1000 fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<R1000> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the r1000s before and after the current r1000 in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param r1000Id the primary key of the current r1000
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next r1000
	* @throws NoSuchR1000Exception if a r1000 with the primary key could not be found
	*/
	public static R1000[] findByUuid_C_PrevAndNext(long r1000Id,
		java.lang.String uuid, long companyId,
		OrderByComparator<R1000> orderByComparator)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(r1000Id, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the r1000s where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of r1000s where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching r1000s
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the r1000s where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @return the matching r1000s
	*/
	public static List<R1000> findByUserId(long userId, Date createDate) {
		return getPersistence().findByUserId(userId, createDate);
	}

	/**
	* Returns a range of all the r1000s where userId = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @return the range of matching r1000s
	*/
	public static List<R1000> findByUserId(long userId, Date createDate,
		int start, int end) {
		return getPersistence().findByUserId(userId, createDate, start, end);
	}

	/**
	* Returns an ordered range of all the r1000s where userId = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching r1000s
	*/
	public static List<R1000> findByUserId(long userId, Date createDate,
		int start, int end, OrderByComparator<R1000> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, createDate, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the r1000s where userId = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching r1000s
	*/
	public static List<R1000> findByUserId(long userId, Date createDate,
		int start, int end, OrderByComparator<R1000> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, createDate, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first r1000 in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public static R1000 findByUserId_First(long userId, Date createDate,
		OrderByComparator<R1000> orderByComparator)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence()
				   .findByUserId_First(userId, createDate, orderByComparator);
	}

	/**
	* Returns the first r1000 in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public static R1000 fetchByUserId_First(long userId, Date createDate,
		OrderByComparator<R1000> orderByComparator) {
		return getPersistence()
				   .fetchByUserId_First(userId, createDate, orderByComparator);
	}

	/**
	* Returns the last r1000 in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public static R1000 findByUserId_Last(long userId, Date createDate,
		OrderByComparator<R1000> orderByComparator)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence()
				   .findByUserId_Last(userId, createDate, orderByComparator);
	}

	/**
	* Returns the last r1000 in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public static R1000 fetchByUserId_Last(long userId, Date createDate,
		OrderByComparator<R1000> orderByComparator) {
		return getPersistence()
				   .fetchByUserId_Last(userId, createDate, orderByComparator);
	}

	/**
	* Returns the r1000s before and after the current r1000 in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param r1000Id the primary key of the current r1000
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next r1000
	* @throws NoSuchR1000Exception if a r1000 with the primary key could not be found
	*/
	public static R1000[] findByUserId_PrevAndNext(long r1000Id, long userId,
		Date createDate, OrderByComparator<R1000> orderByComparator)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence()
				   .findByUserId_PrevAndNext(r1000Id, userId, createDate,
			orderByComparator);
	}

	/**
	* Removes all the r1000s where userId = &#63; and createDate = &#63; from the database.
	*
	* @param userId the user ID
	* @param createDate the create date
	*/
	public static void removeByUserId(long userId, Date createDate) {
		getPersistence().removeByUserId(userId, createDate);
	}

	/**
	* Returns the number of r1000s where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @return the number of matching r1000s
	*/
	public static int countByUserId(long userId, Date createDate) {
		return getPersistence().countByUserId(userId, createDate);
	}

	/**
	* Caches the r1000 in the entity cache if it is enabled.
	*
	* @param r1000 the r1000
	*/
	public static void cacheResult(R1000 r1000) {
		getPersistence().cacheResult(r1000);
	}

	/**
	* Caches the r1000s in the entity cache if it is enabled.
	*
	* @param r1000s the r1000s
	*/
	public static void cacheResult(List<R1000> r1000s) {
		getPersistence().cacheResult(r1000s);
	}

	/**
	* Creates a new r1000 with the primary key. Does not add the r1000 to the database.
	*
	* @param r1000Id the primary key for the new r1000
	* @return the new r1000
	*/
	public static R1000 create(long r1000Id) {
		return getPersistence().create(r1000Id);
	}

	/**
	* Removes the r1000 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param r1000Id the primary key of the r1000
	* @return the r1000 that was removed
	* @throws NoSuchR1000Exception if a r1000 with the primary key could not be found
	*/
	public static R1000 remove(long r1000Id)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence().remove(r1000Id);
	}

	public static R1000 updateImpl(R1000 r1000) {
		return getPersistence().updateImpl(r1000);
	}

	/**
	* Returns the r1000 with the primary key or throws a {@link NoSuchR1000Exception} if it could not be found.
	*
	* @param r1000Id the primary key of the r1000
	* @return the r1000
	* @throws NoSuchR1000Exception if a r1000 with the primary key could not be found
	*/
	public static R1000 findByPrimaryKey(long r1000Id)
		throws com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception {
		return getPersistence().findByPrimaryKey(r1000Id);
	}

	/**
	* Returns the r1000 with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param r1000Id the primary key of the r1000
	* @return the r1000, or <code>null</code> if a r1000 with the primary key could not be found
	*/
	public static R1000 fetchByPrimaryKey(long r1000Id) {
		return getPersistence().fetchByPrimaryKey(r1000Id);
	}

	public static java.util.Map<java.io.Serializable, R1000> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the r1000s.
	*
	* @return the r1000s
	*/
	public static List<R1000> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the r1000s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @return the range of r1000s
	*/
	public static List<R1000> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the r1000s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of r1000s
	*/
	public static List<R1000> findAll(int start, int end,
		OrderByComparator<R1000> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the r1000s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of r1000s
	*/
	public static List<R1000> findAll(int start, int end,
		OrderByComparator<R1000> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the r1000s from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of r1000s.
	*
	* @return the number of r1000s
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static R1000Persistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<R1000Persistence, R1000Persistence> _serviceTracker =
		ServiceTrackerFactory.open(R1000Persistence.class);
}