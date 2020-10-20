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
@interface LRCpdefinitionlinkService_v73 : LRBaseService

- (NSDictionary *)addCpDefinitionLinkWithCpDefinitionId:(long long)cpDefinitionId cProductId:(long long)cProductId priority:(double)priority type:(NSString *)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCpDefinitionLinkWithCpDefinitionLinkId:(long long)cpDefinitionLinkId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCpDefinitionLinksWithCpDefinitionId:(long long)cpDefinitionId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCpDefinitionLinksWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error;
- (NSArray *)getCpDefinitionLinksWithCpDefinitionId:(long long)cpDefinitionId type:(NSString *)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCpDefinitionLinksWithCpDefinitionId:(long long)cpDefinitionId type:(NSString *)type error:(NSError **)error;
- (NSNumber *)getCpDefinitionLinksCountWithCpDefinitionId:(long long)cpDefinitionId type:(NSString *)type error:(NSError **)error;
- (NSNumber *)getCpDefinitionLinksCountWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error;
- (NSDictionary *)updateCpDefinitionLinkWithCpDefinitionLinkId:(long long)cpDefinitionLinkId priority:(double)priority serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)updateCpDefinitionLinksWithCpDefinitionId:(long long)cpDefinitionId cpDefinitionIds2:(NSArray *)cpDefinitionIds2 type:(NSString *)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCpDefinitionLinkWithCpDefinitionLinkId:(long long)cpDefinitionLinkId error:(NSError **)error;
- (NSDictionary *)getCpDefinitionLinkWithCpDefinitionLinkId:(long long)cpDefinitionLinkId error:(NSError **)error;

@end