/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LRAccountentryService_v73 : LRBaseService

- (NSDictionary *)addAccountEntryWithUserId:(long long)userId parentAccountEntryId:(long long)parentAccountEntryId name:(NSString *)name description:(NSString *)description domains:(NSArray *)domains logoBytes:(NSData *)logoBytes taxIdNumber:(NSString *)taxIdNumber type:(NSString *)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addAccountEntryWithUserId:(long long)userId parentAccountEntryId:(long long)parentAccountEntryId name:(NSString *)name description:(NSString *)description domains:(NSArray *)domains logoBytes:(NSData *)logoBytes status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addAccountEntryWithUserId:(long long)userId parentAccountEntryId:(long long)parentAccountEntryId name:(NSString *)name description:(NSString *)description domains:(NSArray *)domains logoBytes:(NSData *)logoBytes status:(int)status error:(NSError **)error;
- (NSArray *)getAccountEntriesWithCompanyId:(long long)companyId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)searchWithKeywords:(NSString *)keywords params:(NSDictionary *)params cur:(int)cur delta:(int)delta orderByField:(NSString *)orderByField reverse:(BOOL)reverse error:(NSError **)error;

@end