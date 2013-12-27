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

package com.liferay.contenttargeting.service.persistence;

import com.liferay.contenttargeting.model.UserSegment;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the user segment service. This utility wraps {@link UserSegmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserSegmentPersistence
 * @see UserSegmentPersistenceImpl
 * @generated
 */
public class UserSegmentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(UserSegment userSegment) {
		getPersistence().clearCache(userSegment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UserSegment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserSegment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserSegment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UserSegment update(UserSegment userSegment)
		throws SystemException {
		return getPersistence().update(userSegment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UserSegment update(UserSegment userSegment,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userSegment, serviceContext);
	}

	/**
	* Returns all the user segments where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the user segments where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.model.impl.UserSegmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of user segments
	* @param end the upper bound of the range of user segments (not inclusive)
	* @return the range of matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the user segments where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.model.impl.UserSegmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of user segments
	* @param end the upper bound of the range of user segments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first user segment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user segment
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first user segment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user segment, or <code>null</code> if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last user segment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user segment
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last user segment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user segment, or <code>null</code> if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the user segments before and after the current user segment in the ordered set where uuid = &#63;.
	*
	* @param segmentId the primary key of the current user segment
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user segment
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a user segment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment[] findByUuid_PrevAndNext(
		long segmentId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_PrevAndNext(segmentId, uuid, orderByComparator);
	}

	/**
	* Removes all the user segments where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of user segments where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the user segment where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.contenttargeting.NoSuchUserSegmentException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching user segment
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the user segment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching user segment, or <code>null</code> if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the user segment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user segment, or <code>null</code> if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the user segment where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the user segment that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of user segments where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the user segments where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the user segments where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.model.impl.UserSegmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of user segments
	* @param end the upper bound of the range of user segments (not inclusive)
	* @return the range of matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the user segments where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.model.impl.UserSegmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of user segments
	* @param end the upper bound of the range of user segments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first user segment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user segment
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first user segment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user segment, or <code>null</code> if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last user segment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user segment
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last user segment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user segment, or <code>null</code> if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the user segments before and after the current user segment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param segmentId the primary key of the current user segment
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user segment
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a user segment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment[] findByUuid_C_PrevAndNext(
		long segmentId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(segmentId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the user segments where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of user segments where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the user segments where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findBygroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupId(groupId);
	}

	/**
	* Returns a range of all the user segments where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.model.impl.UserSegmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of user segments
	* @param end the upper bound of the range of user segments (not inclusive)
	* @return the range of matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findBygroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the user segments where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.model.impl.UserSegmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of user segments
	* @param end the upper bound of the range of user segments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first user segment in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user segment
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment findBygroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first user segment in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user segment, or <code>null</code> if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment fetchBygroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBygroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last user segment in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user segment
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment findBygroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last user segment in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user segment, or <code>null</code> if a matching user segment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment fetchBygroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBygroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the user segments before and after the current user segment in the ordered set where groupId = &#63;.
	*
	* @param segmentId the primary key of the current user segment
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user segment
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a user segment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment[] findBygroupId_PrevAndNext(
		long segmentId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygroupId_PrevAndNext(segmentId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the user segments where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBygroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBygroupId(groupId);
	}

	/**
	* Returns the number of user segments where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching user segments
	* @throws SystemException if a system exception occurred
	*/
	public static int countBygroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBygroupId(groupId);
	}

	/**
	* Caches the user segment in the entity cache if it is enabled.
	*
	* @param userSegment the user segment
	*/
	public static void cacheResult(
		com.liferay.contenttargeting.model.UserSegment userSegment) {
		getPersistence().cacheResult(userSegment);
	}

	/**
	* Caches the user segments in the entity cache if it is enabled.
	*
	* @param userSegments the user segments
	*/
	public static void cacheResult(
		java.util.List<com.liferay.contenttargeting.model.UserSegment> userSegments) {
		getPersistence().cacheResult(userSegments);
	}

	/**
	* Creates a new user segment with the primary key. Does not add the user segment to the database.
	*
	* @param segmentId the primary key for the new user segment
	* @return the new user segment
	*/
	public static com.liferay.contenttargeting.model.UserSegment create(
		long segmentId) {
		return getPersistence().create(segmentId);
	}

	/**
	* Removes the user segment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param segmentId the primary key of the user segment
	* @return the user segment that was removed
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a user segment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment remove(
		long segmentId)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(segmentId);
	}

	public static com.liferay.contenttargeting.model.UserSegment updateImpl(
		com.liferay.contenttargeting.model.UserSegment userSegment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userSegment);
	}

	/**
	* Returns the user segment with the primary key or throws a {@link com.liferay.contenttargeting.NoSuchUserSegmentException} if it could not be found.
	*
	* @param segmentId the primary key of the user segment
	* @return the user segment
	* @throws com.liferay.contenttargeting.NoSuchUserSegmentException if a user segment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment findByPrimaryKey(
		long segmentId)
		throws com.liferay.contenttargeting.NoSuchUserSegmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(segmentId);
	}

	/**
	* Returns the user segment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param segmentId the primary key of the user segment
	* @return the user segment, or <code>null</code> if a user segment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.contenttargeting.model.UserSegment fetchByPrimaryKey(
		long segmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(segmentId);
	}

	/**
	* Returns all the user segments.
	*
	* @return the user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the user segments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.model.impl.UserSegmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user segments
	* @param end the upper bound of the range of user segments (not inclusive)
	* @return the range of user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the user segments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.model.impl.UserSegmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user segments
	* @param end the upper bound of the range of user segments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.contenttargeting.model.UserSegment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user segments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user segments.
	*
	* @return the number of user segments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserSegmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserSegmentPersistence)PortletBeanLocatorUtil.locate(com.liferay.contenttargeting.service.ClpSerializer.getServletContextName(),
					UserSegmentPersistence.class.getName());

			ReferenceRegistry.registerReference(UserSegmentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UserSegmentPersistence persistence) {
	}

	private static UserSegmentPersistence _persistence;
}