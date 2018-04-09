package com.liferay.mobile.android.auth.refresh;

import com.liferay.mobile.android.auth.CookieSignIn;
import com.liferay.mobile.android.http.Request;
import com.liferay.mobile.android.service.Session;

public interface AuthenticationRefreshHandler {

    interface SessionCallback {
        void onSuccess(Session session);

        void onFailure(Exception e);
    }

    Session refreshAuthentication(Session session, SessionCallback
            callback)
    throws Exception;
}
