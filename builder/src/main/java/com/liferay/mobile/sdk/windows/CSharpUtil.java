/**
 * Copyright (c) 2014-present Andrea Di Giorgi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.mobile.sdk.windows;

import com.liferay.mobile.sdk.util.CharPool;
import com.liferay.mobile.sdk.util.LanguageUtil;
import com.liferay.mobile.sdk.util.Validator;

/**
 * @author Andrea Di Giorgi
 */
public class CSharpUtil extends LanguageUtil {

	public static final String BOOL = "bool";

	public static final String DYNAMIC = "dynamic";

	public static final String IDICTIONARY = "IDictionary<string, object>";

	public static final String IDICTIONARY_STRING =
			"IDictionary<string, string>";

	public static final String IENUMERABLE = "IEnumerable";

	public static final String JSON_OBJECT_WRAPPER = "JsonObjectWrapper";

	public static final String MAP_STRING = "map<string,string>";

	public static final String OBJECT = "object";

	public static final String STREAM = "Stream";

	public String getIEnumerableCastType(String type) {
		if (!isArray(type)) {
			return _BLANK;
		}

		String ienumerableCastType;

		if (type.endsWith("[]")) {
			ienumerableCastType = type.substring(0, type.length() - 2);
		}
		else if (type.startsWith("list<")) {
			ienumerableCastType = type.substring(5, type.length() - 1);
		}
		else {
			return _BLANK;
		}

		if (!ienumerableCastType.equals(BOOLEAN) &&
				!ienumerableCastType.equals(DOUBLE) &&
				!ienumerableCastType.equals(INT) &&
				!ienumerableCastType.equals(LONG) &&
				!ienumerableCastType.equals(STRING)) {

			return _BLANK;
		}

		return getType(ienumerableCastType);
	}

	@Override
	public String getMethodName(String path) {
		String last = getMethodURL(path);

		String[] methodName = last.split("-");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < methodName.length; i++) {
			String word = capitalize(methodName[i]);

			sb.append(word);
		}

		sb.append("Async");

		return sb.toString();
	}

	public String getParameterName(String parameterName) {
		if (parameterName.equals("params")) {
			return CharPool.UNDERLINE + parameterName;
		}

		return parameterName;
	}

	public String getReturnType(String type) {
		type = getType(type);

		if (type.equals(INT)) {
			return LONG;
		}

		if (type.equals(JSON_OBJECT_WRAPPER)) {
			return DYNAMIC;
		}

		if (type.equals(getIEnumerableType(OBJECT))) {
			return getIEnumerableType(DYNAMIC);
		}

		return type;
	}

	public String getType(String type) {
		if (type.equals(BYTE_ARRAY) || type.equals(DOUBLE) ||
				type.equals(INT) || type.equals(LONG) || type.equals(STRING) ||
				type.equals(VOID)) {

			return type;
		}

		if (isArray(type)) {
			String ienumerableCastType = getIEnumerableCastType(type);

			if (Validator.isNull(ienumerableCastType)) {
				ienumerableCastType = OBJECT;
			}

			return getIEnumerableType(ienumerableCastType);
		}

		if (type.equals(BOOLEAN)) {
			return BOOL;
		}

		if (type.equals(FILE)) {
			return STREAM;
		}

		if (type.equals(MAP_STRING)) {
			return IDICTIONARY_STRING;
		}

		if (type.startsWith(OBJECT_PREFIX)) {
			return JSON_OBJECT_WRAPPER;
		}

		return IDICTIONARY;
	}

	protected String getIEnumerableType(String type) {
		StringBuilder sb = new StringBuilder();

		sb.append(IENUMERABLE);
		sb.append(CharPool.LESS_THAN);
		sb.append(type);
		sb.append(CharPool.GREATER_THAN);

		return sb.toString();
	}

	private static final String _BLANK = "";

}