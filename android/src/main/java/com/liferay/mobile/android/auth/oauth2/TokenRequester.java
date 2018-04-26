package com.liferay.mobile.android.auth.oauth2;

import com.liferay.mobile.android.auth.SessionCallback;
import com.liferay.mobile.android.exception.ServerException;
import com.liferay.mobile.android.http.Headers;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class TokenRequester {

	public TokenRequester(Session session, String tokenUrl, String clientId, String clientSecret, List<String> scopes,
		Map<String, String> parameters) {
		this.session = session;
		this.tokenUrl = tokenUrl;
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.scopes = scopes;
		this.parameters = parameters;
	}

	public static Map<String, String> parametersUsernameAndPassword(final String username, final String password) {
		Map<String, String> parameters = new HashMap<>();
		parameters.put("username", username);
		parameters.put("password", password);
		parameters.put(GRANT_TYPE, GRANT_TYPE_PASSWORD);

		return parameters;
	}

	public static Map<String, String> parametersClientCredentials() {
		Map<String, String> parameters = new HashMap<>();
		parameters.put(GRANT_TYPE, GRANT_TYPE_CLIENT_CREDENTIALS);

		return parameters;
	}

	public static Map<String, String> parametersRefresh(final String refreshToken) {
		Map<String, String> parameters = new HashMap<>();
		parameters.put("refresh_token", refreshToken);
		parameters.put(GRANT_TYPE, GRANT_TYPE_REFRESH_TOKEN);

		return parameters;
	}

	public Session send(final SessionCallback callback) throws Exception {
		OkHttpClient client = new OkHttpClient();
		FormEncodingBuilder formBody = new FormEncodingBuilder();
		Request.Builder requestBuilder = new Request.Builder().url(tokenUrl);

		for (Map.Entry<String, String> parameter : parameters.entrySet()) {
			formBody.add(parameter.getKey(), parameter.getValue());
		}

		if (!scopes.isEmpty()) {
			formBody.add("scope", spaceSeparatedScopes());
		}

		if (clientSecret != null && !clientSecret.isEmpty()) {
			requestBuilder.header(Headers.AUTHORIZATION, Credentials.basic(clientId, clientSecret));
		}
		else {
			formBody.add("client_id", clientId);
		}

		RequestBody body = formBody.build();
		Request request = requestBuilder.post(body)
			.build();

		final Call call = client.newCall(request);

		if (callback == null) {
			return parseResponse(call.execute(), session, clientId, clientSecret);
		} else {
			call.enqueue(new Callback() {
				@Override
				public void onFailure(Request request, IOException e) {
					callback.onFailure(e);
				}

				@Override
				public void onResponse(Response response) {
					try {
						callback.onSuccess(parseResponse(response, session, clientId, clientSecret));
					} catch (Exception ex) {
						callback.onFailure(ex);
					}
				}
			});

			return null;
		}
	}

	private Session parseResponse(Response response, Session session, String clientId, String clientSecret)
		throws Exception {
		if (!response.isSuccessful()) {
			throw new ServerException(response.message());
		}

		OAuth2Authentication auth = parseJsonToken(response, session, clientId, clientSecret);

		Session oauth2Session = new SessionImpl(session);
		oauth2Session.setAuthentication(auth);

		return oauth2Session;
	}

	private OAuth2Authentication parseJsonToken(Response response, Session session, String clientId,
		String clientSecret) throws Exception {
		try {
			JSONObject jsonObject = new JSONObject(response.body().string());

			String accessToken = jsonObject.getString("access_token");
			long expirationTime = jsonObject.getLong("expires_in");
			String scope = jsonObject.getString("scope");
			String refreshToken = jsonObject.optString("refresh_token");

			long expirationDate = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + expirationTime;
			List<String> scopes = Arrays.asList(scope.split(" "));

			return createOrUpdateAuthentication(session, accessToken, refreshToken, scopes, expirationDate,
				clientId, clientSecret);
		} catch (JSONException e) {
			throw new ServerException("Invalid json");
		}
	}

	private OAuth2Authentication createOrUpdateAuthentication(Session session, String accessToken,
		String refreshToken, List<String> scopes, long expirationDate, String clientId, String clientSecret) {

		if (session.getAuthentication() != null
			&& session.getAuthentication() instanceof OAuth2Authentication) {
			OAuth2Authentication auth = (OAuth2Authentication) session.getAuthentication();

			auth.setAccessToken(accessToken);
			auth.setRefreshToken(refreshToken);
			auth.setScope(scopes);
			auth.setAccessTokenExpirationDate(expirationDate);
			auth.setClientId(clientId);
			auth.setClientSecret(clientSecret);

			return auth;
		}

		return new OAuth2Authentication(accessToken, refreshToken, scopes, expirationDate, clientId, clientSecret);
	}

	private boolean shouldAuthenticateRequest() {
		String grantType = parameters.get(GRANT_TYPE);

		return GRANT_TYPE_CLIENT_CREDENTIALS.equals(grantType) || GRANT_TYPE_PASSWORD.equals(grantType);
	}

	private String spaceSeparatedScopes() {
		StringBuilder builder = new StringBuilder();

		for (String scope : scopes) {
			builder.append(scope).append(" ");
		}

		return builder.toString();
	}


	private String tokenUrl;
	private Session session;
	private String clientId;
	private String clientSecret;
	private List<String> scopes;
	private Map<String, String> parameters;

	private static final String GRANT_TYPE = "grant_type";

	private static final String GRANT_TYPE_PASSWORD = "password";
	private static final String GRANT_TYPE_CLIENT_CREDENTIALS = "client_credentials";
	private static final String GRANT_TYPE_REFRESH_TOKEN = "refresh_token";
}
