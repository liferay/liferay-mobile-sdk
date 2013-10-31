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
@interface RepositoryService_v62 : BaseService

- (NSDictionary *)getRepositoryImpl:(long)folderId fileEntryId:(long)fileEntryId fileVersionId:(long)fileVersionId;
- (NSDictionary *)addRepository:(long)groupId classNameId:(long)classNameId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description portletId:(NSString *)portletId typeSettingsProperties:(NSDictionary *)typeSettingsProperties serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getLocalRepositoryImpl:(long)folderId fileEntryId:(long)fileEntryId fileVersionId:(long)fileVersionId;
- (NSDictionary *)getRepository:(long)repositoryId;
- (NSArray *)getSupportedParameters:(long)classNameId configuration:(NSString *)configuration;
- (void)updateRepository:(long)repositoryId name:(NSString *)name description:(NSString *)description;
- (NSDictionary *)getTypeSettingsProperties:(long)repositoryId;
- (void)deleteRepository:(long)repositoryId;
- (NSArray *)getSupportedConfigurations:(long)classNameId;
- (void)checkRepository:(long)repositoryId;

@end