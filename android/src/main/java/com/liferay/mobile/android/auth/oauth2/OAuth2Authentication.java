package com.liferay.mobile.android.auth.oauth2;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.http.Headers;
import com.liferay.mobile.android.http.Request;
import java.util.List;
import java.util.Map;

public class OAuth2Authentication implements Authentication {

	public OAuth2Authentication(String accessToken, String refreshToken,  List<String> scope, long accessTokenExpirationDate,
		String clientId, String clientSecret) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.scope = scope;
		this.accessTokenExpirationDate = accessTokenExpirationDate;
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}

	@Override
	public void authenticate(Request request) {
		Map<String, String> headers = request.getHeaders();
		headers.put(Headers.AUTHORIZATION, "Bearer " + accessToken);
	}


	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public List<String> getScope() {
		return scope;
	}

	public void setScope(List<String> scope) {
		this.scope = scope;
	}

	public long getAccessTokenExpirationDate() {
		return accessTokenExpirationDate;
	}

	public void setAccessTokenExpirationDate(long accessTokenExpirationDate) {
		this.accessTokenExpirationDate = accessTokenExpirationDate;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	private String accessToken;
	private String refreshToken;
	private List<String> scope;
	private long accessTokenExpirationDate;
	private String clientId;
	private String clientSecret;

}
