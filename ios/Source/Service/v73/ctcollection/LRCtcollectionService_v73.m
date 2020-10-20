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

#import "LRCtcollectionService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCtcollectionService_v73

- (NSDictionary *)addCtCollectionWithCompanyId:(long long)companyId userId:(long long)userId name:(NSString *)name description:(NSString *)description error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description]
	}];

	NSDictionary *_command = @{@"/ct.ctcollection/add-ct-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCtCollectionWithUserId:(long long)userId ctCollectionId:(long long)ctCollectionId name:(NSString *)name description:(NSString *)description error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"ctCollectionId": @(ctCollectionId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description]
	}];

	NSDictionary *_command = @{@"/ct.ctcollection/update-ct-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCtAutoResolutionInfoWithCtAutoResolutionInfoId:(long long)ctAutoResolutionInfoId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ctAutoResolutionInfoId": @(ctAutoResolutionInfoId)
	}];

	NSDictionary *_command = @{@"/ct.ctcollection/delete-ct-auto-resolution-info": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteCtCollectionWithCtCollection:(LRJSONObjectWrapper *)ctCollection error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"ctCollection" className:@"com.liferay.change.tracking.model.CTCollection" wrapper:ctCollection];

	NSDictionary *_command = @{@"/ct.ctcollection/delete-ct-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCtCollectionsWithCompanyId:(long long)companyId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.change.tracking.model.CTCollection>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/ct.ctcollection/get-ct-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCtCollectionsWithCompanyId:(long long)companyId status:(int)status keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"status": @(status),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.change.tracking.model.CTCollection>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/ct.ctcollection/get-ct-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)undoCtCollectionWithCtCollectionId:(long long)ctCollectionId userId:(long long)userId name:(NSString *)name description:(NSString *)description error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ctCollectionId": @(ctCollectionId),
		@"userId": @(userId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description]
	}];

	NSDictionary *_command = @{@"/ct.ctcollection/undo-ct-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCtCollectionsCountWithCompanyId:(long long)companyId status:(int)status keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"status": @(status),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/ct.ctcollection/get-ct-collections-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)discardCtEntryWithCtCollectionId:(long long)ctCollectionId modelClassNameId:(long long)modelClassNameId modelClassPK:(long long)modelClassPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ctCollectionId": @(ctCollectionId),
		@"modelClassNameId": @(modelClassNameId),
		@"modelClassPK": @(modelClassPK)
	}];

	NSDictionary *_command = @{@"/ct.ctcollection/discard-ct-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)publishCtCollectionWithUserId:(long long)userId ctCollectionId:(long long)ctCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"ctCollectionId": @(ctCollectionId)
	}];

	NSDictionary *_command = @{@"/ct.ctcollection/publish-ct-collection": _params};

	[self.session invoke:_command error:error];
}

- (void)discardCtEntriesWithCtCollectionId:(long long)ctCollectionId modelClassNameId:(long long)modelClassNameId modelClassPK:(long long)modelClassPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ctCollectionId": @(ctCollectionId),
		@"modelClassNameId": @(modelClassNameId),
		@"modelClassPK": @(modelClassPK)
	}];

	NSDictionary *_command = @{@"/ct.ctcollection/discard-ct-entries": _params};

	[self.session invoke:_command error:error];
}

@end