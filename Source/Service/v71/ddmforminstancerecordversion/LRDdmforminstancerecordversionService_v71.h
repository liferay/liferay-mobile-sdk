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
@interface LRDdmforminstancerecordversionService_v71 : LRBaseService

- (NSDictionary *)getFormInstanceRecordVersionWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId version:(NSString *)version error:(NSError **)error;
- (NSDictionary *)getFormInstanceRecordVersionWithDdmFormInstanceRecordVersionId:(long long)ddmFormInstanceRecordVersionId error:(NSError **)error;
- (NSArray *)getFormInstanceRecordVersionsWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getFormInstanceRecordVersionsWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId error:(NSError **)error;
- (NSNumber *)getFormInstanceRecordVersionsCountWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId error:(NSError **)error;

@end