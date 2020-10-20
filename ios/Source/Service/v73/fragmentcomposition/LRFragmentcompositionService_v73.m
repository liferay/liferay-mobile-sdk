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

#import "LRFragmentcompositionService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRFragmentcompositionService_v73

- (NSDictionary *)addFragmentCompositionWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentCompositionKey:(NSString *)fragmentCompositionKey name:(NSString *)name description:(NSString *)description data:(NSString *)data previewFileEntryId:(long long)previewFileEntryId status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"fragmentCompositionKey": [self checkNull: fragmentCompositionKey],
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"data": [self checkNull: data],
		@"previewFileEntryId": @(previewFileEntryId),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/add-fragment-composition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId previewFileEntryId:(long long)previewFileEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCompositionId": @(fragmentCompositionId),
		@"previewFileEntryId": @(previewFileEntryId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/update-fragment-composition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name description:(NSString *)description data:(NSString *)data previewFileEntryId:(long long)previewFileEntryId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCompositionId": @(fragmentCompositionId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"data": [self checkNull: data],
		@"previewFileEntryId": @(previewFileEntryId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/update-fragment-composition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCompositionId": @(fragmentCompositionId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/update-fragment-composition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId name:(NSString *)name description:(NSString *)description data:(NSString *)data previewFileEntryId:(long long)previewFileEntryId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCompositionId": @(fragmentCompositionId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"data": [self checkNull: data],
		@"previewFileEntryId": @(previewFileEntryId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/update-fragment-composition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCompositionsWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentComposition>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/get-fragment-compositions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCompositionsWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/get-fragment-compositions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCompositionsWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentComposition>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/get-fragment-compositions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCompositionsWithFragmentCollectionId:(long long)fragmentCollectionId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/get-fragment-compositions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCompositionsWithFragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCollectionId": @(fragmentCollectionId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/get-fragment-compositions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentCompositionsCountWithFragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCollectionId": @(fragmentCollectionId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/get-fragment-compositions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId fragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCompositionId": @(fragmentCompositionId),
		@"fragmentCollectionId": @(fragmentCollectionId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/move-fragment-composition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCompositionId": @(fragmentCompositionId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/delete-fragment-composition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchFragmentCompositionWithFragmentCompositionId:(long long)fragmentCompositionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCompositionId": @(fragmentCompositionId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/fetch-fragment-composition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchFragmentCompositionWithGroupId:(long long)groupId fragmentCompositionKey:(NSString *)fragmentCompositionKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCompositionKey": [self checkNull: fragmentCompositionKey]
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcomposition/fetch-fragment-composition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end