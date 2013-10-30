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

#import "BlogsEntryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation BlogsEntryService_v62

- (void)unsubscribe:(NSNumber *)groupId {
}

- (NSDictionary *)getEntry:(NSNumber *)groupId urlTitle:(NSString *)urlTitle {
}

- (NSArray *)getGroupsEntries:(NSNumber *)companyId groupId:(NSNumber *)groupId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max {
}

- (NSArray *)getCompanyEntries:(NSNumber *)companyId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max {
}

- (void)deleteEntry:(NSNumber *)entryId {
}

- (NSDictionary *)moveEntryToTrash:(NSNumber *)entryId {
}

- (NSString *)getCompanyEntriesRss:(NSNumber *)companyId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay {
}

- (NSString *)getGroupEntriesRss:(NSNumber *)groupId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay {
}

- (NSArray *)getGroupEntries:(NSNumber *)groupId displayDate:(NSNumber *)displayDate status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
}

- (NSNumber *)getGroupEntriesCount:(NSNumber *)groupId displayDate:(NSNumber *)displayDate status:(NSNumber *)status {
}

- (void)restoreEntryFromTrash:(NSNumber *)entryId {
}

- (void)subscribe:(NSNumber *)groupId {
}

- (NSString *)getOrganizationEntriesRss:(NSNumber *)organizationId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay {
}

- (NSArray *)getOrganizationEntries:(NSNumber *)organizationId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max {
}

@end