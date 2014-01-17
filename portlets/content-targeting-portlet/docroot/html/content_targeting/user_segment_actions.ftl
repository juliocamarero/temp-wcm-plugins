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

<#include "../init.ftl" />

<@liferay_ui["icon-menu"]>
	<@portlet["renderURL"] var="editUserSegmentURL">
		<@portlet["param"] name="mvcPath" value="${contentTargetingPath.EDIT_USER_SEGMENT}" />
		<@portlet["param"] name="redirect" value="${redirect}" />
		<@portlet["param"] name="userSegmentId" value="${userSegment.getUserSegmentId()?string}" />
	</@>

	<@liferay_ui["icon"]
		image="edit"
		method="get"
		url="${editUserSegmentURL}"
	/>

	<@portlet["actionURL"] name="deleteUserSegment" var="deleteUserSegmentURL">
		<@portlet["param"] name="redirect" value="${redirect}" />
		<@portlet["param"] name="userSegmentId" value="${userSegment.getUserSegmentId()?string}" />
	</@>

	<@liferay_ui["icon-delete"]
		url="${deleteUserSegmentURL}"
	/>
</@>