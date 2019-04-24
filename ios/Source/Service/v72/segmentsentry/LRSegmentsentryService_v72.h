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
@interface LRSegmentsentryService_v72 : LRBaseService

- (NSArray *)getSegmentsEntriesWithGroupId:(long long)groupId includeAncestorSegmentsEntries:(BOOL)includeAncestorSegmentsEntries start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getSegmentsEntriesWithGroupId:(long long)groupId includeAncestorSegmentsEntries:(BOOL)includeAncestorSegmentsEntries error:(NSError **)error;
- (NSNumber *)getSegmentsEntriesCountWithGroupId:(long long)groupId includeAncestorSegmentsEntries:(BOOL)includeAncestorSegmentsEntries error:(NSError **)error;
- (NSDictionary *)getSegmentsEntryWithSegmentsEntryId:(long long)segmentsEntryId error:(NSError **)error;
- (NSDictionary *)searchSegmentsEntriesWithCompanyId:(long long)companyId groupId:(long long)groupId keywords:(NSString *)keywords includeAncestorSegmentsEntries:(BOOL)includeAncestorSegmentsEntries start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)deleteSegmentsEntryWithSegmentsEntryId:(long long)segmentsEntryId error:(NSError **)error;
- (NSDictionary *)addSegmentsEntryWithSegmentsEntryKey:(NSString *)segmentsEntryKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap active:(BOOL)active criteria:(NSString *)criteria source:(NSString *)source type:(NSString *)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateSegmentsEntryWithSegmentsEntryId:(long long)segmentsEntryId segmentsEntryKey:(NSString *)segmentsEntryKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap active:(BOOL)active criteria:(NSString *)criteria serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end