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

- (NSDictionary *)updateCategory:(long)categoryId parentCategoryId:(long)parentCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap vocabularyId:(long)vocabularyId categoryProperties:(NSArray *)categoryProperties serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"categoryId": @(categoryId),
		@"parentCategoryId": @(parentCategoryId),
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"vocabularyId": @(vocabularyId),
		@"categoryProperties": categoryProperties,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetcategory/update-category": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getVocabularyCategoriesCount:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"vocabularyId": @(vocabularyId)
	};

	NSDictionary *_command = @{@"/assetcategory/get-vocabulary-categories-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSArray *)getCategories:(NSString *)className classPK:(long)classPK {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK)
	};

	NSDictionary *_command = @{@"/assetcategory/get-categories": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)moveCategory:(long)categoryId parentCategoryId:(long)parentCategoryId vocabularyId:(long)vocabularyId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"categoryId": @(categoryId),
		@"parentCategoryId": @(parentCategoryId),
		@"vocabularyId": @(vocabularyId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetcategory/move-category": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getJsonSearch:(long)groupId name:(NSString *)name vocabularyIds:(NSArray *)vocabularyIds start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"vocabularyIds": vocabularyIds,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/assetcategory/get-json-search": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)search:(long)groupId keywords:(NSString *)keywords vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"keywords": keywords,
		@"vocabularyId": @(vocabularyId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetcategory/search": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)deleteCategories:(NSArray *)categoryIds serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"categoryIds": categoryIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetcategory/delete-categories": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)getVocabularyCategoriesDisplay:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"vocabularyId": @(vocabularyId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetcategory/get-vocabulary-categories-display": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addCategory:(long)parentCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap vocabularyId:(long)vocabularyId categoryProperties:(NSArray *)categoryProperties serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"parentCategoryId": @(parentCategoryId),
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"vocabularyId": @(vocabularyId),
		@"categoryProperties": categoryProperties,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetcategory/add-category": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getJsonVocabularyCategories:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"vocabularyId": @(vocabularyId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetcategory/get-json-vocabulary-categories": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getVocabularyRootCategoriesCount:(long)groupId vocabularyId:(long)vocabularyId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"vocabularyId": @(vocabularyId)
	};

	NSDictionary *_command = @{@"/assetcategory/get-vocabulary-root-categories-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSArray *)getChildCategories:(long)parentCategoryId start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"parentCategoryId": @(parentCategoryId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetcategory/get-child-categories": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getVocabularyCategories:(long)groupId name:(NSString *)name vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"vocabularyId": @(vocabularyId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetcategory/get-vocabulary-categories": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)getCategory:(long)categoryId {
	NSDictionary *_params = @{
		@"categoryId": @(categoryId)
	};

	NSDictionary *_command = @{@"/assetcategory/get-category": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteCategory:(long)categoryId {
	NSDictionary *_params = @{
		@"categoryId": @(categoryId)
	};

	NSDictionary *_command = @{@"/assetcategory/delete-category": _params};

	[self.session invoke:_command];
}

- (NSArray *)getVocabularyRootCategories:(long)groupId vocabularyId:(long)vocabularyId start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"vocabularyId": @(vocabularyId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetcategory/get-vocabulary-root-categories": _params};

	return (NSArray *)[self.session invoke:_command];
}

@end