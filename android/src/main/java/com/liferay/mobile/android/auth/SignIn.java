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

package com.liferay.mobile.android.auth;

import com.liferay.mobile.android.auth.basic.BasicAuthentication;
import com.liferay.mobile.android.callback.typed.JSONArrayCallback;
import com.liferay.mobile.android.callback.typed.JSONObjectCallback;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;
import com.liferay.mobile.android.v62.group.GroupService;
import com.liferay.mobile.android.v62.user.UserService;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SignIn {

	public static void signIn(
		final Session session, final JSONObjectCallback callback,
		final SignInMethod method) {

		GroupService groupService = new GroupService(session);

		session.setCallback(new JSONArrayCallback() {

			@Override
			public void onSuccess(JSONArray sites) {
				if (sites.length() == 0) {
					onFailure(new Exception("User doesn't belong to any site"));
				}

				try {
					JSONObject site = sites.getJSONObject(0);
					long companyId = site.getLong("companyId");

					Session userSession = new SessionImpl(session);
					userSession.setCallback(callback);

					UserService userService = new UserService(userSession);

					String username = getUsername(session);

					if (method == SignInMethod.EMAIL) {
						userService.getUserByEmailAddress(companyId, username);
					}
					else if (method == SignInMethod.USER_ID) {
						userService.getUserById(Long.parseLong(username));
					}
					else {
						userService.getUserByScreenName(companyId, username);
					}
				}
				catch (Exception e) {
					onFailure(e);
				}
			}

			@Override
			public void onFailure(Exception exception) {
				callback.onFailure(exception);
			}

		});

		try {
			groupService.getUserSites();
		}
		catch (Exception e) {
			callback.onFailure(e);
		}
	}

	public static void signIn(Session session, JSONObjectCallback callback) {
		try {
			String username = getUsername(session);
			SignInMethod method = SignInMethod.fromUsername(username);

			signIn(session, callback, method);
		}
		catch (Exception e) {
			callback.onFailure(e);
		}
	}

	protected static String getUsername(Session session) throws Exception {
		Authentication auth = session.getAuthentication();

		if (auth == null) {
			throw new Exception("Session's authentication can't be null");
		}

		if (!(auth instanceof BasicAuthentication)) {
			throw new Exception(
				"Can't sign in if authentication implementation is not" +
					"BasicAuthentication");
		}

		return ((BasicAuthentication)auth).getUsername();
	}

}