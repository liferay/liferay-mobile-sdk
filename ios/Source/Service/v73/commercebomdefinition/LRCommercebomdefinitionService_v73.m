/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

#import "LRCommercebomdefinitionService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercebomdefinitionService_v73

- (NSArray *)getCommerceBomDefinitionsWithCommerceBOMFolderId:(long long)commerceBOMFolderId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMFolderId": @(commerceBOMFolderId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomdefinition/get-commerce-bom-definitions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceBomDefinitionsCountWithCommerceBOMFolderId:(long long)commerceBOMFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMFolderId": @(commerceBOMFolderId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomdefinition/get-commerce-bom-definitions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceBomDefinitionWithCommerceBOMDefinitionId:(long long)commerceBOMDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMDefinitionId": @(commerceBOMDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomdefinition/delete-commerce-bom-definition": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceBomDefinitionWithCommerceBOMDefinitionId:(long long)commerceBOMDefinitionId cpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMDefinitionId": @(commerceBOMDefinitionId),
		@"cpAttachmentFileEntryId": @(cpAttachmentFileEntryId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/commerce.commercebomdefinition/update-commerce-bom-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceBomDefinitionWithUserId:(long long)userId commerceBOMFolderId:(long long)commerceBOMFolderId cpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId name:(NSString *)name friendlyUrl:(NSString *)friendlyUrl error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceBOMFolderId": @(commerceBOMFolderId),
		@"cpAttachmentFileEntryId": @(cpAttachmentFileEntryId),
		@"name": [self checkNull: name],
		@"friendlyUrl": [self checkNull: friendlyUrl]
	}];

	NSDictionary *_command = @{@"/commerce.commercebomdefinition/add-commerce-bom-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceBomDefinitionWithCommerceBOMDefinitionId:(long long)commerceBOMDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMDefinitionId": @(commerceBOMDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomdefinition/get-commerce-bom-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end