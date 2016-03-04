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
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Callback;
import com.liferay.mobile.android.v2.ServiceBuilder;
import com.liferay.mobile.android.v62.group.GroupService;
import com.liferay.mobile.android.v62.user.UserService;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SignIn {

	public static void signIn(
		final Session session, final Callback<JSONObject> callback,
		final SignInMethod method) {

		try {
			GroupService groupService = ServiceBuilder.build(
				GroupService.class);

			Call<JSONArray> call = groupService.getUserSites();

			call.async(session, new Callback<JSONArray>() {

				@Override
				public void onSuccess(JSONArray sites) {
					if (sites.length() == 0) {
						onFailure(
							new Exception("User doesn't belong to any site"));
					}

					try {
						JSONObject site = sites.getJSONObject(0);
						long companyId = site.getLong("companyId");

						UserService userService = ServiceBuilder.build(
							UserService.class);

						String username = getUsername(session);
						Call<JSONObject> call;

						if (method == SignInMethod.EMAIL) {
							call = userService.getUserByEmailAddress(
								companyId, username);
						}
						else if (method == SignInMethod.USER_ID) {
							call = userService.getUserById(
								Long.parseLong(username));
						}
						else {
							call = userService.getUserByScreenName(
								companyId, username);
						}

						call.async(session, callback);
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
		}
		catch (Exception e) {
			callback.onFailure(e);
		}
	}

	public static void signIn(Session session, Callback<JSONObject> callback) {
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