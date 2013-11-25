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

#import "LRAssetVocabularyService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRAssetVocabularyService_v62

- (NSDictionary *)addVocabularyWithTitle:(NSString *)title serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"title": title,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetvocabulary/add-vocabulary": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addVocabularyWithTitleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"settings": settings,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetvocabulary/add-vocabulary": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addVocabularyWithTitle:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"title": title,
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"settings": settings,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetvocabulary/add-vocabulary": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteVocabulariesWithVocabularyIds:(NSArray *)vocabularyIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"vocabularyIds": vocabularyIds
	};

	NSDictionary *_command = @{@"/assetvocabulary/delete-vocabularies": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)deleteVocabulariesWithVocabularyIds:(NSArray *)vocabularyIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"vocabularyIds": vocabularyIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetvocabulary/delete-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)deleteVocabularyWithVocabularyId:(long long)vocabularyId error:(NSError **)error {
	NSDictionary *_params = @{
		@"vocabularyId": @(vocabularyId)
	};

	NSDictionary *_command = @{@"/assetvocabulary/delete-vocabulary": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCompanyVocabulariesWithCompanyId:(long long)companyId error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId)
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-company-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupVocabulariesWithGroupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-group-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupVocabulariesWithGroupId:(long long)groupId createDefaultVocabulary:(BOOL)createDefaultVocabulary error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"createDefaultVocabulary": @(createDefaultVocabulary)
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-group-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupVocabulariesWithGroupId:(long long)groupId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-group-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupVocabulariesWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-group-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupVocabulariesCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-group-vocabularies-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupVocabulariesCountWithGroupId:(long long)groupId name:(NSString *)name error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-group-vocabularies-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getGroupVocabulariesDisplayWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-group-vocabularies-display": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getGroupVocabulariesDisplayWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end addDefaultVocabulary:(BOOL)addDefaultVocabulary obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"start": @(start),
		@"end": @(end),
		@"addDefaultVocabulary": @(addDefaultVocabulary),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-group-vocabularies-display": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupsVocabulariesWithGroupIds:(NSArray *)groupIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-groups-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupsVocabulariesWithGroupIds:(NSArray *)groupIds className:(NSString *)className error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupIds": groupIds,
		@"className": className
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-groups-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getJsonGroupVocabulariesWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-json-group-vocabularies": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getVocabulariesWithVocabularyIds:(NSArray *)vocabularyIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"vocabularyIds": vocabularyIds
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-vocabularies": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getVocabularyWithVocabularyId:(long long)vocabularyId error:(NSError **)error {
	NSDictionary *_params = @{
		@"vocabularyId": @(vocabularyId)
	};

	NSDictionary *_command = @{@"/assetvocabulary/get-vocabulary": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateVocabularyWithVocabularyId:(long long)vocabularyId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"vocabularyId": @(vocabularyId),
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"settings": settings,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetvocabulary/update-vocabulary": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateVocabularyWithVocabularyId:(long long)vocabularyId title:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"vocabularyId": @(vocabularyId),
		@"title": title,
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"settings": settings,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/assetvocabulary/update-vocabulary": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end