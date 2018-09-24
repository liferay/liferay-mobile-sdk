package com.liferay.mobile.android;

import com.liferay.mobile.android.auth.OAuth2SignIn;
import com.liferay.mobile.android.auth.oauth2.OAuth2Authentication;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.v7.group.GroupService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.json.JSONArray;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class OAuth2AuthenticationTest extends BaseTest {

	public OAuth2AuthenticationTest() throws IOException {
		super();
	}

	@Test
	public void testOAuth2SignInWithUsernameAnPassword() throws Exception {
		Session oauth2Session =
			OAuth2SignIn.signInWithUsernameAndPassword("test@liferay.com", "test", session, "1234", "1234",
				new ArrayList<String>(){}, null);

		GroupService service = new GroupService(oauth2Session);
		JSONArray userSites = service.getUserSitesGroups();

		GroupServiceTest.assertUserSites(userSites);
	}

	@Test
	public void testOAuth2ClientCredentialsSignIn() throws Exception {

		Session oauth2Session =
			OAuth2SignIn.clientCredentialsSignIn(session, "12345", "12345", new ArrayList<String>(), null);
		GroupService service = new GroupService(oauth2Session);
		JSONArray userSites = service.getUserSitesGroups();

		GroupServiceTest.assertUserSites(userSites);
	}

	@Test
	public void testOAuth2RefreshUsernameAndPassword() throws Exception {
		Session oauth2Session =
			OAuth2SignIn.signInWithUsernameAndPassword("test@liferay.com", "test", session, "1234", "1234",
				new ArrayList<String>(), null);

		OAuth2Authentication auth = (OAuth2Authentication) oauth2Session.getAuthentication();
		auth.setAccessTokenExpirationDate(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));

		String accessToken = auth.getAccessToken();

		GroupService service = new GroupService(oauth2Session);
		service.getUserSitesGroups();

		assertNotEquals(accessToken, auth.getAccessToken());
	}

	@Test
	public void testOAuth2RefreshClientCredentials() throws Exception {
		Session oauth2Session =
			OAuth2SignIn.clientCredentialsSignIn(session, "12345", "12345",
				new ArrayList<String>(), null);

		OAuth2Authentication auth = (OAuth2Authentication) oauth2Session.getAuthentication();
		auth.setAccessTokenExpirationDate(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));

		String accessToken = auth.getAccessToken();

		GroupService service = new GroupService(oauth2Session);
		service.getUserSitesGroups();

		assertNotEquals(accessToken, auth.getAccessToken());
	}
}
