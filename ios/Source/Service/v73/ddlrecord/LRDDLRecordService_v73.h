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
@interface LRDDLRecordService_v73 : LRBaseService

- (NSArray *)getRecordsWithRecordSetId:(long long)recordSetId error:(NSError **)error;
- (NSDictionary *)getRecordWithRecordId:(long long)recordId error:(NSError **)error;
- (NSDictionary *)addRecordWithGroupId:(long long)groupId recordSetId:(long long)recordSetId displayIndex:(int)displayIndex ddmFormValues:(LRJSONObjectWrapper *)ddmFormValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)revertRecordWithRecordId:(long long)recordId version:(NSString *)version serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateRecordWithRecordId:(long long)recordId majorVersion:(BOOL)majorVersion displayIndex:(int)displayIndex ddmFormValues:(LRJSONObjectWrapper *)ddmFormValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteRecordWithRecordId:(long long)recordId error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end