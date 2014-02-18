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

package com.liferay.contenttargeting.rules.scorepoints.service.impl;

import com.liferay.contenttargeting.rules.scorepoints.model.ScorePoint;
import com.liferay.contenttargeting.rules.scorepoints.service.base.ScorePointLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the score point local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.contenttargeting.rules.scorepoints.service.ScorePointLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.contenttargeting.rules.scorepoints.service.base.ScorePointLocalServiceBaseImpl
 * @see com.liferay.contenttargeting.rules.scorepoints.service.ScorePointLocalServiceUtil
 */
public class ScorePointLocalServiceImpl extends ScorePointLocalServiceBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.contenttargeting.rules.scorepoints.service.ScorePointLocalServiceUtil} to access the score point local service.
	 */

	public ScorePoint addScorePoints(long ctUserId, long assetCategoryId)
		throws SystemException {

		return addScorePoints(ctUserId, assetCategoryId, 0);
	}

	public ScorePoint addScorePoints(
			long ctUserId, long assetCategoryId, long points)
		throws SystemException {

		long scorePointId = CounterLocalServiceUtil.increment();

		ScorePoint scorePoint = scorePointPersistence.create(scorePointId);

		scorePoint.setCTUserId(ctUserId);
		scorePoint.setAssetCategoryId(assetCategoryId);
		scorePoint.setPoints(points);

		scorePointPersistence.update(scorePoint);

		return scorePoint;
	}

	public long getPoints(long ctUserId, long assetCategoryId)
		throws SystemException {

		ScorePoint scorePoint = scorePointPersistence.fetchByC_U(
				ctUserId, assetCategoryId);

		if (scorePoint == null) {
			return 0;
		}

		return scorePoint.getPoints();
	}

	public long incrementPoints(
			long ctUserId, long assetCategoryId, long points)
		throws SystemException {

		ScorePoint scorePoint = scorePointPersistence.fetchByC_U(
			ctUserId, assetCategoryId);

		if (scorePoint == null) {
			scorePoint = scorePointLocalService.addScorePoints(
				ctUserId, assetCategoryId);
		}

		long total = scorePoint.getPoints() + points;

		scorePoint.setPoints(total);

		scorePointPersistence.update(scorePoint);

		return total;
	}

	public ScorePoint updateScorePoints(
			long ctUserId, long assetCategoryId, long points)
		throws SystemException {

		ScorePoint scorePoint = scorePointPersistence.fetchByC_U(
			ctUserId, assetCategoryId);

		scorePoint.setPoints(points);

		scorePointPersistence.update(scorePoint);

		return scorePoint;
	}

}