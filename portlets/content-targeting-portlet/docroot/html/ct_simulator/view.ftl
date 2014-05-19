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


<@portlet["actionURL"] name="stopSimulation" var="stopSimulationURL">
	<@portlet["param"] name="redirect" value="${currentURL}" />
</@>

<a href="${stopSimulationURL}"><@liferay_ui["message"] key="clear-simulated-user-segments" /></a>

<#if userSegments?has_content>

	<h2><@liferay_ui["message"] key="matched-user-segments" /></h2>

	<ul>

	<#list userSegments as userSegment>
		<li>${userSegment.getNameWithGroupName(locale, themeDisplay.getScopeGroupId())}</li>
	</#list>

	</ul>
<#else>
	<div class="alert alert-info">
		<@liferay_ui["message"] key="the-current-user-does-not-match-any-user-segment" />
	</div>
</#if>

<h2><@liferay_ui["message"] key="available-user-segments" /></h2>

<ul>

<#list availableUserSegments as userSegment>
	<@portlet["actionURL"] name="simulateUserSegment" var="simulateUserSegmentURL">
		<@portlet["param"] name="userSegmentId" value="${userSegment.getUserSegmentId()}" />
		<@portlet["param"] name="redirect" value="${currentURL}" />
	</@>

	<li>

	<@liferay_ui["icon"]
		label=true
		message="${userSegment.getNameWithGroupName(locale, themeDisplay.getScopeGroupId())}"
		url="${simulateUserSegmentURL}"
	/>

	</li>
</#list>

</ul>

