package com.liferay.mobile.android.auth.refresh;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.auth.basic.CookieAuthentication;
import com.liferay.mobile.android.auth.oauth2.OAuth2Authentication;

public class AuthenticationRefreshHandlerFactory {

    public AuthenticationRefreshHandler refreshHandlerForAuthentication(Authentication authentication) {
        if (authentication instanceof CookieAuthentication) {
            return new CookieAuthenticationRefreshHandler();
        }
        else if (authentication instanceof OAuth2Authentication) {
            return new OAuth2AuthenticationRefreshHandler();
        }
        else {
            return new BasicAuthenticationRefreshHandler();
        }
    }
}
