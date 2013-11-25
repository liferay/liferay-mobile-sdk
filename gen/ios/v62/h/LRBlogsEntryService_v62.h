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
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LRBlogsEntryService_v62 : LRBaseService

- (void)deleteEntryWithEntryId:(long)entryId error:(NSError **)error;
- (NSArray *)getCompanyEntriesWithCompanyId:(long)companyId displayDate:(long)displayDate status:(int)status max:(int)max error:(NSError **)error;
- (NSString *)getCompanyEntriesRssWithCompanyId:(long)companyId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error;
- (NSDictionary *)getEntryWithEntryId:(long)entryId error:(NSError **)error;
- (NSDictionary *)getEntryWithGroupId:(long)groupId urlTitle:(NSString *)urlTitle error:(NSError **)error;
- (NSArray *)getGroupEntriesWithGroupId:(long)groupId status:(int)status max:(int)max error:(NSError **)error;
- (NSArray *)getGroupEntriesWithGroupId:(long)groupId displayDate:(long)displayDate status:(int)status max:(int)max error:(NSError **)error;
- (NSArray *)getGroupEntriesWithGroupId:(long)groupId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getGroupEntriesWithGroupId:(long)groupId displayDate:(long)displayDate status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getGroupEntriesCountWithGroupId:(long)groupId status:(int)status error:(NSError **)error;
- (NSNumber *)getGroupEntriesCountWithGroupId:(long)groupId displayDate:(long)displayDate status:(int)status error:(NSError **)error;
- (NSString *)getGroupEntriesRssWithGroupId:(long)groupId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error;
- (NSArray *)getGroupsEntriesWithCompanyId:(long)companyId groupId:(long)groupId displayDate:(long)displayDate status:(int)status max:(int)max error:(NSError **)error;
- (NSArray *)getOrganizationEntriesWithOrganizationId:(long)organizationId displayDate:(long)displayDate status:(int)status max:(int)max error:(NSError **)error;
- (NSString *)getOrganizationEntriesRssWithOrganizationId:(long)organizationId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error;
- (NSDictionary *)moveEntryToTrashWithEntryId:(long)entryId error:(NSError **)error;
- (void)restoreEntryFromTrashWithEntryId:(long)entryId error:(NSError **)error;
- (void)subscribeWithGroupId:(long)groupId error:(NSError **)error;
- (void)unsubscribeWithGroupId:(long)groupId error:(NSError **)error;

@end