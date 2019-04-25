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
@interface LRFragmententryService_v72 : LRBaseService

- (NSDictionary *)copyFragmentEntryWithGroupId:(long long)groupId fragmentEntryId:(long long)fragmentEntryId fragmentCollectionId:(long long)fragmentCollectionId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)fetchFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId error:(NSError **)error;
- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error;
- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status error:(NSError **)error;
- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name error:(NSError **)error;
- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name status:(int)status error:(NSError **)error;
- (NSNumber *)getFragmentCollectionsCountByTypeWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type error:(NSError **)error;
- (NSArray *)getFragmentEntriesByTypeWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type status:(int)status error:(NSError **)error;
- (NSArray *)getFragmentEntriesByTypeWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)moveFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId fragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error;
- (NSArray *)getTempFileNamesWithGroupId:(long long)groupId folderName:(NSString *)folderName error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js status:(int)status error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js previewFileEntryId:(long long)previewFileEntryId status:(int)status error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId previewFileEntryId:(long long)previewFileEntryId error:(NSError **)error;
- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentEntryKey:(NSString *)fragmentEntryKey name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentEntryKey:(NSString *)fragmentEntryKey name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentEntryKey:(NSString *)fragmentEntryKey name:(NSString *)name type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentEntryKey:(NSString *)fragmentEntryKey name:(NSString *)name status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getFragmentEntriesWithFragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error;
- (NSArray *)getFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status error:(NSError **)error;
- (NSArray *)getFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (void)deleteFragmentEntriesWithFragmentEntriesIds:(NSArray *)fragmentEntriesIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)deleteFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId error:(NSError **)error;

@end