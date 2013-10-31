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
@interface BlogsEntryService_v62 : BaseService

- (void)unsubscribe:(long)groupId;
- (NSDictionary *)getEntry:(long)groupId urlTitle:(NSString *)urlTitle;
- (NSArray *)getGroupsEntries:(long)companyId groupId:(long)groupId displayDate:(long)displayDate status:(int)status max:(int)max;
- (NSArray *)getCompanyEntries:(long)companyId displayDate:(long)displayDate status:(int)status max:(int)max;
- (void)deleteEntry:(long)entryId;
- (NSDictionary *)moveEntryToTrash:(long)entryId;
- (NSString *)getCompanyEntriesRss:(long)companyId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (NSString *)getGroupEntriesRss:(long)groupId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (NSArray *)getGroupEntries:(long)groupId displayDate:(long)displayDate status:(int)status start:(int)start end:(int)end;
- (int)getGroupEntriesCount:(long)groupId displayDate:(long)displayDate status:(int)status;
- (void)restoreEntryFromTrash:(long)entryId;
- (void)subscribe:(long)groupId;
- (NSString *)getOrganizationEntriesRss:(long)organizationId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (NSArray *)getOrganizationEntries:(long)organizationId displayDate:(long)displayDate status:(int)status max:(int)max;

@end