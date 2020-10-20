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

#import "LRCommercebomfolderService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercebomfolderService_v73

- (NSDictionary *)addCommerceBomFolderWithUserId:(long long)userId parentCommerceBOMFolderId:(long long)parentCommerceBOMFolderId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"parentCommerceBOMFolderId": @(parentCommerceBOMFolderId),
		@"name": [self checkNull: name],
		@"logo": @(logo),
		@"logoBytes": [self toString:logoBytes]
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolder/add-commerce-bom-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceBomFolderWithCommerceBOMFolderId:(long long)commerceBOMFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMFolderId": @(commerceBOMFolderId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolder/delete-commerce-bom-folder": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceBomFolderWithCommerceBOMFolderId:(long long)commerceBOMFolderId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMFolderId": @(commerceBOMFolderId),
		@"name": [self checkNull: name],
		@"logo": @(logo),
		@"logoBytes": [self toString:logoBytes]
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolder/update-commerce-bom-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceBomFolderWithCommerceBOMFolderId:(long long)commerceBOMFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMFolderId": @(commerceBOMFolderId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolder/get-commerce-bom-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceBomFoldersWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolder/get-commerce-bom-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceBomFoldersWithCompanyId:(long long)companyId parentCommerceBOMFolderId:(long long)parentCommerceBOMFolderId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"parentCommerceBOMFolderId": @(parentCommerceBOMFolderId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolder/get-commerce-bom-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceBomFoldersCountWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolder/get-commerce-bom-folders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceBomFoldersCountWithCompanyId:(long long)companyId parentCommerceBOMFolderId:(long long)parentCommerceBOMFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"parentCommerceBOMFolderId": @(parentCommerceBOMFolderId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomfolder/get-commerce-bom-folders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end