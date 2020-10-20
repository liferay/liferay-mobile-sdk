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

#import "LRDispatchtriggerService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRDispatchtriggerService_v73

- (NSDictionary *)addDispatchTriggerWithUserId:(long long)userId name:(NSString *)name taskSettingsUnicodeProperties:(NSDictionary *)taskSettingsUnicodeProperties taskType:(NSString *)taskType error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"name": [self checkNull: name],
		@"taskSettingsUnicodeProperties": [self checkNull: taskSettingsUnicodeProperties],
		@"taskType": [self checkNull: taskType]
	}];

	NSDictionary *_command = @{@"/dispatch.dispatchtrigger/add-dispatch-trigger": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateDispatchTriggerWithDispatchTriggerId:(long long)dispatchTriggerId name:(NSString *)name taskSettingsUnicodeProperties:(NSDictionary *)taskSettingsUnicodeProperties error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"dispatchTriggerId": @(dispatchTriggerId),
		@"name": [self checkNull: name],
		@"taskSettingsUnicodeProperties": [self checkNull: taskSettingsUnicodeProperties]
	}];

	NSDictionary *_command = @{@"/dispatch.dispatchtrigger/update-dispatch-trigger": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateDispatchTriggerWithDispatchTriggerId:(long long)dispatchTriggerId active:(BOOL)active cronExpression:(NSString *)cronExpression endDateMonth:(int)endDateMonth endDateDay:(int)endDateDay endDateYear:(int)endDateYear endDateHour:(int)endDateHour endDateMinute:(int)endDateMinute neverEnd:(BOOL)neverEnd overlapAllowed:(BOOL)overlapAllowed startDateMonth:(int)startDateMonth startDateDay:(int)startDateDay startDateYear:(int)startDateYear startDateHour:(int)startDateHour startDateMinute:(int)startDateMinute error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"dispatchTriggerId": @(dispatchTriggerId),
		@"active": @(active),
		@"cronExpression": [self checkNull: cronExpression],
		@"endDateMonth": @(endDateMonth),
		@"endDateDay": @(endDateDay),
		@"endDateYear": @(endDateYear),
		@"endDateHour": @(endDateHour),
		@"endDateMinute": @(endDateMinute),
		@"neverEnd": @(neverEnd),
		@"overlapAllowed": @(overlapAllowed),
		@"startDateMonth": @(startDateMonth),
		@"startDateDay": @(startDateDay),
		@"startDateYear": @(startDateYear),
		@"startDateHour": @(startDateHour),
		@"startDateMinute": @(startDateMinute)
	}];

	NSDictionary *_command = @{@"/dispatch.dispatchtrigger/update-dispatch-trigger": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getDispatchTriggersWithStart:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/dispatch.dispatchtrigger/get-dispatch-triggers": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getDispatchTriggersCount:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	NSDictionary *_command = @{@"/dispatch.dispatchtrigger/get-dispatch-triggers-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteDispatchTriggerWithDispatchTriggerId:(long long)dispatchTriggerId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"dispatchTriggerId": @(dispatchTriggerId)
	}];

	NSDictionary *_command = @{@"/dispatch.dispatchtrigger/delete-dispatch-trigger": _params};

	[self.session invoke:_command error:error];
}

@end