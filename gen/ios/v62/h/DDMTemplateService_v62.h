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
@interface DDMTemplateService_v62 : BaseService

- (NSDictionary *)getTemplate:(long)groupId classNameId:(long)classNameId templateKey:(NSString *)templateKey includeGlobalTemplates:(BOOL)includeGlobalTemplates;
- (NSArray *)getTemplatesByClassPk:(long)groupId classPK:(long)classPK;
- (int)getTemplatesByStructureClassNameIdCount:(long)groupId structureClassNameId:(long)structureClassNameId;
- (NSDictionary *)updateTemplate:(long)templateId classPK:(long)classPK nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type mode:(NSString *)mode language:(NSString *)language script:(NSString *)script cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallImageFile:(NSDictionary *)smallImageFile serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getTemplatesByStructureClassNameId:(long)groupId structureClassNameId:(long)structureClassNameId start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator;
- (NSDictionary *)copyTemplate:(long)templateId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)fetchTemplate:(long)groupId classNameId:(long)classNameId templateKey:(NSString *)templateKey;
- (NSArray *)copyTemplates:(long)classNameId classPK:(long)classPK newClassPK:(long)newClassPK type:(NSString *)type serviceContext:(NSDictionary *)serviceContext;
- (void)deleteTemplate:(long)templateId;
- (NSArray *)getTemplates:(long)groupId classNameId:(long)classNameId classPK:(long)classPK type:(NSString *)type mode:(NSString *)mode;
- (NSDictionary *)addTemplate:(long)groupId classNameId:(long)classNameId classPK:(long)classPK templateKey:(NSString *)templateKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type mode:(NSString *)mode language:(NSString *)language script:(NSString *)script cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallImageFile:(NSDictionary *)smallImageFile serviceContext:(NSDictionary *)serviceContext;
- (int)searchCount:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds classPKs:(NSArray *)classPKs keywords:(NSString *)keywords type:(NSString *)type mode:(NSString *)mode;
- (NSArray *)search:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds classPKs:(NSArray *)classPKs name:(NSString *)name description:(NSString *)description type:(NSString *)type mode:(NSString *)mode language:(NSString *)language andOperator:(BOOL)andOperator start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator;

@end