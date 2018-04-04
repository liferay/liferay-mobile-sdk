/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

#import "LROAuth2SignIn.h"
#import <AppAuth/AppAuth.h>
#import "LROAuth2AuthorizationFlow+Private.h"
#import "SafariAuthorizationUICoordinator.h"
#import "LRError.h"

static NSString *_TOKEN_PATH;
static NSString *_AUTHORIZATION_PATH;

@implementation LROAuth2SignIn

+ (void)initialize {
	_TOKEN_PATH = @"o/oauth2/token";
	_AUTHORIZATION_PATH = @"o/oauth2/authorize";
}

+ (LROAuth2AuthorizationFlow *)signInWithRedirectURL:(NSURL *)redirectURL
	session:(LRSession *)session clientId:(NSString *)clientId
	scopes:(NSArray *)scopes callback:(LRSessionHandler)callback {

	OIDServiceConfiguration *serviceConfig = [self serviceConfigurationWithSession:session];

	OIDAuthorizationRequest *request = [[OIDAuthorizationRequest alloc]
		initWithConfiguration:serviceConfig clientId:clientId scopes:scopes
		redirectURL:redirectURL responseType:OIDResponseTypeCode additionalParameters:nil];

	SafariAuthorizationUICoordinator *coordinator = [[SafariAuthorizationUICoordinator alloc] init];

	id<OIDAuthorizationFlowSession> userAgentSesion = [OIDAuthState
		authStateByPresentingAuthorizationRequest:request UICoordinator:coordinator
		callback:^(OIDAuthState *authState, NSError *error) {
			if (error) {
				callback(nil, error);
			}
			else {
				LROAuth2Authentication *auth = [[LROAuth2Authentication alloc]
					initWithAccessToken:authState.lastTokenResponse.accessToken
					refreshToken:authState.refreshToken scope:authState.scope
					accessTokenExpirationDate:authState.lastTokenResponse.accessTokenExpirationDate
					clientId:clientId
					clientSecret:nil];

				session.authentication = auth;
				callback(session, nil);
			}
		}];

	return [[LROAuth2AuthorizationFlow alloc] initWithExternalUserAgentSession:userAgentSesion];
}

+ (LRSession *)signInWithUsername:(NSString *)username password:(NSString *)password
	session:(LRSession *)session clientId:(NSString *)clientId
	clientSecret:(NSString *)clientSecret scopes:(NSArray *)scopes
	callback:(LRSessionHandler)callback error:(NSError **)error {

	NSDictionary *additionalParameters = @{
		@"username" : username,
		@"password" : password
	};

	OIDServiceConfiguration *serviceConfig = [self serviceConfigurationWithSession:session];

	OIDTokenRequest *tokenRequest = [[OIDTokenRequest alloc] initWithConfiguration:serviceConfig
		grantType:OIDGrantTypePassword authorizationCode:nil redirectURL:nil clientID:clientId
		clientSecret:clientSecret scopes:scopes refreshToken:nil codeVerifier:nil
		additionalParameters:additionalParameters];

	if (callback) {
		[self sendTokenRequestAsync:tokenRequest session:session callback:callback];
		return nil;
	}
	else {
		return [self sendTokenRequestSync:tokenRequest session:session error:error];
	}
}

+ (LRSession * _Nullable)clientCredentialsSignInWithSession:(LRSession *)session
	clientId:(NSString *)clientId clientSecret:(NSString *)clientSecret scopes:(NSArray *)scopes
	callback:(LRSessionHandler)callback error:(NSError **)error {

	OIDServiceConfiguration *serviceConfig = [self serviceConfigurationWithSession:session];

	OIDTokenRequest *tokenRequest = [[OIDTokenRequest alloc] initWithConfiguration:serviceConfig
		grantType:OIDGrantTypeClientCredentials authorizationCode:nil redirectURL:nil clientID:clientId
		clientSecret:clientSecret scopes:scopes refreshToken:nil codeVerifier:nil
		additionalParameters:nil];

	if (callback) {
		[self sendTokenRequestAsync:tokenRequest session:session callback:callback];
		return nil;
	}
	else {
		return [self sendTokenRequestSync:tokenRequest session:session error:error];
	}
}

+ (LRSession *)refreshTokenWithSession:(LRSession *)session
	scopes:(NSArray *)scopes callback:(LRSessionHandler)callback error:(NSError **)error {

	LROAuth2Authentication *authentication = session.authentication;
	OIDServiceConfiguration *serviceConfig = [self serviceConfigurationWithSession:session];

	OIDTokenRequest *tokenRequest = [[OIDTokenRequest alloc] initWithConfiguration:serviceConfig
		grantType:OIDGrantTypeRefreshToken authorizationCode:nil redirectURL:nil clientID:authentication.clientId
		clientSecret:authentication.clientSecret scopes:scopes
		refreshToken:authentication.refreshToken codeVerifier:nil
		additionalParameters:nil];

	if (callback) {
		[self sendTokenRequestAsync:tokenRequest session:session callback:callback];
		return nil;
	}
	else {
		return [self sendTokenRequestSync:tokenRequest session:session error:error];
	}
}

+ (void)setTokenPath:(NSString *)tokenPath authorizationPath:(NSString *)authorizationPath {
	_TOKEN_PATH = tokenPath;
	_AUTHORIZATION_PATH = authorizationPath;
}

+ (void)sendTokenRequestAsync:(OIDTokenRequest *)tokenRequest session:(LRSession *)session
	callback:(LRSessionHandler)callback {
	[OIDAuthorizationService performTokenRequest:tokenRequest
		callback:^(OIDTokenResponse * tokenResponse, NSError * error) {
			if (error) {
				callback(nil, error);
			}
			else {
				LROAuth2Authentication *auth = [[LROAuth2Authentication alloc]
					initWithAccessToken:tokenResponse.accessToken
					refreshToken:tokenResponse.refreshToken scope:tokenResponse.scope
					accessTokenExpirationDate:tokenResponse.accessTokenExpirationDate
					clientId:tokenResponse.request.clientID clientSecret:tokenResponse.request.clientSecret];

				session.authentication = auth;
				callback(session, nil);
			}
	}];
}

+ (LRSession *)sendTokenRequestSync:(OIDTokenRequest *)tokenRequest
	session:(LRSession *)session error:(NSError **)error {
	if ([NSThread isMainThread]) {
		[NSException raise:@"Sync request in main thread"
			format:@"You can't execute a sync request in the main thread. " \
			"You should either set a callback to dispatch the call asynchronously" \
			"or execute this in another thread"];
	}

	dispatch_semaphore_t syncSemaphore = dispatch_semaphore_create(0);

	__block LROAuth2Authentication *auth;

	[OIDAuthorizationService performTokenRequest:tokenRequest
		callback:^(OIDTokenResponse * tokenResponse, NSError *e) {
			if (e) {
				*error = e;
			}
			else {
				auth = [[LROAuth2Authentication alloc]
					initWithAccessToken:tokenResponse.accessToken
					refreshToken:tokenResponse.refreshToken scope:tokenResponse.scope
					accessTokenExpirationDate:tokenResponse.accessTokenExpirationDate
					clientId:tokenResponse.request.clientID clientSecret:tokenResponse.request.clientSecret];
			}
			dispatch_semaphore_signal(syncSemaphore);
		}];

	dispatch_semaphore_wait(syncSemaphore, DISPATCH_TIME_FOREVER);

	session.authentication = auth;
	return session;
}

+ (OIDServiceConfiguration *)serviceConfigurationWithSession:(LRSession *)session {
	NSString *server = session.server;

	if (![server hasSuffix:@"/"]) {
		server = [NSString stringWithFormat:@"%@/", server];
	}

	NSURL *tokenEndpoint =
		[NSURL URLWithString: [NSString stringWithFormat:@"%@%@", server, _TOKEN_PATH]];
	NSURL *authorizationEndpoint =
		[NSURL URLWithString: [NSString stringWithFormat:@"%@%@", server, _AUTHORIZATION_PATH]];

	return [[OIDServiceConfiguration alloc] initWithAuthorizationEndpoint:authorizationEndpoint
		tokenEndpoint:tokenEndpoint];
}

@end
