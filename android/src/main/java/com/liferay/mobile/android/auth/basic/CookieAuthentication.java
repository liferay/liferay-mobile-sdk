package com.liferay.mobile.android.auth.basic;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.http.Request;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author Javier Gamarra
 */
public class CookieAuthentication implements Authentication {

	public CookieAuthentication(String authToken, String cookieHeader) {
		this.authToken = authToken;
		this.cookieHeader = cookieHeader;
	}

	@Override
	public void authenticate(Request request) throws Exception {
		Map<String, String> headers = request.getHeaders();
		headers.put("Cookie", "COOKIE_SUPPORT=true; " + cookieHeader);
		headers.put("X-CSRF-Token", authToken);
	}

	private String authToken;
	private String cookieHeader;

	public String getAuthToken() {
		return authToken;
	}

	public String getCookieHeader() {
		return cookieHeader;
	}
}
