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

#import "MDRRuleGroupService_v62.h"

/**
 * author Bruno Farache
 */
@implementation MDRRuleGroupService_v62

- (NSDictionary *)copyRuleGroup:(long)ruleGroupId groupId:(long)groupId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"ruleGroupId": @(ruleGroupId),
		@"groupId": @(groupId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mdrrulegroup/copy-rule-group": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)updateRuleGroup:(long)ruleGroupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"ruleGroupId": @(ruleGroupId),
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mdrrulegroup/update-rule-group": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteRuleGroup:(long)ruleGroupId {
	NSDictionary *_params = @{
		@"ruleGroupId": @(ruleGroupId)
	};

	NSDictionary *_command = @{@"/mdrrulegroup/delete-rule-group": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)fetchRuleGroup:(long)ruleGroupId {
	NSDictionary *_params = @{
		@"ruleGroupId": @(ruleGroupId)
	};

	NSDictionary *_command = @{@"/mdrrulegroup/fetch-rule-group": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addRuleGroup:(long)groupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mdrrulegroup/add-rule-group": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getRuleGroup:(long)ruleGroupId {
	NSDictionary *_params = @{
		@"ruleGroupId": @(ruleGroupId)
	};

	NSDictionary *_command = @{@"/mdrrulegroup/get-rule-group": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end