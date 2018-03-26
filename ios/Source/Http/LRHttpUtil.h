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
#import "LRAuthenticationRefreshHandler.h"
#import "LRAuthenticationRefreshFactory.h"

NS_ASSUME_NONNULL_BEGIN
extern NSString *const LR_GET;
extern NSString *const LR_HEAD;
extern NSString *const LR_JSONWS_PATH_V61;
extern NSString *const LR_JSONWS_PATH_V62;
extern NSString *const LR_POST;

typedef void (^LRHandler)(
	NSData * _Nullable data, NSURLResponse * _Nullable response, NSError * _Nullable error);

/**
 * @author Bruno Farache
 */
@interface LRHttpUtil : NSObject

+ (NSString *)encodeURL:(NSString *)URL;

+ (NSString *)escape:(NSString *)string include:(NSString *)include
	ignore:(NSString * _Nullable)ignore;

+ (NSMutableURLRequest *)getRequestWithSession:(LRSession *)session
	URL:(NSURL *)URL;

+ (NSURL *)getURL:(LRSession *)session path:(NSString *)path;

+ (NSArray * _Nullable)post:(LRSession *)session command:(NSDictionary *)command
	error:(NSError **)error;

+ (NSArray * _Nullable)post:(LRSession *)session commands:(NSArray *)commands
	error:(NSError **)error;

+ (NSData * _Nullable)sendSyncRequest:(NSMutableURLRequest *)request
	delegate:(nullable id<NSURLSessionDelegate>)delegate
	session:(LRSession *)session response:(NSHTTPURLResponse * _Nullable * _Nullable)response
	error:(NSError *_Nullable *_Nullable)error;

+ (nullable LRSession *)requestFreshAuthentication:(LRSession *)session
	handler:(nullable LRSessionHandler)handler error:(NSError * _Nullable * _Nullable)error;

+ (void)setJSONWSPath:(NSString *)path;

+ (void)setRefreshFactory:(LRAuthenticationRefreshFactory *)refreshFactory;

@end
NS_ASSUME_NONNULL_END
