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

#import "LRDispatchlogService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRDispatchlogService_v73

- (NSArray *)getDispatchLogsWithDispatchTriggerId:(long long)dispatchTriggerId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"dispatchTriggerId": @(dispatchTriggerId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/dispatch.dispatchlog/get-dispatch-logs": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getDispatchLogsCountWithDispatchTriggerId:(long long)dispatchTriggerId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"dispatchTriggerId": @(dispatchTriggerId)
	}];

	NSDictionary *_command = @{@"/dispatch.dispatchlog/get-dispatch-logs-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteDispatchLogWithDispatchLogId:(long long)dispatchLogId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"dispatchLogId": @(dispatchLogId)
	}];

	NSDictionary *_command = @{@"/dispatch.dispatchlog/delete-dispatch-log": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getDispatchLogWithDispatchLogId:(long long)dispatchLogId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"dispatchLogId": @(dispatchLogId)
	}];

	NSDictionary *_command = @{@"/dispatch.dispatchlog/get-dispatch-log": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end