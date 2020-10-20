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
@interface LRCpoptionvalueService_v73 : LRBaseService

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSArray *)getCpOptionValuesWithCpOptionId:(long long)cpOptionId start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)addCpOptionValueWithCpOptionId:(long long)cpOptionId titleMap:(NSDictionary *)titleMap priority:(double)priority key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCpOptionValueWithCpOptionValueId:(long long)cpOptionValueId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)getCpOptionValueWithCpOptionValueId:(long long)cpOptionValueId error:(NSError **)error;
- (NSNumber *)getCpOptionValuesCountWithCpOptionId:(long long)cpOptionId error:(NSError **)error;
- (NSDictionary *)updateCpOptionValueWithCpOptionValueId:(long long)cpOptionValueId titleMap:(NSDictionary *)titleMap priority:(double)priority key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)upsertCpOptionValueWithCpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap priority:(double)priority key:(NSString *)key externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)fetchCpOptionValueWithCpOptionValueId:(long long)cpOptionValueId error:(NSError **)error;

@end