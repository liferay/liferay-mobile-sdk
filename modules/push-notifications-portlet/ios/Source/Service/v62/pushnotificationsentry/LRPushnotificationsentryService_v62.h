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

#import "LRBaseService.h"

/**
 * @author Bruno Farache
 */
@interface LRPushnotificationsentryService_v62 : LRBaseService

- (NSDictionary *)addPushNotificationsEntryWithPayload:(NSString *)payload error:(NSError **)error;
- (NSDictionary *)addPushNotificationsEntryWithParentPushNotificationsEntryId:(long long)parentPushNotificationsEntryId payload:(NSString *)payload error:(NSError **)error;
- (NSArray *)getPushNotificationsEntriesWithParentPushNotificationsEntryId:(long long)parentPushNotificationsEntryId lastAccessTime:(long long)lastAccessTime start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)likePushNotificationsEntryWithPushNotificationsEntryId:(long long)pushNotificationsEntryId error:(NSError **)error;
- (NSDictionary *)unlikePushNotificationsEntryWithPushNotificationsEntryId:(long long)pushNotificationsEntryId error:(NSError **)error;

@end