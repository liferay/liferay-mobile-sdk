/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

#import "LRAssetlistentryService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRAssetlistentryService_v72

- (NSDictionary *)getAssetListEntryWithGroupId:(long long)groupId assetListEntryKey:(NSString *)assetListEntryKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"assetListEntryKey": [self checkNull: assetListEntryKey]
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/get-asset-list-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getAssetListEntryWithAssetListEntryId:(long long)assetListEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntryId": @(assetListEntryId)
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/get-asset-list-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getAssetListEntryByUuidAndGroupIdWithUuid:(NSString *)uuid groupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"uuid": [self checkNull: uuid],
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/get-asset-list-entry-by-uuid-and-group-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)addAssetEntrySelectionsWithAssetListEntryId:(long long)assetListEntryId assetEntryIds:(NSArray *)assetEntryIds segmentsEntryId:(long long)segmentsEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntryId": @(assetListEntryId),
		@"assetEntryIds": [self checkNull: assetEntryIds],
		@"segmentsEntryId": @(segmentsEntryId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/add-asset-entry-selections": _params};

	[self.session invoke:_command error:error];
}

- (void)addAssetEntrySelectionWithAssetListEntryId:(long long)assetListEntryId assetEntryId:(long long)assetEntryId segmentsEntryId:(long long)segmentsEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntryId": @(assetListEntryId),
		@"assetEntryId": @(assetEntryId),
		@"segmentsEntryId": @(segmentsEntryId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/add-asset-entry-selection": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchAssetListEntryWithAssetListEntryId:(long long)assetListEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntryId": @(assetListEntryId)
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/fetch-asset-list-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addDynamicAssetListEntryWithUserId:(long long)userId groupId:(long long)groupId title:(NSString *)title typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"title": [self checkNull: title],
		@"typeSettings": [self checkNull: typeSettings],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/add-dynamic-asset-list-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addManualAssetListEntryWithUserId:(long long)userId groupId:(long long)groupId title:(NSString *)title assetEntryIds:(NSArray *)assetEntryIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"title": [self checkNull: title],
		@"assetEntryIds": [self checkNull: assetEntryIds],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/add-manual-asset-list-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteAssetEntrySelectionWithAssetListEntryId:(long long)assetListEntryId segmentsEntryId:(long long)segmentsEntryId position:(int)position error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntryId": @(assetListEntryId),
		@"segmentsEntryId": @(segmentsEntryId),
		@"position": @(position)
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/delete-asset-entry-selection": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteAssetListEntryWithAssetListEntryId:(long long)assetListEntryId segmentsEntryId:(long long)segmentsEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntryId": @(assetListEntryId),
		@"segmentsEntryId": @(segmentsEntryId)
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/delete-asset-list-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteAssetListEntryWithAssetListEntryId:(long long)assetListEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntryId": @(assetListEntryId)
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/delete-asset-list-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getAssetListEntriesWithGroupId:(long long)groupId title:(NSString *)title start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"title": [self checkNull: title],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.list.model.AssetListEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/get-asset-list-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getAssetListEntriesWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.list.model.AssetListEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/get-asset-list-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)moveAssetEntrySelectionWithAssetListEntryId:(long long)assetListEntryId segmentsEntryId:(long long)segmentsEntryId position:(int)position newPosition:(int)newPosition error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntryId": @(assetListEntryId),
		@"segmentsEntryId": @(segmentsEntryId),
		@"position": @(position),
		@"newPosition": @(newPosition)
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/move-asset-entry-selection": _params};

	[self.session invoke:_command error:error];
}

- (void)updateAssetListEntryTypeSettingsWithAssetListEntryId:(long long)assetListEntryId segmentsEntryId:(long long)segmentsEntryId typeSettings:(NSString *)typeSettings error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntryId": @(assetListEntryId),
		@"segmentsEntryId": @(segmentsEntryId),
		@"typeSettings": [self checkNull: typeSettings]
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/update-asset-list-entry-type-settings": _params};

	[self.session invoke:_command error:error];
}

- (NSNumber *)getAssetListEntriesCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/get-asset-list-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getAssetListEntriesCountWithGroupId:(long long)groupId title:(NSString *)title error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"title": [self checkNull: title]
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/get-asset-list-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteAssetListEntriesWithAssetListEntriesIds:(NSArray *)assetListEntriesIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntriesIds": [self checkNull: assetListEntriesIds]
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/delete-asset-list-entries": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addAssetListEntryWithGroupId:(long long)groupId title:(NSString *)title type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"title": [self checkNull: title],
		@"type": @(type),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/add-asset-list-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateAssetListEntryWithAssetListEntryId:(long long)assetListEntryId title:(NSString *)title error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntryId": @(assetListEntryId),
		@"title": [self checkNull: title]
	}];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/update-asset-list-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)updateAssetListEntryWithAssetListEntryId:(long long)assetListEntryId segmentsEntryId:(long long)segmentsEntryId typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetListEntryId": @(assetListEntryId),
		@"segmentsEntryId": @(segmentsEntryId),
		@"typeSettings": [self checkNull: typeSettings],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/assetlist.assetlistentry/update-asset-list-entry": _params};

	[self.session invoke:_command error:error];
}

@end