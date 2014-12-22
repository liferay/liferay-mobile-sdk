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

package com.liferay.mobile.android.auth.oauth;

import com.liferay.mobile.android.auth.Authentication;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

import org.apache.http.HttpRequest;

/**
 * @author Bruno Farache
 */
public class OAuth implements Authentication {

	public OAuth(
		String consumerKey, String consumerSecret, String token,
		String tokenSecret) {

		_consumerKey = consumerKey;
		_consumerSecret = consumerSecret;
		_token = token;
		_tokenSecret = tokenSecret;
	}

	@Override
	public void authenticate(HttpRequest request) throws Exception {
		OAuthConsumer consumer = new CommonsHttpOAuthConsumer(
			_consumerKey, _consumerSecret);

		consumer.setTokenWithSecret(_token, _tokenSecret);
		consumer.sign(request);
	}

	private String _consumerKey;
	private String _consumerSecret;
	private String _token;
	private String _tokenSecret;

}