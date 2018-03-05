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
@interface LRSocialActivitySettingService_v71 : LRBaseService

- (NSDictionary *)getActivityDefinitionWithGroupId:(long long)groupId className:(NSString *)className activityType:(int)activityType error:(NSError **)error;
- (NSArray *)getActivityDefinitionsWithGroupId:(long long)groupId className:(NSString *)className error:(NSError **)error;
- (NSArray *)getActivitySettingsWithGroupId:(long long)groupId error:(NSError **)error;
- (void)updateActivitySettingWithGroupId:(long long)groupId className:(NSString *)className activityType:(int)activityType activityCounterDefinition:(LRJSONObjectWrapper *)activityCounterDefinition error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)updateActivitySettingWithGroupId:(long long)groupId className:(NSString *)className enabled:(BOOL)enabled error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)updateActivitySettingsWithGroupId:(long long)groupId className:(NSString *)className activityType:(int)activityType activityCounterDefinitions:(NSArray *)activityCounterDefinitions error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getJsonActivityDefinitionsWithGroupId:(long long)groupId className:(NSString *)className error:(NSError **)error;

@end