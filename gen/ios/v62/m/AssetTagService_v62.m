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

#import "AssetTagService_v62.h"

/**
 * author Bruno Farache
 */
@implementation AssetTagService_v62

- (NSDictionary *)getJsonGroupTags:(long)groupId name:(NSString *)name start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/assettag/get-json-group-tags": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteTag:(long)tagId {
	NSDictionary *_params = @{
		@"tagId": @(tagId)
	};

	NSDictionary *_command = @{@"/assettag/delete-tag": _params};

	[self.session invoke:_command];
}

- (int)getGroupTagsCount:(long)groupId {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/assettag/get-group-tags-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)getTag:(long)tagId {
	NSDictionary *_params = @{
		@"tagId": @(tagId)
	};

	NSDictionary *_command = @{@"/assettag/get-tag": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteTags:(NSArray *)tagIds {
	NSDictionary *_params = @{
		@"tagIds": tagIds
	};

	NSDictionary *_command = @{@"/assettag/delete-tags": _params};

	[self.session invoke:_command];
}

- (void)mergeTags:(NSArray *)fromTagIds toTagId:(long)toTagId overrideProperties:(BOOL)overrideProperties {
	NSDictionary *_params = @{
		@"fromTagIds": fromTagIds,
		@"toTagId": @(toTagId),
		@"overrideProperties": @(overrideProperties)
	};

	NSDictionary *_command = @{@"/assettag/merge-tags": _params};

	[self.session invoke:_command];
}

- (NSArray *)getTags:(long)groupId classNameId:(long)classNameId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"name": name,
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assettag/get-tags": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)updateTag:(long)tagId name:(NSString *)name tagProperties:(NSArray *)tagProperties serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"tagId": @(tagId),
		@"name": name,
		@"tagProperties": tagProperties,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assettag/update-tag": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getGroupsTags:(NSArray *)groupIds {
	NSDictionary *_params = @{
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/assettag/get-groups-tags": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (int)getTagsCount:(long)groupId name:(NSString *)name tagProperties:(NSArray *)tagProperties {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"tagProperties": tagProperties
	};

	NSDictionary *_command = @{@"/assettag/get-tags-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)getGroupTagsDisplay:(long)groupId name:(NSString *)name start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/assettag/get-group-tags-display": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getGroupTags:(long)groupId start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assettag/get-group-tags": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)search:(NSArray *)groupIds name:(NSString *)name tagProperties:(NSArray *)tagProperties start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupIds": groupIds,
		@"name": name,
		@"tagProperties": tagProperties,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/assettag/search": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addTag:(NSString *)name tagProperties:(NSArray *)tagProperties serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"name": name,
		@"tagProperties": tagProperties,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assettag/add-tag": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end