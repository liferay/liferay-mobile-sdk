package com.liferay.mobile.android.auth.basic;

import com.liferay.mobile.android.http.Headers;
import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.net.Proxy;

/**
 * @author Victor Galan
 */
public class BasicAuthAutenticator extends BasicAuthentication implements Authenticator {

    public BasicAuthAutenticator(String username, String password) {
        super(username, password);
    }

    @Override
    public Request authenticate(Proxy proxy, Response response) throws IOException {
        String credential = Credentials.basic(username, password);
        return response.request().newBuilder().header(Headers.AUTHORIZATION, credential).build();
    }

    @Override
    public Request authenticateProxy(Proxy proxy, Response response) throws IOException {
        return null;
    }
}
