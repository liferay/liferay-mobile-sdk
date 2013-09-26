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

package com.liferay.mobile.sdk.android;

import com.liferay.mobile.sdk.Builder;
import com.liferay.mobile.sdk.http.Action;
import com.liferay.mobile.sdk.http.Discovery;
import com.liferay.mobile.sdk.http.PortalVersion;
import com.liferay.mobile.sdk.velocity.VelocityUtil;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.tools.generic.EscapeTool;

/**
 * @author Bruno Farache
 */
public class AndroidBuilder implements Builder {

	public void build(String filter, PortalVersion version, Discovery discovery)
		throws Exception {

		VelocityContext context = getVelocityContext(
			filter, version, discovery);

		buildServiceImpl(context);
	}

	public void buildAll(PortalVersion version, Discovery discovery)
		throws Exception {

		HashMap<String, ArrayList<Action>> actionsMap =
			new HashMap<String, ArrayList<Action>>();

		ArrayList<Action> actions = discovery.getActions();

		for (Action action : actions) {
			String path = action.getPath();

			String className = path.substring(1, path.indexOf("/", 1));
			ArrayList<Action> classActions = actionsMap.get(className);

			if (classActions == null) {
				classActions = new ArrayList<Action>();

				actionsMap.put(className, classActions);
			}

			classActions.add(action);
		}

		for (Entry<String, ArrayList<Action>> entry : actionsMap.entrySet()) {
			discovery.setActions(entry.getValue());

			build(entry.getKey(), version, discovery);
		}
	}

	protected void buildServiceImpl(VelocityContext context) throws Exception {
		String templatePath = "service.vm";
		String filePath = getServiceFilePath(context);

		VelocityUtil.generate(context, templatePath, filePath);
	}

	protected String getServiceFilePath(VelocityContext context) {
		String packageName = (String)context.get(PACKAGE);
		String className = (String)context.get(CLASS_NAME);

		String packagePath = packageName.replace(".", "/");

		StringBuilder sb = new StringBuilder();

		sb.append("gen/src/");
		sb.append(packagePath);
		sb.append("/");

		File file = new File(sb.toString());
		file.mkdirs();

		sb.append(className);
		sb.append(".java");

		return sb.toString();
	}

	protected VelocityContext getVelocityContext(
		String filter, PortalVersion version, Discovery discovery) {

		VelocityContext context = new VelocityContext();

		JavaUtil javaUtil = new JavaUtil();

		StringBuilder sb = new StringBuilder("com.liferay.mobile.android");

		if (version != PortalVersion.UNKNOWN) {
			sb.append(".v");
			sb.append(version.getValue());
		}

		sb.append(".");
		sb.append(filter);

		String packageName = sb.toString();

		context.put(CLASS_NAME, javaUtil.getServiceClassName(filter));
		context.put(DISCOVERY, discovery);
		context.put(ESCAPE_TOOL, new EscapeTool());
		context.put(JAVA_UTIL, javaUtil);
		context.put(PACKAGE, packageName);

		return context;
	}

	protected static final String CLASS_NAME = "className";

	protected static final String DISCOVERY = "discovery";

	protected static final String ESCAPE_TOOL = "esc";

	protected static final String JAVA_UTIL = "javaUtil";

	protected static final String PACKAGE = "package";

}