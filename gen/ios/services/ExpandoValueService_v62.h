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
@interface ExpandoValueService_v62 : NSObject

- (NSDictionary *)getData:(NSNumber *)companyId className:(NSString *)className tableName:(NSString *)tableName columnNames:(NSDictionary *)columnNames classPK:(NSNumber *)classPK;
- (void)addValues:(NSNumber *)companyId className:(NSString *)className tableName:(NSString *)tableName classPK:(NSNumber *)classPK attributeValues:(NSDictionary *)attributeValues;
- (NSDictionary *)addValue:(NSNumber *)companyId className:(NSString *)className tableName:(NSString *)tableName columnName:(NSString *)columnName classPK:(NSNumber *)classPK data:(NSDictionary *)data;
- (NSDictionary *)getJsonData:(NSNumber *)companyId className:(NSString *)className tableName:(NSString *)tableName columnName:(NSString *)columnName classPK:(NSNumber *)classPK;

@end