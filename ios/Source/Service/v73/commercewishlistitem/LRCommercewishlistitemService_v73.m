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

#import "LRCommercewishlistitemService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercewishlistitemService_v73

- (NSArray *)getCommerceWishListItemsWithCommerceWishListId:(long long)commerceWishListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceWishListId": @(commerceWishListId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.wish.list.model.CommerceWishListItem>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercewishlistitem/get-commerce-wish-list-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceWishListItemWithCommerceAccountId:(long long)commerceAccountId commerceWishListId:(long long)commerceWishListId cProductId:(long long)cProductId cpInstanceUuid:(NSString *)cpInstanceUuid json:(NSString *)json serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"commerceWishListId": @(commerceWishListId),
		@"cProductId": @(cProductId),
		@"cpInstanceUuid": [self checkNull: cpInstanceUuid],
		@"json": [self checkNull: json],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercewishlistitem/add-commerce-wish-list-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceWishListItemWithCommerceWishListItemId:(long long)commerceWishListItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceWishListItemId": @(commerceWishListItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlistitem/get-commerce-wish-list-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceWishListItemWithCommerceWishListId:(long long)commerceWishListId cpInstanceUuid:(NSString *)cpInstanceUuid cProductId:(long long)cProductId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceWishListId": @(commerceWishListId),
		@"cpInstanceUuid": [self checkNull: cpInstanceUuid],
		@"cProductId": @(cProductId)
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlistitem/get-commerce-wish-list-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceWishListItemByContainsCpInstanceCountWithCommerceWishListId:(long long)commerceWishListId cpInstanceUuid:(NSString *)cpInstanceUuid error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceWishListId": @(commerceWishListId),
		@"cpInstanceUuid": [self checkNull: cpInstanceUuid]
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlistitem/get-commerce-wish-list-item-by-contains-cp-instance-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceWishListItemByContainsCProductCountWithCommerceWishListId:(long long)commerceWishListId cProductId:(long long)cProductId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceWishListId": @(commerceWishListId),
		@"cProductId": @(cProductId)
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlistitem/get-commerce-wish-list-item-by-contains-c-product-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceWishListItemsCountWithCommerceWishListId:(long long)commerceWishListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceWishListId": @(commerceWishListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlistitem/get-commerce-wish-list-items-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceWishListItemWithCommerceWishListItemId:(long long)commerceWishListItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceWishListItemId": @(commerceWishListItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlistitem/delete-commerce-wish-list-item": _params};

	[self.session invoke:_command error:error];
}

@end