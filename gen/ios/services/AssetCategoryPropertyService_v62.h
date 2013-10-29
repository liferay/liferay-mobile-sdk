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
@interface AssetCategoryPropertyService_v62 : NSObject

- (NSArray *)getCategoryPropertyValues:(NSNumber *)companyId key:(NSString *)key;
- (void)deleteCategoryProperty:(NSNumber *)categoryPropertyId;
- (NSDictionary *)updateCategoryProperty:(NSNumber *)categoryPropertyId key:(NSString *)key value:(NSString *)value;
- (NSDictionary *)addCategoryProperty:(NSNumber *)entryId key:(NSString *)key value:(NSString *)value;
- (NSArray *)getCategoryProperties:(NSNumber *)entryId;

@end