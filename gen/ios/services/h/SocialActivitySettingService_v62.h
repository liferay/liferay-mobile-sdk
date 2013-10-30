/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

#import <Foundation/Foundation.h>

/**
 * author Bruno Farache
 */
@interface SocialActivitySettingService_v62 : NSObject

- (NSDictionary *)getActivityDefinition:(NSNumber *)groupId className:(NSString *)className activityType:(NSNumber *)activityType;
- (NSArray *)getActivityDefinitions:(NSNumber *)groupId className:(NSString *)className;
- (NSDictionary *)getJsonActivityDefinitions:(NSNumber *)groupId className:(NSString *)className;
- (void)updateActivitySettings:(NSNumber *)groupId className:(NSString *)className activityType:(NSNumber *)activityType activityCounterDefinitions:(NSArray *)activityCounterDefinitions;
- (NSArray *)getActivitySettings:(NSNumber *)groupId;
- (void)updateActivitySetting:(NSNumber *)groupId className:(NSString *)className activityType:(NSNumber *)activityType activityCounterDefinition:(NSDictionary *)activityCounterDefinition;

@end