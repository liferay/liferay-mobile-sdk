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

#import "LRAuthentication.h"
#import "LRBlockCallback.h"

/**
 * @author Bruno Farache
 */
NS_ASSUME_NONNULL_BEGIN
@interface LRSession : NSObject

typedef void (^LRSessionHandler)(LRSession * _Nullable, NSError * _Nullable);

@property (nonatomic, strong, nullable) id<LRAuthentication> authentication;
@property (nonatomic, strong, nullable) id<LRCallback> callback;
@property (nonatomic) int connectionTimeout;
@property (nonatomic, strong, nullable) NSDictionary *headers;
@property (nonatomic, strong) NSString *server;
@property (nonatomic, strong) NSOperationQueue *queue;

- (id)initWithServer:(NSString *)server;
- (id)initWithServer:(NSString *)server callback:(id<LRCallback> _Nullable)callback;

- (id)initWithServer:(NSString *)server
	authentication:(id<LRAuthentication> _Nullable)authentication;

- (id)initWithServer:(NSString *)server
	authentication:(id<LRAuthentication> _Nullable)authentication
	callback:(id<LRCallback> _Nullable)callback;

- (id)initWithServer:(NSString *)server
	authentication:(id<LRAuthentication> _Nullable)authentication
	connectionTimeout:(int)connectionTimeout
	callback:(id<LRCallback> _Nullable)callback;

- (id)initWithServer:(NSString *)server
	authentication:(id<LRAuthentication> _Nullable)authentication
	connectionTimeout:(int)connectionTimeout
	callback:(id<LRCallback> _Nullable)callback queue:(NSOperationQueue * _Nullable)queue;

- (id)initWithSession:(LRSession *)session;

- (nullable id)invoke:(NSDictionary *)command error:(NSError * _Nullable * _Nullable)error;
- (void)onSuccess:(LRSuccessBlock)success onFailure:(LRFailureBlock)failure;
- (nullable id)upload:(NSDictionary *)command error:(NSError * _Nullable * _Nullable)error;

@end
NS_ASSUME_NONNULL_END
