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
@interface LRFragmentcompositionService_v73 : LRBaseService

- (NSDictionary *)addFragmentCompositionWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentCompositionKey:(NSString *)fragmentCompositionKey name:(NSString *)name description:(NSString *)description data:(NSString *)data previewFileEntryId:(long long)previewFileEntryId status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId previewFileEntryId:(long long)previewFileEntryId error:(NSError **)error;
- (NSDictionary *)updateFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name description:(NSString *)description data:(NSString *)data previewFileEntryId:(long long)previewFileEntryId status:(int)status error:(NSError **)error;
- (NSDictionary *)updateFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)updateFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId name:(NSString *)name description:(NSString *)description data:(NSString *)data previewFileEntryId:(long long)previewFileEntryId status:(int)status error:(NSError **)error;
- (NSArray *)getFragmentCompositionsWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentCompositionsWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status error:(NSError **)error;
- (NSArray *)getFragmentCompositionsWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFragmentCompositionsWithFragmentCollectionId:(long long)fragmentCollectionId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getFragmentCompositionsWithFragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error;
- (NSNumber *)getFragmentCompositionsCountWithFragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error;
- (NSDictionary *)moveFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId fragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error;
- (NSDictionary *)deleteFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId error:(NSError **)error;
- (NSDictionary *)fetchFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId error:(NSError **)error;
- (NSDictionary *)fetchFragmentCompositionWithGroupId:(long long)groupId fragmentCompositionKey:(NSString *)fragmentCompositionKey error:(NSError **)error;

@end