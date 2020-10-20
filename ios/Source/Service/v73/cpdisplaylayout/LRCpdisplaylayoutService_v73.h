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
@interface LRCpdisplaylayoutService_v73 : LRBaseService

- (NSDictionary *)addCpDisplayLayoutWithUserId:(long long)userId groupId:(long long)groupId clazz:(NSString *)clazz classPK:(long long)classPK layoutUuid:(NSString *)layoutUuid error:(NSError **)error;
- (NSDictionary *)addCpDisplayLayoutWithClazz:(NSString *)clazz classPK:(long long)classPK layoutUuid:(NSString *)layoutUuid serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCpDisplayLayoutWithClazz:(NSString *)clazz classPK:(long long)classPK error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteCpDisplayLayoutWithCpDisplayLayoutId:(long long)cpDisplayLayoutId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCpDisplayLayoutWithCpDisplayLayoutId:(long long)cpDisplayLayoutId error:(NSError **)error;
- (NSDictionary *)updateCpDisplayLayoutWithCpDisplayLayoutId:(long long)cpDisplayLayoutId layoutUuid:(NSString *)layoutUuid error:(NSError **)error;
- (NSDictionary *)searchCpDisplayLayoutWithCompanyId:(long long)companyId groupId:(long long)groupId className:(NSString *)className keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;

@end