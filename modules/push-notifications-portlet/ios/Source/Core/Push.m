/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

#import "Push.h"

#import "LRPushNotificationsDeviceService_v62.h"

NSString *const IOS = @"ios";

/**
 * @author Bruno Farache
 */
@interface Push ()

@property (nonatomic, copy) LRFailureBlock failure;
@property (nonatomic, copy) LRSuccessBlock success;

@end

@implementation Push

+ (instancetype)withSession:(LRSession *)session {
	return [[Push alloc] initWithSession:session];
}

- (id)initWithSession:(LRSession *)session {
	self = [super init];

	if (self) {
		self.session = [[LRSession alloc] initWithSession:session];

		[self.session
			onSuccess:^(id result) {
				if (self.success) {
					self.success(result);
				}
			}
			onFailure:^(NSError *error) {
				[self _onFailure:error];
			}
		];
	}

	return self;
}

- (instancetype)onFailure:(LRFailureBlock)failure {
	self.failure = failure;

	return self;
}

- (instancetype)onSuccess:(LRSuccessBlock)success {
	self.success = success;

	return self;
}

- (void)registerToken:(NSString *)token {
	NSError *error;

	[[self _getService] addPushNotificationsDeviceWithToken:token platform:IOS
		error:&error];

	if (error) {
		[self _onFailure:error];
	}
}

- (void)sendToUserId:(long long)userId
		notification:(NSDictionary *)notification {

	NSError *error;

	NSData *data = [NSJSONSerialization dataWithJSONObject:notification
		options:0 error:&error];

	NSString *payloadString = [[NSString alloc] initWithData:data
		encoding:NSUTF8StringEncoding];

	if (error) {
		[self _onFailure:error];
	}

	[[self _getService] sendPushNotificationWithToUserId:userId
		payload:payloadString error:&error];

	if (error) {
		[self _onFailure:error];
	}
}

- (void)unregisterToken:(NSString *)token {
	NSError *error;

	[[self _getService] deletePushNotificationsDeviceWithToken:token
		error:&error];

	if (error) {
		[self _onFailure:error];
	}
}

- (LRPushNotificationsDeviceService_v62 *)_getService {
	return [[LRPushNotificationsDeviceService_v62 alloc]
		initWithSession:self.session];
}

- (void)_onFailure:(NSError *)error {
	if (self.failure) {
		self.failure(error);
	}
}

@end