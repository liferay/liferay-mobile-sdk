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

import com.liferay.mobile.sdk.BaseBuilder;
import com.liferay.mobile.sdk.http.Action;
import com.liferay.mobile.sdk.http.Discovery;
import com.liferay.mobile.sdk.http.HttpUtil;
import com.liferay.mobile.sdk.velocity.VelocityUtil;

import java.io.File;

import java.util.ArrayList;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.tools.generic.EscapeTool;

/**
 * @author Bruno Farache
 */
public class AndroidBuilder extends BaseBuilder {

	public void build(Discovery discovery, int version, String filter)
		throws Exception {

		VelocityContext context = getVelocityContext(
			discovery, version, filter);

		String templatePath = "com/liferay/mobile/sdk/android/service.vm";
		String filePath = getServiceFilePath(context);

		VelocityUtil.generate(context, templatePath, filePath);
	}

	protected String getServiceFilePath(VelocityContext context) {
		String packageName = (String)context.get(PACKAGE);
		String className = (String)context.get(CLASS_NAME);

		String packagePath = packageName.replace(".", "/");

		StringBuilder sb = new StringBuilder();

		sb.append("gen/android/src/");
		sb.append(packagePath);
		sb.append("/");

		File file = new File(sb.toString());
		file.mkdirs();

		sb.append(className);
		sb.append(".java");

		return sb.toString();
	}

	protected VelocityContext getVelocityContext(
		Discovery discovery, int version, String filter) {

		VelocityContext context = new VelocityContext();

		JavaUtil javaUtil = new JavaUtil();

		StringBuilder sb = new StringBuilder("com.liferay.mobile.android");

		if (version != HttpUtil.UNKNOWN_VERSION) {
			sb.append(".v");
			sb.append(version);
		}

		sb.append(".");
		sb.append(filter);

		String packageName = sb.toString();

		context.put(CLASS_NAME, javaUtil.getServiceClassName(filter));
		context.put(DISCOVERY, discovery);
		context.put(ESCAPE_TOOL, new EscapeTool());
		context.put(LANGUAGE_UTIL, javaUtil);
		context.put(PACKAGE, packageName);

		_excludeMethods(context);

		return context;
	}

	protected static final String PACKAGE = "package";

	private void _excludeMethods(VelocityContext context) {
		String className = (String)context.get(CLASS_NAME);
		Discovery discovery = (Discovery)context.get(DISCOVERY);

		if (!className.equals("DDLRecordService")) {
			return;
		}

		ArrayList<Action> actions = discovery.getActions();

		for (Action action : actions) {
			String path = action.getPath();

			if (path.equals("/ddlrecord/add-record")) {
				actions.remove(action);

				break;
			}
		}
	}

}