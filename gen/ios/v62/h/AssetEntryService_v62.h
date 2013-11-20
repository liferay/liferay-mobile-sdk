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
@interface AssetEntryService_v62 : BaseService

- (NSArray *)getCompanyEntriesWithCompanyId:(long)companyId start:(int)start end:(int)end error:(NSError **)error;
- (int)getCompanyEntriesCountWithCompanyId:(long)companyId error:(NSError **)error;
- (NSArray *)getEntriesWithEntryQuery:(NSDictionary *)entryQuery error:(NSError **)error;
- (int)getEntriesCountWithEntryQuery:(NSDictionary *)entryQuery error:(NSError **)error;
- (NSDictionary *)getEntryWithEntryId:(long)entryId error:(NSError **)error;
- (NSDictionary *)incrementViewCounterWithClassName:(NSString *)className classPK:(long)classPK error:(NSError **)error;
- (NSDictionary *)updateEntryWithGroupId:(long)groupId className:(NSString *)className classPK:(long)classPK classUuid:(NSString *)classUuid classTypeId:(long)classTypeId categoryIds:(NSArray *)categoryIds tagNames:(NSArray *)tagNames visible:(BOOL)visible startDate:(long)startDate endDate:(long)endDate expirationDate:(long)expirationDate mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description summary:(NSString *)summary url:(NSString *)url layoutUuid:(NSString *)layoutUuid height:(int)height width:(int)width priority:(NSDictionary *)priority sync:(BOOL)sync error:(NSError **)error;
- (NSDictionary *)updateEntryWithGroupId:(long)groupId className:(NSString *)className classPK:(long)classPK classUuid:(NSString *)classUuid classTypeId:(long)classTypeId categoryIds:(NSArray *)categoryIds tagNames:(NSArray *)tagNames visible:(BOOL)visible startDate:(long)startDate endDate:(long)endDate publishDate:(long)publishDate expirationDate:(long)expirationDate mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description summary:(NSString *)summary url:(NSString *)url layoutUuid:(NSString *)layoutUuid height:(int)height width:(int)width priority:(NSDictionary *)priority sync:(BOOL)sync error:(NSError **)error;
- (NSDictionary *)updateEntryWithGroupId:(long)groupId createDate:(long)createDate modifiedDate:(long)modifiedDate className:(NSString *)className classPK:(long)classPK classUuid:(NSString *)classUuid classTypeId:(long)classTypeId categoryIds:(NSArray *)categoryIds tagNames:(NSArray *)tagNames visible:(BOOL)visible startDate:(long)startDate endDate:(long)endDate expirationDate:(long)expirationDate mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description summary:(NSString *)summary url:(NSString *)url layoutUuid:(NSString *)layoutUuid height:(int)height width:(int)width priority:(NSDictionary *)priority sync:(BOOL)sync error:(NSError **)error;

@end