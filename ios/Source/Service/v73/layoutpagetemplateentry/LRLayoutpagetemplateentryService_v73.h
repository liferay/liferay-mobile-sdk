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
@interface LRLayoutpagetemplateentryService_v73 : LRBaseService

- (NSDictionary *)updateStatusWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId status:(int)status error:(NSError **)error;
- (NSDictionary *)addLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name type:(int)type masterLayoutPlid:(long long)masterLayoutPlid status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name status:(int)status classNameId:(long long)classNameId classTypeId:(long long)classTypeId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name masterLayoutPlid:(long long)masterLayoutPlid status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)updateLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId defaultTemplate:(BOOL)defaultTemplate error:(NSError **)error;
- (NSDictionary *)updateLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId fragmentEntryIds:(NSArray *)fragmentEntryIds editableValues:(NSString *)editableValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId previewFileEntryId:(long long)previewFileEntryId error:(NSError **)error;
- (NSDictionary *)updateLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId name:(NSString *)name fragmentEntryIds:(NSArray *)fragmentEntryIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)copyLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId layoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId error:(NSError **)error;
- (NSDictionary *)fetchDefaultLayoutPageTemplateEntryWithGroupId:(long long)groupId type:(int)type status:(int)status error:(NSError **)error;
- (NSDictionary *)fetchDefaultLayoutPageTemplateEntryWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId error:(NSError **)error;
- (NSDictionary *)fetchLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId name:(NSString *)name type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId name:(NSString *)name type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId type:(int)type defaultTemplate:(BOOL)defaultTemplate error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type status:(int)status error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)fetchLayoutPageTemplateEntryByUuidAndGroupIdWithUuid:(NSString *)uuid groupId:(long long)groupId error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name status:(int)status error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name type:(int)type status:(int)status error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId name:(NSString *)name type:(int)type error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId name:(NSString *)name type:(int)type status:(int)status error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId status:(int)status error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId type:(int)type status:(int)status error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId type:(int)type error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type status:(int)status error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name type:(int)type error:(NSError **)error;
- (void)deleteLayoutPageTemplateEntriesWithLayoutPageTemplateEntryIds:(NSArray *)layoutPageTemplateEntryIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getLayoutPageTemplateEntriesByTypeWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateEntriesCountByTypeWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId type:(int)type error:(NSError **)error;

@end