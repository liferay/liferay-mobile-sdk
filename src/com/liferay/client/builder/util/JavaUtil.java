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

package com.liferay.client.builder.util;

import org.apache.commons.lang.WordUtils;

/**
 * @author Bruno Farache
 */
public class JavaUtil {

	public String getMethodName(String path) {
		String last = getMethodURL(path);
		
		String[] methodName = last.split("-");
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < methodName.length; i++) {
			String word = methodName[i];
			
			if (i > 0) {
				word = WordUtils.capitalize(word);
			} 
			
			sb.append(word);
		}
		
		return sb.toString();
	}
	
	public String getMethodURL(String path) {
		int index = path.lastIndexOf("/") + 1;
		
		return path.substring(index);
	}
	
	public String getServiceClassName(String serviceContext) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(WordUtils.capitalize(serviceContext));
		sb.append("Service");
		
		return sb.toString();
	}
	
	public String getType(String type) {
		if (type.endsWith("[]") || type.equals("list")) {
			return "JSONArray";
		}
		
		if (type.equals("string")) {
			return "String";
		}
		
		if (type.startsWith("object") || type.startsWith("map")) {
			return "JSONObject";
		}

		return type;
	}

}