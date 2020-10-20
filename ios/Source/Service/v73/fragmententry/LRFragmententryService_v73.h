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
@interface LRFragmententryService_v73 : LRBaseService

- (NSArray *)getTempFileNamesWithGroupId:(long long)groupId folderName:(NSString *)folderName error:(NSError **)error;
- (NSDictionary *)fetchDraftWithPrimaryKey:(long long)primaryKey error:(NSError **)error;
- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentEntryKey:(NSString *)fragmentEntryKey name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js configuration:(NSString *)configuration previewFileEntryId:(long long)previewFileEntryId type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentEntryKey:(NSString *)fragmentEntryKey name:(NSString *)name previewFileEntryId:(long long)previewFileEntryId type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentEntryKey:(NSString *)fragmentEntryKey name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js cacheable:(BOOL)cacheable configuration:(NSString *)configuration previewFileEntryId:(long long)previewFileEntryId type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js cacheable:(BOOL)cacheable configuration:(NSString *)configuration status:(int)status error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js cacheable:(BOOL)cacheable configuration:(NSString *)configuration previewFileEntryId:(long long)previewFileEntryId status:(int)status error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js configuration:(NSString *)configuration previewFileEntryId:(long long)previewFileEntryId status:(int)status error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js cacheable:(BOOL)cacheable configuration:(NSString *)configuration previewFileEntryId:(long long)previewFileEntryId status:(int)status error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId previewFileEntryId:(long long)previewFileEntryId error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntry:(LRJSONObjectWrapper *)fragmentEntry error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js configuration:(NSString *)configuration status:(int)status error:(NSError **)error;
- (NSArray *)getFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentEntriesWithFragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error;
- (NSDictionary *)fetchFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId error:(NSError **)error;
- (NSDictionary *)copyFragmentEntryWithGroupId:(long long)groupId fragmentEntryId:(long long)fragmentEntryId fragmentCollectionId:(long long)fragmentCollectionId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId error:(NSError **)error;
- (NSNumber *)getFragmentEntriesCountWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error;
- (NSDictionary *)moveFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId fragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error;
- (void)deleteFragmentEntriesWithFragmentEntriesIds:(NSArray *)fragmentEntriesIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getFragmentCompositionsAndFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentCompositionsAndFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getFragmentCompositionsAndFragmentEntriesCountWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name status:(int)status error:(NSError **)error;
- (NSNumber *)getFragmentCompositionsAndFragmentEntriesCountWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status error:(NSError **)error;
- (NSArray *)getFragmentEntriesByNameWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentEntriesByNameAndStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentEntriesByStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status error:(NSError **)error;
- (NSArray *)getFragmentEntriesByStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentEntriesByTypeWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentEntriesByTypeAndStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentEntriesByTypeAndStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type status:(int)status error:(NSError **)error;
- (NSNumber *)getFragmentEntriesCountByNameWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name error:(NSError **)error;
- (NSNumber *)getFragmentEntriesCountByNameAndStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name status:(int)status error:(NSError **)error;
- (NSNumber *)getFragmentEntriesCountByStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status error:(NSError **)error;
- (NSNumber *)getFragmentEntriesCountByTypeWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type error:(NSError **)error;
- (NSNumber *)getFragmentEntriesCountByTypeAndStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type status:(int)status error:(NSError **)error;
- (NSDictionary *)getDraftWithPrimaryKey:(long long)primaryKey error:(NSError **)error;
- (NSDictionary *)publishDraftWithDraftFragmentEntry:(LRJSONObjectWrapper *)draftFragmentEntry error:(NSError **)error;
- (NSDictionary *)updateDraftWithDraftFragmentEntry:(LRJSONObjectWrapper *)draftFragmentEntry error:(NSError **)error;

@end