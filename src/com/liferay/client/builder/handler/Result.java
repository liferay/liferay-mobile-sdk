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

package com.liferay.client.builder.handler;

/**
 * @author Bruno Farache
 */
public class Result {

	public String getBasePath() {
		return _basePath;
	}

	public String getBaseURL() {
		return _baseURL;
	}

	public String getContext() {
		return _context;
	}

	public String[] getDiscover() {
		return _discover;
	}

	public void setBasePath(String _basePath) {
		this._basePath = _basePath;
	}

	public void setBaseURL(String _baseURL) {
		this._baseURL = _baseURL;
	}

	public void setContext(String _context) {
		this._context = _context;
	}

	public void setDiscover(String[] _discover) {
		this._discover = _discover;
	}

	private String _basePath;
	private String _baseURL;
	private String _context;
	private String[] _discover;

}