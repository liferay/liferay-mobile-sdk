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

#import "MDRRuleService_v62.h"

/**
 * author Bruno Farache
 */
@implementation MDRRuleService_v62

- (NSDictionary *)updateRule:(NSNumber *)ruleId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type typeSettingsProperties:(NSDictionary *)typeSettingsProperties serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"ruleId": ruleId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"type": type,
		@"typeSettingsProperties": typeSettingsProperties,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mdrrule/update-rule": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteRule:(NSNumber *)ruleId {
	NSDictionary *_params = @{
		@"ruleId": ruleId
	};

	NSDictionary *_command = @{@"/mdrrule/delete-rule": _params};

	[session invoke:_command];
}

- (NSDictionary *)addRule:(NSNumber *)ruleGroupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type typeSettings:(NSString *)typeSettings serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"ruleGroupId": ruleGroupId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"type": type,
		@"typeSettings": typeSettings,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mdrrule/add-rule": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getRule:(NSNumber *)ruleId {
	NSDictionary *_params = @{
		@"ruleId": ruleId
	};

	NSDictionary *_command = @{@"/mdrrule/get-rule": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)fetchRule:(NSNumber *)ruleId {
	NSDictionary *_params = @{
		@"ruleId": ruleId
	};

	NSDictionary *_command = @{@"/mdrrule/fetch-rule": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end