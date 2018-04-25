package com.liferay.mobile.android.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import com.liferay.mobile.android.auth.oauth2.OAuth2Authentication;
import com.liferay.mobile.android.auth.oauth2.TokenRequester;
import com.liferay.mobile.android.service.Session;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.openid.appauth.AuthorizationException;
import net.openid.appauth.AuthorizationRequest;
import net.openid.appauth.AuthorizationResponse;
import net.openid.appauth.AuthorizationService;
import net.openid.appauth.AuthorizationServiceConfiguration;
import net.openid.appauth.ResponseTypeValues;

public class OAuth2SignIn {

	public static Session resumeAuthorizationFlowWithIntent(Context context, final Session session, Intent intent,
		final SessionCallback callback) throws Exception {
		final AuthorizationResponse resp = AuthorizationResponse.fromIntent(intent);
		AuthorizationException ex = AuthorizationException.fromIntent(intent);

		if (ex != null) {
			callback.onFailure(ex);
		}

		String tokenUrl = getTokenUrl(session.getServer());

		net.openid.appauth.TokenRequest appAuthRequest = resp.createTokenExchangeRequest();

		TokenRequester request = new TokenRequester(session, tokenUrl, appAuthRequest.clientId, null,
			new ArrayList<String>(), appAuthRequest.getRequestParameters());

		return request.send(callback);
	}

	public static void signInWithRedirect(Activity activity, Session session,
		String clientId, List<String> scopes, Uri redirectUri, CustomTabsIntent customTabsIntent) {

		AuthorizationService service = new AuthorizationService(activity);
		AuthorizationServiceConfiguration config = getAuthorizationServiceConfiguration(session.getServer());

		AuthorizationRequest request = new AuthorizationRequest.Builder(config, clientId, ResponseTypeValues.CODE, redirectUri)
			.setScopes(scopes).build();

		Intent intent;

		if (customTabsIntent != null) {
			intent = service.getAuthorizationRequestIntent(request, customTabsIntent);
		} else {
			intent = service.getAuthorizationRequestIntent(request);
		}

		activity.startActivityForResult(intent, 0);
	}

	public static Session signInWithUsernameAndPassword(final String username, final String password, Session session,
		String clientId, String clientSecret, List<String> scopes, SessionCallback callback) throws Exception {

		String tokenUrl = getTokenUrl(session.getServer());
		Map<String, String> parameters = TokenRequester.parametersUsernameAndPassword(username, password);

		TokenRequester request = new TokenRequester(session, tokenUrl, clientId, clientSecret, scopes, parameters);

		return request.send(callback);
	}

	public static Session clientCredentialsSignIn(Session session, String clientId, String clientSecret,
		List<String> scopes, SessionCallback callback) throws Exception {

		String tokenUrl = getTokenUrl(session.getServer());
		Map<String, String> parameters = TokenRequester.parametersClientCredentials();

		TokenRequester request = new TokenRequester(session, tokenUrl, clientId, clientSecret, scopes, parameters);

		return request.send(callback);
	}

	public static Session refreshToken(Session session, List<String> scopes, SessionCallback callback)
		throws Exception {

		if (!(session.getAuthentication() instanceof OAuth2Authentication)) {
			throw new IllegalAccessException("Authentication should be of type OAuth2Authentication");
		}

		final OAuth2Authentication authentication = (OAuth2Authentication) session.getAuthentication();

		if (isClientCredentialsToken(authentication)) {
			return clientCredentialsSignIn(session, authentication.getClientId(),
				authentication.getClientSecret(), scopes, callback);
		}


		String tokenUrl = getTokenUrl(session.getServer());
		Map<String, String> parameters = TokenRequester.parametersRefresh(authentication.getRefreshToken());

		TokenRequester request = new TokenRequester(session, tokenUrl, authentication.getClientId(),
			authentication.getClientSecret(), scopes, parameters);

		return request.send(callback);
	}

	public static void setPaths(String tokenPath, String authorizationPath) {
		_TOKEN_PATH = tokenPath;
		_AUTHORIZATION_PATH = authorizationPath;
	}


	private static AuthorizationServiceConfiguration getAuthorizationServiceConfiguration(String server) {
		String parsedServer = getServerURL(server);

		Uri authorizationUri = Uri.parse(parsedServer + _AUTHORIZATION_PATH);
		Uri tokenUri = Uri.parse(parsedServer + _TOKEN_PATH);

		return new AuthorizationServiceConfiguration(authorizationUri, tokenUri);
	}

	private static boolean isClientCredentialsToken(OAuth2Authentication auth) {
		// Tokens obtained with client credentials doesn't have refresh token
		return auth.getRefreshToken().isEmpty();
	}

	private static String getTokenUrl(String server) {
		return getServerURL(server) + _TOKEN_PATH;
	}

	private static String getServerURL(String server) {
		return server.endsWith("/") ? server : server + "/";
	}

	private static String _AUTHORIZATION_PATH = "o/oauth2/authorize";
	private static String _TOKEN_PATH = "o/oauth2/token";
}
