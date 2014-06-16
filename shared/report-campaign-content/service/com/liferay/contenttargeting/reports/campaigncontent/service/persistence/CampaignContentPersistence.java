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

package com.liferay.contenttargeting.reports.campaigncontent.service.persistence;

import com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the campaign content service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CampaignContentPersistenceImpl
 * @see CampaignContentUtil
 * @generated
 */
public interface CampaignContentPersistence extends BasePersistence<CampaignContent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CampaignContentUtil} to access the campaign content persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the campaign contents where campaignId = &#63;.
	*
	* @param campaignId the campaign ID
	* @return the matching campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent> findByCampaignId(
		long campaignId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the campaign contents where campaignId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.reports.campaigncontent.model.impl.CampaignContentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param campaignId the campaign ID
	* @param start the lower bound of the range of campaign contents
	* @param end the upper bound of the range of campaign contents (not inclusive)
	* @return the range of matching campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent> findByCampaignId(
		long campaignId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the campaign contents where campaignId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.reports.campaigncontent.model.impl.CampaignContentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param campaignId the campaign ID
	* @param start the lower bound of the range of campaign contents
	* @param end the upper bound of the range of campaign contents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent> findByCampaignId(
		long campaignId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first campaign content in the ordered set where campaignId = &#63;.
	*
	* @param campaignId the campaign ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching campaign content
	* @throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException if a matching campaign content could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent findByCampaignId_First(
		long campaignId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first campaign content in the ordered set where campaignId = &#63;.
	*
	* @param campaignId the campaign ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching campaign content, or <code>null</code> if a matching campaign content could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent fetchByCampaignId_First(
		long campaignId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last campaign content in the ordered set where campaignId = &#63;.
	*
	* @param campaignId the campaign ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching campaign content
	* @throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException if a matching campaign content could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent findByCampaignId_Last(
		long campaignId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last campaign content in the ordered set where campaignId = &#63;.
	*
	* @param campaignId the campaign ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching campaign content, or <code>null</code> if a matching campaign content could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent fetchByCampaignId_Last(
		long campaignId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the campaign contents before and after the current campaign content in the ordered set where campaignId = &#63;.
	*
	* @param campaignContentId the primary key of the current campaign content
	* @param campaignId the campaign ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next campaign content
	* @throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException if a campaign content with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent[] findByCampaignId_PrevAndNext(
		long campaignContentId, long campaignId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the campaign contents where campaignId = &#63; from the database.
	*
	* @param campaignId the campaign ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCampaignId(long campaignId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of campaign contents where campaignId = &#63;.
	*
	* @param campaignId the campaign ID
	* @return the number of matching campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public int countByCampaignId(long campaignId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the campaign contents where campaignId = &#63; and modifiedDate &gt; &#63;.
	*
	* @param campaignId the campaign ID
	* @param modifiedDate the modified date
	* @return the matching campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent> findByC_GtD(
		long campaignId, java.util.Date modifiedDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the campaign contents where campaignId = &#63; and modifiedDate &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.reports.campaigncontent.model.impl.CampaignContentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param campaignId the campaign ID
	* @param modifiedDate the modified date
	* @param start the lower bound of the range of campaign contents
	* @param end the upper bound of the range of campaign contents (not inclusive)
	* @return the range of matching campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent> findByC_GtD(
		long campaignId, java.util.Date modifiedDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the campaign contents where campaignId = &#63; and modifiedDate &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.reports.campaigncontent.model.impl.CampaignContentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param campaignId the campaign ID
	* @param modifiedDate the modified date
	* @param start the lower bound of the range of campaign contents
	* @param end the upper bound of the range of campaign contents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent> findByC_GtD(
		long campaignId, java.util.Date modifiedDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first campaign content in the ordered set where campaignId = &#63; and modifiedDate &gt; &#63;.
	*
	* @param campaignId the campaign ID
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching campaign content
	* @throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException if a matching campaign content could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent findByC_GtD_First(
		long campaignId, java.util.Date modifiedDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first campaign content in the ordered set where campaignId = &#63; and modifiedDate &gt; &#63;.
	*
	* @param campaignId the campaign ID
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching campaign content, or <code>null</code> if a matching campaign content could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent fetchByC_GtD_First(
		long campaignId, java.util.Date modifiedDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last campaign content in the ordered set where campaignId = &#63; and modifiedDate &gt; &#63;.
	*
	* @param campaignId the campaign ID
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching campaign content
	* @throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException if a matching campaign content could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent findByC_GtD_Last(
		long campaignId, java.util.Date modifiedDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last campaign content in the ordered set where campaignId = &#63; and modifiedDate &gt; &#63;.
	*
	* @param campaignId the campaign ID
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching campaign content, or <code>null</code> if a matching campaign content could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent fetchByC_GtD_Last(
		long campaignId, java.util.Date modifiedDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the campaign contents before and after the current campaign content in the ordered set where campaignId = &#63; and modifiedDate &gt; &#63;.
	*
	* @param campaignContentId the primary key of the current campaign content
	* @param campaignId the campaign ID
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next campaign content
	* @throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException if a campaign content with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent[] findByC_GtD_PrevAndNext(
		long campaignContentId, long campaignId, java.util.Date modifiedDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the campaign contents where campaignId = &#63; and modifiedDate &gt; &#63; from the database.
	*
	* @param campaignId the campaign ID
	* @param modifiedDate the modified date
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_GtD(long campaignId, java.util.Date modifiedDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of campaign contents where campaignId = &#63; and modifiedDate &gt; &#63;.
	*
	* @param campaignId the campaign ID
	* @param modifiedDate the modified date
	* @return the number of matching campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_GtD(long campaignId, java.util.Date modifiedDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the campaign content where campaignId = &#63; and className = &#63; and classPK = &#63; and eventType = &#63; or throws a {@link com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException} if it could not be found.
	*
	* @param campaignId the campaign ID
	* @param className the class name
	* @param classPK the class p k
	* @param eventType the event type
	* @return the matching campaign content
	* @throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException if a matching campaign content could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent findByC_C_C_E(
		long campaignId, java.lang.String className, long classPK,
		java.lang.String eventType)
		throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the campaign content where campaignId = &#63; and className = &#63; and classPK = &#63; and eventType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param campaignId the campaign ID
	* @param className the class name
	* @param classPK the class p k
	* @param eventType the event type
	* @return the matching campaign content, or <code>null</code> if a matching campaign content could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent fetchByC_C_C_E(
		long campaignId, java.lang.String className, long classPK,
		java.lang.String eventType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the campaign content where campaignId = &#63; and className = &#63; and classPK = &#63; and eventType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param campaignId the campaign ID
	* @param className the class name
	* @param classPK the class p k
	* @param eventType the event type
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching campaign content, or <code>null</code> if a matching campaign content could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent fetchByC_C_C_E(
		long campaignId, java.lang.String className, long classPK,
		java.lang.String eventType, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the campaign content where campaignId = &#63; and className = &#63; and classPK = &#63; and eventType = &#63; from the database.
	*
	* @param campaignId the campaign ID
	* @param className the class name
	* @param classPK the class p k
	* @param eventType the event type
	* @return the campaign content that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent removeByC_C_C_E(
		long campaignId, java.lang.String className, long classPK,
		java.lang.String eventType)
		throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of campaign contents where campaignId = &#63; and className = &#63; and classPK = &#63; and eventType = &#63;.
	*
	* @param campaignId the campaign ID
	* @param className the class name
	* @param classPK the class p k
	* @param eventType the event type
	* @return the number of matching campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_C_C_E(long campaignId, java.lang.String className,
		long classPK, java.lang.String eventType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the campaign content in the entity cache if it is enabled.
	*
	* @param campaignContent the campaign content
	*/
	public void cacheResult(
		com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent campaignContent);

	/**
	* Caches the campaign contents in the entity cache if it is enabled.
	*
	* @param campaignContents the campaign contents
	*/
	public void cacheResult(
		java.util.List<com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent> campaignContents);

	/**
	* Creates a new campaign content with the primary key. Does not add the campaign content to the database.
	*
	* @param campaignContentId the primary key for the new campaign content
	* @return the new campaign content
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent create(
		long campaignContentId);

	/**
	* Removes the campaign content with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param campaignContentId the primary key of the campaign content
	* @return the campaign content that was removed
	* @throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException if a campaign content with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent remove(
		long campaignContentId)
		throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent updateImpl(
		com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent campaignContent)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the campaign content with the primary key or throws a {@link com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException} if it could not be found.
	*
	* @param campaignContentId the primary key of the campaign content
	* @return the campaign content
	* @throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException if a campaign content with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent findByPrimaryKey(
		long campaignContentId)
		throws com.liferay.contenttargeting.reports.campaigncontent.NoSuchCampaignContentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the campaign content with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param campaignContentId the primary key of the campaign content
	* @return the campaign content, or <code>null</code> if a campaign content with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent fetchByPrimaryKey(
		long campaignContentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the campaign contents.
	*
	* @return the campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the campaign contents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.reports.campaigncontent.model.impl.CampaignContentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of campaign contents
	* @param end the upper bound of the range of campaign contents (not inclusive)
	* @return the range of campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the campaign contents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.reports.campaigncontent.model.impl.CampaignContentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of campaign contents
	* @param end the upper bound of the range of campaign contents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the campaign contents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of campaign contents.
	*
	* @return the number of campaign contents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}