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
@interface LRBackgroundTaskService_v73 : LRBaseService

- (NSNumber *)getBackgroundTasksCountWithGroupId:(long long)groupId name:(NSString *)name taskExecutorClassName:(NSString *)taskExecutorClassName error:(NSError **)error;
- (NSNumber *)getBackgroundTasksCountWithGroupId:(long long)groupId taskExecutorClassName:(NSString *)taskExecutorClassName completed:(BOOL)completed error:(NSError **)error;
- (NSString *)getBackgroundTaskStatusJsonWithBackgroundTaskId:(long long)backgroundTaskId error:(NSError **)error;

@end