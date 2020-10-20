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

#import "LRRedirectentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRRedirectentryService_v73

- (NSDictionary *)addRedirectEntryWithGroupId:(long long)groupId destinationURL:(NSString *)destinationURL expirationDate:(long long)expirationDate groupBaseURL:(NSString *)groupBaseURL permanent:(BOOL)permanent sourceURL:(NSString *)sourceURL updateChainedRedirectEntries:(BOOL)updateChainedRedirectEntries serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"destinationURL": [self checkNull: destinationURL],
		@"expirationDate": @(expirationDate),
		@"groupBaseURL": [self checkNull: groupBaseURL],
		@"permanent": @(permanent),
		@"sourceURL": [self checkNull: sourceURL],
		@"updateChainedRedirectEntries": @(updateChainedRedirectEntries),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/redirect.redirectentry/add-redirect-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addRedirectEntryWithGroupId:(long long)groupId destinationURL:(NSString *)destinationURL expirationDate:(long long)expirationDate permanent:(BOOL)permanent sourceURL:(NSString *)sourceURL serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"destinationURL": [self checkNull: destinationURL],
		@"expirationDate": @(expirationDate),
		@"permanent": @(permanent),
		@"sourceURL": [self checkNull: sourceURL],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/redirect.redirectentry/add-redirect-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateRedirectEntryWithRedirectEntryId:(long long)redirectEntryId destinationURL:(NSString *)destinationURL expirationDate:(long long)expirationDate permanent:(BOOL)permanent sourceURL:(NSString *)sourceURL error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"redirectEntryId": @(redirectEntryId),
		@"destinationURL": [self checkNull: destinationURL],
		@"expirationDate": @(expirationDate),
		@"permanent": @(permanent),
		@"sourceURL": [self checkNull: sourceURL]
	}];

	NSDictionary *_command = @{@"/redirect.redirectentry/update-redirect-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateRedirectEntryWithRedirectEntryId:(long long)redirectEntryId destinationURL:(NSString *)destinationURL expirationDate:(long long)expirationDate groupBaseURL:(NSString *)groupBaseURL permanent:(BOOL)permanent sourceURL:(NSString *)sourceURL updateChainedRedirectEntries:(BOOL)updateChainedRedirectEntries error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"redirectEntryId": @(redirectEntryId),
		@"destinationURL": [self checkNull: destinationURL],
		@"expirationDate": @(expirationDate),
		@"groupBaseURL": [self checkNull: groupBaseURL],
		@"permanent": @(permanent),
		@"sourceURL": [self checkNull: sourceURL],
		@"updateChainedRedirectEntries": @(updateChainedRedirectEntries)
	}];

	NSDictionary *_command = @{@"/redirect.redirectentry/update-redirect-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteRedirectEntryWithRedirectEntryId:(long long)redirectEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"redirectEntryId": @(redirectEntryId)
	}];

	NSDictionary *_command = @{@"/redirect.redirectentry/delete-redirect-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchRedirectEntryWithRedirectEntryId:(long long)redirectEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"redirectEntryId": @(redirectEntryId)
	}];

	NSDictionary *_command = @{@"/redirect.redirectentry/fetch-redirect-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getRedirectEntriesWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.redirect.model.RedirectEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/redirect.redirectentry/get-redirect-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getRedirectEntriesCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/redirect.redirectentry/get-redirect-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end