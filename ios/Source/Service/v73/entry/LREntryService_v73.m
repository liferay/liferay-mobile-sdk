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

#import "LREntryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LREntryService_v73

- (NSNumber *)getEntriesCountWithGroupId:(long long)groupId definitionName:(NSString *)definitionName userName:(NSString *)userName createDateGT:(long long)createDateGT createDateLT:(long long)createDateLT andSearch:(BOOL)andSearch error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"definitionName": [self checkNull: definitionName],
		@"userName": [self checkNull: userName],
		@"createDateGT": @(createDateGT),
		@"createDateLT": @(createDateLT),
		@"andSearch": @(andSearch)
	}];

	NSDictionary *_command = @{@"/reports.entry/get-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteAttachmentWithCompanyId:(long long)companyId entryId:(long long)entryId fileName:(NSString *)fileName error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"entryId": @(entryId),
		@"fileName": [self checkNull: fileName]
	}];

	NSDictionary *_command = @{@"/reports.entry/delete-attachment": _params};

	[self.session invoke:_command error:error];
}

- (void)sendEmailsWithEntryId:(long long)entryId fileName:(NSString *)fileName emailAddresses:(NSArray *)emailAddresses notification:(BOOL)notification error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"entryId": @(entryId),
		@"fileName": [self checkNull: fileName],
		@"emailAddresses": [self checkNull: emailAddresses],
		@"notification": @(notification)
	}];

	NSDictionary *_command = @{@"/reports.entry/send-emails": _params};

	[self.session invoke:_command error:error];
}

- (void)unscheduleEntryWithEntryId:(long long)entryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"entryId": @(entryId)
	}];

	NSDictionary *_command = @{@"/reports.entry/unschedule-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addEntryWithGroupId:(long long)groupId definitionId:(long long)definitionId format:(NSString *)format schedulerRequest:(BOOL)schedulerRequest startDate:(long long)startDate endDate:(long long)endDate repeating:(BOOL)repeating recurrence:(NSString *)recurrence emailNotifications:(NSString *)emailNotifications emailDelivery:(NSString *)emailDelivery portletId:(NSString *)portletId pageURL:(NSString *)pageURL reportName:(NSString *)reportName reportParameters:(NSString *)reportParameters serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"definitionId": @(definitionId),
		@"format": [self checkNull: format],
		@"schedulerRequest": @(schedulerRequest),
		@"startDate": @(startDate),
		@"endDate": @(endDate),
		@"repeating": @(repeating),
		@"recurrence": [self checkNull: recurrence],
		@"emailNotifications": [self checkNull: emailNotifications],
		@"emailDelivery": [self checkNull: emailDelivery],
		@"portletId": [self checkNull: portletId],
		@"pageURL": [self checkNull: pageURL],
		@"reportName": [self checkNull: reportName],
		@"reportParameters": [self checkNull: reportParameters],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/reports.entry/add-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getEntriesWithGroupId:(long long)groupId definitionName:(NSString *)definitionName userName:(NSString *)userName createDateGT:(long long)createDateGT createDateLT:(long long)createDateLT andSearch:(BOOL)andSearch start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"definitionName": [self checkNull: definitionName],
		@"userName": [self checkNull: userName],
		@"createDateGT": @(createDateGT),
		@"createDateLT": @(createDateLT),
		@"andSearch": @(andSearch),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.reports.engine.console.model.Entry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/reports.entry/get-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteEntryWithEntryId:(long long)entryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"entryId": @(entryId)
	}];

	NSDictionary *_command = @{@"/reports.entry/delete-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end