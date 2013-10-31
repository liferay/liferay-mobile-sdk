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
@interface SCProductEntryService_v62 : BaseService

- (NSDictionary *)addProductEntry:(NSString *)name type:(NSString *)type tags:(NSString *)tags shortDescription:(NSString *)shortDescription longDescription:(NSString *)longDescription pageURL:(NSString *)pageURL author:(NSString *)author repoGroupId:(NSString *)repoGroupId repoArtifactId:(NSString *)repoArtifactId licenseIds:(NSArray *)licenseIds thumbnails:(NSArray *)thumbnails fullImages:(NSArray *)fullImages serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateProductEntry:(long)productEntryId name:(NSString *)name type:(NSString *)type tags:(NSString *)tags shortDescription:(NSString *)shortDescription longDescription:(NSString *)longDescription pageURL:(NSString *)pageURL author:(NSString *)author repoGroupId:(NSString *)repoGroupId repoArtifactId:(NSString *)repoArtifactId licenseIds:(NSArray *)licenseIds thumbnails:(NSArray *)thumbnails fullImages:(NSArray *)fullImages;
- (NSDictionary *)getProductEntry:(long)productEntryId;
- (void)deleteProductEntry:(long)productEntryId;

@end