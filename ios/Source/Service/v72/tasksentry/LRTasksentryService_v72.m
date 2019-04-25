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

#import "LRTasksentryService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRTasksentryService_v72

- (NSDictionary *)getTasksEntryWithTasksEntryId:(long long)tasksEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"tasksEntryId": @(tasksEntryId)
	}];

	NSDictionary *_command = @{@"/tasks-portlet.tasksentry/get-tasks-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteTasksEntryWithTasksEntryId:(long long)tasksEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"tasksEntryId": @(tasksEntryId)
	}];

	NSDictionary *_command = @{@"/tasks-portlet.tasksentry/delete-tasks-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateTasksEntryStatusWithTasksEntryId:(long long)tasksEntryId resolverUserId:(long long)resolverUserId status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"tasksEntryId": @(tasksEntryId),
		@"resolverUserId": @(resolverUserId),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/tasks-portlet.tasksentry/update-tasks-entry-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addTasksEntryWithTitle:(NSString *)title priority:(int)priority assigneeUserId:(long long)assigneeUserId dueDateMonth:(int)dueDateMonth dueDateDay:(int)dueDateDay dueDateYear:(int)dueDateYear dueDateHour:(int)dueDateHour dueDateMinute:(int)dueDateMinute neverDue:(BOOL)neverDue serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"title": [self checkNull: title],
		@"priority": @(priority),
		@"assigneeUserId": @(assigneeUserId),
		@"dueDateMonth": @(dueDateMonth),
		@"dueDateDay": @(dueDateDay),
		@"dueDateYear": @(dueDateYear),
		@"dueDateHour": @(dueDateHour),
		@"dueDateMinute": @(dueDateMinute),
		@"neverDue": @(neverDue),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/tasks-portlet.tasksentry/add-tasks-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateTasksEntryWithTasksEntryId:(long long)tasksEntryId title:(NSString *)title priority:(int)priority assigneeUserId:(long long)assigneeUserId resolverUserId:(long long)resolverUserId dueDateMonth:(int)dueDateMonth dueDateDay:(int)dueDateDay dueDateYear:(int)dueDateYear dueDateHour:(int)dueDateHour dueDateMinute:(int)dueDateMinute neverDue:(BOOL)neverDue status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"tasksEntryId": @(tasksEntryId),
		@"title": [self checkNull: title],
		@"priority": @(priority),
		@"assigneeUserId": @(assigneeUserId),
		@"resolverUserId": @(resolverUserId),
		@"dueDateMonth": @(dueDateMonth),
		@"dueDateDay": @(dueDateDay),
		@"dueDateYear": @(dueDateYear),
		@"dueDateHour": @(dueDateHour),
		@"dueDateMinute": @(dueDateMinute),
		@"neverDue": @(neverDue),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/tasks-portlet.tasksentry/update-tasks-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end