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

#import "LRAssetdisplaypageentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRAssetdisplaypageentryService_v73

- (NSDictionary *)addAssetDisplayPageEntryWithUserId:(long long)userId groupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK layoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/asset.assetdisplaypageentry/add-asset-display-page-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addAssetDisplayPageEntryWithUserId:(long long)userId groupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK layoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId),
		@"type": @(type),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/asset.assetdisplaypageentry/add-asset-display-page-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateAssetDisplayPageEntryWithAssetDisplayPageEntryId:(long long)assetDisplayPageEntryId layoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId type:(int)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"assetDisplayPageEntryId": @(assetDisplayPageEntryId),
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId),
		@"type": @(type)
	}];

	NSDictionary *_command = @{@"/asset.assetdisplaypageentry/update-asset-display-page-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getAssetDisplayPageEntriesCountByLayoutPageTemplateEntryIdWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId)
	}];

	NSDictionary *_command = @{@"/asset.assetdisplaypageentry/get-asset-display-page-entries-count-by-layout-page-template-entry-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteAssetDisplayPageEntryWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/asset.assetdisplaypageentry/delete-asset-display-page-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchAssetDisplayPageEntryWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/asset.assetdisplaypageentry/fetch-asset-display-page-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getAssetDisplayPageEntriesByLayoutPageTemplateEntryIdWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.display.page.model.AssetDisplayPageEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/asset.assetdisplaypageentry/get-asset-display-page-entries-by-layout-page-template-entry-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getAssetDisplayPageEntriesByLayoutPageTemplateEntryIdWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId)
	}];

	NSDictionary *_command = @{@"/asset.assetdisplaypageentry/get-asset-display-page-entries-by-layout-page-template-entry-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

@end