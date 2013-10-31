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

#import "MDRActionService_v62.h"

/**
 * author Bruno Farache
 */
@implementation MDRActionService_v62

- (NSDictionary *)updateAction:(NSNumber *)actionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type typeSettingsProperties:(NSDictionary *)typeSettingsProperties serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"actionId": actionId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"type": type,
		@"typeSettingsProperties": typeSettingsProperties,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mdraction/update-action": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addAction:(NSNumber *)ruleGroupInstanceId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type typeSettingsProperties:(NSDictionary *)typeSettingsProperties serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"ruleGroupInstanceId": ruleGroupInstanceId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"type": type,
		@"typeSettingsProperties": typeSettingsProperties,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mdraction/add-action": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getAction:(NSNumber *)actionId {
	NSDictionary *_params = @{
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/mdraction/get-action": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteAction:(NSNumber *)actionId {
	NSDictionary *_params = @{
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/mdraction/delete-action": _params};

	[session invoke:_command];
}

- (NSDictionary *)fetchAction:(NSNumber *)actionId {
	NSDictionary *_params = @{
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/mdraction/fetch-action": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end