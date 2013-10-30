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

#import "AssetEntryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation AssetEntryService_v62

- (NSDictionary *)updateEntry:(NSNumber *)groupId createDate:(NSNumber *)createDate modifiedDate:(NSNumber *)modifiedDate className:(NSString *)className classPK:(NSNumber *)classPK classUuid:(NSString *)classUuid classTypeId:(NSNumber *)classTypeId categoryIds:(NSArray *)categoryIds tagNames:(NSArray *)tagNames visible:(BOOL)visible startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate expirationDate:(NSNumber *)expirationDate mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description summary:(NSString *)summary url:(NSString *)url layoutUuid:(NSString *)layoutUuid height:(NSNumber *)height width:(NSNumber *)width priority:(NSDictionary *)priority sync:(BOOL)sync {
}

- (NSArray *)getEntries:(NSDictionary *)entryQuery {
}

- (NSArray *)getCompanyEntries:(NSNumber *)companyId start:(NSNumber *)start end:(NSNumber *)end {
}

- (NSDictionary *)incrementViewCounter:(NSString *)className classPK:(NSNumber *)classPK {
}

- (NSNumber *)getEntriesCount:(NSDictionary *)entryQuery {
}

- (NSNumber *)getCompanyEntriesCount:(NSNumber *)companyId {
}

- (NSDictionary *)getEntry:(NSNumber *)entryId {
}

@end