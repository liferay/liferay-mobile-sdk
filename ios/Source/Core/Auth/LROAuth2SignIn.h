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

#import <Foundation/Foundation.h>
#import "LRSession.h"
#import "LROAuth2AuthorizationFlow.h"
#import "LROAuth2Authentication.h"

NS_ASSUME_NONNULL_BEGIN
@interface LROAuth2SignIn : NSObject

+ (LROAuth2AuthorizationFlow *)signInWithRedirectURL:(NSURL *)redirectURL
	session:(LRSession *)session clientId:(NSString *)clientId
	scopes:(NSArray<NSString *> *)scopes callback:(LRSessionHandler)callback;

+ (LRSession * _Nullable)signInWithUsername:(NSString *)username password:(NSString *)password
	session:(LRSession *)session clientId:(NSString *)clientId
	clientSecret:(NSString *)clientSecret scopes:(NSArray<NSString *> *)scopes
	callback:(nullable LRSessionHandler)callback error:(NSError *_Nullable *_Nullable)error;

+ (LRSession * _Nullable)clientCredentialsSignInWithSession:(LRSession *)session
	clientId:(NSString *)clientId clientSecret:(NSString *)clientSecret scopes:(NSArray<NSString *> *_Nullable)scopes
	callback:(nullable LRSessionHandler)callback error:(NSError *_Nullable *_Nullable)error;

+ (LRSession * _Nullable)refreshTokenWithSession:(LRSession *)session
	scopes:(NSArray *_Nullable)scopes callback:(nullable LRSessionHandler)callback
	error:(NSError *_Nullable *_Nullable)error;

+ (void)setTokenPath:(NSString *)tokenPath authorizationPath:(NSString *)authorizationPath;

@end
NS_ASSUME_NONNULL_END
