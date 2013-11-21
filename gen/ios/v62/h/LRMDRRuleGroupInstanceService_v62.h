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
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LRMDRRuleGroupInstanceService_v62 : LRBaseService

- (NSDictionary *)addRuleGroupInstanceWithGroupId:(long)groupId className:(NSString *)className classPK:(long)classPK ruleGroupId:(long)ruleGroupId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addRuleGroupInstanceWithGroupId:(long)groupId className:(NSString *)className classPK:(long)classPK ruleGroupId:(long)ruleGroupId priority:(int)priority serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteRuleGroupInstanceWithRuleGroupInstanceId:(long)ruleGroupInstanceId error:(NSError **)error;
- (NSArray *)getRuleGroupInstancesWithClassName:(NSString *)className classPK:(long)classPK start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error;
- (int)getRuleGroupInstancesCountWithClassName:(NSString *)className classPK:(long)classPK error:(NSError **)error;
- (NSDictionary *)updateRuleGroupInstanceWithRuleGroupInstanceId:(long)ruleGroupInstanceId priority:(int)priority error:(NSError **)error;

@end