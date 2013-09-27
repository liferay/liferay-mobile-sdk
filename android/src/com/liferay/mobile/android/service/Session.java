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

package com.liferay.mobile.android.service;

/**
 * @author Bruno Farache
 */
public class Session {

	public static final int DEFAULT_CONNECTION_TIMEOUT = 15000;

	public Session(String server, String username, String password) {
		this(server, username, password, DEFAULT_CONNECTION_TIMEOUT);
	}

	public Session(
		String server, String username, String password,
		int connectionTimeout) {

		_server = server;
		_username = username;
		_password = password;
		_connectionTimeout = connectionTimeout;
	}

	public int getConnectionTimeout() {
		return _connectionTimeout;
	}

	public String getPassword() {
		return _password;
	}

	public String getServer() {
		return _server;
	}

	public String getUsername() {
		return _username;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		_connectionTimeout = connectionTimeout;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public void setServer(String server) {
		_server = server;
	}

	public void setUsername(String username) {
		_username = username;
	}

	private int _connectionTimeout;
	private String _password;
	private String _server;
	private String _username;

}