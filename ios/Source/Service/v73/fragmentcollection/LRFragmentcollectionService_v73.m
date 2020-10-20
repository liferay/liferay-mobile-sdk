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

#import "LRFragmentcollectionService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRFragmentcollectionService_v73

- (NSArray *)getTempFileNamesWithGroupId:(long long)groupId folderName:(NSString *)folderName error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"folderName": [self checkNull: folderName]
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-temp-file-names": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFragmentCollectionWithGroupId:(long long)groupId fragmentCollectionKey:(NSString *)fragmentCollectionKey name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionKey": [self checkNull: fragmentCollectionKey],
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/add-fragment-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFragmentCollectionWithGroupId:(long long)groupId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/add-fragment-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentCollectionWithFragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name description:(NSString *)description error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description]
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/update-fragment-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteFragmentCollectionWithFragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCollectionId": @(fragmentCollectionId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/delete-fragment-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchFragmentCollectionWithFragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCollectionId": @(fragmentCollectionId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/fetch-fragment-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId name:(NSString *)name includeSystem:(BOOL)includeSystem start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"includeSystem": @(includeSystem),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentCollection>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentCollection>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCollectionsWithGroupIds:(NSArray *)groupIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupIds": [self checkNull: groupIds]
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCollectionsWithGroupIds:(NSArray *)groupIds start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupIds": [self checkNull: groupIds],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentCollection>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCollectionsWithGroupIds:(NSArray *)groupIds name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupIds": [self checkNull: groupIds],
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentCollection>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId includeSystem:(BOOL)includeSystem error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"includeSystem": @(includeSystem)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId includeSystem:(BOOL)includeSystem start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"includeSystem": @(includeSystem),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentCollection>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCollectionsWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentCollection>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentCollectionsCountWithGroupIds:(NSArray *)groupIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupIds": [self checkNull: groupIds]
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId name:(NSString *)name includeSystem:(BOOL)includeSystem error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"includeSystem": @(includeSystem)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentCollectionsCountWithGroupIds:(NSArray *)groupIds name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupIds": [self checkNull: groupIds],
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId includeSystem:(BOOL)includeSystem error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"includeSystem": @(includeSystem)
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentCollectionsCountWithGroupId:(long long)groupId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/get-fragment-collections-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteFragmentCollectionsWithFragmentCollectionIds:(NSArray *)fragmentCollectionIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCollectionIds": [self checkNull: fragmentCollectionIds]
	}];

	NSDictionary *_command = @{@"/fragment.fragmentcollection/delete-fragment-collections": _params};

	[self.session invoke:_command error:error];
}

@end