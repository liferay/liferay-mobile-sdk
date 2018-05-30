package com.liferay.mobile.android.auth.refresh;

import com.liferay.mobile.android.auth.SessionCallback;
import com.liferay.mobile.android.service.Session;

public interface AuthenticationRefreshHandler {

	Session refreshAuthentication(Session session, SessionCallback callback) throws Exception;
}
