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

#import "LRPushNotificationsDeviceService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRPushNotificationsDeviceService_v73

- (void)sendPushNotificationWithPlatform:(NSString *)platform tokens:(NSArray *)tokens payload:(NSString *)payload error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"platform": [self checkNull: platform],
		@"tokens": [self checkNull: tokens],
		@"payload": [self checkNull: payload]
	}];

	NSDictionary *_command = @{@"/pushnotifications.pushnotificationsdevice/send-push-notification": _params};

	[self.session invoke:_command error:error];
}

- (void)sendPushNotificationWithToUserIds:(NSArray *)toUserIds payload:(NSString *)payload error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"toUserIds": [self checkNull: toUserIds],
		@"payload": [self checkNull: payload]
	}];

	NSDictionary *_command = @{@"/pushnotifications.pushnotificationsdevice/send-push-notification": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addPushNotificationsDeviceWithToken:(NSString *)token platform:(NSString *)platform error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"token": [self checkNull: token],
		@"platform": [self checkNull: platform]
	}];

	NSDictionary *_command = @{@"/pushnotifications.pushnotificationsdevice/add-push-notifications-device": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deletePushNotificationsDeviceWithToken:(NSString *)token error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"token": [self checkNull: token]
	}];

	NSDictionary *_command = @{@"/pushnotifications.pushnotificationsdevice/delete-push-notifications-device": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deletePushNotificationsDeviceWithPushNotificationsDeviceId:(long long)pushNotificationsDeviceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"pushNotificationsDeviceId": @(pushNotificationsDeviceId)
	}];

	NSDictionary *_command = @{@"/pushnotifications.pushnotificationsdevice/delete-push-notifications-device": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end