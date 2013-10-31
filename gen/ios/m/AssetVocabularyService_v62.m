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

#import "AssetVocabularyService_v62.h"

/**
 * author Bruno Farache
 */
@implementation AssetVocabularyService_v62

- (NSDictionary *)addVocabulary:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"title": title,
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"settings": settings,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetvocabulary/add-vocabulary": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getJsonGroupVocabularies:(long)groupId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-json-group-vocabularies": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getVocabularies:(NSArray *)vocabularyIds {
	NSDictionary *_params = @{
		@"vocabularyIds": vocabularyIds
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (int)getGroupVocabulariesCount:(long)groupId name:(NSString *)name {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-group-vocabularies-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSArray *)getCompanyVocabularies:(long)companyId {
	NSDictionary *_params = @{
		@"companyId": @(companyId)
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-company-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)getVocabulary:(long)vocabularyId {
	NSDictionary *_params = @{
		@"vocabularyId": @(vocabularyId)
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-vocabulary": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)updateVocabulary:(long)vocabularyId title:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"vocabularyId": @(vocabularyId),
		@"title": title,
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"settings": settings,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetvocabulary/update-vocabulary": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getGroupVocabularies:(long)groupId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-group-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getGroupsVocabularies:(NSArray *)groupIds className:(NSString *)className {
	NSDictionary *_params = @{
		@"groupIds": groupIds,
		@"className": className
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-groups-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)getGroupVocabulariesDisplay:(long)groupId name:(NSString *)name start:(int)start end:(int)end addDefaultVocabulary:(BOOL)addDefaultVocabulary obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"start": @(start),
		@"end": @(end),
		@"addDefaultVocabulary": @(addDefaultVocabulary),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-group-vocabularies-display": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteVocabulary:(long)vocabularyId {
	NSDictionary *_params = @{
		@"vocabularyId": @(vocabularyId)
	};

	NSDictionary *_command = @{@"/assetvocabulary/delete-vocabulary": _params};

	[self.session invoke:_command];
}

- (NSArray *)deleteVocabularies:(NSArray *)vocabularyIds serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"vocabularyIds": vocabularyIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetvocabulary/delete-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command];
}

@end