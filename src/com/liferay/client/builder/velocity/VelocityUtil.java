/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

import java.io.StringWriter;
import java.util.Map;
import java.util.Set;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import com.liferay.client.builder.util.JavaUtil;

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
		
		String serviceContext = getServiceContext(actions);
		
		context.put("serviceContext", serviceContext);
		context.put("actions", actions);
		context.put("javaUtil", new JavaUtil());
		
		Template template = Velocity.getTemplate(templateDir + "service.vm");
		
		StringWriter writer = new StringWriter();
		
		template.merge(context, writer);
		
		System.out.println(writer);
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