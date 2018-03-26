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

#import "LRSession.h"
#import "LRCookieCallback.h"
NS_ASSUME_NONNULL_BEGIN

/**
 * @author Victor Galán
 */

@interface LRCookieSignIn : NSObject

typedef void (^ChallengeBlock)(NSURLAuthenticationChallenge *challenge,
	void (^)(NSURLSessionAuthChallengeDisposition, NSURLCredential * _Nullable));

+ (void)registerAuthenticationChallengeBlock:(ChallengeBlock)challengeBlock
	forServer:(NSString *)server;

+ (nullable LRSession *)signInWithSession:(LRSession *)session
	callback:(nullable id<LRCookieCallback>)callback
	error:(NSError * _Nullable * _Nullable)error;

@end
NS_ASSUME_NONNULL_END
