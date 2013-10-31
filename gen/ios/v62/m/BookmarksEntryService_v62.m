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

#import "BookmarksEntryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation BookmarksEntryService_v62

- (NSDictionary *)moveEntryToTrash:(long)entryId {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/bookmarksentry/move-entry-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)search:(long)groupId creatorUserId:(long)creatorUserId status:(int)status start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"creatorUserId": @(creatorUserId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/bookmarksentry/search": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getEntries:(long)groupId folderId:(long)folderId start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"start": @(start),
		@"end": @(end),
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/bookmarksentry/get-entries": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)restoreEntryFromTrash:(long)entryId {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/bookmarksentry/restore-entry-from-trash": _params};

	[self.session invoke:_command];
}

- (int)getEntriesCount:(long)groupId folderId:(long)folderId status:(int)status {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/bookmarksentry/get-entries-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)moveEntryFromTrash:(long)entryId parentFolderId:(long)parentFolderId {
	NSDictionary *_params = @{
		@"entryId": @(entryId),
		@"parentFolderId": @(parentFolderId)
	};

	NSDictionary *_command = @{@"/bookmarksentry/move-entry-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)moveEntry:(long)entryId parentFolderId:(long)parentFolderId {
	NSDictionary *_params = @{
		@"entryId": @(entryId),
		@"parentFolderId": @(parentFolderId)
	};

	NSDictionary *_command = @{@"/bookmarksentry/move-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getFoldersEntriesCount:(long)groupId folderIds:(NSArray *)folderIds {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderIds": folderIds
	};

	NSDictionary *_command = @{@"/bookmarksentry/get-folders-entries-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSArray *)getGroupEntries:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/bookmarksentry/get-group-entries": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)openEntry:(long)entryId {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/bookmarksentry/open-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addEntry:(long)groupId folderId:(long)folderId name:(NSString *)name url:(NSString *)url description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"name": name,
		@"url": url,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/bookmarksentry/add-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteEntry:(long)entryId {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/bookmarksentry/delete-entry": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getEntry:(long)entryId {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/bookmarksentry/get-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getGroupEntriesCount:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId)
	};

	NSDictionary *_command = @{@"/bookmarksentry/get-group-entries-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)updateEntry:(long)entryId groupId:(long)groupId folderId:(long)folderId name:(NSString *)name url:(NSString *)url description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"entryId": @(entryId),
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"name": name,
		@"url": url,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/bookmarksentry/update-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)subscribeEntry:(long)entryId {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/bookmarksentry/subscribe-entry": _params};

	[self.session invoke:_command];
}

- (void)unsubscribeEntry:(long)entryId {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/bookmarksentry/unsubscribe-entry": _params};

	[self.session invoke:_command];
}

@end