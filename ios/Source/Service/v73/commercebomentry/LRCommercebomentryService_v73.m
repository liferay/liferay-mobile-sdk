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

#import "LRCommercebomentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercebomentryService_v73

- (NSDictionary *)addCommerceBomEntryWithUserId:(long long)userId number:(int)number cpInstanceUuid:(NSString *)cpInstanceUuid cProductId:(long long)cProductId commerceBOMDefinitionId:(long long)commerceBOMDefinitionId positionX:(double)positionX positionY:(double)positionY radius:(double)radius error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"number": @(number),
		@"cpInstanceUuid": [self checkNull: cpInstanceUuid],
		@"cProductId": @(cProductId),
		@"commerceBOMDefinitionId": @(commerceBOMDefinitionId),
		@"positionX": @(positionX),
		@"positionY": @(positionY),
		@"radius": @(radius)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomentry/add-commerce-bom-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceBomEntryWithCommerceBOMEntryId:(long long)commerceBOMEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMEntryId": @(commerceBOMEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomentry/delete-commerce-bom-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceBomEntriesWithCommerceBOMDefinitionId:(long long)commerceBOMDefinitionId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMDefinitionId": @(commerceBOMDefinitionId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomentry/get-commerce-bom-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceBomEntriesCountWithCommerceBOMDefinitionId:(long long)commerceBOMDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMDefinitionId": @(commerceBOMDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomentry/get-commerce-bom-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceBomEntryWithCommerceBOMEntryId:(long long)commerceBOMEntryId number:(int)number cpInstanceUuid:(NSString *)cpInstanceUuid cProductId:(long long)cProductId positionX:(double)positionX positionY:(double)positionY radius:(double)radius error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMEntryId": @(commerceBOMEntryId),
		@"number": @(number),
		@"cpInstanceUuid": [self checkNull: cpInstanceUuid],
		@"cProductId": @(cProductId),
		@"positionX": @(positionX),
		@"positionY": @(positionY),
		@"radius": @(radius)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomentry/update-commerce-bom-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceBomEntryWithCommerceBOMEntryId:(long long)commerceBOMEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceBOMEntryId": @(commerceBOMEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercebomentry/get-commerce-bom-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end