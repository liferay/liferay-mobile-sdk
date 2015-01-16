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

#import "LRPushNotificationsDeviceService_v62.h"

/**
 * @author Bruno Farache
 */
@implementation LRPushNotificationsDeviceService_v62

- (NSDictionary *)addPushNotificationsDeviceWithToken:(NSString *)token platform:(NSString *)platform error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"token": token,
		@"platform": platform
	}];

	NSDictionary *_command = @{@"/push-notifications-portlet/pushnotificationsdevice/add-push-notifications-device": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deletePushNotificationsDeviceWithToken:(NSString *)token error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"token": token
	}];

	NSDictionary *_command = @{@"/push-notifications-portlet/pushnotificationsdevice/delete-push-notifications-device": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)sendPushNotificationWithToUserId:(long long)toUserId payload:(NSString *)payload error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"toUserId": @(toUserId),
		@"payload": payload
	}];

	NSDictionary *_command = @{@"/push-notifications-portlet/pushnotificationsdevice/send-push-notification": _params};

	[self.session invoke:_command error:error];
}

@end