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
@interface LRDLFileEntryTypeService_v62 : BaseService

- (NSDictionary *)addFileEntryTypeWithGroupId:(long)groupId name:(NSString *)name description:(NSString *)description ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFileEntryTypeWithGroupId:(long)groupId fileEntryTypeKey:(NSString *)fileEntryTypeKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteFileEntryTypeWithFileEntryTypeId:(long)fileEntryTypeId error:(NSError **)error;
- (NSDictionary *)getFileEntryTypeWithFileEntryTypeId:(long)fileEntryTypeId error:(NSError **)error;
- (NSArray *)getFileEntryTypesWithGroupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSArray *)getFileEntryTypesWithGroupIds:(NSArray *)groupIds start:(int)start end:(int)end error:(NSError **)error;
- (int)getFileEntryTypesCountWithGroupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSArray *)getFolderFileEntryTypesWithGroupIds:(NSArray *)groupIds folderId:(long)folderId inherited:(BOOL)inherited error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords includeBasicFileEntryType:(BOOL)includeBasicFileEntryType start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error;
- (int)searchCountWithCompanyId:(long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords includeBasicFileEntryType:(BOOL)includeBasicFileEntryType error:(NSError **)error;
- (void)updateFileEntryTypeWithFileEntryTypeId:(long)fileEntryTypeId name:(NSString *)name description:(NSString *)description ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)updateFileEntryTypeWithFileEntryTypeId:(long)fileEntryTypeId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end