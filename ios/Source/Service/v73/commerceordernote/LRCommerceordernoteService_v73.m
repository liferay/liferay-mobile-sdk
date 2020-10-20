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

#import "LRCommerceordernoteService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceordernoteService_v73

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commerceordernote/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceOrderNoteWithCommerceOrderId:(long long)commerceOrderId content:(NSString *)content restricted:(BOOL)restricted serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"content": [self checkNull: content],
		@"restricted": @(restricted),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceordernote/add-commerce-order-note": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceOrderNotesWithCommerceOrderId:(long long)commerceOrderId restricted:(BOOL)restricted error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"restricted": @(restricted)
	}];

	NSDictionary *_command = @{@"/commerce.commerceordernote/get-commerce-order-notes": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceOrderNotesWithCommerceOrderId:(long long)commerceOrderId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceordernote/get-commerce-order-notes": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceOrderNotesCountWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceordernote/get-commerce-order-notes-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceOrderNotesCountWithCommerceOrderId:(long long)commerceOrderId restricted:(BOOL)restricted error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"restricted": @(restricted)
	}];

	NSDictionary *_command = @{@"/commerce.commerceordernote/get-commerce-order-notes-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderNoteWithCommerceOrderNoteId:(long long)commerceOrderNoteId content:(NSString *)content restricted:(BOOL)restricted error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderNoteId": @(commerceOrderNoteId),
		@"content": [self checkNull: content],
		@"restricted": @(restricted)
	}];

	NSDictionary *_command = @{@"/commerce.commerceordernote/update-commerce-order-note": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceOrderNoteWithCommerceOrderNoteId:(long long)commerceOrderNoteId commerceOrderId:(long long)commerceOrderId content:(NSString *)content restricted:(BOOL)restricted externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderNoteId": @(commerceOrderNoteId),
		@"commerceOrderId": @(commerceOrderId),
		@"content": [self checkNull: content],
		@"restricted": @(restricted),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceordernote/upsert-commerce-order-note": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceOrderNoteWithCommerceOrderNoteId:(long long)commerceOrderNoteId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderNoteId": @(commerceOrderNoteId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceordernote/get-commerce-order-note": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceOrderNoteWithCommerceOrderNoteId:(long long)commerceOrderNoteId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderNoteId": @(commerceOrderNoteId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceordernote/delete-commerce-order-note": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceOrderNoteWithCommerceOrderNoteId:(long long)commerceOrderNoteId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderNoteId": @(commerceOrderNoteId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceordernote/fetch-commerce-order-note": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end