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

#import "LRCommercebomfolderapplicationrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercebomfolderapplicationrelService_v73

- (void)deleteCommerceBomFolderApplicationRelWithCommerceBOMFolderApplicationRelId:(long long)commerceBOMFolderApplicationRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMFolderApplicationRelId": @(commerceBOMFolderApplicationRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolderapplicationrel/delete-commerce-bom-folder-application-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceBomFolderApplicationRelWithUserId:(long long)userId commerceBOMFolderId:(long long)commerceBOMFolderId commerceApplicationModelId:(long long)commerceApplicationModelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceBOMFolderId": @(commerceBOMFolderId),
		@"commerceApplicationModelId": @(commerceApplicationModelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolderapplicationrel/add-commerce-bom-folder-application-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceBomFolderApplicationRelsByCamIdWithCommerceApplicationModelId:(long long)commerceApplicationModelId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationModelId": @(commerceApplicationModelId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-by-cam-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceBomFolderApplicationRelsByCommerceBomFolderIdWithCommerceBOMFolderId:(long long)commerceBOMFolderId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMFolderId": @(commerceBOMFolderId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-by-commerce-bom-folder-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceBomFolderApplicationRelsCountByCamIdWithCommerceApplicationModelId:(long long)commerceApplicationModelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationModelId": @(commerceApplicationModelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-count-by-cam-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceBomFolderApplicationRelsCountByCommerceBomFolderIdWithCommerceBOMFolderId:(long long)commerceBOMFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMFolderId": @(commerceBOMFolderId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-count-by-commerce-bom-folder-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end