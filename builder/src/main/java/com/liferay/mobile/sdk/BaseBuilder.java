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

package com.liferay.mobile.sdk;

import com.liferay.mobile.sdk.http.Action;
import com.liferay.mobile.sdk.http.Discovery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Bruno Farache
 */
public abstract class BaseBuilder implements Builder {

	@Override
	public void buildAll(
		Discovery discovery, String packageName, int version,
		String destination) {

		HashMap<String, List<Action>> actionsMap =
			new HashMap<String, List<Action>>();

		List<Action> actions = discovery.getActions();

		for (Action action : actions) {
			String path = action.getPath();
			int index = path.indexOf("/", 1);

			if (index == -1) {
				_log.log(
					Level.WARNING, "Action {0} skipped, unexpected path format",
					action.getPath());

				continue;
			}

			String className = path.substring(1, index);
			List<Action> classActions = actionsMap.get(className);

			if (classActions == null) {
				classActions = new ArrayList<Action>();

				actionsMap.put(className, classActions);
			}

			classActions.add(action);
		}

		for (Entry<String, List<Action>> entry : actionsMap.entrySet()) {
			try {
				build(
					discovery, entry.getValue(), packageName, version,
					entry.getKey(), destination);
			}
			catch (Exception e) {
				_log.log(
					Level.SEVERE, "Could not generate classes for action " +
						entry.getKey(),
					e);

				continue;
			}
		}
	}

	protected static final String ACTIONS = "actions";

	protected static final String BYTE_ARRAY = "BYTE_ARRAY";

	protected static final String CLASS_NAME = "className";

	protected static final String DISCOVERY = "discovery";

	protected static final String ESCAPE_TOOL = "esc";

	protected static final String JSON_OBJECT_WRAPPER = "JSON_OBJECT_WRAPPER";

	protected static final String LANGUAGE_UTIL = "languageUtil";

	protected static final String VOID = "VOID";

	private static final Logger _log = Logger.getLogger(
		BaseBuilder.class.getName());

}