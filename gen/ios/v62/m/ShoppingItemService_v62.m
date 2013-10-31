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

#import "ShoppingItemService_v62.h"

/**
 * author Bruno Farache
 */
@implementation ShoppingItemService_v62

- (int)getCategoriesItemsCount:(long)groupId categoryIds:(NSArray *)categoryIds {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"categoryIds": categoryIds
	};

	NSDictionary *_command = @{@"/shoppingitem/get-categories-items-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)getItem:(long)itemId {
	NSDictionary *_params = @{
		@"itemId": @(itemId)
	};

	NSDictionary *_command = @{@"/shoppingitem/get-item": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteItem:(long)itemId {
	NSDictionary *_params = @{
		@"itemId": @(itemId)
	};

	NSDictionary *_command = @{@"/shoppingitem/delete-item": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)addItem:(long)groupId categoryId:(long)categoryId sku:(NSString *)sku name:(NSString *)name description:(NSString *)description properties:(NSString *)properties fieldsQuantities:(NSString *)fieldsQuantities requiresShipping:(BOOL)requiresShipping stockQuantity:(int)stockQuantity featured:(BOOL)featured sale:(NSDictionary *)sale smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile mediumImage:(BOOL)mediumImage mediumImageURL:(NSString *)mediumImageURL mediumFile:(NSDictionary *)mediumFile largeImage:(BOOL)largeImage largeImageURL:(NSString *)largeImageURL largeFile:(NSDictionary *)largeFile itemFields:(NSArray *)itemFields itemPrices:(NSArray *)itemPrices serviceContext:(NSDictionary *)serviceContext {
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

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getItemsCount:(long)groupId categoryId:(long)categoryId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId)
	};

	NSDictionary *_command = @{@"/shoppingitem/get-items-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)updateItem:(long)itemId groupId:(long)groupId categoryId:(long)categoryId sku:(NSString *)sku name:(NSString *)name description:(NSString *)description properties:(NSString *)properties fieldsQuantities:(NSString *)fieldsQuantities requiresShipping:(BOOL)requiresShipping stockQuantity:(int)stockQuantity featured:(BOOL)featured sale:(NSDictionary *)sale smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile mediumImage:(BOOL)mediumImage mediumImageURL:(NSString *)mediumImageURL mediumFile:(NSDictionary *)mediumFile largeImage:(BOOL)largeImage largeImageURL:(NSString *)largeImageURL largeFile:(NSDictionary *)largeFile itemFields:(NSArray *)itemFields itemPrices:(NSArray *)itemPrices serviceContext:(NSDictionary *)serviceContext {
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

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getItems:(long)groupId categoryId:(long)categoryId start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/shoppingitem/get-items": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)addBookItems:(long)groupId categoryId:(long)categoryId isbns:(NSArray *)isbns {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"isbns": isbns
	};

	NSDictionary *_command = @{@"/shoppingitem/add-book-items": _params};

	[self.session invoke:_command];
}

- (NSArray *)getItemsPrevAndNext:(long)itemId obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"itemId": @(itemId),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/shoppingitem/get-items-prev-and-next": _params};

	return (NSArray *)[self.session invoke:_command];
}

@end