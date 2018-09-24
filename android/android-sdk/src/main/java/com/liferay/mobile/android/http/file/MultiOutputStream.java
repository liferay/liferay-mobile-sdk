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

package com.liferay.mobile.android.http.file;

import java.io.IOException;
import java.io.OutputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Silvio Santos
 */
public class MultiOutputStream extends OutputStream {

	public MultiOutputStream(OutputStream... streams) {
		_streams = new ArrayList<OutputStream>(Arrays.asList(streams));
	}

	public void addOutputStream(OutputStream os) {
		_streams.add(os);
	}

	@Override
	public void close() throws IOException {
		for (OutputStream os : _streams) {
			os.close();
		}
	}

	@Override
	public void flush() throws IOException {
		for (OutputStream os : _streams) {
			os.flush();
		}
	}

	@Override
	public void write(byte[] buffer, int offset, int count) throws IOException {
		for (OutputStream os : _streams) {
			os.write(buffer, offset, count);
		}
	}

	@Override
	public void write(int oneByte) throws IOException {
		for (OutputStream os : _streams) {
			os.write(oneByte);
		}
	}

	private List<OutputStream> _streams;

}