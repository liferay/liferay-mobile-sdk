/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

#import <Foundation/Foundation.h>
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface TrashEntryService_v62 : BaseService

- (NSDictionary *)restoreEntry:(long)entryId overrideClassPK:(long)overrideClassPK name:(NSString *)name;
- (void)deleteEntry:(NSString *)className classPK:(long)classPK;
- (void)moveEntry:(NSString *)className classPK:(long)classPK destinationContainerModelId:(long)destinationContainerModelId serviceContext:(NSDictionary *)serviceContext;
- (void)deleteEntries:(long)groupId;
- (NSDictionary *)getEntries:(long)groupId start:(int)start end:(int)end obc:(NSDictionary *)obc;

@end