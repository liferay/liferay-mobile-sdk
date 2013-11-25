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

#import "LRShoppingItemService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRShoppingItemService_v62

- (void)addBookItemsWithGroupId:(long long)groupId categoryId:(long long)categoryId isbns:(NSArray *)isbns error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"isbns": isbns
	};

	NSDictionary *_command = @{@"/shoppingitem/add-book-items": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addItemWithGroupId:(long long)groupId categoryId:(long long)categoryId sku:(NSString *)sku name:(NSString *)name description:(NSString *)description properties:(NSString *)properties fieldsQuantities:(NSString *)fieldsQuantities requiresShipping:(BOOL)requiresShipping stockQuantity:(int)stockQuantity featured:(BOOL)featured sale:(NSDictionary *)sale smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile mediumImage:(BOOL)mediumImage mediumImageURL:(NSString *)mediumImageURL mediumFile:(NSDictionary *)mediumFile largeImage:(BOOL)largeImage largeImageURL:(NSString *)largeImageURL largeFile:(NSDictionary *)largeFile itemFields:(NSArray *)itemFields itemPrices:(NSArray *)itemPrices serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"sku": sku,
		@"name": name,
		@"description": description,
		@"properties": properties,
		@"fieldsQuantities": fieldsQuantities,
		@"requiresShipping": @(requiresShipping),
		@"stockQuantity": @(stockQuantity),
		@"featured": @(featured),
		@"sale": sale,
		@"smallImage": @(smallImage),
		@"smallImageURL": smallImageURL,
		@"smallFile": smallFile,
		@"mediumImage": @(mediumImage),
		@"mediumImageURL": mediumImageURL,
		@"mediumFile": mediumFile,
		@"largeImage": @(largeImage),
		@"largeImageURL": largeImageURL,
		@"largeFile": largeFile,
		@"itemFields": itemFields,
		@"itemPrices": itemPrices,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/shoppingitem/add-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteItemWithItemId:(long long)itemId error:(NSError **)error {
	NSDictionary *_params = @{
		@"itemId": @(itemId)
	};

	NSDictionary *_command = @{@"/shoppingitem/delete-item": _params};

	[self.session invoke:_command error:error];
}

- (NSNumber *)getCategoriesItemsCountWithGroupId:(long long)groupId categoryIds:(NSArray *)categoryIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"categoryIds": categoryIds
	};

	NSDictionary *_command = @{@"/shoppingitem/get-categories-items-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getItemWithItemId:(long long)itemId error:(NSError **)error {
	NSDictionary *_params = @{
		@"itemId": @(itemId)
	};

	NSDictionary *_command = @{@"/shoppingitem/get-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getItemsWithGroupId:(long long)groupId categoryId:(long long)categoryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId)
	};

	NSDictionary *_command = @{@"/shoppingitem/get-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getItemsWithGroupId:(long long)groupId categoryId:(long long)categoryId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/shoppingitem/get-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getItemsCountWithGroupId:(long long)groupId categoryId:(long long)categoryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId)
	};

	NSDictionary *_command = @{@"/shoppingitem/get-items-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getItemsPrevAndNextWithItemId:(long long)itemId obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"itemId": @(itemId),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/shoppingitem/get-items-prev-and-next": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateItemWithItemId:(long long)itemId groupId:(long long)groupId categoryId:(long long)categoryId sku:(NSString *)sku name:(NSString *)name description:(NSString *)description properties:(NSString *)properties fieldsQuantities:(NSString *)fieldsQuantities requiresShipping:(BOOL)requiresShipping stockQuantity:(int)stockQuantity featured:(BOOL)featured sale:(NSDictionary *)sale smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile mediumImage:(BOOL)mediumImage mediumImageURL:(NSString *)mediumImageURL mediumFile:(NSDictionary *)mediumFile largeImage:(BOOL)largeImage largeImageURL:(NSString *)largeImageURL largeFile:(NSDictionary *)largeFile itemFields:(NSArray *)itemFields itemPrices:(NSArray *)itemPrices serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"itemId": @(itemId),
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"sku": sku,
		@"name": name,
		@"description": description,
		@"properties": properties,
		@"fieldsQuantities": fieldsQuantities,
		@"requiresShipping": @(requiresShipping),
		@"stockQuantity": @(stockQuantity),
		@"featured": @(featured),
		@"sale": sale,
		@"smallImage": @(smallImage),
		@"smallImageURL": smallImageURL,
		@"smallFile": smallFile,
		@"mediumImage": @(mediumImage),
		@"mediumImageURL": mediumImageURL,
		@"mediumFile": mediumFile,
		@"largeImage": @(largeImage),
		@"largeImageURL": largeImageURL,
		@"largeFile": largeFile,
		@"itemFields": itemFields,
		@"itemPrices": itemPrices,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/shoppingitem/update-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end