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
@interface MDRRuleGroupService_v62 : NSObject

- (NSDictionary *)copyRuleGroup:(NSNumber *)ruleGroupId groupId:(NSNumber *)groupId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateRuleGroup:(NSNumber *)ruleGroupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext;
- (void)deleteRuleGroup:(NSNumber *)ruleGroupId;
- (NSDictionary *)fetchRuleGroup:(NSNumber *)ruleGroupId;
- (NSDictionary *)addRuleGroup:(NSNumber *)groupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getRuleGroup:(NSNumber *)ruleGroupId;

@end