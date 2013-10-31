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
@interface MBThreadService_v62 : BaseService

- (int)getGroupThreadsCount:(long)groupId userId:(long)userId status:(int)status subscribed:(BOOL)subscribed includeAnonymous:(BOOL)includeAnonymous;
- (NSDictionary *)moveThreadFromTrash:(long)categoryId threadId:(long)threadId;
- (NSDictionary *)moveThreadToTrash:(long)threadId;
- (void)deleteThread:(long)threadId;
- (void)restoreThreadFromTrash:(long)threadId;
- (void)unlockThread:(long)threadId;
- (NSDictionary *)moveThread:(long)categoryId threadId:(long)threadId;
- (NSArray *)getThreads:(long)groupId categoryId:(long)categoryId status:(int)status start:(int)start end:(int)end;
- (NSDictionary *)splitThread:(long)messageId subject:(NSString *)subject serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getGroupThreads:(long)groupId userId:(long)userId status:(int)status subscribed:(BOOL)subscribed includeAnonymous:(BOOL)includeAnonymous start:(int)start end:(int)end;
- (NSDictionary *)lockThread:(long)threadId;
- (int)getThreadsCount:(long)groupId categoryId:(long)categoryId status:(int)status;
- (NSDictionary *)search:(long)groupId creatorUserId:(long)creatorUserId startDate:(long)startDate endDate:(long)endDate status:(int)status start:(int)start end:(int)end;

@end