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

<@aui["nav"]>
	<#if contentTargetingPermission.contains(permissionChecker, scopeGroupId, actionKeys.ADD_USER_SEGMENT)>
		<@portlet["renderURL"] var="addUserSegmentURL">
			<@portlet["param"] name="mvcPath" value="${contentTargetingPath.EDIT_USER_SEGMENT}" />
			<@portlet["param"] name="redirect" value="${viewUserSegmentsURL}" />
		</@>

		<@aui["nav-item"] href="${addUserSegmentURL}" iconCssClass="icon-plus" label="add-user-segment" />
	</#if>
</@>
