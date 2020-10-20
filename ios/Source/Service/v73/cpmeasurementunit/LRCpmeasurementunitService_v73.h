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
@interface LRCpmeasurementunitService_v73 : LRBaseService

- (void)deleteCpMeasurementUnitWithCpMeasurementUnitId:(long long)cpMeasurementUnitId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addCpMeasurementUnitWithNameMap:(NSDictionary *)nameMap key:(NSString *)key rate:(double)rate primary:(BOOL)primary priority:(double)priority type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getCpMeasurementUnitsWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCpMeasurementUnitsWithCompanyId:(long long)companyId type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)fetchPrimaryCpMeasurementUnitWithCompanyId:(long long)companyId type:(int)type error:(NSError **)error;
- (NSNumber *)getCpMeasurementUnitsCountWithCompanyId:(long long)companyId type:(int)type error:(NSError **)error;
- (NSNumber *)getCpMeasurementUnitsCountWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSDictionary *)updateCpMeasurementUnitWithCpMeasurementUnitId:(long long)cpMeasurementUnitId nameMap:(NSDictionary *)nameMap key:(NSString *)key rate:(double)rate primary:(BOOL)primary priority:(double)priority type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getCpMeasurementUnitWithCpMeasurementUnitId:(long long)cpMeasurementUnitId error:(NSError **)error;
- (NSDictionary *)setPrimaryWithCpMeasurementUnitId:(long long)cpMeasurementUnitId primary:(BOOL)primary error:(NSError **)error;

@end