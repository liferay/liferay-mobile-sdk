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

/**
 * author: Bruno Farache
 */
@interface ShoppingItemService_v62 : NSObject

- (NSNumber *)getCategoriesItemsCount:(NSNumber *)groupId categoryIds:(NSArray *)categoryIds;
- (NSDictionary *)getItem:(NSNumber *)itemId;
- (void)deleteItem:(NSNumber *)itemId;
- (NSDictionary *)addItem:(NSNumber *)groupId categoryId:(NSNumber *)categoryId sku:(NSString *)sku name:(NSString *)name description:(NSString *)description properties:(NSString *)properties fieldsQuantities:(NSString *)fieldsQuantities requiresShipping:(BOOL)requiresShipping stockQuantity:(NSNumber *)stockQuantity featured:(BOOL)featured sale:(NSDictionary *)sale smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile mediumImage:(BOOL)mediumImage mediumImageURL:(NSString *)mediumImageURL mediumFile:(NSDictionary *)mediumFile largeImage:(BOOL)largeImage largeImageURL:(NSString *)largeImageURL largeFile:(NSDictionary *)largeFile itemFields:(NSArray *)itemFields itemPrices:(NSArray *)itemPrices serviceContext:(NSDictionary *)serviceContext;
- (NSNumber *)getItemsCount:(NSNumber *)groupId categoryId:(NSNumber *)categoryId;
- (NSDictionary *)updateItem:(NSNumber *)itemId groupId:(NSNumber *)groupId categoryId:(NSNumber *)categoryId sku:(NSString *)sku name:(NSString *)name description:(NSString *)description properties:(NSString *)properties fieldsQuantities:(NSString *)fieldsQuantities requiresShipping:(BOOL)requiresShipping stockQuantity:(NSNumber *)stockQuantity featured:(BOOL)featured sale:(NSDictionary *)sale smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile mediumImage:(BOOL)mediumImage mediumImageURL:(NSString *)mediumImageURL mediumFile:(NSDictionary *)mediumFile largeImage:(BOOL)largeImage largeImageURL:(NSString *)largeImageURL largeFile:(NSDictionary *)largeFile itemFields:(NSArray *)itemFields itemPrices:(NSArray *)itemPrices serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getItems:(NSNumber *)groupId categoryId:(NSNumber *)categoryId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (void)addBookItems:(NSNumber *)groupId categoryId:(NSNumber *)categoryId isbns:(NSArray *)isbns;
- (NSArray *)getItemsPrevAndNext:(NSNumber *)itemId obc:(NSDictionary *)obc;

@end