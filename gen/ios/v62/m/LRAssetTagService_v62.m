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

#import "LRAssetTagService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRAssetTagService_v62

- (NSDictionary *)addTagWithName:(NSString *)name tagProperties:(NSArray *)tagProperties serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"name": name,
		@"tagProperties": tagProperties,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assettag/add-tag": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteTagWithTagId:(long long)tagId error:(NSError **)error {
	NSDictionary *_params = @{
		@"tagId": @(tagId)
	};

	NSDictionary *_command = @{@"/assettag/delete-tag": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteTagsWithTagIds:(NSArray *)tagIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"tagIds": tagIds
	};

	NSDictionary *_command = @{@"/assettag/delete-tags": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getGroupTagsWithGroupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/assettag/get-group-tags": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupTagsWithGroupId:(long long)groupId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assettag/get-group-tags": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupTagsCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/assettag/get-group-tags-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getGroupTagsDisplayWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/assettag/get-group-tags-display": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupsTagsWithGroupIds:(NSArray *)groupIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/assettag/get-groups-tags": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getJsonGroupTagsWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/assettag/get-json-group-tags": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getTagWithTagId:(long long)tagId error:(NSError **)error {
	NSDictionary *_params = @{
		@"tagId": @(tagId)
	};

	NSDictionary *_command = @{@"/assettag/get-tag": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getTagsWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK)
	};

	NSDictionary *_command = @{@"/assettag/get-tags": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getTagsWithGroupId:(long long)groupId classNameId:(long long)classNameId name:(NSString *)name error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"name": name
	};

	NSDictionary *_command = @{@"/assettag/get-tags": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getTagsWithGroupId:(long long)groupId name:(NSString *)name tagProperties:(NSArray *)tagProperties start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"tagProperties": tagProperties,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/assettag/get-tags": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getTagsWithGroupIds:(NSArray *)groupIds name:(NSString *)name tagProperties:(NSArray *)tagProperties start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupIds": groupIds,
		@"name": name,
		@"tagProperties": tagProperties,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/assettag/get-tags": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getTagsWithGroupId:(long long)groupId classNameId:(long long)classNameId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"name": name,
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assettag/get-tags": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getTagsCountWithGroupId:(long long)groupId name:(NSString *)name error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name
	};

	NSDictionary *_command = @{@"/assettag/get-tags-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getTagsCountWithGroupId:(long long)groupId classNameId:(long long)classNameId name:(NSString *)name error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"name": name
	};

	NSDictionary *_command = @{@"/assettag/get-tags-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getTagsCountWithGroupId:(long long)groupId name:(NSString *)name tagProperties:(NSArray *)tagProperties error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"tagProperties": tagProperties
	};

	NSDictionary *_command = @{@"/assettag/get-tags-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)mergeTagsWithFromTagId:(long long)fromTagId toTagId:(long long)toTagId overrideProperties:(BOOL)overrideProperties error:(NSError **)error {
	NSDictionary *_params = @{
		@"fromTagId": @(fromTagId),
		@"toTagId": @(toTagId),
		@"overrideProperties": @(overrideProperties)
	};

	NSDictionary *_command = @{@"/assettag/merge-tags": _params};

	[self.session invoke:_command error:error];
}

- (void)mergeTagsWithFromTagIds:(NSArray *)fromTagIds toTagId:(long long)toTagId overrideProperties:(BOOL)overrideProperties error:(NSError **)error {
	NSDictionary *_params = @{
		@"fromTagIds": fromTagIds,
		@"toTagId": @(toTagId),
		@"overrideProperties": @(overrideProperties)
	};

	NSDictionary *_command = @{@"/assettag/merge-tags": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithGroupId:(long long)groupId name:(NSString *)name tagProperties:(NSArray *)tagProperties start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"tagProperties": tagProperties,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/assettag/search": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithGroupIds:(NSArray *)groupIds name:(NSString *)name tagProperties:(NSArray *)tagProperties start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupIds": groupIds,
		@"name": name,
		@"tagProperties": tagProperties,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/assettag/search": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateTagWithTagId:(long long)tagId name:(NSString *)name tagProperties:(NSArray *)tagProperties serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"tagId": @(tagId),
		@"name": name,
		@"tagProperties": tagProperties,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assettag/update-tag": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end