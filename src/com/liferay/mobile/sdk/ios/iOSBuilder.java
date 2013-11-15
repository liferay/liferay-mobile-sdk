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

package com.liferay.mobile.sdk.ios;

import com.liferay.mobile.sdk.BaseBuilder;
import com.liferay.mobile.sdk.http.Discovery;
import com.liferay.mobile.sdk.http.HttpUtil;
import com.liferay.mobile.sdk.velocity.VelocityUtil;

import java.io.File;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.tools.generic.EscapeTool;

/**
 * @author Bruno Farache
 */
public class iOSBuilder extends BaseBuilder {

	public void build(Discovery discovery, int version, String filter)
		throws Exception {

		VelocityContext context = getVelocityContext(
			discovery, version, filter);

		String headerTemplate = "com/liferay/mobile/sdk/ios/h.vm";
		String headerPath = getFilePath(context, version, true);

		VelocityUtil.generate(context, headerTemplate, headerPath, true);

		String implTemplate = "com/liferay/mobile/sdk/ios/m.vm";
		String implPath = getFilePath(context, version, false);

		VelocityUtil.generate(context, implTemplate, implPath, true);
	}

	protected String getFilePath(
		VelocityContext context, int version, boolean header) {

		String className = (String)context.get(CLASS_NAME);

		StringBuilder sb = new StringBuilder();

		sb.append("gen/ios/");

		if (version != HttpUtil.UNKNOWN_VERSION) {
			sb.append("v");
			sb.append(version);
			sb.append("/");
		}

		if (header) {
			sb.append("h/");
		}
		else {
			sb.append("m/");
		}

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
		Discovery discovery, int version, String filter) {

		VelocityContext context = new VelocityContext();

		ObjectiveCUtil objectiveCUtil = new ObjectiveCUtil();

		StringBuilder className = new StringBuilder(
			objectiveCUtil.getServiceClassName(filter));

		className.append("_v");
		className.append(version);

		context.put(CLASS_NAME, className.toString());
		context.put(DISCOVERY, discovery);
		context.put(ESCAPE_TOOL, new EscapeTool());
		context.put(LANGUAGE_UTIL, objectiveCUtil);

		return context;
	}

}