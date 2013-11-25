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
@interface LRDDMStructureService_v62 : LRBaseService

- (NSDictionary *)addStructureWithGroupId:(long)groupId parentStructureId:(long)parentStructureId classNameId:(long)classNameId structureKey:(NSString *)structureKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd storageType:(NSString *)storageType type:(int)type serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addStructureWithUserId:(long)userId groupId:(long)groupId parentStructureKey:(NSString *)parentStructureKey classNameId:(long)classNameId structureKey:(NSString *)structureKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd storageType:(NSString *)storageType type:(int)type serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addStructureWithUserId:(long)userId groupId:(long)groupId classNameId:(long)classNameId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)copyStructureWithStructureId:(long)structureId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)copyStructureWithStructureId:(long)structureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteStructureWithStructureId:(long)structureId error:(NSError **)error;
- (NSDictionary *)fetchStructureWithGroupId:(long)groupId classNameId:(long)classNameId structureKey:(NSString *)structureKey error:(NSError **)error;
- (NSDictionary *)getStructureWithStructureId:(long)structureId error:(NSError **)error;
- (NSDictionary *)getStructureWithGroupId:(long)groupId classNameId:(long)classNameId structureKey:(NSString *)structureKey error:(NSError **)error;
- (NSDictionary *)getStructureWithGroupId:(long)groupId classNameId:(long)classNameId structureKey:(NSString *)structureKey includeGlobalStructures:(BOOL)includeGlobalStructures error:(NSError **)error;
- (NSArray *)getStructuresWithGroupId:(long)groupId error:(NSError **)error;
- (NSArray *)getStructuresWithGroupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds name:(NSString *)name description:(NSString *)description storageType:(NSString *)storageType type:(int)type andOperator:(BOOL)andOperator start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error;
- (NSNumber *)searchCountWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds keywords:(NSString *)keywords error:(NSError **)error;
- (NSNumber *)searchCountWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds name:(NSString *)name description:(NSString *)description storageType:(NSString *)storageType type:(int)type andOperator:(BOOL)andOperator error:(NSError **)error;
- (NSDictionary *)updateStructureWithStructureId:(long)structureId parentStructureId:(long)parentStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateStructureWithGroupId:(long)groupId parentStructureId:(long)parentStructureId classNameId:(long)classNameId structureKey:(NSString *)structureKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end