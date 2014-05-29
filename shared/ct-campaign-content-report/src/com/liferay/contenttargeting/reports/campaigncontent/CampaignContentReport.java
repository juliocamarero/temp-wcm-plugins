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

package com.liferay.contenttargeting.reports.campaigncontent;

import aQute.bnd.annotation.component.Component;

import com.liferay.contenttargeting.api.model.BaseReport;
import com.liferay.contenttargeting.api.model.Report;
import com.liferay.contenttargeting.model.Campaign;
import com.liferay.contenttargeting.reports.campaigncontent.model.CampaignContent;
import com.liferay.contenttargeting.reports.campaigncontent.service.CampaignContentLocalServiceUtil;
import com.liferay.contenttargeting.reports.campaigncontent.util.comparator.CampaignContentCountComparator;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.dao.search.SearchPaginationUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletURLFactoryUtil;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Eduardo Garcia
 */
@Component(immediate = true, provide = Report.class)
public class CampaignContentReport extends BaseReport {

	@Override
	public String getIcon() {
		return "icon-eye-open";
	}

	@Override
	public String getReportType() {
		return Campaign.class.getName();
	}

	@Override
	public void updateReport() {
		try {
			CampaignContentLocalServiceUtil.checkCampaignContentEvents();
		}
		catch (Exception e) {
			_log.error("Cannot update report");
		}
	}

	@Override
	protected void populateContext(Map<String, Object> context) {
		final long campaignId = MapUtil.getLong(context, "campaignId", 0);

		List<CampaignContent> campaignContents = Collections.emptyList();

		PortletRequest renderRequest = (PortletRequest)context.get(
			"renderRequest");

		PortletRequest renderResponse = (PortletRequest)context.get(
			"renderResponse");

		PortletURLFactoryUtil.create(renderRequest, );


		SearchContainer<CampaignContent> searchContainer =
			new SearchContainer<CampaignContent>(renderRequest, );

		searchContainer.setResults();
		searchContainer.setTotal();


		int totalCampaignContents = 0;

		if (campaignId == 0) {
			context.put("campaignContents", campaignContents);
			context.put("totalCampaignContents", totalCampaignContents);

			return;
		}

		HttpServletRequest request = (HttpServletRequest)context.get("request");

		int cur = ParamUtil.getInteger(
			request, SearchContainer.DEFAULT_CUR_PARAM,
			SearchContainer.DEFAULT_CUR);

		int delta = ParamUtil.getInteger(
			request, SearchContainer.DEFAULT_DELTA_PARAM,
			SearchContainer.DEFAULT_DELTA);

		int[] startAndEnd = SearchPaginationUtil.calculateStartAndEnd(
			cur, delta);

		try {
			campaignContents =
				CampaignContentLocalServiceUtil.getCampaignContents(
					campaignId, startAndEnd[0], startAndEnd[1],
					new CampaignContentCountComparator());

			totalCampaignContents =
				CampaignContentLocalServiceUtil.getCampaignContentsCount();
		}
		catch (Exception e) {
			_log.error("Cannot render report for campaign " + campaignId);
		}

		context.put(
			"searchContainerIterator",
			new SearchContainerIterator<CampaignContent>() {

				@Override
				public List<CampaignContent> getResults(int start, int end)
					throws SystemException, PortalException {

					return CampaignContentLocalServiceUtil.getCampaignContents(
						campaignId, start, end,
						new CampaignContentCountComparator());
				}

				@Override
				public int getTotal() throws SystemException, PortalException {
					return
						CampaignContentLocalServiceUtil.
							getCampaignContentsCount(campaignId);
				}
			}
		);

		context.put("campaignContents", campaignContents);
		context.put("totalCampaignContents", totalCampaignContents);
	}


	private static Log _log = LogFactoryUtil.getLog(
		CampaignContentReport.class);

	public class SearchContainerIterator<R> {
		public List<R> getResults(int start, int end)
			throws SystemException, PortalException {

			return Collections.emptyList();
		}

		public int getTotal() throws SystemException, PortalException {
			return 0;
		}
	}

}

