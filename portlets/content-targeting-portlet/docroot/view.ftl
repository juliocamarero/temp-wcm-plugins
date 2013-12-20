<#--
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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
-->

<#include "init.ftl" />

<#assign userSegmentService = serviceLocator.findService("com.liferay.portal.service.UserSegmentService")>
<#assign userSegmentResults = userSegmentService.getUserSegments(themeDisplay.getScopeGroupId())>
<#assign userSegmentResultsTotal = userSegmentService.getUserSegmentsCount(themeDisplay.getScopeGroupId())>

<@aui["nav-bar"]>
	<@aui["nav"]>
		<#assign editUserSegmentURL = renderResponse.createRenderURL()>

		${editUserSegmentURL.setParameter("mvcPath", "/html/user_segment/edit_user_segment.ftl")}
		${editUserSegmentURL.setParameter("redirect", portalUtil.getCurrentURL(request))}

		<@aui["nav-item"] href="${editUserSegmentURL}" iconCssClass="icon-plus" label="add-user-segment" />
	</@>
</@>

<#assign iteratorURL = renderResponse.createRenderURL()>

<@liferay_ui["search-container"]
	emptyResultsMessage="no-user-segment-were-found"
	iteratorURL=iteratorURL
>
    <@liferay_ui["search-container-results"]
		results=userSegmentResults
		total=userSegmentResultsTotal
	/>

    <@liferay_ui["search-container-row"]
		className="com.liferay.portal.model.UserSegment"
		modelVar="userSegment"
	>
        <@liferay_ui["search-container-column-text"]
			name="name"
			value=userSegment.getName()
		/>

		<@liferay_ui["search-container-column-text"]
			name="description"
			value=userSegment.getDescription()
		/>
    </@>

    <@liferay_ui["search-iterator"] />
</@>