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
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LRMBThreadService_v62 : BaseService

- (void)deleteThreadWithThreadId:(long)threadId error:(NSError **)error;
- (NSArray *)getGroupThreadsWithGroupId:(long)groupId userId:(long)userId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getGroupThreadsWithGroupId:(long)groupId userId:(long)userId modifiedDate:(long)modifiedDate status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getGroupThreadsWithGroupId:(long)groupId userId:(long)userId status:(int)status subscribed:(BOOL)subscribed start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getGroupThreadsWithGroupId:(long)groupId userId:(long)userId status:(int)status subscribed:(BOOL)subscribed includeAnonymous:(BOOL)includeAnonymous start:(int)start end:(int)end error:(NSError **)error;
- (int)getGroupThreadsCountWithGroupId:(long)groupId userId:(long)userId status:(int)status error:(NSError **)error;
- (int)getGroupThreadsCountWithGroupId:(long)groupId userId:(long)userId modifiedDate:(long)modifiedDate status:(int)status error:(NSError **)error;
- (int)getGroupThreadsCountWithGroupId:(long)groupId userId:(long)userId status:(int)status subscribed:(BOOL)subscribed error:(NSError **)error;
- (int)getGroupThreadsCountWithGroupId:(long)groupId userId:(long)userId status:(int)status subscribed:(BOOL)subscribed includeAnonymous:(BOOL)includeAnonymous error:(NSError **)error;
- (NSArray *)getThreadsWithGroupId:(long)groupId categoryId:(long)categoryId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (int)getThreadsCountWithGroupId:(long)groupId categoryId:(long)categoryId status:(int)status error:(NSError **)error;
- (NSDictionary *)lockThreadWithThreadId:(long)threadId error:(NSError **)error;
- (NSDictionary *)moveThreadWithCategoryId:(long)categoryId threadId:(long)threadId error:(NSError **)error;
- (NSDictionary *)moveThreadFromTrashWithCategoryId:(long)categoryId threadId:(long)threadId error:(NSError **)error;
- (NSDictionary *)moveThreadToTrashWithThreadId:(long)threadId error:(NSError **)error;
- (void)restoreThreadFromTrashWithThreadId:(long)threadId error:(NSError **)error;
- (NSDictionary *)searchWithGroupId:(long)groupId creatorUserId:(long)creatorUserId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)searchWithGroupId:(long)groupId creatorUserId:(long)creatorUserId startDate:(long)startDate endDate:(long)endDate status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)splitThreadWithMessageId:(long)messageId subject:(NSString *)subject serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)unlockThreadWithThreadId:(long)threadId error:(NSError **)error;

@end