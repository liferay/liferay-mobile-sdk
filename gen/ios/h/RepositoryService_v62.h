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

/**
 * author Bruno Farache
 */
@interface RepositoryService_v62 : NSObject

- (NSDictionary *)getRepositoryImpl:(NSNumber *)folderId fileEntryId:(NSNumber *)fileEntryId fileVersionId:(NSNumber *)fileVersionId;
- (NSDictionary *)addRepository:(NSNumber *)groupId classNameId:(NSNumber *)classNameId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description portletId:(NSString *)portletId typeSettingsProperties:(NSDictionary *)typeSettingsProperties serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getLocalRepositoryImpl:(NSNumber *)folderId fileEntryId:(NSNumber *)fileEntryId fileVersionId:(NSNumber *)fileVersionId;
- (NSDictionary *)getRepository:(NSNumber *)repositoryId;
- (NSArray *)getSupportedParameters:(NSNumber *)classNameId configuration:(NSString *)configuration;
- (void)updateRepository:(NSNumber *)repositoryId name:(NSString *)name description:(NSString *)description;
- (NSDictionary *)getTypeSettingsProperties:(NSNumber *)repositoryId;
- (void)deleteRepository:(NSNumber *)repositoryId;
- (NSArray *)getSupportedConfigurations:(NSNumber *)classNameId;
- (void)checkRepository:(NSNumber *)repositoryId;

@end