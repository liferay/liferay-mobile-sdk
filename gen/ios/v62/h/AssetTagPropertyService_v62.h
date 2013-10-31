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
@interface AssetTagPropertyService_v62 : BaseService

- (NSArray *)getTagProperties:(long)tagId;
- (NSDictionary *)updateTagProperty:(long)tagPropertyId key:(NSString *)key value:(NSString *)value;
- (NSDictionary *)addTagProperty:(long)tagId key:(NSString *)key value:(NSString *)value;
- (NSArray *)getTagPropertyValues:(long)companyId key:(NSString *)key;
- (void)deleteTagProperty:(long)tagPropertyId;

@end