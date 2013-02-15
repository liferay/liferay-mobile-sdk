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

package com.liferay.client.builder;

import java.util.Map;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.liferay.client.builder.handler.JSONResponseHandler;
import com.liferay.client.builder.velocity.VelocityUtil;

/**
 * @author Bruno Farache
 */
public class JSONWebServiceClientBuilder {

	public static void main(String[] args) {
		String[] filters = new String[] {"/dlapp/*"};
		
		new JSONWebServiceClientBuilder(
			"http://localhost:8080/api/jsonws?discover", "", filters);
	}
	
	public JSONWebServiceClientBuilder(
		String url, String templateDir, String[] filters) {
		
		StringBuilder sb = new StringBuilder();

		sb.append(url);

		for (int i = 0; i < filters.length; i++) {
			if (i == 0) {
				sb.append("=");				
			}
			
			if (i > 1) {
				sb.append(",");
			}
			
			sb.append(filters[i]);
		}
		
		HttpClient client = new DefaultHttpClient();
		
		HttpGet get = new HttpGet(sb.toString());
		
		JSONResponseHandler handler = new JSONResponseHandler();
		
		try {
			Map<String, Object> result = client.execute(get, handler);
			
			@SuppressWarnings("unchecked")
			Map<String, Object> actions = 
				(Map<String, Object>)result.get("actions");
			
			VelocityUtil.generate("android/", actions);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}