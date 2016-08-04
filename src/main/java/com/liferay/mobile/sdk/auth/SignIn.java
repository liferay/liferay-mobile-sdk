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

package com.liferay.mobile.sdk.auth;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.Callback;
import com.liferay.mobile.sdk.Config;
import com.liferay.mobile.sdk.ServiceBuilder;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SignIn {

	public static void signIn(Config config, Callback<JSONObject> callback) {
		try {
			String username = getUsername(config);
			SignInMethod method = SignInMethod.fromUsername(username);

			signIn(config, callback, method);
		}
		catch (Exception e) {
			callback.onFailure(e);
		}
	}

	public static void signIn(
		final Config config, final Callback<JSONObject> callback,
		final SignInMethod method) {

		try {
			GroupService groupService = ServiceBuilder.build(
				GroupService.class);

			Call<JSONArray> call = groupService.getUserSites();

			call.async(config, new Callback<JSONArray>() {

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

						String username = getUsername(config);
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

						call.async(config, callback);
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

	protected static String getUsername(Config config) throws Exception {
		Authentication auth = config.auth();

		if (auth == null) {
			throw new Exception("Session's authentication can't be null");
		}

		if (!(auth instanceof BasicAuthentication)) {
			throw new Exception(
				"Can't sign in if authentication implementation is not" +
					"BasicAuthentication");
		}

		return ((BasicAuthentication)auth).username();
	}

	@Path("/group")
	interface GroupService {

		@Path("/get-user-sites")
		Call<JSONArray> getUserSites();
	}

	@Path("/user")
	interface UserService {

		@Path("/get-user-by-email-address")
		Call<JSONObject> getUserByEmailAddress(
			@Param(name = "companyId") long companyId,
			@Param(name = "emailAddress") String emailAddress);

		@Path("/get-user-by-id")
		Call<JSONObject> getUserById(@Param(name = "userId") long userId);

		@Path("/get-user-by-screen-name")
		Call<JSONObject> getUserByScreenName(
			@Param(name = "companyId") long companyId,
			@Param(name = "screenName") String screenName);
	}

}