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
@interface LRFragmentcollectionService_v73 : LRBaseService

- (NSArray *)getTempFileNamesWithGroupId:(long long)groupId folderName:(NSString *)folderName error:(NSError **)error;
- (NSDictionary *)addFragmentCollectionWithGroupId:(long long)groupId fragmentCollectionKey:(NSString *)fragmentCollectionKey name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFragmentCollectionWithGroupId:(long long)groupId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateFragmentCollectionWithFragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name description:(NSString *)description error:(NSError **)error;
- (NSDictionary *)deleteFragmentCollectionWithFragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error;
- (NSDictionary *)fetchFragmentCollectionWithFragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error;
- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId name:(NSString *)name includeSystem:(BOOL)includeSystem start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentCollectionsWithGroupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSArray *)getFragmentCollectionsWithGroupIds:(NSArray *)groupIds start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentCollectionsWithGroupIds:(NSArray *)groupIds name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId error:(NSError **)error;
- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId includeSystem:(BOOL)includeSystem error:(NSError **)error;
- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId includeSystem:(BOOL)includeSystem start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getFragmentCollectionsCountWithGroupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId name:(NSString *)name includeSystem:(BOOL)includeSystem error:(NSError **)error;
- (NSNumber *)getFragmentCollectionsCountWithGroupIds:(NSArray *)groupIds name:(NSString *)name error:(NSError **)error;
- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId error:(NSError **)error;
- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId includeSystem:(BOOL)includeSystem error:(NSError **)error;
- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId name:(NSString *)name error:(NSError **)error;
- (void)deleteFragmentCollectionsWithFragmentCollectionIds:(NSArray *)fragmentCollectionIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end