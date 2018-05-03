package com.liferay.mobile.android.auth.refresh;

import com.liferay.mobile.android.auth.SessionCallback;
import com.liferay.mobile.android.service.Session;

public class BasicAuthenticationRefreshHandler implements AuthenticationRefreshHandler {

    @Override
    public Session refreshAuthentication(Session session, SessionCallback callback)
            throws Exception {

        if (callback == null) {
            return session;
        }

        callback.onSuccess(session);
        return null;
    }
}
