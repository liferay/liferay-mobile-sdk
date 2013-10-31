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

#import <Foundation/Foundation.h>
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface ShoppingItemService_v62 : BaseService

- (int)getCategoriesItemsCount:(long)groupId categoryIds:(NSArray *)categoryIds;
- (NSDictionary *)getItem:(long)itemId;
- (void)deleteItem:(long)itemId;
- (NSDictionary *)addItem:(long)groupId categoryId:(long)categoryId sku:(NSString *)sku name:(NSString *)name description:(NSString *)description properties:(NSString *)properties fieldsQuantities:(NSString *)fieldsQuantities requiresShipping:(BOOL)requiresShipping stockQuantity:(int)stockQuantity featured:(BOOL)featured sale:(NSDictionary *)sale smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile mediumImage:(BOOL)mediumImage mediumImageURL:(NSString *)mediumImageURL mediumFile:(NSDictionary *)mediumFile largeImage:(BOOL)largeImage largeImageURL:(NSString *)largeImageURL largeFile:(NSDictionary *)largeFile itemFields:(NSArray *)itemFields itemPrices:(NSArray *)itemPrices serviceContext:(NSDictionary *)serviceContext;
- (int)getItemsCount:(long)groupId categoryId:(long)categoryId;
- (NSDictionary *)updateItem:(long)itemId groupId:(long)groupId categoryId:(long)categoryId sku:(NSString *)sku name:(NSString *)name description:(NSString *)description properties:(NSString *)properties fieldsQuantities:(NSString *)fieldsQuantities requiresShipping:(BOOL)requiresShipping stockQuantity:(int)stockQuantity featured:(BOOL)featured sale:(NSDictionary *)sale smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile mediumImage:(BOOL)mediumImage mediumImageURL:(NSString *)mediumImageURL mediumFile:(NSDictionary *)mediumFile largeImage:(BOOL)largeImage largeImageURL:(NSString *)largeImageURL largeFile:(NSDictionary *)largeFile itemFields:(NSArray *)itemFields itemPrices:(NSArray *)itemPrices serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getItems:(long)groupId categoryId:(long)categoryId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (void)addBookItems:(long)groupId categoryId:(long)categoryId isbns:(NSArray *)isbns;
- (NSArray *)getItemsPrevAndNext:(long)itemId obc:(NSDictionary *)obc;

@end