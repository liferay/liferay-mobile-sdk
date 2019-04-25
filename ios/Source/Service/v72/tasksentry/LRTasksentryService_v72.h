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
@interface LRTasksentryService_v72 : LRBaseService

- (NSDictionary *)getTasksEntryWithTasksEntryId:(long long)tasksEntryId error:(NSError **)error;
- (NSDictionary *)deleteTasksEntryWithTasksEntryId:(long long)tasksEntryId error:(NSError **)error;
- (NSDictionary *)updateTasksEntryStatusWithTasksEntryId:(long long)tasksEntryId resolverUserId:(long long)resolverUserId status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addTasksEntryWithTitle:(NSString *)title priority:(int)priority assigneeUserId:(long long)assigneeUserId dueDateMonth:(int)dueDateMonth dueDateDay:(int)dueDateDay dueDateYear:(int)dueDateYear dueDateHour:(int)dueDateHour dueDateMinute:(int)dueDateMinute neverDue:(BOOL)neverDue serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateTasksEntryWithTasksEntryId:(long long)tasksEntryId title:(NSString *)title priority:(int)priority assigneeUserId:(long long)assigneeUserId resolverUserId:(long long)resolverUserId dueDateMonth:(int)dueDateMonth dueDateDay:(int)dueDateDay dueDateYear:(int)dueDateYear dueDateHour:(int)dueDateHour dueDateMinute:(int)dueDateMinute neverDue:(BOOL)neverDue status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end