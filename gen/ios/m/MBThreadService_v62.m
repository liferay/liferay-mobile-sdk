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

#import "MBThreadService_v62.h"

/**
 * author Bruno Farache
 */
@implementation MBThreadService_v62

- (NSNumber *)getGroupThreadsCount:(NSNumber *)groupId userId:(NSNumber *)userId status:(NSNumber *)status subscribed:(BOOL)subscribed includeAnonymous:(BOOL)includeAnonymous {
}

- (NSDictionary *)moveThreadFromTrash:(NSNumber *)categoryId threadId:(NSNumber *)threadId {
}

- (NSDictionary *)moveThreadToTrash:(NSNumber *)threadId {
}

- (void)deleteThread:(NSNumber *)threadId {
}

- (void)restoreThreadFromTrash:(NSNumber *)threadId {
}

- (void)unlockThread:(NSNumber *)threadId {
}

- (NSDictionary *)moveThread:(NSNumber *)categoryId threadId:(NSNumber *)threadId {
}

- (NSArray *)getThreads:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
}

- (NSDictionary *)splitThread:(NSNumber *)messageId subject:(NSString *)subject serviceContext:(NSDictionary *)serviceContext {
}

- (NSArray *)getGroupThreads:(NSNumber *)groupId userId:(NSNumber *)userId status:(NSNumber *)status subscribed:(BOOL)subscribed includeAnonymous:(BOOL)includeAnonymous start:(NSNumber *)start end:(NSNumber *)end {
}

- (NSDictionary *)lockThread:(NSNumber *)threadId {
}

- (NSNumber *)getThreadsCount:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status {
}

- (NSDictionary *)search:(NSNumber *)groupId creatorUserId:(NSNumber *)creatorUserId startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
}

@end