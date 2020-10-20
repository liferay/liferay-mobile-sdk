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
@interface LRDepotentrygrouprelService_v73 : LRBaseService

- (NSDictionary *)addDepotEntryGroupRelWithDepotEntryId:(long long)depotEntryId toGroupId:(long long)toGroupId error:(NSError **)error;
- (NSDictionary *)deleteDepotEntryGroupRelWithDepotEntryGroupRelId:(long long)depotEntryGroupRelId error:(NSError **)error;
- (NSNumber *)getDepotEntryGroupRelsCountWithGroupId:(long long)groupId error:(NSError **)error;
- (NSNumber *)getDepotEntryGroupRelsCountWithDepotEntry:(LRJSONObjectWrapper *)depotEntry error:(NSError **)error;
- (NSDictionary *)updateDdmStructuresAvailableWithDepotEntryGroupRelId:(long long)depotEntryGroupRelId ddmStructuresAvailable:(BOOL)ddmStructuresAvailable error:(NSError **)error;
- (NSArray *)getDepotEntryGroupRelsWithGroupId:(long long)groupId start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)updateSearchableWithDepotEntryGroupRelId:(long long)depotEntryGroupRelId searchable:(BOOL)searchable error:(NSError **)error;

@end