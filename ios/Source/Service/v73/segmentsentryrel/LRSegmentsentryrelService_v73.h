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
@interface LRSegmentsentryrelService_v73 : LRBaseService

- (NSDictionary *)addSegmentsEntryRelWithSegmentsEntryId:(long long)segmentsEntryId classNameId:(long long)classNameId classPK:(long long)classPK serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteSegmentsEntryRelWithSegmentsEntryId:(long long)segmentsEntryId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteSegmentsEntryRelWithSegmentsEntryRelId:(long long)segmentsEntryRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getSegmentsEntryRelsWithSegmentsEntryId:(long long)segmentsEntryId error:(NSError **)error;
- (NSArray *)getSegmentsEntryRelsWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error;
- (NSArray *)getSegmentsEntryRelsWithSegmentsEntryId:(long long)segmentsEntryId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getSegmentsEntryRelsCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error;
- (NSNumber *)getSegmentsEntryRelsCountWithSegmentsEntryId:(long long)segmentsEntryId error:(NSError **)error;
- (BOOL)hasSegmentsEntryRelWithSegmentsEntryId:(long long)segmentsEntryId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error;

@end