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
@interface LRRedirectentryService_v73 : LRBaseService

- (NSDictionary *)addRedirectEntryWithGroupId:(long long)groupId destinationURL:(NSString *)destinationURL expirationDate:(long long)expirationDate groupBaseURL:(NSString *)groupBaseURL permanent:(BOOL)permanent sourceURL:(NSString *)sourceURL updateChainedRedirectEntries:(BOOL)updateChainedRedirectEntries serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addRedirectEntryWithGroupId:(long long)groupId destinationURL:(NSString *)destinationURL expirationDate:(long long)expirationDate permanent:(BOOL)permanent sourceURL:(NSString *)sourceURL serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateRedirectEntryWithRedirectEntryId:(long long)redirectEntryId destinationURL:(NSString *)destinationURL expirationDate:(long long)expirationDate permanent:(BOOL)permanent sourceURL:(NSString *)sourceURL error:(NSError **)error;
- (NSDictionary *)updateRedirectEntryWithRedirectEntryId:(long long)redirectEntryId destinationURL:(NSString *)destinationURL expirationDate:(long long)expirationDate groupBaseURL:(NSString *)groupBaseURL permanent:(BOOL)permanent sourceURL:(NSString *)sourceURL updateChainedRedirectEntries:(BOOL)updateChainedRedirectEntries error:(NSError **)error;
- (NSDictionary *)deleteRedirectEntryWithRedirectEntryId:(long long)redirectEntryId error:(NSError **)error;
- (NSDictionary *)fetchRedirectEntryWithRedirectEntryId:(long long)redirectEntryId error:(NSError **)error;
- (NSArray *)getRedirectEntriesWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getRedirectEntriesCountWithGroupId:(long long)groupId error:(NSError **)error;

@end