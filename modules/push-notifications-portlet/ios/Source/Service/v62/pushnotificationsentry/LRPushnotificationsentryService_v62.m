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

#import "LRPushnotificationsentryService_v62.h"

/**
 * @author Bruno Farache
 */
@implementation LRPushnotificationsentryService_v62

- (NSDictionary *)addPushNotificationsEntryWithPayload:(NSString *)payload error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"payload": payload
	}];

	NSDictionary *_command = @{@"/push-notifications-portlet/pushnotificationsentry/add-push-notifications-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addPushNotificationsEntryWithParentPushNotificationsEntryId:(long long)parentPushNotificationsEntryId payload:(NSString *)payload error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"parentPushNotificationsEntryId": @(parentPushNotificationsEntryId),
		@"payload": payload
	}];

	NSDictionary *_command = @{@"/push-notifications-portlet/pushnotificationsentry/add-push-notifications-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getPushNotificationsEntriesWithParentPushNotificationsEntryId:(long long)parentPushNotificationsEntryId lastAccessTime:(long long)lastAccessTime start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"parentPushNotificationsEntryId": @(parentPushNotificationsEntryId),
		@"lastAccessTime": @(lastAccessTime),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/push-notifications-portlet/pushnotificationsentry/get-push-notifications-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)likePushNotificationsEntryWithPushNotificationsEntryId:(long long)pushNotificationsEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"pushNotificationsEntryId": @(pushNotificationsEntryId)
	}];

	NSDictionary *_command = @{@"/push-notifications-portlet/pushnotificationsentry/like-push-notifications-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)unlikePushNotificationsEntryWithPushNotificationsEntryId:(long long)pushNotificationsEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"pushNotificationsEntryId": @(pushNotificationsEntryId)
	}];

	NSDictionary *_command = @{@"/push-notifications-portlet/pushnotificationsentry/unlike-push-notifications-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end