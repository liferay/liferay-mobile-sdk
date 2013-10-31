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

#import "JournalFolderService_v62.h"

/**
 * author Bruno Farache
 */
@implementation JournalFolderService_v62

- (NSArray *)getFolders:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/journalfolder/get-folders": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)moveFolder:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"parentFolderId": parentFolderId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalfolder/move-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getFoldersAndArticles:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"status": status,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalfolder/get-folders-and-articles": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)moveFolderFromTrash:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"parentFolderId": parentFolderId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalfolder/move-folder-from-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)restoreFolderFromTrash:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/journalfolder/restore-folder-from-trash": _params};

	[session invoke:_command];
}

- (void)deleteFolder:(NSNumber *)folderId includeTrashedEntries:(BOOL)includeTrashedEntries {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"includeTrashedEntries": includeTrashedEntries
	};

	NSDictionary *_command = @{@"/journalfolder/delete-folder": _params};

	[session invoke:_command];
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

	NSDictionary *_command = @{@"/journalfolder/update-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getSubfolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId recurse:(BOOL)recurse {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"recurse": recurse
	};

	NSDictionary *_command = @{@"/journalfolder/get-subfolder-ids": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)addFolder:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId,
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalfolder/add-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getFolder:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/journalfolder/get-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getFoldersAndArticlesCount:(NSNumber *)groupId folderIds:(NSArray *)folderIds status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderIds": folderIds,
		@"status": status
	};

	NSDictionary *_command = @{@"/journalfolder/get-folders-and-articles-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)moveFolderToTrash:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/journalfolder/move-folder-to-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getFolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/journalfolder/get-folder-ids": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getFoldersCount:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId,
		@"status": status
	};

	NSDictionary *_command = @{@"/journalfolder/get-folders-count": _params};

	return (NSNumber *)[session invoke:_command];
}

@end