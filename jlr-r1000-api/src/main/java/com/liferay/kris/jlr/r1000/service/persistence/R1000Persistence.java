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

import com.liferay.kris.jlr.r1000.exception.NoSuchR1000Exception;
import com.liferay.kris.jlr.r1000.model.R1000;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Date;

/**
 * The persistence interface for the r1000 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.kris.jlr.r1000.service.persistence.impl.R1000PersistenceImpl
 * @see R1000Util
 * @generated
 */
@ProviderType
public interface R1000Persistence extends BasePersistence<R1000> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link R1000Util} to access the r1000 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the r1000s where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching r1000s
	*/
	public java.util.List<R1000> findByUuid(java.lang.String uuid);

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
	public java.util.List<R1000> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<R1000> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator);

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
	public java.util.List<R1000> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first r1000 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public R1000 findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator)
		throws NoSuchR1000Exception;

	/**
	* Returns the first r1000 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public R1000 fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator);

	/**
	* Returns the last r1000 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public R1000 findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator)
		throws NoSuchR1000Exception;

	/**
	* Returns the last r1000 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public R1000 fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator);

	/**
	* Returns the r1000s before and after the current r1000 in the ordered set where uuid = &#63;.
	*
	* @param r1000Id the primary key of the current r1000
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next r1000
	* @throws NoSuchR1000Exception if a r1000 with the primary key could not be found
	*/
	public R1000[] findByUuid_PrevAndNext(long r1000Id, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator)
		throws NoSuchR1000Exception;

	/**
	* Removes all the r1000s where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of r1000s where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching r1000s
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the r1000 where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchR1000Exception} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public R1000 findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchR1000Exception;

	/**
	* Returns the r1000 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public R1000 fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the r1000 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public R1000 fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the r1000 where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the r1000 that was removed
	*/
	public R1000 removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchR1000Exception;

	/**
	* Returns the number of r1000s where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching r1000s
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the r1000s where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching r1000s
	*/
	public java.util.List<R1000> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<R1000> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<R1000> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator);

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
	public java.util.List<R1000> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first r1000 in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public R1000 findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator)
		throws NoSuchR1000Exception;

	/**
	* Returns the first r1000 in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public R1000 fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator);

	/**
	* Returns the last r1000 in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public R1000 findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator)
		throws NoSuchR1000Exception;

	/**
	* Returns the last r1000 in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public R1000 fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator);

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
	public R1000[] findByUuid_C_PrevAndNext(long r1000Id,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator)
		throws NoSuchR1000Exception;

	/**
	* Removes all the r1000s where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of r1000s where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching r1000s
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the r1000s where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @return the matching r1000s
	*/
	public java.util.List<R1000> findByUserId(long userId, Date createDate);

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
	public java.util.List<R1000> findByUserId(long userId, Date createDate,
		int start, int end);

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
	public java.util.List<R1000> findByUserId(long userId, Date createDate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator);

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
	public java.util.List<R1000> findByUserId(long userId, Date createDate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first r1000 in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public R1000 findByUserId_First(long userId, Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator)
		throws NoSuchR1000Exception;

	/**
	* Returns the first r1000 in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public R1000 fetchByUserId_First(long userId, Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator);

	/**
	* Returns the last r1000 in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000
	* @throws NoSuchR1000Exception if a matching r1000 could not be found
	*/
	public R1000 findByUserId_Last(long userId, Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator)
		throws NoSuchR1000Exception;

	/**
	* Returns the last r1000 in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	public R1000 fetchByUserId_Last(long userId, Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator);

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
	public R1000[] findByUserId_PrevAndNext(long r1000Id, long userId,
		Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator)
		throws NoSuchR1000Exception;

	/**
	* Removes all the r1000s where userId = &#63; and createDate = &#63; from the database.
	*
	* @param userId the user ID
	* @param createDate the create date
	*/
	public void removeByUserId(long userId, Date createDate);

	/**
	* Returns the number of r1000s where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @return the number of matching r1000s
	*/
	public int countByUserId(long userId, Date createDate);

	/**
	* Caches the r1000 in the entity cache if it is enabled.
	*
	* @param r1000 the r1000
	*/
	public void cacheResult(R1000 r1000);

	/**
	* Caches the r1000s in the entity cache if it is enabled.
	*
	* @param r1000s the r1000s
	*/
	public void cacheResult(java.util.List<R1000> r1000s);

	/**
	* Creates a new r1000 with the primary key. Does not add the r1000 to the database.
	*
	* @param r1000Id the primary key for the new r1000
	* @return the new r1000
	*/
	public R1000 create(long r1000Id);

	/**
	* Removes the r1000 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param r1000Id the primary key of the r1000
	* @return the r1000 that was removed
	* @throws NoSuchR1000Exception if a r1000 with the primary key could not be found
	*/
	public R1000 remove(long r1000Id) throws NoSuchR1000Exception;

	public R1000 updateImpl(R1000 r1000);

	/**
	* Returns the r1000 with the primary key or throws a {@link NoSuchR1000Exception} if it could not be found.
	*
	* @param r1000Id the primary key of the r1000
	* @return the r1000
	* @throws NoSuchR1000Exception if a r1000 with the primary key could not be found
	*/
	public R1000 findByPrimaryKey(long r1000Id) throws NoSuchR1000Exception;

	/**
	* Returns the r1000 with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param r1000Id the primary key of the r1000
	* @return the r1000, or <code>null</code> if a r1000 with the primary key could not be found
	*/
	public R1000 fetchByPrimaryKey(long r1000Id);

	@Override
	public java.util.Map<java.io.Serializable, R1000> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the r1000s.
	*
	* @return the r1000s
	*/
	public java.util.List<R1000> findAll();

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
	public java.util.List<R1000> findAll(int start, int end);

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
	public java.util.List<R1000> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator);

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
	public java.util.List<R1000> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<R1000> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the r1000s from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of r1000s.
	*
	* @return the number of r1000s
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}