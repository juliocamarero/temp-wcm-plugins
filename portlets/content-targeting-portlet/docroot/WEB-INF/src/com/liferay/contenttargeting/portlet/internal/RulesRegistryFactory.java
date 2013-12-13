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

package com.liferay.contenttargeting.portlet.internal;

import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Deactivate;
import aQute.bnd.annotation.component.Reference;

import com.liferay.contenttargeting.api.model.RulesRegistry;
import com.liferay.contenttargeting.portlet.internal.tracker.TemplateTracker;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.osgi.util.tracker.BundleTracker;

/**
 * @author Eduardo Garcia
 */
@Component(immediate = true)
public class RulesRegistryFactory {

	public static RulesRegistry getRulesRegistryFactory() {
		return _rulesRegistry;
	}

	@Activate
	public void activate(ComponentContext componentContext) {
		final BundleContext bundleContext = componentContext.getBundleContext();

		_bundleTracker = new BundleTracker<Object>(
			bundleContext, Bundle.RESOLVED, new TemplateTracker());

		System.out.println("Opening bundle tracker ....");
		_bundleTracker.open();
	}

	@Deactivate
	public void deactivate() {
		System.out.println("Closing bundle tracker ...");
		_bundleTracker.close();
	}

	@Reference(type = '?', unbind ="setRulesRegistry")
	public void setRulesRegistry(RulesRegistry rulesRegistry) {
		_rulesRegistry = rulesRegistry;
	}

	private static RulesRegistry _rulesRegistry;

	private BundleTracker<Object> _bundleTracker = null;

}