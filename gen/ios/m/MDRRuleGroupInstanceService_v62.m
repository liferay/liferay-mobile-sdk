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

#import "MDRRuleGroupInstanceService_v62.h"

/**
 * author Bruno Farache
 */
@implementation MDRRuleGroupInstanceService_v62

- (void)deleteRuleGroupInstance:(long)ruleGroupInstanceId {
	NSDictionary *_params = @{
		@"ruleGroupInstanceId": @(ruleGroupInstanceId)
	};

	NSDictionary *_command = @{@"/mdrrulegroupinstance/delete-rule-group-instance": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)updateRuleGroupInstance:(long)ruleGroupInstanceId priority:(int)priority {
	NSDictionary *_params = @{
		@"ruleGroupInstanceId": @(ruleGroupInstanceId),
		@"priority": @(priority)
	};

	NSDictionary *_command = @{@"/mdrrulegroupinstance/update-rule-group-instance": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addRuleGroupInstance:(long)groupId className:(NSString *)className classPK:(long)classPK ruleGroupId:(long)ruleGroupId priority:(int)priority serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"className": className,
		@"classPK": @(classPK),
		@"ruleGroupId": @(ruleGroupId),
		@"priority": @(priority),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mdrrulegroupinstance/add-rule-group-instance": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getRuleGroupInstances:(NSString *)className classPK:(long)classPK start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK),
		@"start": @(start),
		@"end": @(end),
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/mdrrulegroupinstance/get-rule-group-instances": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (int)getRuleGroupInstancesCount:(NSString *)className classPK:(long)classPK {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK)
	};

	NSDictionary *_command = @{@"/mdrrulegroupinstance/get-rule-group-instances-count": _params};

	return (int)[self.session invoke:_command];
}

@end