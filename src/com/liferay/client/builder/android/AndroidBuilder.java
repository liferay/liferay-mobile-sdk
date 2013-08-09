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

package com.liferay.client.builder.android;

import com.liferay.client.builder.Builder;
import com.liferay.client.builder.ClientBuilder;
import com.liferay.client.builder.http.Discovery;
import com.liferay.client.builder.velocity.VelocityUtil;

import java.io.File;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.tools.generic.EscapeTool;

/**
 * @author Bruno Farache
 */
public class AndroidBuilder implements Builder {

	public void build(
			String serviceContext, String portalVersion, Discovery discovery)
		throws Exception {

		VelocityContext context = getVelocityContext(
			serviceContext, portalVersion, discovery);

		buildServiceImpl(context);
	}

	protected void buildServiceImpl(VelocityContext context) throws Exception {
		String templatePath = "android/service.vm";
		String filePath = getServiceFilePath(context);

		VelocityUtil.generate(context, templatePath, filePath);
	}

	protected String getServiceFilePath(VelocityContext context) {
		JavaUtil javaUtil = (JavaUtil)context.get(JAVA_UTIL);
		String packageName = (String)context.get(PACKAGE);
		String serviceContext = (String)context.get(SERVICE_CONTEXT);

		String packagePath = packageName.replace(".", "/");
		String className = javaUtil.getServiceClassName(serviceContext);

		StringBuilder sb = new StringBuilder();

		sb.append("gen/");
		sb.append(packagePath);
		sb.append("/");

		File file = new File(sb.toString());
		file.mkdirs();

		sb.append(className);
		sb.append(".java");

		return sb.toString();
	}

	protected VelocityContext getVelocityContext(
		String serviceContext, String portalVersion, Discovery discovery) {

		VelocityContext context = new VelocityContext();

		StringBuilder sb = new StringBuilder("com.liferay.client");

		if (!portalVersion.equals(ClientBuilder.UNKOWN_PORTAL_VERSION)) {
			sb.append(".v");
			sb.append(portalVersion);
		}

		sb.append(".");
		sb.append(serviceContext);

		String packageName = sb.toString();

		context.put(DISCOVERY, discovery);
		context.put(ESCAPE_TOOL, new EscapeTool());
		context.put(JAVA_UTIL, new JavaUtil());
		context.put(PACKAGE, packageName);
		context.put(SERVICE_CONTEXT, serviceContext);

		return context;
	}

	protected static final String DISCOVERY = "discovery";

	protected static final String ESCAPE_TOOL = "esc";

	protected static final String JAVA_UTIL = "javaUtil";

	protected static final String PACKAGE = "package";

	protected static final String SERVICE_CONTEXT = "serviceContext";

}