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

package com.liferay.mobile.android.http;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.callback.Callback;
import com.squareup.okhttp.Protocol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class Request {

	public Request(
		Authentication authentication, Method method,
		Map<String, String> headers, String url, Object body,
		int connectionTimeout, Callback callback) {

		this(
			authentication, method, headers, url, body, connectionTimeout,
			callback, null, false);
	}

	public Request(
		Authentication authentication, Method method,
		Map<String, String> headers, String url, Object body,
		int connectionTimeout, Callback callback,  Object tag) {

		this(authentication, method, headers, url, body,
			connectionTimeout, callback, tag, false);
	}

	public Request(
		Authentication authentication, Method method,
		Map<String, String> headers, String url, Object body,
		int connectionTimeout, Callback callback, Object tag, boolean followRedirects) {

		_authentication = authentication;
		_method = method;

		if (headers != null) {
			_headers = new HashMap<String, String>(headers);
		}

		_url = url;
		_body = body;
		_connectionTimeout = connectionTimeout;
		_callback = callback;

		if (tag == null) {
			tag = this;
		}

		_tag = tag;
		_followRedirects = followRedirects;
	}

	public Request(
		Method method, Map<String, String> headers, String url, Object body,
		int connectionTimeout) {

		this(null, method, headers, url, body, connectionTimeout, null);
	}

	public Request(
			Method method, Map<String, String> headers, String url, Object body,
			int connectionTimeout, boolean followRedirects) {

		this(null, method, headers, url, body, connectionTimeout, null,
				null, followRedirects);
	}

	public Authentication getAuthentication() {
		return _authentication;
	}

	public Object getBody() {
		return _body;
	}

	public Callback getCallback() {
		return _callback;
	}

	public int getConnectionTimeout() {
		return _connectionTimeout;
	}

	public Map<String, String> getHeaders() {
		return _headers;
	}

	public Method getMethod() {
		return _method;
	}

	public List<Protocol> getProtocols() {
		return _protocols;
	}

	public Object getTag() {
		return _tag;
	}

	public String getURL() {
		return _url;
	}

	public void setAuthentication(Authentication _authentication) {
		this._authentication = _authentication;
	}

	public boolean isFollowRedirects() {
		return _followRedirects;
	}

	public void setBody(Object body) {
		_body = body;
	}

	public void setCallback(Callback callback) {
		this._callback = callback;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		_connectionTimeout = connectionTimeout;
	}

	public void setHeaders(Map<String, String> headers) {
		_headers = headers;
	}

	public void setMethod(Method method) {
		_method = method;
	}

	public void setProtocols(List<Protocol> protocols) {
		_protocols = protocols;
	}

	public void setURL(String url) {
		_url = url;
	}

	public void setFollowRedirects(boolean followRedirects) {
		_followRedirects = followRedirects;
	}

	private Authentication _authentication;
	private Object _body;
	private Callback _callback;
	private int _connectionTimeout;
	private boolean _followRedirects;
	private Map<String, String> _headers = new HashMap<String, String>();
	private Method _method;
	private List<Protocol> _protocols = new ArrayList<Protocol>();
	private Object _tag;
	private String _url;
}