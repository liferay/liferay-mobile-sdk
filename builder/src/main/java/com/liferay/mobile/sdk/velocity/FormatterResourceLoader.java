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

package com.liferay.mobile.sdk.velocity;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

/**
 * @author Bruno Farache
 */
public class FormatterResourceLoader extends ClasspathResourceLoader {

	public InputStream getResourceStream(String name)
		throws ResourceNotFoundException {

		InputStream is = super.getResourceStream(name);

		try {
			String template = read(is);

			return new ByteArrayInputStream(template.getBytes("UTF-8"));
		}
		catch (Exception e) {
			_log.log(Level.SEVERE, "Could not load template file", e);
		}

		return is;
	}

	protected String read(InputStream is) throws IOException {
		StringBuilder sb = new StringBuilder();

		BufferedReader reader = new BufferedReader(new InputStreamReader(is));

		String line;

		try {
			while ((line = reader.readLine()) != null) {
				if (line.trim().equals("")) {
					continue;
				}

				if (line.trim().startsWith("##t")) {
					line = line.trim().replaceAll("##t", "");
					sb.append(line);
					sb.append('\n');

					continue;
				}

				if (line.trim().equals("##n")) {
					sb.append('\n');

					continue;
				}

				sb.append(line.replaceAll("\t", ""));
				sb.append('\n');
			}
		}
		finally {
			reader.close();
		}

		return sb.toString().trim();
	}

	private static final Logger _log = Logger.getLogger(
		FormatterResourceLoader.class.getName());

}