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
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LRAssetCategoryService_v62 : LRBaseService

- (NSDictionary *)addCategoryWithTitle:(NSString *)title vocabularyId:(long)vocabularyId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCategoryWithParentCategoryId:(long)parentCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap vocabularyId:(long)vocabularyId categoryProperties:(NSArray *)categoryProperties serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteCategoriesWithCategoryIds:(NSArray *)categoryIds error:(NSError **)error;
- (NSArray *)deleteCategoriesWithCategoryIds:(NSArray *)categoryIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteCategoryWithCategoryId:(long)categoryId error:(NSError **)error;
- (NSArray *)getCategoriesWithClassName:(NSString *)className classPK:(long)classPK error:(NSError **)error;
- (NSDictionary *)getCategoryWithCategoryId:(long)categoryId error:(NSError **)error;
- (NSArray *)getChildCategoriesWithParentCategoryId:(long)parentCategoryId error:(NSError **)error;
- (NSArray *)getChildCategoriesWithParentCategoryId:(long)parentCategoryId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSDictionary *)getJsonSearchWithGroupId:(long)groupId name:(NSString *)name vocabularyIds:(NSArray *)vocabularyIds start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)getJsonVocabularyCategoriesWithVocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSDictionary *)getJsonVocabularyCategoriesWithGroupId:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getVocabularyCategoriesWithVocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getVocabularyCategoriesWithParentCategoryId:(long)parentCategoryId vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getVocabularyCategoriesWithGroupId:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getVocabularyCategoriesCountWithGroupId:(long)groupId vocabularyId:(long)vocabularyId error:(NSError **)error;
- (int)getVocabularyCategoriesCountWithGroupId:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId error:(NSError **)error;
- (NSDictionary *)getVocabularyCategoriesDisplayWithVocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSDictionary *)getVocabularyCategoriesDisplayWithGroupId:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getVocabularyRootCategoriesWithVocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getVocabularyRootCategoriesWithGroupId:(long)groupId vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getVocabularyRootCategoriesCountWithGroupId:(long)groupId vocabularyId:(long)vocabularyId error:(NSError **)error;
- (NSDictionary *)moveCategoryWithCategoryId:(long)categoryId parentCategoryId:(long)parentCategoryId vocabularyId:(long)vocabularyId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)searchWithGroupId:(long)groupId name:(NSString *)name categoryProperties:(NSArray *)categoryProperties start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)searchWithGroupIds:(NSArray *)groupIds name:(NSString *)name vocabularyIds:(NSArray *)vocabularyIds start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)searchWithGroupId:(long)groupId keywords:(NSString *)keywords vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSDictionary *)updateCategoryWithCategoryId:(long)categoryId parentCategoryId:(long)parentCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap vocabularyId:(long)vocabularyId categoryProperties:(NSArray *)categoryProperties serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end