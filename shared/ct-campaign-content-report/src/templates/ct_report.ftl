<#assign aui = PortletJspTagLibs["/META-INF/aui.tld"] />
<#assign liferay_theme = PortletJspTagLibs["/META-INF/liferay-theme.tld"] />
<#assign liferay_ui = PortletJspTagLibs["/META-INF/liferay-ui.tld"] />
<#assign portlet = PortletJspTagLibs["/META-INF/liferay-portlet.tld"] />

<@portlet["defineObjects"] />

<@liferay_theme["defineObjects"] />

<#setting number_format="computer">

<#if campaignContents?has_content>
	<#include "ct_chart.ftl" />
</#if>

<@portlet["renderURL"] varImpl="portletURL">
	<@portlet["param"] name="mvcPath" value="${contentTargetingPath.VIEW_CAMPAIGN_REPORTS}" />
	<@portlet["param"] name="tabs1" value="${tabs1}" />
	<@portlet["param"] name="tabs2" value="${tabs2}" />
	<@portlet["param"] name="campaignId" value="${campaign.getCampaignId()?string}" />
</@>

<@liferay_ui["search-container"]
	emptyResultsMessage="no-reports-for-campaign-content-were-found"
	iteratorURL=portletURL
>
	<@liferay_ui["search-container-results"]
		results=campaignContents
		total=totalCampaignContents
	/>

	<@liferay_ui["search-container-row"]
		className="com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent"
		modelVar="campaignContent"
	>

		<@liferay_ui["search-container-column-text"]
			name="title"
			value=campaignContent.getTitle(locale)
		/>

		<@liferay_ui["search-container-column-text"]
			name="type"
			value=campaignContent.getType(locale)
		/>

		<@liferay_ui["search-container-column-text"]
			name="event"
			value="${languageUtil.get(locale, campaignContent.getEventType())}"
		/>

		<@liferay_ui["search-container-column-text"]
			name="count"
			value=campaignContent.getCount()?string
		/>

		<@liferay_ui["search-container-column-date"]
			name="last-update"
			value=campaignContent.getModifiedDate()
		/>
	</@>

	<@liferay_ui["search-iterator"] />
</@>