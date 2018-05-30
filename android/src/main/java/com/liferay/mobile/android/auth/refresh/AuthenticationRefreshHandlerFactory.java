package com.liferay.mobile.android.auth.refresh;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.auth.basic.CookieAuthentication;

public class AuthenticationRefreshHandlerFactory {

    public AuthenticationRefreshHandler refreshHandlerForAuthentication(Authentication authentication) {
        if (authentication instanceof CookieAuthentication) {
            return new CookieAuthenticationRefreshHandler();
        }
        else {
            return new BasicAuthenticationRefreshHandler();
        }
    }
}
