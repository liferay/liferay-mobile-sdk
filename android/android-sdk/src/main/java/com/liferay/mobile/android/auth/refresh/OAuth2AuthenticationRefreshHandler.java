package com.liferay.mobile.android.auth.refresh;

import com.liferay.mobile.android.auth.OAuth2SignIn;
import com.liferay.mobile.android.auth.SessionCallback;
import com.liferay.mobile.android.auth.oauth2.OAuth2Authentication;
import com.liferay.mobile.android.service.Session;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OAuth2AuthenticationRefreshHandler implements AuthenticationRefreshHandler {

	@Override
	public Session refreshAuthentication(final Session session, final SessionCallback callback) throws Exception {

		OAuth2Authentication authentication = (OAuth2Authentication) session.getAuthentication();
		semaphore.acquire();

		if (shouldRefreshToken(authentication.getAccessTokenExpirationDate())) {
			if (callback == null) {
				try {
					return OAuth2SignIn.refreshToken(session, authentication.getScope(),null);
				} finally {
					semaphore.release();
				}
			} else {

				try {
					OAuth2SignIn.refreshToken(session, authentication.getScope(), new SessionCallback() {
						@Override
						public void onSuccess(Session oauth2Session) {
							session.setAuthentication(oauth2Session.getAuthentication());

							semaphore.release();

							callback.onSuccess(session);
						}

						@Override
						public void onFailure(Exception e) {
							semaphore.release();

							callback.onFailure(e);
						}
					});
				} catch (Exception e) {
					callback.onFailure(e);
				} finally {
					semaphore.release();
				}

				return null;
			}
		} else {
			semaphore.release();
		}

		if (callback != null) {
			callback.onSuccess(session);

			return null;
		} else {
			return session;
		}
	}

	private boolean shouldRefreshToken(long accessTokenExpirationDate) {
		long currentTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());

		long deltaTime = accessTokenExpirationDate - currentTime;

		return deltaTime <= TOLERANCE;
	}

	protected static final Semaphore semaphore = new Semaphore(1);
	private static final int TOLERANCE = 60;
}
