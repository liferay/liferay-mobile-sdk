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

/**
 * author: Bruno Farache
 */
@interface MDRRuleGroupInstanceService_v62 : NSObject

- (void)deleteRuleGroupInstance:(NSNumber *)ruleGroupInstanceId;
- (NSDictionary *)updateRuleGroupInstance:(NSNumber *)ruleGroupInstanceId priority:(NSNumber *)priority;
- (NSDictionary *)addRuleGroupInstance:(NSNumber *)groupId className:(NSString *)className classPK:(NSNumber *)classPK ruleGroupId:(NSNumber *)ruleGroupId priority:(NSNumber *)priority serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getRuleGroupInstances:(NSString *)className classPK:(NSNumber *)classPK start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator;
- (NSNumber *)getRuleGroupInstancesCount:(NSString *)className classPK:(NSNumber *)classPK;

@end