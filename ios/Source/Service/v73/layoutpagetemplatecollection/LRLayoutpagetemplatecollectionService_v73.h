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
@interface LRLayoutpagetemplatecollectionService_v73 : LRBaseService

- (NSDictionary *)addLayoutPageTemplateCollectionWithGroupId:(long long)groupId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateLayoutPageTemplateCollectionWithLayoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name description:(NSString *)description error:(NSError **)error;
- (void)deleteLayoutPageTemplateCollectionsWithLayoutPageTemplateCollectionIds:(NSArray *)layoutPageTemplateCollectionIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)deleteLayoutPageTemplateCollectionWithLayoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId error:(NSError **)error;
- (NSDictionary *)fetchLayoutPageTemplateCollectionWithLayoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateCollectionsWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateCollectionsWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateCollectionsWithGroupId:(long long)groupId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getLayoutPageTemplateCollectionsWithGroupId:(long long)groupId error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateCollectionsCountWithGroupId:(long long)groupId name:(NSString *)name error:(NSError **)error;
- (NSNumber *)getLayoutPageTemplateCollectionsCountWithGroupId:(long long)groupId error:(NSError **)error;

@end