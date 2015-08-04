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

import com.liferay.mobile.android.http.Headers;

import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.Response;

import java.io.IOException;

import java.net.Proxy;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.auth.DigestScheme;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpRequest;

/**
 * @author Silvio Santos
 */
public class DigestAuthentication extends BasicAuthentication
	implements Authenticator {

	public DigestAuthentication(String username, String password) {
		super(username, password);
	}

	@Override
	public void authenticate(com.liferay.mobile.android.http.Request request) {
	}

	@Override
	public Request authenticate(Proxy proxy, Response response)
		throws IOException {

		Request request = response.request();
		Builder builder = request.newBuilder();

		try {
			BasicHeader authenticateHeader = new BasicHeader(
				Headers.WWW_AUTHENTICATE,
				response.header(Headers.WWW_AUTHENTICATE));

			DigestScheme scheme = new DigestScheme();
			scheme.processChallenge(authenticateHeader);

			BasicHttpRequest basicHttpRequest = new BasicHttpRequest(
				request.method(), request.uri().getPath());

			UsernamePasswordCredentials credentials =
				new UsernamePasswordCredentials(username, password);

			String authorizationHeader = scheme.authenticate(
				credentials, basicHttpRequest).getValue();

			builder.addHeader(Headers.AUTHORIZATION, authorizationHeader);
		}
		catch (Exception e) {
			throw new IOException(e);
		}

		return builder.build();
	}

	@Override
	public Request authenticateProxy(Proxy proxy, Response response)
		throws IOException {

		return null;
	}

}