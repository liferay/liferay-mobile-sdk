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
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface DDLRecordSetService_v62 : BaseService

- (void)deleteRecordSet:(long)recordSetId;
- (NSDictionary *)getRecordSet:(long)recordSetId;
- (int)searchCount:(long)companyId groupId:(long)groupId name:(NSString *)name description:(NSString *)description scope:(int)scope andOperator:(BOOL)andOperator;
- (NSArray *)search:(long)companyId groupId:(long)groupId name:(NSString *)name description:(NSString *)description scope:(int)scope andOperator:(BOOL)andOperator start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator;
- (NSDictionary *)updateMinDisplayRows:(long)recordSetId minDisplayRows:(int)minDisplayRows serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateRecordSet:(long)groupId ddmStructureId:(long)ddmStructureId recordSetKey:(NSString *)recordSetKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap minDisplayRows:(int)minDisplayRows serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addRecordSet:(long)groupId ddmStructureId:(long)ddmStructureId recordSetKey:(NSString *)recordSetKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap minDisplayRows:(int)minDisplayRows scope:(int)scope serviceContext:(NSDictionary *)serviceContext;

@end