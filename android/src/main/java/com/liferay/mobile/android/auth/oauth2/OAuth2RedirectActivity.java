package com.liferay.mobile.android.auth.oauth2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import net.openid.appauth.AuthorizationManagementActivity;

public class OAuth2RedirectActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceBundle) {
		super.onCreate(savedInstanceBundle);

		Intent intent = AuthorizationManagementActivity.createResponseHandlingIntent(
			this, getIntent().getData());

		startActivity(intent);
		finish();
	}
}
