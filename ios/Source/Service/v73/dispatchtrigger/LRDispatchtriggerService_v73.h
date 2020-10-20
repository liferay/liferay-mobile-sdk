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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LRDispatchtriggerService_v73 : LRBaseService

- (NSDictionary *)addDispatchTriggerWithUserId:(long long)userId name:(NSString *)name taskSettingsUnicodeProperties:(NSDictionary *)taskSettingsUnicodeProperties taskType:(NSString *)taskType error:(NSError **)error;
- (NSDictionary *)updateDispatchTriggerWithDispatchTriggerId:(long long)dispatchTriggerId name:(NSString *)name taskSettingsUnicodeProperties:(NSDictionary *)taskSettingsUnicodeProperties error:(NSError **)error;
- (NSDictionary *)updateDispatchTriggerWithDispatchTriggerId:(long long)dispatchTriggerId active:(BOOL)active cronExpression:(NSString *)cronExpression endDateMonth:(int)endDateMonth endDateDay:(int)endDateDay endDateYear:(int)endDateYear endDateHour:(int)endDateHour endDateMinute:(int)endDateMinute neverEnd:(BOOL)neverEnd overlapAllowed:(BOOL)overlapAllowed startDateMonth:(int)startDateMonth startDateDay:(int)startDateDay startDateYear:(int)startDateYear startDateHour:(int)startDateHour startDateMinute:(int)startDateMinute error:(NSError **)error;
- (NSArray *)getDispatchTriggersWithStart:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getDispatchTriggersCount:(NSError **)error;
- (void)deleteDispatchTriggerWithDispatchTriggerId:(long long)dispatchTriggerId error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end