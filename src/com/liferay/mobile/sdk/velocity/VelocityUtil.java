/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.sdk.velocity;

import java.io.FileWriter;
import java.io.Writer;

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
			VelocityContext context, String templatePath, String filePath)
		throws Exception {

		generate(context, templatePath, filePath, false);
	}

	public static void generate(
			VelocityContext context, String templatePath, String filePath,
			boolean format)
		throws Exception {

		String resourceLoader = ClasspathResourceLoader.class.getName();

		if (format) {
			resourceLoader = FormatterResourceLoader.class.getName();
		}

		Velocity.setProperty(RuntimeConstants.VM_LIBRARY, "macros.vm");
		Velocity.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		Velocity.setProperty("classpath.resource.loader.class", resourceLoader);

		Velocity.init();

		Template template = Velocity.getTemplate(templatePath);

		Writer writer = new FileWriter(filePath);

		template.merge(context, writer);

		writer.flush();
		writer.close();
	}

}