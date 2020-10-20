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
@interface LRAssetdisplaypageentryService_v73 : LRBaseService

- (NSDictionary *)addAssetDisplayPageEntryWithUserId:(long long)userId groupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK layoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addAssetDisplayPageEntryWithUserId:(long long)userId groupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK layoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateAssetDisplayPageEntryWithAssetDisplayPageEntryId:(long long)assetDisplayPageEntryId layoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId type:(int)type error:(NSError **)error;
- (NSNumber *)getAssetDisplayPageEntriesCountByLayoutPageTemplateEntryIdWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId error:(NSError **)error;
- (void)deleteAssetDisplayPageEntryWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchAssetDisplayPageEntryWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error;
- (NSArray *)getAssetDisplayPageEntriesByLayoutPageTemplateEntryIdWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getAssetDisplayPageEntriesByLayoutPageTemplateEntryIdWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId error:(NSError **)error;

@end