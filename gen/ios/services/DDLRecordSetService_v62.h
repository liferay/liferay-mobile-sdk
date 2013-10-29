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
@interface DDLRecordSetService_v62 : NSObject

- (void)deleteRecordSet:(NSNumber *)recordSetId;
- (NSDictionary *)getRecordSet:(NSNumber *)recordSetId;
- (NSDictionary *)updateMinDisplayRows:(NSNumber *)recordSetId minDisplayRows:(NSNumber *)minDisplayRows serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateRecordSet:(NSNumber *)groupId ddmStructureId:(NSNumber *)ddmStructureId recordSetKey:(NSString *)recordSetKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap minDisplayRows:(NSNumber *)minDisplayRows serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addRecordSet:(NSNumber *)groupId ddmStructureId:(NSNumber *)ddmStructureId recordSetKey:(NSString *)recordSetKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap minDisplayRows:(NSNumber *)minDisplayRows scope:(NSNumber *)scope serviceContext:(NSDictionary *)serviceContext;

@end