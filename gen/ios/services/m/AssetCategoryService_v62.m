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

#import "AssetCategoryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation AssetCategoryService_v62

- (NSDictionary *)updateCategory:(NSNumber *)categoryId parentCategoryId:(NSNumber *)parentCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap vocabularyId:(NSNumber *)vocabularyId categoryProperties:(NSArray *)categoryProperties serviceContext:(NSDictionary *)serviceContext {
}

- (NSNumber *)getVocabularyCategoriesCount:(NSNumber *)groupId name:(NSString *)name vocabularyId:(NSNumber *)vocabularyId {
}

- (NSArray *)getCategories:(NSString *)className classPK:(NSNumber *)classPK {
}

- (NSDictionary *)moveCategory:(NSNumber *)categoryId parentCategoryId:(NSNumber *)parentCategoryId vocabularyId:(NSNumber *)vocabularyId serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)getJsonSearch:(NSNumber *)groupId name:(NSString *)name vocabularyIds:(NSArray *)vocabularyIds start:(NSNumber *)start end:(NSNumber *)end {
}

- (NSArray *)search:(NSNumber *)groupId keywords:(NSString *)keywords vocabularyId:(NSNumber *)vocabularyId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
}

- (NSArray *)deleteCategories:(NSArray *)categoryIds serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)getVocabularyCategoriesDisplay:(NSNumber *)groupId name:(NSString *)name vocabularyId:(NSNumber *)vocabularyId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
}

- (NSDictionary *)addCategory:(NSNumber *)parentCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap vocabularyId:(NSNumber *)vocabularyId categoryProperties:(NSArray *)categoryProperties serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)getJsonVocabularyCategories:(NSNumber *)groupId name:(NSString *)name vocabularyId:(NSNumber *)vocabularyId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
}

- (NSNumber *)getVocabularyRootCategoriesCount:(NSNumber *)groupId vocabularyId:(NSNumber *)vocabularyId {
}

- (NSArray *)getChildCategories:(NSNumber *)parentCategoryId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
}

- (NSArray *)getVocabularyCategories:(NSNumber *)groupId name:(NSString *)name vocabularyId:(NSNumber *)vocabularyId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
}

- (NSDictionary *)getCategory:(NSNumber *)categoryId {
}

- (void)deleteCategory:(NSNumber *)categoryId {
}

- (NSArray *)getVocabularyRootCategories:(NSNumber *)groupId vocabularyId:(NSNumber *)vocabularyId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
}

@end