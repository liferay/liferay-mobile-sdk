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

#import "LRCommercenotificationqueueentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercenotificationqueueentryService_v73

- (void)deleteCommerceNotificationQueueEntryWithCommerceNotificationQueueEntryId:(long long)commerceNotificationQueueEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceNotificationQueueEntryId": @(commerceNotificationQueueEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercenotificationqueueentry/delete-commerce-notification-queue-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceNotificationQueueEntriesWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.notification.model.CommerceNotificationQueueEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercenotificationqueueentry/get-commerce-notification-queue-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceNotificationQueueEntriesCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commercenotificationqueueentry/get-commerce-notification-queue-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)resendCommerceNotificationQueueEntryWithCommerceNotificationQueueEntryId:(long long)commerceNotificationQueueEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceNotificationQueueEntryId": @(commerceNotificationQueueEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercenotificationqueueentry/resend-commerce-notification-queue-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end