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
@interface LRAssetlistentryService_v72 : LRBaseService

- (NSDictionary *)getAssetListEntryWithGroupId:(long long)groupId assetListEntryKey:(NSString *)assetListEntryKey error:(NSError **)error;
- (NSDictionary *)getAssetListEntryWithAssetListEntryId:(long long)assetListEntryId error:(NSError **)error;
- (NSDictionary *)getAssetListEntryByUuidAndGroupIdWithUuid:(NSString *)uuid groupId:(long long)groupId error:(NSError **)error;
- (void)addAssetEntrySelectionsWithAssetListEntryId:(long long)assetListEntryId assetEntryIds:(NSArray *)assetEntryIds segmentsEntryId:(long long)segmentsEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)addAssetEntrySelectionWithAssetListEntryId:(long long)assetListEntryId assetEntryId:(long long)assetEntryId segmentsEntryId:(long long)segmentsEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchAssetListEntryWithAssetListEntryId:(long long)assetListEntryId error:(NSError **)error;
- (NSDictionary *)addDynamicAssetListEntryWithUserId:(long long)userId groupId:(long long)groupId title:(NSString *)title typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addManualAssetListEntryWithUserId:(long long)userId groupId:(long long)groupId title:(NSString *)title assetEntryIds:(NSArray *)assetEntryIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteAssetEntrySelectionWithAssetListEntryId:(long long)assetListEntryId segmentsEntryId:(long long)segmentsEntryId position:(int)position error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteAssetListEntryWithAssetListEntryId:(long long)assetListEntryId segmentsEntryId:(long long)segmentsEntryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)deleteAssetListEntryWithAssetListEntryId:(long long)assetListEntryId error:(NSError **)error;
- (NSArray *)getAssetListEntriesWithGroupId:(long long)groupId title:(NSString *)title start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getAssetListEntriesWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (void)moveAssetEntrySelectionWithAssetListEntryId:(long long)assetListEntryId segmentsEntryId:(long long)segmentsEntryId position:(int)position newPosition:(int)newPosition error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)updateAssetListEntryTypeSettingsWithAssetListEntryId:(long long)assetListEntryId segmentsEntryId:(long long)segmentsEntryId typeSettings:(NSString *)typeSettings error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSNumber *)getAssetListEntriesCountWithGroupId:(long long)groupId error:(NSError **)error;
- (NSNumber *)getAssetListEntriesCountWithGroupId:(long long)groupId title:(NSString *)title error:(NSError **)error;
- (void)deleteAssetListEntriesWithAssetListEntriesIds:(NSArray *)assetListEntriesIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addAssetListEntryWithGroupId:(long long)groupId title:(NSString *)title type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateAssetListEntryWithAssetListEntryId:(long long)assetListEntryId title:(NSString *)title error:(NSError **)error;
- (void)updateAssetListEntryWithAssetListEntryId:(long long)assetListEntryId segmentsEntryId:(long long)segmentsEntryId typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end