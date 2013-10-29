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
@interface DDMStructureService_v62 : NSObject

- (NSArray *)getStructures:(NSArray *)groupIds;
- (NSArray *)search:(NSNumber *)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds keywords:(NSString *)keywords start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator;
- (NSDictionary *)updateStructure:(NSNumber *)groupId parentStructureId:(NSNumber *)parentStructureId classNameId:(NSNumber *)classNameId structureKey:(NSString *)structureKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addStructure:(NSNumber *)userId groupId:(NSNumber *)groupId classNameId:(NSNumber *)classNameId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext;
- (NSNumber *)searchCount:(NSNumber *)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds name:(NSString *)name description:(NSString *)description storageType:(NSString *)storageType type:(NSNumber *)type andOperator:(BOOL)andOperator;
- (NSDictionary *)copyStructure:(NSNumber *)structureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getStructure:(NSNumber *)groupId classNameId:(NSNumber *)classNameId structureKey:(NSString *)structureKey includeGlobalStructures:(BOOL)includeGlobalStructures;
- (NSDictionary *)fetchStructure:(NSNumber *)groupId classNameId:(NSNumber *)classNameId structureKey:(NSString *)structureKey;
- (void)deleteStructure:(NSNumber *)structureId;

@end