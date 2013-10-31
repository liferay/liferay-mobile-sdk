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
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userId": userId,
		@"status": status,
		@"subscribed": subscribed,
		@"includeAnonymous": includeAnonymous
	};

	NSDictionary *_command = @{@"/mbthread/get-group-threads-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)moveThreadFromTrash:(NSNumber *)categoryId threadId:(NSNumber *)threadId {
	NSDictionary *_params = @{
		@"categoryId": categoryId,
		@"threadId": threadId
	};

	NSDictionary *_command = @{@"/mbthread/move-thread-from-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)moveThreadToTrash:(NSNumber *)threadId {
	NSDictionary *_params = @{
		@"threadId": threadId
	};

	NSDictionary *_command = @{@"/mbthread/move-thread-to-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteThread:(NSNumber *)threadId {
	NSDictionary *_params = @{
		@"threadId": threadId
	};

	NSDictionary *_command = @{@"/mbthread/delete-thread": _params};

	[session invoke:_command];
}

- (void)restoreThreadFromTrash:(NSNumber *)threadId {
	NSDictionary *_params = @{
		@"threadId": threadId
	};

	NSDictionary *_command = @{@"/mbthread/restore-thread-from-trash": _params};

	[session invoke:_command];
}

- (void)unlockThread:(NSNumber *)threadId {
	NSDictionary *_params = @{
		@"threadId": threadId
	};

	NSDictionary *_command = @{@"/mbthread/unlock-thread": _params};

	[session invoke:_command];
}

- (NSDictionary *)moveThread:(NSNumber *)categoryId threadId:(NSNumber *)threadId {
	NSDictionary *_params = @{
		@"categoryId": categoryId,
		@"threadId": threadId
	};

	NSDictionary *_command = @{@"/mbthread/move-thread": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getThreads:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/mbthread/get-threads": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)splitThread:(NSNumber *)messageId subject:(NSString *)subject serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"messageId": messageId,
		@"subject": subject,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mbthread/split-thread": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getGroupThreads:(NSNumber *)groupId userId:(NSNumber *)userId status:(NSNumber *)status subscribed:(BOOL)subscribed includeAnonymous:(BOOL)includeAnonymous start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userId": userId,
		@"status": status,
		@"subscribed": subscribed,
		@"includeAnonymous": includeAnonymous,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/mbthread/get-group-threads": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)lockThread:(NSNumber *)threadId {
	NSDictionary *_params = @{
		@"threadId": threadId
	};

	NSDictionary *_command = @{@"/mbthread/lock-thread": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getThreadsCount:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId,
		@"status": status
	};

	NSDictionary *_command = @{@"/mbthread/get-threads-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)search:(NSNumber *)groupId creatorUserId:(NSNumber *)creatorUserId startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"creatorUserId": creatorUserId,
		@"startDate": startDate,
		@"endDate": endDate,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/mbthread/search": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end