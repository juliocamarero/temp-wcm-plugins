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

package com.liferay.contenttargeting.rules.scorepoints.analytics;

import com.liferay.contenttargeting.rules.scorepoints.service.ScorePointLocalServiceUtil;
import com.liferay.contenttargeting.util.ContentTargetingUtil;
import com.liferay.contenttargeting.util.UserSegmentUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portlet.asset.AssetRendererFactoryRegistryUtil;
import com.liferay.portlet.asset.NoSuchVocabularyException;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.model.AssetRendererFactory;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetVocabularyLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eudaldo Alonso
 */
public class ScorePointsAssigner {

	public static void assignPoints(
			long groupId, long ctUserId, String className, long classPK)
		throws Exception {

		AssetRendererFactory assetRendererFactory =
			AssetRendererFactoryRegistryUtil.getAssetRendererFactoryByClassName(
				className);

		AssetEntry entry = null;

		try {
			entry = assetRendererFactory.getAssetEntry(className, classPK);
		}
		catch (Exception e) {
			return;
		}

		long[] groupIds = ContentTargetingUtil.getAncestorsAndCurrentGroupIds(
			groupId);

		List<AssetCategory> categories = new ArrayList<AssetCategory>();

		for (long curGroupId : groupIds) {
			AssetVocabulary vocabulary = null;

			try {
				vocabulary = AssetVocabularyLocalServiceUtil.getGroupVocabulary(
					curGroupId, UserSegmentUtil.getAssetVocabularyName());
			}
			catch (NoSuchVocabularyException nsve) {
				continue;
			}

			List<AssetCategory> curCategories =
				AssetCategoryLocalServiceUtil.getVocabularyCategories(
					vocabulary.getVocabularyId(), QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null);

			categories.addAll(curCategories);
		}

		long[] assetCategoryIds = entry.getCategoryIds();

		if (categories.isEmpty() || ArrayUtil.isEmpty(assetCategoryIds)) {
			return;
		}

		for (AssetCategory category : categories) {
			if (ArrayUtil.contains(
					assetCategoryIds, category.getCategoryId())) {

				long points = getScorePoints(
					className, classPK, category.getCategoryId());

				ScorePointLocalServiceUtil.incrementPoints(
					ctUserId, category.getCategoryId(), points);
			}
		}
	}

	protected static long getScorePoints(
		String className, long classPK, long categoryId) {

		return DEFAULT_POINTS;
	}

	private static final long DEFAULT_POINTS = 1;

}