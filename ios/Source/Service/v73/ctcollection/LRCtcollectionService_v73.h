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
@interface LRCtcollectionService_v73 : LRBaseService

- (NSDictionary *)addCtCollectionWithCompanyId:(long long)companyId userId:(long long)userId name:(NSString *)name description:(NSString *)description error:(NSError **)error;
- (NSDictionary *)updateCtCollectionWithUserId:(long long)userId ctCollectionId:(long long)ctCollectionId name:(NSString *)name description:(NSString *)description error:(NSError **)error;
- (void)deleteCtAutoResolutionInfoWithCtAutoResolutionInfoId:(long long)ctAutoResolutionInfoId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)deleteCtCollectionWithCtCollection:(LRJSONObjectWrapper *)ctCollection error:(NSError **)error;
- (NSArray *)getCtCollectionsWithCompanyId:(long long)companyId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCtCollectionsWithCompanyId:(long long)companyId status:(int)status keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)undoCtCollectionWithCtCollectionId:(long long)ctCollectionId userId:(long long)userId name:(NSString *)name description:(NSString *)description error:(NSError **)error;
- (NSNumber *)getCtCollectionsCountWithCompanyId:(long long)companyId status:(int)status keywords:(NSString *)keywords error:(NSError **)error;
- (void)discardCtEntryWithCtCollectionId:(long long)ctCollectionId modelClassNameId:(long long)modelClassNameId modelClassPK:(long long)modelClassPK error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)publishCtCollectionWithUserId:(long long)userId ctCollectionId:(long long)ctCollectionId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)discardCtEntriesWithCtCollectionId:(long long)ctCollectionId modelClassNameId:(long long)modelClassNameId modelClassPK:(long long)modelClassPK error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end