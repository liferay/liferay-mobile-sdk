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
@interface LRSegmentsexperienceService_v72 : LRBaseService

- (NSDictionary *)deleteSegmentsExperienceWithSegmentsExperienceId:(long long)segmentsExperienceId error:(NSError **)error;
- (NSDictionary *)getSegmentsExperienceWithSegmentsExperienceId:(long long)segmentsExperienceId error:(NSError **)error;
- (NSArray *)getSegmentsExperiencesWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getSegmentsExperiencesWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK active:(BOOL)active error:(NSError **)error;
- (NSNumber *)getSegmentsExperiencesCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK active:(BOOL)active error:(NSError **)error;
- (void)updateSegmentsExperiencePriorityWithSegmentsExperienceId:(long long)segmentsExperienceId newPriority:(int)newPriority error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addSegmentsExperienceWithSegmentsEntryId:(long long)segmentsEntryId classNameId:(long long)classNameId classPK:(long long)classPK nameMap:(NSDictionary *)nameMap active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateSegmentsExperienceWithSegmentsExperienceId:(long long)segmentsExperienceId segmentsEntryId:(long long)segmentsEntryId nameMap:(NSDictionary *)nameMap active:(BOOL)active error:(NSError **)error;

@end