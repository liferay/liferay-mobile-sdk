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

package com.liferay.mobile.sdk.ios;

import com.liferay.mobile.sdk.BaseBuilder;
import com.liferay.mobile.sdk.http.Action;
import com.liferay.mobile.sdk.http.Discovery;
import com.liferay.mobile.sdk.util.LanguageUtil;
import com.liferay.mobile.sdk.util.Validator;
import com.liferay.mobile.sdk.velocity.VelocityUtil;

import java.io.File;

import java.util.List;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.tools.generic.EscapeTool;

/**
 * @author Bruno Farache
 */
public class iOSBuilder extends BaseBuilder {

	@Override
	public void build(
			Discovery discovery, List<Action> actions, String packageName,
			int version, String filter, String destination)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		if (Validator.isNotNull(destination)) {
			sb.append(destination);
			sb.append("/ios/");
		}

		sb.append("Source/Service");
		destination = sb.toString();

		VelocityContext context = getVelocityContext(
			discovery, actions, version, filter);

		String headerTemplate = "templates/ios/h.vm";
		String headerPath = getFilePath(
			context, version, true, destination, filter);

		VelocityUtil.generate(context, headerTemplate, headerPath, true);

		String implTemplate = "templates/ios/m.vm";
		String implPath = getFilePath(
			context, version, false, destination, filter);

		VelocityUtil.generate(context, implTemplate, implPath, true);
	}

	protected String getFilePath(
		VelocityContext context, int version, boolean header,
		String destination, String filter) {

		String className = (String)context.get(CLASS_NAME);

		StringBuilder sb = new StringBuilder();

		sb.append(destination);
		sb.append("/");
		sb.append("v");
		sb.append(version);
		sb.append("/");

		sb.append(filter);
		sb.append("/");

		File file = new File(sb.toString());
		file.mkdirs();

		sb.append(className);

		if (header) {
			sb.append(".h");
		}
		else {
			sb.append(".m");
		}

		return sb.toString();
	}

	protected VelocityContext getVelocityContext(
		Discovery discovery, List<Action> actions, int version, String filter) {

		VelocityContext context = new VelocityContext();

		ObjectiveCUtil objectiveCUtil = new ObjectiveCUtil();

		StringBuilder className = new StringBuilder("LR");

		className.append(objectiveCUtil.getServiceClassName(filter));
		className.append("_v");
		className.append(version);

		context.put(ACTIONS, actions);
		context.put(BOOL, ObjectiveCUtil.BOOL);
		context.put(CLASS_NAME, className.toString());
		context.put(DISCOVERY, discovery);
		context.put(ESCAPE_TOOL, new EscapeTool());
		context.put(JSON_OBJECT_WRAPPER, ObjectiveCUtil.LR_JSON_OBJECT_WRAPPER);
		context.put(LANGUAGE_UTIL, objectiveCUtil);
		context.put(LR_UPLOAD_DATA, objectiveCUtil.LR_UPLOAD_DATA);
		context.put(VOID, LanguageUtil.VOID);

		return context;
	}

	protected static final String BOOL = "BOOL";

	protected static final String LR_UPLOAD_DATA = "LR_UPLOAD_DATA";

}