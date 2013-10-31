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

#import "SocialActivitySettingService_v62.h"

/**
 * author Bruno Farache
 */
@implementation SocialActivitySettingService_v62

- (NSDictionary *)getActivityDefinition:(NSNumber *)groupId className:(NSString *)className activityType:(NSNumber *)activityType {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"className": className,
		@"activityType": activityType
	};

	NSDictionary *_command = @{@"/socialactivitysetting/get-activity-definition": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getActivityDefinitions:(NSNumber *)groupId className:(NSString *)className {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"className": className
	};

	NSDictionary *_command = @{@"/socialactivitysetting/get-activity-definitions": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)getJsonActivityDefinitions:(NSNumber *)groupId className:(NSString *)className {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"className": className
	};

	NSDictionary *_command = @{@"/socialactivitysetting/get-json-activity-definitions": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)updateActivitySettings:(NSNumber *)groupId className:(NSString *)className activityType:(NSNumber *)activityType activityCounterDefinitions:(NSArray *)activityCounterDefinitions {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"className": className,
		@"activityType": activityType,
		@"activityCounterDefinitions": activityCounterDefinitions
	};

	NSDictionary *_command = @{@"/socialactivitysetting/update-activity-settings": _params};

	[session invoke:_command];
}

- (NSArray *)getActivitySettings:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/socialactivitysetting/get-activity-settings": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)updateActivitySetting:(NSNumber *)groupId className:(NSString *)className activityType:(NSNumber *)activityType activityCounterDefinition:(NSDictionary *)activityCounterDefinition {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"className": className,
		@"activityType": activityType,
		@"activityCounterDefinition": activityCounterDefinition
	};

	NSDictionary *_command = @{@"/socialactivitysetting/update-activity-setting": _params};

	[session invoke:_command];
}

@end