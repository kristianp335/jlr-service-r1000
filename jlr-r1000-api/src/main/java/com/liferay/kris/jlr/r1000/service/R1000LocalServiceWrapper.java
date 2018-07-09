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

package com.liferay.kris.jlr.r1000.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link R1000LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see R1000LocalService
 * @generated
 */
@ProviderType
public class R1000LocalServiceWrapper implements R1000LocalService,
	ServiceWrapper<R1000LocalService> {
	public R1000LocalServiceWrapper(R1000LocalService r1000LocalService) {
		_r1000LocalService = r1000LocalService;
	}

	/**
	* Adds the r1000 to the database. Also notifies the appropriate model listeners.
	*
	* @param r1000 the r1000
	* @return the r1000 that was added
	*/
	@Override
	public com.liferay.kris.jlr.r1000.model.R1000 addR1000(
		com.liferay.kris.jlr.r1000.model.R1000 r1000) {
		return _r1000LocalService.addR1000(r1000);
	}

	/**
	* Creates a new r1000 with the primary key. Does not add the r1000 to the database.
	*
	* @param r1000Id the primary key for the new r1000
	* @return the new r1000
	*/
	@Override
	public com.liferay.kris.jlr.r1000.model.R1000 createR1000(long r1000Id) {
		return _r1000LocalService.createR1000(r1000Id);
	}

	/**
	* Deletes the r1000 from the database. Also notifies the appropriate model listeners.
	*
	* @param r1000 the r1000
	* @return the r1000 that was removed
	*/
	@Override
	public com.liferay.kris.jlr.r1000.model.R1000 deleteR1000(
		com.liferay.kris.jlr.r1000.model.R1000 r1000) {
		return _r1000LocalService.deleteR1000(r1000);
	}

	/**
	* Deletes the r1000 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param r1000Id the primary key of the r1000
	* @return the r1000 that was removed
	* @throws PortalException if a r1000 with the primary key could not be found
	*/
	@Override
	public com.liferay.kris.jlr.r1000.model.R1000 deleteR1000(long r1000Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _r1000LocalService.deleteR1000(r1000Id);
	}

	@Override
	public com.liferay.kris.jlr.r1000.model.R1000 fetchR1000(long r1000Id) {
		return _r1000LocalService.fetchR1000(r1000Id);
	}

	/**
	* Returns the r1000 matching the UUID and group.
	*
	* @param uuid the r1000's UUID
	* @param groupId the primary key of the group
	* @return the matching r1000, or <code>null</code> if a matching r1000 could not be found
	*/
	@Override
	public com.liferay.kris.jlr.r1000.model.R1000 fetchR1000ByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _r1000LocalService.fetchR1000ByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the r1000 with the primary key.
	*
	* @param r1000Id the primary key of the r1000
	* @return the r1000
	* @throws PortalException if a r1000 with the primary key could not be found
	*/
	@Override
	public com.liferay.kris.jlr.r1000.model.R1000 getR1000(long r1000Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _r1000LocalService.getR1000(r1000Id);
	}

	/**
	* Returns the r1000 matching the UUID and group.
	*
	* @param uuid the r1000's UUID
	* @param groupId the primary key of the group
	* @return the matching r1000
	* @throws PortalException if a matching r1000 could not be found
	*/
	@Override
	public com.liferay.kris.jlr.r1000.model.R1000 getR1000ByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _r1000LocalService.getR1000ByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the r1000 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param r1000 the r1000
	* @return the r1000 that was updated
	*/
	@Override
	public com.liferay.kris.jlr.r1000.model.R1000 updateR1000(
		com.liferay.kris.jlr.r1000.model.R1000 r1000) {
		return _r1000LocalService.updateR1000(r1000);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _r1000LocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _r1000LocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _r1000LocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _r1000LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _r1000LocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _r1000LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of r1000s.
	*
	* @return the number of r1000s
	*/
	@Override
	public int getR1000sCount() {
		return _r1000LocalService.getR1000sCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _r1000LocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _r1000LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.kris.jlr.r1000.model.impl.R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _r1000LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.kris.jlr.r1000.model.impl.R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _r1000LocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the r1000s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.kris.jlr.r1000.model.impl.R1000ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @return the range of r1000s
	*/
	@Override
	public java.util.List<com.liferay.kris.jlr.r1000.model.R1000> getR1000s(
		int start, int end) {
		return _r1000LocalService.getR1000s(start, end);
	}

	/**
	* Returns all the r1000s matching the UUID and company.
	*
	* @param uuid the UUID of the r1000s
	* @param companyId the primary key of the company
	* @return the matching r1000s, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.kris.jlr.r1000.model.R1000> getR1000sByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _r1000LocalService.getR1000sByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of r1000s matching the UUID and company.
	*
	* @param uuid the UUID of the r1000s
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of r1000s
	* @param end the upper bound of the range of r1000s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching r1000s, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.kris.jlr.r1000.model.R1000> getR1000sByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.kris.jlr.r1000.model.R1000> orderByComparator) {
		return _r1000LocalService.getR1000sByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _r1000LocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _r1000LocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public R1000LocalService getWrappedService() {
		return _r1000LocalService;
	}

	@Override
	public void setWrappedService(R1000LocalService r1000LocalService) {
		_r1000LocalService = r1000LocalService;
	}

	private R1000LocalService _r1000LocalService;
}