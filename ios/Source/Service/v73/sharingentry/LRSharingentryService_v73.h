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
@interface LRSharingentryService_v73 : LRBaseService

- (NSDictionary *)addOrUpdateSharingEntryWithToUserId:(long long)toUserId classNameId:(long long)classNameId classPK:(long long)classPK groupId:(long long)groupId shareable:(BOOL)shareable sharingEntryActions:(NSArray *)sharingEntryActions expirationDate:(long long)expirationDate serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteSharingEntryWithSharingEntryId:(long long)sharingEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateSharingEntryWithSharingEntryId:(long long)sharingEntryId sharingEntryActions:(NSArray *)sharingEntryActions shareable:(BOOL)shareable expirationDate:(long long)expirationDate serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addSharingEntryWithToUserId:(long long)toUserId classNameId:(long long)classNameId classPK:(long long)classPK groupId:(long long)groupId shareable:(BOOL)shareable sharingEntryActions:(NSArray *)sharingEntryActions expirationDate:(long long)expirationDate serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end