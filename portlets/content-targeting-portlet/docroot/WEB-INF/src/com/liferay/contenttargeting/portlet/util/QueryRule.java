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

package com.liferay.contenttargeting.portlet.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portlet.asset.AssetRendererFactoryRegistryUtil;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.AssetRendererFactory;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;

import java.util.Locale;

import javax.portlet.PortletRequest;

/**
 * @author Eudaldo Alonso
 */
public class QueryRule {

	public QueryRule(
			boolean andOperator, boolean contains, long assetEntryId,
			long[] userSegmentAssetCategoryIds, int index, Locale locale)
		throws PortalException, SystemException {

		_andOperator = andOperator;
		_contains = contains;
		_assetEntryId = assetEntryId;
		_userSegmentAssetCategoryIds = userSegmentAssetCategoryIds;
		_index = index;

		AssetEntry assetEntry = AssetEntryLocalServiceUtil.fetchAssetEntry(
			_assetEntryId);

		if (assetEntry == null) {
			return;
		}

		AssetRendererFactory assetRendererFactory =
			AssetRendererFactoryRegistryUtil.getAssetRendererFactoryByClassName(
				assetEntry.getClassName());

		_assetClassName = assetEntry.getClassName();
		_assetClassPK = assetEntry.getClassPK();
		_assetTitle = assetEntry.getTitle(locale);
		_assetType = assetRendererFactory.getTypeName(locale, true);
	}

	public boolean evaluate(long[] userSegmentAssetCategoryIds) {
		if (_contains) {
			if (_andOperator) {
				return ArrayUtil.containsAll(
					_userSegmentAssetCategoryIds, userSegmentAssetCategoryIds);
			}
			else {
				for (long userSegmentAssetCategoryId :
						userSegmentAssetCategoryIds) {

					if (ArrayUtil.contains(
							_userSegmentAssetCategoryIds,
							userSegmentAssetCategoryId)) {

						return true;
					}
				}

				return false;
			}
		}
		else {
			if (_andOperator) {
				for (long userSegmentAssetCategoryId :
						userSegmentAssetCategoryIds) {

					if (ArrayUtil.contains(
							_userSegmentAssetCategoryIds,
							userSegmentAssetCategoryId)) {

						return false;
					}
				}

				return true;
			}
			else {
				for (long userSegmentAssetCategoryId :
						userSegmentAssetCategoryIds) {

					if (!ArrayUtil.contains(
							_userSegmentAssetCategoryIds,
							userSegmentAssetCategoryId)) {

						return true;
					}
				}

				return false;
			}
		}
	}

	public String getAssetClassName() {
		return _assetClassName;
	}

	public long getAssetClassPK() {
		return _assetClassPK;
	}

	public long getAssetEntryId() {
		return _assetEntryId;
	}

	public String getAssetImage(PortletRequest portletRequest)
		throws Exception {

		AssetRendererFactory assetRendererFactory =
			AssetRendererFactoryRegistryUtil.getAssetRendererFactoryByClassName(
				_assetClassName);

		AssetRenderer assetRenderer = assetRendererFactory.getAssetRenderer(
			_assetClassPK);

		return assetRenderer.getThumbnailPath(portletRequest);
	}

	public String getAssetTitle() {
		return _assetTitle;
	}

	public String getAssetType() {
		return _assetType;
	}

	public int getIndex() {
		return _index;
	}

	public long[] getUserSegmentAssetCategoryIds() {
		return _userSegmentAssetCategoryIds;
	}

	public String getUserSegmentAssetCategoryIdsAsString() {
		if (ArrayUtil.isEmpty(_userSegmentAssetCategoryIds)) {
			return StringPool.BLANK;
		}

		return StringUtil.merge(_userSegmentAssetCategoryIds);
	}

	public String getUserSegmentNames(Locale locale) throws SystemException {
		return getUserSegmentNames(locale, StringPool.COMMA_AND_SPACE);
	}

	protected String getUserSegmentNames(Locale locale, String separator)
		throws SystemException {

		if (ArrayUtil.isEmpty(_userSegmentAssetCategoryIds)) {
			return StringPool.BLANK;
		}

		StringBundler sb = new StringBundler(
			(_userSegmentAssetCategoryIds.length * 2) - 1);

		for (long userSegmentAssetCategoryId : _userSegmentAssetCategoryIds) {
			AssetCategory assetCategory =
				AssetCategoryLocalServiceUtil.fetchAssetCategory(
					userSegmentAssetCategoryId);

			if (assetCategory == null) {
				continue;
			}

			sb.append(assetCategory.getTitle(locale));
			sb.append(separator);
		}

		return sb.toString();
	}

	public String getUserSegmentAssetCategoryNames(Locale locale)
		throws SystemException {

		return getUserSegmentNames(locale, _CATEGORY_SEPARATOR);
	}

	public boolean isAndOperator() {
		return _andOperator;
	}

	public boolean isContains() {
		return _contains;
	}

	public boolean isValid() {
		if (Validator.isNull(_assetClassName) || (_assetClassPK <= 0)) {
			return false;
		}

		if (ArrayUtil.isEmpty(_userSegmentAssetCategoryIds)) {
			return false;
		}

		return true;
	}

	public void setAndOperator(boolean andOperator) {
		_andOperator = andOperator;
	}

	public void setAssetClassName(String assetClassName) {
		_assetClassName = assetClassName;
	}

	public void setAssetClassPK(long assetClassPK) {
		_assetClassPK = assetClassPK;
	}

	public void setAssetEntryId(long assetEntryId) {
		_assetEntryId = assetEntryId;
	}

	public void setAssetTitle(String assetTitle) {
		_assetTitle = assetTitle;
	}

	public void setAssetType(String assetType) {
		_assetType = assetType;
	}

	public void setContains(boolean contains) {
		_contains = contains;
	}

	public void setIndex(int index) {
		_index = index;
	}

	public void setUserSegmentAssetCategoryIds(
		long[] userSegmentAssetCategoryIds) {

		_userSegmentAssetCategoryIds = userSegmentAssetCategoryIds;
	}

	private static final String _CATEGORY_SEPARATOR = "_CATEGORY_";

	private boolean _andOperator;
	private String _assetClassName = StringPool.BLANK;
	private long _assetClassPK;
	private long _assetEntryId;
	private String _assetTitle = StringPool.BLANK;
	private String _assetType = StringPool.BLANK;
	private boolean _contains;
	private int _index;
	private long[] _userSegmentAssetCategoryIds;

}