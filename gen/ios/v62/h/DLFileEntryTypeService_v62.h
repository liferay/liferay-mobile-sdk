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
@interface DLFileEntryTypeService_v62 : BaseService

- (void)updateFileEntryType:(long)fileEntryTypeId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext;
- (int)searchCount:(long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords includeBasicFileEntryType:(BOOL)includeBasicFileEntryType;
- (int)getFileEntryTypesCount:(NSArray *)groupIds;
- (NSArray *)search:(long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords includeBasicFileEntryType:(BOOL)includeBasicFileEntryType start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator;
- (NSArray *)getFolderFileEntryTypes:(NSArray *)groupIds folderId:(long)folderId inherited:(BOOL)inherited;
- (NSDictionary *)addFileEntryType:(long)groupId fileEntryTypeKey:(NSString *)fileEntryTypeKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getFileEntryTypes:(NSArray *)groupIds start:(int)start end:(int)end;
- (NSDictionary *)getFileEntryType:(long)fileEntryTypeId;
- (void)deleteFileEntryType:(long)fileEntryTypeId;

@end