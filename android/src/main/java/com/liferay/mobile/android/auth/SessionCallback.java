package com.liferay.mobile.android.auth;

import com.liferay.mobile.android.service.Session;

public interface SessionCallback {
	void onSuccess(Session session);

	void onFailure(Exception e);
}