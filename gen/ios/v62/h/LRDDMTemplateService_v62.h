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
@interface LRDDMTemplateService_v62 : LRBaseService

- (NSDictionary *)addTemplateWithGroupId:(long)groupId classNameId:(long)classNameId classPK:(long)classPK nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type mode:(NSString *)mode language:(NSString *)language script:(NSString *)script serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addTemplateWithGroupId:(long)groupId classNameId:(long)classNameId classPK:(long)classPK templateKey:(NSString *)templateKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type mode:(NSString *)mode language:(NSString *)language script:(NSString *)script cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallImageFile:(NSDictionary *)smallImageFile serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)copyTemplateWithTemplateId:(long)templateId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)copyTemplateWithTemplateId:(long)templateId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSArray *)copyTemplatesWithClassNameId:(long)classNameId classPK:(long)classPK newClassPK:(long)newClassPK type:(NSString *)type serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteTemplateWithTemplateId:(long)templateId error:(NSError **)error;
- (NSDictionary *)fetchTemplateWithGroupId:(long)groupId classNameId:(long)classNameId templateKey:(NSString *)templateKey error:(NSError **)error;
- (NSDictionary *)getTemplateWithTemplateId:(long)templateId error:(NSError **)error;
- (NSDictionary *)getTemplateWithGroupId:(long)groupId classNameId:(long)classNameId templateKey:(NSString *)templateKey error:(NSError **)error;
- (NSDictionary *)getTemplateWithGroupId:(long)groupId classNameId:(long)classNameId templateKey:(NSString *)templateKey includeGlobalTemplates:(BOOL)includeGlobalTemplates error:(NSError **)error;
- (NSArray *)getTemplatesWithGroupId:(long)groupId classNameId:(long)classNameId error:(NSError **)error;
- (NSArray *)getTemplatesWithGroupId:(long)groupId classNameId:(long)classNameId classPK:(long)classPK error:(NSError **)error;
- (NSArray *)getTemplatesWithGroupId:(long)groupId classNameId:(long)classNameId classPK:(long)classPK type:(NSString *)type error:(NSError **)error;
- (NSArray *)getTemplatesWithGroupId:(long)groupId classNameId:(long)classNameId classPK:(long)classPK type:(NSString *)type mode:(NSString *)mode error:(NSError **)error;
- (NSArray *)getTemplatesByClassPkWithGroupId:(long)groupId classPK:(long)classPK error:(NSError **)error;
- (NSArray *)getTemplatesByStructureClassNameIdWithGroupId:(long)groupId structureClassNameId:(long)structureClassNameId start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error;
- (NSNumber *)getTemplatesByStructureClassNameIdCountWithGroupId:(long)groupId structureClassNameId:(long)structureClassNameId error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupId:(long)groupId classNameId:(long)classNameId classPK:(long)classPK keywords:(NSString *)keywords type:(NSString *)type mode:(NSString *)mode start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds classPKs:(NSArray *)classPKs keywords:(NSString *)keywords type:(NSString *)type mode:(NSString *)mode start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupId:(long)groupId classNameId:(long)classNameId classPK:(long)classPK name:(NSString *)name description:(NSString *)description type:(NSString *)type mode:(NSString *)mode language:(NSString *)language andOperator:(BOOL)andOperator start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds classPKs:(NSArray *)classPKs name:(NSString *)name description:(NSString *)description type:(NSString *)type mode:(NSString *)mode language:(NSString *)language andOperator:(BOOL)andOperator start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error;
- (NSNumber *)searchCountWithCompanyId:(long)companyId groupId:(long)groupId classNameId:(long)classNameId classPK:(long)classPK name:(NSString *)name description:(NSString *)description type:(NSString *)type mode:(NSString *)mode language:(NSString *)language andOperator:(BOOL)andOperator error:(NSError **)error;
- (NSNumber *)searchCountWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds classPKs:(NSArray *)classPKs name:(NSString *)name description:(NSString *)description type:(NSString *)type mode:(NSString *)mode language:(NSString *)language andOperator:(BOOL)andOperator error:(NSError **)error;
- (NSNumber *)searchCountWithCompanyId:(long)companyId groupId:(long)groupId classNameId:(long)classNameId classPK:(long)classPK keywords:(NSString *)keywords type:(NSString *)type mode:(NSString *)mode error:(NSError **)error;
- (NSNumber *)searchCountWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds classPKs:(NSArray *)classPKs keywords:(NSString *)keywords type:(NSString *)type mode:(NSString *)mode error:(NSError **)error;
- (NSDictionary *)updateTemplateWithTemplateId:(long)templateId classPK:(long)classPK nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type mode:(NSString *)mode language:(NSString *)language script:(NSString *)script cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallImageFile:(NSDictionary *)smallImageFile serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end