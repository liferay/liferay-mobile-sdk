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

- (void)deleteEntryWithEntryId:(long)entryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/blogsentry/delete-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCompanyEntriesWithCompanyId:(long)companyId displayDate:(long)displayDate status:(int)status max:(int)max error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"max": @(max)
	};

	NSDictionary *_command = @{@"/blogsentry/get-company-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSString *)getCompanyEntriesRssWithCompanyId:(long)companyId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error {
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

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getEntryWithEntryId:(long)entryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/blogsentry/get-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getEntryWithGroupId:(long)groupId urlTitle:(NSString *)urlTitle error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"urlTitle": urlTitle
	};

	NSDictionary *_command = @{@"/blogsentry/get-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupEntriesWithGroupId:(long)groupId status:(int)status max:(int)max error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"status": @(status),
		@"max": @(max)
	};

	NSDictionary *_command = @{@"/blogsentry/get-group-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupEntriesWithGroupId:(long)groupId displayDate:(long)displayDate status:(int)status max:(int)max error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"max": @(max)
	};

	NSDictionary *_command = @{@"/blogsentry/get-group-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupEntriesWithGroupId:(long)groupId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/blogsentry/get-group-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupEntriesWithGroupId:(long)groupId displayDate:(long)displayDate status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/blogsentry/get-group-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (int)getGroupEntriesCountWithGroupId:(long)groupId status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/blogsentry/get-group-entries-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (int)getGroupEntriesCountWithGroupId:(long)groupId displayDate:(long)displayDate status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"displayDate": @(displayDate),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/blogsentry/get-group-entries-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (NSString *)getGroupEntriesRssWithGroupId:(long)groupId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error {
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

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupsEntriesWithCompanyId:(long)companyId groupId:(long)groupId displayDate:(long)displayDate status:(int)status max:(int)max error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"max": @(max)
	};

	NSDictionary *_command = @{@"/blogsentry/get-groups-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getOrganizationEntriesWithOrganizationId:(long)organizationId displayDate:(long)displayDate status:(int)status max:(int)max error:(NSError **)error {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId),
		@"displayDate": @(displayDate),
		@"status": @(status),
		@"max": @(max)
	};

	NSDictionary *_command = @{@"/blogsentry/get-organization-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSString *)getOrganizationEntriesRssWithOrganizationId:(long)organizationId displayDate:(long)displayDate status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error {
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

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveEntryToTrashWithEntryId:(long)entryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/blogsentry/move-entry-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)restoreEntryFromTrashWithEntryId:(long)entryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"entryId": @(entryId)
	};

	NSDictionary *_command = @{@"/blogsentry/restore-entry-from-trash": _params};

	[self.session invoke:_command error:error];
}

- (void)subscribeWithGroupId:(long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/blogsentry/subscribe": _params};

	[self.session invoke:_command error:error];
}

- (void)unsubscribeWithGroupId:(long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/blogsentry/unsubscribe": _params};

	[self.session invoke:_command error:error];
}

@end