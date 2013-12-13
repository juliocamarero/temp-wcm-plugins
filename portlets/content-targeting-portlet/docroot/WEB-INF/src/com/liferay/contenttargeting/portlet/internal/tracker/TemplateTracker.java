package com.liferay.contenttargeting.portlet.internal.tracker;

import java.net.URL;

import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleEvent;
import org.osgi.util.tracker.BundleTrackerCustomizer;

/**
 * @author Eduardo Garcia
 */
public class TemplateTracker implements BundleTrackerCustomizer {

	@Override
	public Object addingBundle(Bundle bundle, BundleEvent event) {

		// lets track all the bundles publishing the _TEMPLATES_LOCATION

		String templatesLocation = bundle.getHeaders().get(_TEMPLATES_LOCATION);

		if (templatesLocation == null) {
			System.out.println("No templates provided");

			return bundle;
		}

		Enumeration<URL> templates = bundle.findEntries(
			templatesLocation, ".ftl", true);

		while (templates.hasMoreElements()) {
			URL template = templates.nextElement();

			System.out.println(
				"Registered template " + template.toExternalForm());

			_registeredTemplates.add(template);
		}

		return bundle;
	}

	@Override
	public void modifiedBundle(Bundle bundle, BundleEvent event, Object object) {
	}

	@Override
	public void removedBundle(Bundle bundle, BundleEvent event, Object object) {
	}

	private final static String _TEMPLATES_LOCATION = "Templates-Location";

	private List<URL> _registeredTemplates = new CopyOnWriteArrayList<URL>();

}