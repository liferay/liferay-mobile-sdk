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

/**
 * author: Bruno Farache
 */
@interface TrashEntryService_v62 : NSObject

- (NSDictionary *)restoreEntry:(NSNumber *)entryId overrideClassPK:(NSNumber *)overrideClassPK name:(NSString *)name;
- (void)deleteEntry:(NSString *)className classPK:(NSNumber *)classPK;
- (void)moveEntry:(NSString *)className classPK:(NSNumber *)classPK destinationContainerModelId:(NSNumber *)destinationContainerModelId serviceContext:(NSDictionary *)serviceContext;
- (void)deleteEntries:(NSNumber *)groupId;
- (NSDictionary *)getEntries:(NSNumber *)groupId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;

@end