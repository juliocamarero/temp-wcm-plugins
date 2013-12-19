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

package com.liferay.contenttargeting.service.base;

import com.liferay.contenttargeting.model.Rule;
import com.liferay.contenttargeting.service.RuleLocalService;
import com.liferay.contenttargeting.service.persistence.CTUserPersistence;
import com.liferay.contenttargeting.service.persistence.RulePersistence;
import com.liferay.contenttargeting.service.persistence.UserSegmentPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the rule local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.contenttargeting.service.impl.RuleLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.contenttargeting.service.impl.RuleLocalServiceImpl
 * @see com.liferay.contenttargeting.service.RuleLocalServiceUtil
 * @generated
 */
public abstract class RuleLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements RuleLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.contenttargeting.service.RuleLocalServiceUtil} to access the rule local service.
	 */

	/**
	 * Adds the rule to the database. Also notifies the appropriate model listeners.
	 *
	 * @param rule the rule
	 * @return the rule that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Rule addRule(Rule rule) throws SystemException {
		rule.setNew(true);

		return rulePersistence.update(rule);
	}

	/**
	 * Creates a new rule with the primary key. Does not add the rule to the database.
	 *
	 * @param ruleId the primary key for the new rule
	 * @return the new rule
	 */
	@Override
	public Rule createRule(long ruleId) {
		return rulePersistence.create(ruleId);
	}

	/**
	 * Deletes the rule with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ruleId the primary key of the rule
	 * @return the rule that was removed
	 * @throws PortalException if a rule with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Rule deleteRule(long ruleId) throws PortalException, SystemException {
		return rulePersistence.remove(ruleId);
	}

	/**
	 * Deletes the rule from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rule the rule
	 * @return the rule that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Rule deleteRule(Rule rule) throws SystemException {
		return rulePersistence.remove(rule);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Rule.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return rulePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.model.impl.RuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return rulePersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.model.impl.RuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return rulePersistence.findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return rulePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return rulePersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Rule fetchRule(long ruleId) throws SystemException {
		return rulePersistence.fetchByPrimaryKey(ruleId);
	}

	/**
	 * Returns the rule with the matching UUID and company.
	 *
	 * @param uuid the rule's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching rule, or <code>null</code> if a matching rule could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rule fetchRuleByUuidAndCompanyId(String uuid, long companyId)
		throws SystemException {
		return rulePersistence.fetchByUuid_C_First(uuid, companyId, null);
	}

	/**
	 * Returns the rule matching the UUID and group.
	 *
	 * @param uuid the rule's UUID
	 * @param groupId the primary key of the group
	 * @return the matching rule, or <code>null</code> if a matching rule could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rule fetchRuleByUuidAndGroupId(String uuid, long groupId)
		throws SystemException {
		return rulePersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the rule with the primary key.
	 *
	 * @param ruleId the primary key of the rule
	 * @return the rule
	 * @throws PortalException if a rule with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rule getRule(long ruleId) throws PortalException, SystemException {
		return rulePersistence.findByPrimaryKey(ruleId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return rulePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the rule with the matching UUID and company.
	 *
	 * @param uuid the rule's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching rule
	 * @throws PortalException if a matching rule could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rule getRuleByUuidAndCompanyId(String uuid, long companyId)
		throws PortalException, SystemException {
		return rulePersistence.findByUuid_C_First(uuid, companyId, null);
	}

	/**
	 * Returns the rule matching the UUID and group.
	 *
	 * @param uuid the rule's UUID
	 * @param groupId the primary key of the group
	 * @return the matching rule
	 * @throws PortalException if a matching rule could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rule getRuleByUuidAndGroupId(String uuid, long groupId)
		throws PortalException, SystemException {
		return rulePersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the rules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contenttargeting.model.impl.RuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rules
	 * @param end the upper bound of the range of rules (not inclusive)
	 * @return the range of rules
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Rule> getRules(int start, int end) throws SystemException {
		return rulePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of rules.
	 *
	 * @return the number of rules
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getRulesCount() throws SystemException {
		return rulePersistence.countAll();
	}

	/**
	 * Updates the rule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param rule the rule
	 * @return the rule that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Rule updateRule(Rule rule) throws SystemException {
		return rulePersistence.update(rule);
	}

	/**
	 * Returns the c t user local service.
	 *
	 * @return the c t user local service
	 */
	public com.liferay.contenttargeting.service.CTUserLocalService getCTUserLocalService() {
		return ctUserLocalService;
	}

	/**
	 * Sets the c t user local service.
	 *
	 * @param ctUserLocalService the c t user local service
	 */
	public void setCTUserLocalService(
		com.liferay.contenttargeting.service.CTUserLocalService ctUserLocalService) {
		this.ctUserLocalService = ctUserLocalService;
	}

	/**
	 * Returns the c t user remote service.
	 *
	 * @return the c t user remote service
	 */
	public com.liferay.contenttargeting.service.CTUserService getCTUserService() {
		return ctUserService;
	}

	/**
	 * Sets the c t user remote service.
	 *
	 * @param ctUserService the c t user remote service
	 */
	public void setCTUserService(
		com.liferay.contenttargeting.service.CTUserService ctUserService) {
		this.ctUserService = ctUserService;
	}

	/**
	 * Returns the c t user persistence.
	 *
	 * @return the c t user persistence
	 */
	public CTUserPersistence getCTUserPersistence() {
		return ctUserPersistence;
	}

	/**
	 * Sets the c t user persistence.
	 *
	 * @param ctUserPersistence the c t user persistence
	 */
	public void setCTUserPersistence(CTUserPersistence ctUserPersistence) {
		this.ctUserPersistence = ctUserPersistence;
	}

	/**
	 * Returns the rule local service.
	 *
	 * @return the rule local service
	 */
	public com.liferay.contenttargeting.service.RuleLocalService getRuleLocalService() {
		return ruleLocalService;
	}

	/**
	 * Sets the rule local service.
	 *
	 * @param ruleLocalService the rule local service
	 */
	public void setRuleLocalService(
		com.liferay.contenttargeting.service.RuleLocalService ruleLocalService) {
		this.ruleLocalService = ruleLocalService;
	}

	/**
	 * Returns the rule remote service.
	 *
	 * @return the rule remote service
	 */
	public com.liferay.contenttargeting.service.RuleService getRuleService() {
		return ruleService;
	}

	/**
	 * Sets the rule remote service.
	 *
	 * @param ruleService the rule remote service
	 */
	public void setRuleService(
		com.liferay.contenttargeting.service.RuleService ruleService) {
		this.ruleService = ruleService;
	}

	/**
	 * Returns the rule persistence.
	 *
	 * @return the rule persistence
	 */
	public RulePersistence getRulePersistence() {
		return rulePersistence;
	}

	/**
	 * Sets the rule persistence.
	 *
	 * @param rulePersistence the rule persistence
	 */
	public void setRulePersistence(RulePersistence rulePersistence) {
		this.rulePersistence = rulePersistence;
	}

	/**
	 * Returns the user segment local service.
	 *
	 * @return the user segment local service
	 */
	public com.liferay.contenttargeting.service.UserSegmentLocalService getUserSegmentLocalService() {
		return userSegmentLocalService;
	}

	/**
	 * Sets the user segment local service.
	 *
	 * @param userSegmentLocalService the user segment local service
	 */
	public void setUserSegmentLocalService(
		com.liferay.contenttargeting.service.UserSegmentLocalService userSegmentLocalService) {
		this.userSegmentLocalService = userSegmentLocalService;
	}

	/**
	 * Returns the user segment remote service.
	 *
	 * @return the user segment remote service
	 */
	public com.liferay.contenttargeting.service.UserSegmentService getUserSegmentService() {
		return userSegmentService;
	}

	/**
	 * Sets the user segment remote service.
	 *
	 * @param userSegmentService the user segment remote service
	 */
	public void setUserSegmentService(
		com.liferay.contenttargeting.service.UserSegmentService userSegmentService) {
		this.userSegmentService = userSegmentService;
	}

	/**
	 * Returns the user segment persistence.
	 *
	 * @return the user segment persistence
	 */
	public UserSegmentPersistence getUserSegmentPersistence() {
		return userSegmentPersistence;
	}

	/**
	 * Sets the user segment persistence.
	 *
	 * @param userSegmentPersistence the user segment persistence
	 */
	public void setUserSegmentPersistence(
		UserSegmentPersistence userSegmentPersistence) {
		this.userSegmentPersistence = userSegmentPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.liferay.contenttargeting.model.Rule",
			ruleLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.liferay.contenttargeting.model.Rule");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Rule.class;
	}

	protected String getModelClassName() {
		return Rule.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = rulePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.contenttargeting.service.CTUserLocalService.class)
	protected com.liferay.contenttargeting.service.CTUserLocalService ctUserLocalService;
	@BeanReference(type = com.liferay.contenttargeting.service.CTUserService.class)
	protected com.liferay.contenttargeting.service.CTUserService ctUserService;
	@BeanReference(type = CTUserPersistence.class)
	protected CTUserPersistence ctUserPersistence;
	@BeanReference(type = com.liferay.contenttargeting.service.RuleLocalService.class)
	protected com.liferay.contenttargeting.service.RuleLocalService ruleLocalService;
	@BeanReference(type = com.liferay.contenttargeting.service.RuleService.class)
	protected com.liferay.contenttargeting.service.RuleService ruleService;
	@BeanReference(type = RulePersistence.class)
	protected RulePersistence rulePersistence;
	@BeanReference(type = com.liferay.contenttargeting.service.UserSegmentLocalService.class)
	protected com.liferay.contenttargeting.service.UserSegmentLocalService userSegmentLocalService;
	@BeanReference(type = com.liferay.contenttargeting.service.UserSegmentService.class)
	protected com.liferay.contenttargeting.service.UserSegmentService userSegmentService;
	@BeanReference(type = UserSegmentPersistence.class)
	protected UserSegmentPersistence userSegmentPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private RuleLocalServiceClpInvoker _clpInvoker = new RuleLocalServiceClpInvoker();
}