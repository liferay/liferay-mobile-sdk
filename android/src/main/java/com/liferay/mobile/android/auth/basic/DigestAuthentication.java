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

package com.liferay.mobile.android.auth.basic;

import com.liferay.mobile.android.http.Request;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @author Bruno Farache
 */
public class DigestAuthentication extends BasicAuthentication {

	public DigestAuthentication(String username, String password) {
		super(username, password);
	}

	public void authenticate(HttpClientBuilder clientBuilder) {
		CredentialsProvider provider = new BasicCredentialsProvider();

		provider.setCredentials(
			new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
			new UsernamePasswordCredentials(username, password));

		clientBuilder.setDefaultCredentialsProvider(provider);
	}

	@Override
	public void authenticate(Request request) {
	}

}