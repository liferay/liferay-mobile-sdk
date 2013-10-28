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

package com.liferay.mobile.sdk;

import com.liferay.mobile.sdk.http.Action;
import com.liferay.mobile.sdk.http.Discovery;
import com.liferay.mobile.sdk.http.PortalVersion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author Bruno Farache
 */
public abstract class BaseBuilder implements Builder {

	public void buildAll(PortalVersion version, Discovery discovery)
		throws Exception {

		HashMap<String, ArrayList<Action>> actionsMap =
			new HashMap<String, ArrayList<Action>>();

		ArrayList<Action> actions = discovery.getActions();

		for (Action action : actions) {
			String path = action.getPath();

			String className = path.substring(1, path.indexOf("/", 1));
			ArrayList<Action> classActions = actionsMap.get(className);

			if (classActions == null) {
				classActions = new ArrayList<Action>();

				actionsMap.put(className, classActions);
			}

			classActions.add(action);
		}

		for (Entry<String, ArrayList<Action>> entry : actionsMap.entrySet()) {
			discovery.setActions(entry.getValue());

			build(entry.getKey(), version, discovery);
		}
	}

	protected static final String CLASS_NAME = "className";

	protected static final String DISCOVERY = "discovery";

	protected static final String ESCAPE_TOOL = "esc";

	protected static final String LANGUAGE_UTIL = "languageUtil";

}