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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LRDepotentryService_v73 : LRBaseService

- (NSDictionary *)addDepotEntryWithNameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateDepotEntryWithDepotEntryId:(long long)depotEntryId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap depotAppCustomizationMap:(NSDictionary *)depotAppCustomizationMap typeSettingsUnicodeProperties:(NSDictionary *)typeSettingsUnicodeProperties serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getGroupConnectedDepotEntriesWithGroupId:(long long)groupId ddmStructuresAvailable:(BOOL)ddmStructuresAvailable start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getGroupConnectedDepotEntriesWithGroupId:(long long)groupId start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)deleteDepotEntryWithDepotEntryId:(long long)depotEntryId error:(NSError **)error;
- (NSDictionary *)getDepotEntryWithDepotEntryId:(long long)depotEntryId error:(NSError **)error;
- (NSNumber *)getGroupConnectedDepotEntriesCountWithGroupId:(long long)groupId error:(NSError **)error;
- (NSDictionary *)getGroupDepotEntryWithGroupId:(long long)groupId error:(NSError **)error;

@end