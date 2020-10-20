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

#import "LRCommercewishlistService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercewishlistService_v73

- (NSDictionary *)addCommerceWishListWithName:(NSString *)name defaultWishList:(BOOL)defaultWishList serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"name": [self checkNull: name],
		@"defaultWishList": @(defaultWishList),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercewishlist/add-commerce-wish-list": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceWishListWithCommerceWishListId:(long long)commerceWishListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceWishListId": @(commerceWishListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlist/delete-commerce-wish-list": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceWishListWithGroupId:(long long)groupId userId:(long long)userId defaultWishList:(BOOL)defaultWishList orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"defaultWishList": @(defaultWishList),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.wish.list.model.CommerceWishList>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercewishlist/fetch-commerce-wish-list": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceWishListsWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.wish.list.model.CommerceWishList>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercewishlist/get-commerce-wish-lists": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceWishListsWithGroupId:(long long)groupId userId:(long long)userId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.wish.list.model.CommerceWishList>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercewishlist/get-commerce-wish-lists": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceWishListsCountWithGroupId:(long long)groupId userId:(long long)userId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"userId": @(userId)
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlist/get-commerce-wish-lists-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceWishListsCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlist/get-commerce-wish-lists-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getDefaultCommerceWishListWithGroupId:(long long)groupId userId:(long long)userId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"userId": @(userId)
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlist/get-default-commerce-wish-list": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceWishListWithCommerceWishListId:(long long)commerceWishListId name:(NSString *)name defaultWishList:(BOOL)defaultWishList error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceWishListId": @(commerceWishListId),
		@"name": [self checkNull: name],
		@"defaultWishList": @(defaultWishList)
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlist/update-commerce-wish-list": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceWishListWithCommerceWishListId:(long long)commerceWishListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceWishListId": @(commerceWishListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercewishlist/get-commerce-wish-list": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end