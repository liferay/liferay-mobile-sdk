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

- (void)unsubscribe:(long)groupId {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/blogsentry/unsubscribe": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getEntry:(long)groupId urlTitle:(NSString *)urlTitle {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"urlTitle": urlTitle
	};

	NSDictionary *_command = @{@"/blogsentry/get-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getGroupsEntries:(long)companyId groupId:(long)groupId displayDate:(long)displayDate status:(int)status max:(int)max {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"max": @(max)
	};

	NSDictionary *_command = @{@"/blogsentry/get-groups-entries": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getCompanyEntries:(long)companyId displayDate:(long)displayDate status:(int)status max:(int)max {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"max": @(max)
	};

	NSDictionary *_command = @{@"/blogsentry/get-company-entries": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)deleteEntry:(long)entryId {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/blogsentry/delete-entry": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)moveEntryToTrash:(long)entryId {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/blogsentry/move-entry-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSString *)getCompanyEntriesRss:(long)companyId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"max": @(max),
		@"type": type,
		@"version": @(version),
		@"displayStyle": displayStyle,
		@"feedURL": feedURL,
		@"entryURL": entryURL,
		@"themeDisplay": themeDisplay
	};

	NSDictionary *_command = @{@"/blogsentry/get-company-entries-rss": _params};

	return (NSString *)[self.session invoke:_command];
}

- (NSString *)getGroupEntriesRss:(long)groupId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"max": @(max),
		@"type": type,
		@"version": @(version),
		@"displayStyle": displayStyle,
		@"feedURL": feedURL,
		@"entryURL": entryURL,
		@"themeDisplay": themeDisplay
	};

	NSDictionary *_command = @{@"/blogsentry/get-group-entries-rss": _params};

	return (NSString *)[self.session invoke:_command];
}

- (NSArray *)getGroupEntries:(long)groupId displayDate:(long)displayDate status:(int)status start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/blogsentry/get-group-entries": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (int)getGroupEntriesCount:(long)groupId displayDate:(long)displayDate status:(int)status {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"displayDate": @(displayDate),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/blogsentry/get-group-entries-count": _params};

	return (int)[self.session invoke:_command];
}

- (void)restoreEntryFromTrash:(long)entryId {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/blogsentry/restore-entry-from-trash": _params};

	[self.session invoke:_command];
}

- (void)subscribe:(long)groupId {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/blogsentry/subscribe": _params};

	[self.session invoke:_command];
}

- (NSString *)getOrganizationEntriesRss:(long)organizationId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"max": @(max),
		@"type": type,
		@"version": @(version),
		@"displayStyle": displayStyle,
		@"feedURL": feedURL,
		@"entryURL": entryURL,
		@"themeDisplay": themeDisplay
	};

	NSDictionary *_command = @{@"/blogsentry/get-organization-entries-rss": _params};

	return (NSString *)[self.session invoke:_command];
}

- (NSArray *)getOrganizationEntries:(long)organizationId displayDate:(long)displayDate status:(int)status max:(int)max {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"max": @(max)
	};

	NSDictionary *_command = @{@"/blogsentry/get-organization-entries": _params};

	return (NSArray *)[self.session invoke:_command];
}

@end