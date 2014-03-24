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

<@liferay_ui["header"]
	backURL="${redirect}"
	title='${(userSegment.getName(locale))!"new-user-segment"}'
/>

<@portlet["actionURL"] name="updateUserSegment" var="addUserSegmentURL" />

<@aui["form"] action="${addUserSegmentURL}" method="post" name="fm">
	<@aui["input"] name="redirect" type="hidden" value="${redirect}" />
	<@aui["input"] name="userSegmentId" type="hidden" value=userSegmentId />

	<@aui["model-context"] bean=userSegment model=userSegmentClass />

	<@aui["input"] name="name" />

	<@aui["input"] name="description" />

	<#if userSegment??>
		<div id="formBuilder"></div>
	</#if>

	<@aui["button-row"]>
		<@aui["button"] type="submit" />
	</@>
</@>

<#if userSegment??>
	<@aui["script"] use="aui-form-builder">

		<#list ruleTemplates?keys as ruleKey>
			<#assign rule=rulesRegistry.getRule(ruleKey)>
			<#assign ruleEditorType=rule.getEditorType()>

			var CT${ruleEditorType}RuleField = A.Component.create({

				NAME: 'ct-${ruleEditorType}-rule-field',

				EXTENDS: A.FormBuilderField,

				prototype: {
					getHTML: function() {
						var instance = this;

						return '<div> \
							<div class="rule-header"> \
								<i class="${rule.getIcon()} rule-icon"></i> \
								<div class="row rule-info"> \
									<div class="rule-title">${rule.getName(locale)}</div> \
									<div class="rule-description">${rule.getDescription(locale)}</div> \
								</div> \
							</div> \
							<div class="rule-editor"> \
								${ruleTemplates[ruleKey]} \
							</div> \
						</div>';
					}
				}

			});

			A.CT${ruleEditorType}RuleField = CT${ruleEditorType}RuleField;

			if (!A.FormBuilder.types.${ruleEditorType}) {
				A.FormBuilder.types.${ruleEditorType} = A.CT${ruleEditorType}RuleField;
			}
		</#list>
		;

		new A.FormBuilder(
			{
				boundingBox: '#formBuilder',

				availableFields:
				[
					<#list rules as rule>
						<#assign options=rule.getEditorOptions()>

						{
							acceptChildren: false,
							iconClass: '${rule.getIcon()}',

							<#if !rule.isInstantiable()>
							id: '${rule.getEditorType()}Unique',
							</#if>

							label: '<div class="row"><div class="rule-title">${rule.getName(locale)}</div><div class="rule-description">${rule.getDescription(locale)}</div></div>',
							options: [
								<#list options?keys as option>
									{
										label: '${option}',
										value: '${options[option]}'
									}

									<#if option_has_next>,</#if>
								</#list>
							],
							type: '${rule.getEditorType()}',
							unique: ${(!rule.isInstantiable())?string}
						}

						<#if rule_has_next>,</#if>
					</#list>
				],

				fields:
				[
					<#list ruleInstances as ruleInstance>
						<#assign rule = rulesRegistry.getRule(ruleInstance.getRuleKey())>
						<#assign options=rule.getEditorOptions()>

						{
							acceptChildren: false,
							iconClass: '${rule.getIcon()}',

							<#if !rule.isInstantiable()>
							id: '${rule.getEditorType()}Unique',
							</#if>

							label: '${rule.getName(locale)}',
							options: [
								<#list options?keys as option>
									{
										label: '${option}',
										value: '${options[option]}'
									}

									<#if option_has_next>,</#if>
								</#list>
							],
							type: '${rule.getEditorType()}',
							unique: ${(!rule.isInstantiable())?string}
						}

						<#if ruleInstance_has_next>,</#if>
					</#list>
				]
			}
		).render();
	</@>
</#if>