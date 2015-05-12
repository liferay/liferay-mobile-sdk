/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
import com.liferay.mobile.sdk.util.LanguageUtil;
import com.liferay.mobile.sdk.util.Validator;
import com.liferay.mobile.sdk.velocity.VelocityUtil;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.tools.generic.EscapeTool;

/**
 * @author Bruno Farache
 */
public class AndroidBuilder extends BaseBuilder {

	@Override
	public void build(
			Discovery discovery, List<Action> actions, String packageName,
			int version, String filter, String destination)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		if (Validator.isNotNull(destination)) {
			sb.append(destination);
			sb.append("/android/");
		}

		sb.append("src/gen/java");
		destination = sb.toString();

		VelocityContext context = getVelocityContext(
			discovery, actions, packageName, version, filter);

		String templatePath = "templates/android/service.vm";
		String filePath = getServiceFilePath(context, destination);

		VelocityUtil.generate(context, templatePath, filePath, true);
	}

	protected List<Action> excludeMethods(
		String className, List<Action> actions) {

		if (!className.equals("DDLRecordService")) {
			return actions;
		}

		actions = new ArrayList<Action>(actions);

		for (Action action : actions) {
			String path = action.getPath();

			if (path.equals("/ddlrecord/add-record")) {
				actions.remove(action);

				break;
			}
		}

		return actions;
	}

	protected String getServiceFilePath(
		VelocityContext context, String destination) {

		String packageName = (String)context.get(PACKAGE);
		String className = (String)context.get(CLASS_NAME);

		String packagePath = packageName.replace(".", "/");

		StringBuilder sb = new StringBuilder();

		sb.append(destination);
		sb.append("/");
		sb.append(packagePath);
		sb.append("/");

		File file = new File(sb.toString());
		file.mkdirs();

		sb.append(className);
		sb.append(".java");

		return sb.toString();
	}

	protected VelocityContext getVelocityContext(
		Discovery discovery, List<Action> actions, String packageName,
		int version, String filter) {

		VelocityContext context = new VelocityContext();

		JavaUtil javaUtil = new JavaUtil();

		StringBuilder sb = new StringBuilder(packageName);

		sb.append(".v");
		sb.append(version);
		sb.append(".");
		sb.append(filter);

		packageName = sb.toString();

		String className = javaUtil.getServiceClassName(filter);

		context.put(BYTE_ARRAY, LanguageUtil.BYTE_ARRAY);
		context.put(CLASS_NAME, className);
		context.put(DISCOVERY, discovery);
		context.put(ACTIONS, excludeMethods(className, actions));
		context.put(ESCAPE_TOOL, new EscapeTool());
		context.put(INPUT_STREAM_BODY, JavaUtil.INPUT_STREAM_BODY);
		context.put(INTEGER, JavaUtil.INTEGER);
		context.put(JSON_OBJECT_WRAPPER, JavaUtil.JSON_OBJECT_WRAPPER);
		context.put(LANGUAGE_UTIL, javaUtil);
		context.put(PACKAGE, packageName);
		context.put(VOID, LanguageUtil.VOID);

		return context;
	}

	protected static final String INPUT_STREAM_BODY = "INPUT_STREAM_BODY";

	protected static final String INTEGER = "INTEGER";

	protected static final String PACKAGE = "package";

}