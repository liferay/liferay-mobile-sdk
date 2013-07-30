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

package com.liferay.client.builder.velocity;

import com.liferay.client.builder.util.JavaUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

import java.util.Map;
import java.util.Set;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

/**
 * @author Bruno Farache
 */
public class VelocityUtil {

	public static void generate(
		String templateDir, Map<String, Object> actions) {

		Velocity.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		Velocity.setProperty(
			"classpath.resource.loader.class",
			ClasspathResourceLoader.class.getName());

		Velocity.init();

		VelocityContext context = new VelocityContext();

		JavaUtil javaUtil = new JavaUtil();

		String serviceContext = getServiceContext(actions);

		StringBuilder sb = new StringBuilder("com.liferay.client");
		sb.append(".");
		sb.append(serviceContext);

		String packageName = sb.toString();

		context.put("serviceContext", serviceContext);
		context.put("package", packageName);
		context.put("actions", actions);
		context.put("javaUtil", javaUtil);

		Template template = Velocity.getTemplate(templateDir + "service.vm");

		try {
			String className = javaUtil.getServiceClassName(serviceContext);

			String packagePath = packageName.replace(".", "/");

			sb = new StringBuilder();

			sb.append("gen/");
			sb.append(packagePath);
			sb.append("/");

			File file = new File(sb.toString());
			file.mkdirs();

			sb.append(className);
			sb.append(".java");

			Writer writer = new FileWriter(sb.toString());

			template.merge(context, writer);

			writer.flush();
			writer.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected static String getServiceContext(Map<String, Object> actions) {
		Set<String> keys = actions.keySet();

		for (String key : keys) {
			String[] serviceName = key.split("/");

			return serviceName[1];
		}

		return "";
	}

}