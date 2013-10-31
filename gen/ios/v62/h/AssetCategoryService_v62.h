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
@interface AssetCategoryService_v62 : BaseService

- (NSDictionary *)updateCategory:(long)categoryId parentCategoryId:(long)parentCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap vocabularyId:(long)vocabularyId categoryProperties:(NSArray *)categoryProperties serviceContext:(NSDictionary *)serviceContext;
- (int)getVocabularyCategoriesCount:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId;
- (NSArray *)getCategories:(NSString *)className classPK:(long)classPK;
- (NSDictionary *)moveCategory:(long)categoryId parentCategoryId:(long)parentCategoryId vocabularyId:(long)vocabularyId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getJsonSearch:(long)groupId name:(NSString *)name vocabularyIds:(NSArray *)vocabularyIds start:(int)start end:(int)end;
- (NSArray *)search:(long)groupId keywords:(NSString *)keywords vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSArray *)deleteCategories:(NSArray *)categoryIds serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getVocabularyCategoriesDisplay:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSDictionary *)addCategory:(long)parentCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap vocabularyId:(long)vocabularyId categoryProperties:(NSArray *)categoryProperties serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getJsonVocabularyCategories:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (int)getVocabularyRootCategoriesCount:(long)groupId vocabularyId:(long)vocabularyId;
- (NSArray *)getChildCategories:(long)parentCategoryId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSArray *)getVocabularyCategories:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSDictionary *)getCategory:(long)categoryId;
- (void)deleteCategory:(long)categoryId;
- (NSArray *)getVocabularyRootCategories:(long)groupId vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc;

@end