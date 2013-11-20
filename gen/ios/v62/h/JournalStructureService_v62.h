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
@interface JournalStructureService_v62 : BaseService

- (NSDictionary *)addStructureWithGroupId:(long)groupId structureId:(NSString *)structureId autoStructureId:(BOOL)autoStructureId parentStructureId:(NSString *)parentStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)copyStructureWithGroupId:(long)groupId oldStructureId:(NSString *)oldStructureId newStructureId:(NSString *)newStructureId autoStructureId:(BOOL)autoStructureId error:(NSError **)error;
- (void)deleteStructureWithGroupId:(long)groupId structureId:(NSString *)structureId error:(NSError **)error;
- (NSDictionary *)getStructureWithGroupId:(long)groupId structureId:(NSString *)structureId error:(NSError **)error;
- (NSDictionary *)getStructureWithGroupId:(long)groupId structureId:(NSString *)structureId includeGlobalStructures:(BOOL)includeGlobalStructures error:(NSError **)error;
- (NSArray *)getStructuresWithGroupId:(long)groupId error:(NSError **)error;
- (NSArray *)getStructuresWithGroupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds structureId:(NSString *)structureId name:(NSString *)name description:(NSString *)description andOperator:(BOOL)andOperator start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)searchCountWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords error:(NSError **)error;
- (int)searchCountWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds structureId:(NSString *)structureId name:(NSString *)name description:(NSString *)description andOperator:(BOOL)andOperator error:(NSError **)error;
- (NSDictionary *)updateStructureWithGroupId:(long)groupId structureId:(NSString *)structureId parentStructureId:(NSString *)parentStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end