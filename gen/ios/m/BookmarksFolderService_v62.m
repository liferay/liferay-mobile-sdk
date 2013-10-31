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

- (void)deleteFolder:(NSNumber *)folderId includeTrashedEntries:(BOOL)includeTrashedEntries {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"includeTrashedEntries": includeTrashedEntries
	};

	NSDictionary *_command = @{@"/bookmarksfolder/delete-folder": _params};

	[session invoke:_command];
}

- (void)unsubscribeFolder:(NSNumber *)groupId folderId:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/bookmarksfolder/unsubscribe-folder": _params};

	[session invoke:_command];
}

- (NSDictionary *)getFolder:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getFoldersAndEntriesCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"status": status
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folders-and-entries-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (void)subscribeFolder:(NSNumber *)groupId folderId:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/bookmarksfolder/subscribe-folder": _params};

	[session invoke:_command];
}

- (NSArray *)getFoldersAndEntries:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folders-and-entries": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)moveFolderToTrash:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/bookmarksfolder/move-folder-to-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getFolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folder-ids": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updateFolder:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description mergeWithParentFolder:(BOOL)mergeWithParentFolder serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"parentFolderId": parentFolderId,
		@"name": name,
		@"description": description,
		@"mergeWithParentFolder": mergeWithParentFolder,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/bookmarksfolder/update-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getSubfolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId recurse:(BOOL)recurse {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"recurse": recurse
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-subfolder-ids": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getFolders:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folders": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)restoreFolderFromTrash:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/bookmarksfolder/restore-folder-from-trash": _params};

	[session invoke:_command];
}

- (NSDictionary *)moveFolder:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"parentFolderId": parentFolderId
	};

	NSDictionary *_command = @{@"/bookmarksfolder/move-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getFoldersCount:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId,
		@"status": status
	};

	NSDictionary *_command = @{@"/bookmarksfolder/get-folders-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)addFolder:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"parentFolderId": parentFolderId,
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/bookmarksfolder/add-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)moveFolderFromTrash:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"parentFolderId": parentFolderId
	};

	NSDictionary *_command = @{@"/bookmarksfolder/move-folder-from-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end