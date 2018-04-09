/**
 * Copyright (c) 2014 Andrea Di Giorgi. All rights reserved.
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

package com.liferay.mobile.windows;

import com.liferay.mobile.sdk.BaseBuilder;
import com.liferay.mobile.sdk.http.Discovery;
import com.liferay.mobile.sdk.util.CharPool;
import com.liferay.mobile.sdk.util.LanguageUtil;
import com.liferay.mobile.sdk.util.Validator;
import com.liferay.mobile.sdk.velocity.VelocityUtil;

import java.io.File;

import org.apache.commons.lang.WordUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.tools.generic.EscapeTool;

/**
 * @author Andrea Di Giorgi (adigiorgi@outlook.com)
 */
public class WindowsSDKBuilder extends BaseBuilder {

	@Override
	public void build(
			Discovery discovery, String packageName, int version, String filter,
			String destination)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		if (Validator.isNotNull(destination)) {
			sb.append(destination);
			sb.append("/windows/");
		}

		sb.append("Liferay.SDK/Service");
		destination = sb.toString();

		VelocityContext context = getVelocityContext(
			discovery, packageName, version, filter);

		String templatePath = "templates/windows/service.vm";
		String filePath = getServiceFilePath(
			context, version, destination, filter);

		VelocityUtil.generate(context, templatePath, filePath, true);
	}

	protected String getServiceFilePath(
		VelocityContext context, int version, String destination,
		String filter) {

		String className = (String)context.get(CLASS_NAME);

		StringBuilder sb = new StringBuilder();

		sb.append(destination);
		sb.append("/V");
		sb.append(version);
		sb.append(CharPool.SLASH);

		sb.append(WordUtils.capitalize(filter));
		sb.append(CharPool.SLASH);

		File file = new File(sb.toString());
		file.mkdirs();

		sb.append(className);
		sb.append(".cs");

		return sb.toString();
	}

	protected VelocityContext getVelocityContext(
		Discovery discovery, String packageName, int version, String filter) {

		VelocityContext context = new VelocityContext();

		CSharpUtil cSharpUtil = new CSharpUtil();

		StringBuilder sb = new StringBuilder(packageName);

		sb.append(".V");
		sb.append(version);
		sb.append(CharPool.PERIOD);
		sb.append(WordUtils.capitalize(filter));

		packageName = sb.toString();

		context.put(BYTE_ARRAY, LanguageUtil.BYTE_ARRAY);
		context.put(CLASS_NAME, cSharpUtil.getServiceClassName(filter));
		context.put(DISCOVERY, discovery);
		context.put(ESCAPE_TOOL, new EscapeTool());
		context.put(JSON_OBJECT_WRAPPER, CSharpUtil.JSON_OBJECT_WRAPPER);
		context.put(LANGUAGE_UTIL, cSharpUtil);
		context.put(PACKAGE, packageName);
		context.put(VOID, LanguageUtil.VOID);

		return context;
	}

	protected static final String PACKAGE = "package";

}