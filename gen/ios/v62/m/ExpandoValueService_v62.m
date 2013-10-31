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

#import "ExpandoValueService_v62.h"

/**
 * author Bruno Farache
 */
@implementation ExpandoValueService_v62

- (NSDictionary *)getData:(long)companyId className:(NSString *)className tableName:(NSString *)tableName columnNames:(NSDictionary *)columnNames classPK:(long)classPK {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"className": className,
		@"tableName": tableName,
		@"columnNames": columnNames,
		@"classPK": @(classPK)
	};

	NSDictionary *_command = @{@"/expandovalue/get-data": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)addValues:(long)companyId className:(NSString *)className tableName:(NSString *)tableName classPK:(long)classPK attributeValues:(NSDictionary *)attributeValues {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"className": className,
		@"tableName": tableName,
		@"classPK": @(classPK),
		@"attributeValues": attributeValues
	};

	NSDictionary *_command = @{@"/expandovalue/add-values": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)addValue:(long)companyId className:(NSString *)className tableName:(NSString *)tableName columnName:(NSString *)columnName classPK:(long)classPK data:(NSDictionary *)data {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"className": className,
		@"tableName": tableName,
		@"columnName": columnName,
		@"classPK": @(classPK),
		@"data": data
	};

	NSDictionary *_command = @{@"/expandovalue/add-value": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getJsonData:(long)companyId className:(NSString *)className tableName:(NSString *)tableName columnName:(NSString *)columnName classPK:(long)classPK {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"className": className,
		@"tableName": tableName,
		@"columnName": columnName,
		@"classPK": @(classPK)
	};

	NSDictionary *_command = @{@"/expandovalue/get-json-data": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end