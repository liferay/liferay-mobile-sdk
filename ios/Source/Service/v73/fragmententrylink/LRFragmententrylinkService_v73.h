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
@interface LRFragmententrylinkService_v73 : LRBaseService

- (NSDictionary *)addFragmentEntryLinkWithGroupId:(long long)groupId originalFragmentEntryLinkId:(long long)originalFragmentEntryLinkId fragmentEntryId:(long long)fragmentEntryId segmentsExperienceId:(long long)segmentsExperienceId classNameId:(long long)classNameId classPK:(long long)classPK css:(NSString *)css html:(NSString *)html js:(NSString *)js configuration:(NSString *)configuration editableValues:(NSString *)editableValues namespace:(NSString *)namespace position:(int)position rendererKey:(NSString *)rendererKey serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFragmentEntryLinkWithGroupId:(long long)groupId originalFragmentEntryLinkId:(long long)originalFragmentEntryLinkId fragmentEntryId:(long long)fragmentEntryId segmentsExperienceId:(long long)segmentsExperienceId plid:(long long)plid css:(NSString *)css html:(NSString *)html js:(NSString *)js configuration:(NSString *)configuration editableValues:(NSString *)editableValues namespace:(NSString *)namespace position:(int)position rendererKey:(NSString *)rendererKey serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryLinkWithFragmentEntryLinkId:(long long)fragmentEntryLinkId editableValues:(NSString *)editableValues error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryLinkWithFragmentEntryLinkId:(long long)fragmentEntryLinkId editableValues:(NSString *)editableValues updateClassedModel:(BOOL)updateClassedModel error:(NSError **)error;
- (NSDictionary *)deleteFragmentEntryLinkWithFragmentEntryLinkId:(long long)fragmentEntryLinkId error:(NSError **)error;
- (void)updateFragmentEntryLinksWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK fragmentEntryIds:(NSArray *)fragmentEntryIds editableValues:(NSString *)editableValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)updateFragmentEntryLinksWithGroupId:(long long)groupId plid:(long long)plid fragmentEntryIds:(NSArray *)fragmentEntryIds editableValues:(NSString *)editableValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)updateFragmentEntryLinksWithFragmentEntryLinksEditableValuesMap:(NSDictionary *)fragmentEntryLinksEditableValuesMap error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end