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
@interface DDLRecordService_v62 : BaseService

- (NSDictionary *)addRecordWithGroupId:(long)groupId recordSetId:(long)recordSetId displayIndex:(int)displayIndex fields:(NSDictionary *)fields serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addRecordWithGroupId:(long)groupId recordSetId:(long)recordSetId displayIndex:(int)displayIndex fieldsMap:(NSDictionary *)fieldsMap serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteRecordLocaleWithRecordId:(long)recordId locale:(NSString *)locale serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)getRecordWithRecordId:(long)recordId error:(NSError **)error;
- (NSDictionary *)updateRecordWithRecordId:(long)recordId displayIndex:(int)displayIndex fieldsMap:(NSDictionary *)fieldsMap mergeFields:(BOOL)mergeFields serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateRecordWithRecordId:(long)recordId majorVersion:(BOOL)majorVersion displayIndex:(int)displayIndex fields:(NSDictionary *)fields mergeFields:(BOOL)mergeFields serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end