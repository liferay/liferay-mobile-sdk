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

#import "LRCommercediscountaccountrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercediscountaccountrelService_v73

- (NSDictionary *)addCommerceDiscountAccountRelWithCommerceDiscountId:(long long)commerceDiscountId commerceAccountId:(long long)commerceAccountId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"commerceAccountId": @(commerceAccountId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscountaccountrel/add-commerce-discount-account-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceDiscountAccountRelWithCommerceDiscountAccountRelId:(long long)commerceDiscountAccountRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountAccountRelId": @(commerceDiscountAccountRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountaccountrel/get-commerce-discount-account-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceDiscountAccountRelWithCommerceDiscountAccountRelId:(long long)commerceDiscountAccountRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountAccountRelId": @(commerceDiscountAccountRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountaccountrel/delete-commerce-discount-account-rel": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteCommerceDiscountAccountRelsByCommerceDiscountIdWithCommerceDiscountId:(long long)commerceDiscountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountaccountrel/delete-commerce-discount-account-rels-by-commerce-discount-id": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceDiscountAccountRelWithCommerceDiscountId:(long long)commerceDiscountId commerceAccountId:(long long)commerceAccountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"commerceAccountId": @(commerceAccountId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountaccountrel/fetch-commerce-discount-account-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceDiscountAccountRelsWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountaccountrel/get-commerce-discount-account-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceDiscountAccountRelsWithCommerceDiscountId:(long long)commerceDiscountId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.discount.model.CommerceDiscountAccountRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercediscountaccountrel/get-commerce-discount-account-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceDiscountAccountRelsCountWithCommerceDiscountId:(long long)commerceDiscountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountaccountrel/get-commerce-discount-account-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceDiscountAccountRelsCountWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountaccountrel/get-commerce-discount-account-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end