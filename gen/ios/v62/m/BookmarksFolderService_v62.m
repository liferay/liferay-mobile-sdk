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

#import "BookmarksFolderService_v62.h"

/**
 * author Bruno Farache
 */
@implementation BookmarksFolderService_v62

- (void)deleteFolder:(long)folderId includeTrashedEntries:(BOOL)includeTrashedEntries {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"includeTrashedEntries": @(includeTrashedEntries)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/delete-folder": _params};

	[self.session invoke:_command];
}

- (void)unsubscribeFolder:(long)groupId folderId:(long)folderId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/unsubscribe-folder": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getFolder:(long)folderId {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folder": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getFoldersAndEntriesCount:(long)groupId folderId:(long)folderId status:(int)status {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folders-and-entries-count": _params};

	return (int)[self.session invoke:_command];
}

- (void)subscribeFolder:(long)groupId folderId:(long)folderId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/subscribe-folder": _params};

	[self.session invoke:_command];
}

- (NSArray *)getFoldersAndEntries:(long)groupId folderId:(long)folderId status:(int)status start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folders-and-entries": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)moveFolderToTrash:(long)folderId {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/move-folder-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getFolderIds:(long)groupId folderId:(long)folderId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folder-ids": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)updateFolder:(long)folderId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description mergeWithParentFolder:(BOOL)mergeWithParentFolder serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"parentFolderId": @(parentFolderId),
		@"name": name,
		@"description": description,
		@"mergeWithParentFolder": @(mergeWithParentFolder),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/bookmarksfolder/update-folder": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getSubfolderIds:(long)groupId folderId:(long)folderId recurse:(BOOL)recurse {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"recurse": @(recurse)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-subfolder-ids": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getFolders:(long)groupId parentFolderId:(long)parentFolderId status:(int)status start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"parentFolderId": @(parentFolderId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folders": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)restoreFolderFromTrash:(long)folderId {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/restore-folder-from-trash": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)moveFolder:(long)folderId parentFolderId:(long)parentFolderId {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"parentFolderId": @(parentFolderId)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/move-folder": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getFoldersCount:(long)groupId parentFolderId:(long)parentFolderId status:(int)status {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"parentFolderId": @(parentFolderId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folders-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)addFolder:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"parentFolderId": @(parentFolderId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/bookmarksfolder/add-folder": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)moveFolderFromTrash:(long)folderId parentFolderId:(long)parentFolderId {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"parentFolderId": @(parentFolderId)
	};

	NSDictionary *_command = @{@"/bookmarksfolder/move-folder-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end