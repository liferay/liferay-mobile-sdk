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

#import "LRFragmententryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRFragmententryService_v73

- (NSArray *)getTempFileNamesWithGroupId:(long long)groupId folderName:(NSString *)folderName error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"folderName": [self checkNull: folderName]
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-temp-file-names": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchDraftWithPrimaryKey:(long long)primaryKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"primaryKey": @(primaryKey)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/fetch-draft": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentEntryKey:(NSString *)fragmentEntryKey name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js configuration:(NSString *)configuration previewFileEntryId:(long long)previewFileEntryId type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"fragmentEntryKey": [self checkNull: fragmentEntryKey],
		@"name": [self checkNull: name],
		@"css": [self checkNull: css],
		@"html": [self checkNull: html],
		@"js": [self checkNull: js],
		@"configuration": [self checkNull: configuration],
		@"previewFileEntryId": @(previewFileEntryId),
		@"type": @(type),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/fragment.fragmententry/add-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentEntryKey:(NSString *)fragmentEntryKey name:(NSString *)name previewFileEntryId:(long long)previewFileEntryId type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"fragmentEntryKey": [self checkNull: fragmentEntryKey],
		@"name": [self checkNull: name],
		@"previewFileEntryId": @(previewFileEntryId),
		@"type": @(type),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/fragment.fragmententry/add-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFragmentEntryWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId fragmentEntryKey:(NSString *)fragmentEntryKey name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js cacheable:(BOOL)cacheable configuration:(NSString *)configuration previewFileEntryId:(long long)previewFileEntryId type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"fragmentEntryKey": [self checkNull: fragmentEntryKey],
		@"name": [self checkNull: name],
		@"css": [self checkNull: css],
		@"html": [self checkNull: html],
		@"js": [self checkNull: js],
		@"cacheable": @(cacheable),
		@"configuration": [self checkNull: configuration],
		@"previewFileEntryId": @(previewFileEntryId),
		@"type": @(type),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/fragment.fragmententry/add-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryId": @(fragmentEntryId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/update-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js cacheable:(BOOL)cacheable configuration:(NSString *)configuration status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryId": @(fragmentEntryId),
		@"name": [self checkNull: name],
		@"css": [self checkNull: css],
		@"html": [self checkNull: html],
		@"js": [self checkNull: js],
		@"cacheable": @(cacheable),
		@"configuration": [self checkNull: configuration],
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/update-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js cacheable:(BOOL)cacheable configuration:(NSString *)configuration previewFileEntryId:(long long)previewFileEntryId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryId": @(fragmentEntryId),
		@"name": [self checkNull: name],
		@"css": [self checkNull: css],
		@"html": [self checkNull: html],
		@"js": [self checkNull: js],
		@"cacheable": @(cacheable),
		@"configuration": [self checkNull: configuration],
		@"previewFileEntryId": @(previewFileEntryId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/update-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js configuration:(NSString *)configuration previewFileEntryId:(long long)previewFileEntryId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryId": @(fragmentEntryId),
		@"name": [self checkNull: name],
		@"css": [self checkNull: css],
		@"html": [self checkNull: html],
		@"js": [self checkNull: js],
		@"configuration": [self checkNull: configuration],
		@"previewFileEntryId": @(previewFileEntryId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/update-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js cacheable:(BOOL)cacheable configuration:(NSString *)configuration previewFileEntryId:(long long)previewFileEntryId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryId": @(fragmentEntryId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"name": [self checkNull: name],
		@"css": [self checkNull: css],
		@"html": [self checkNull: html],
		@"js": [self checkNull: js],
		@"cacheable": @(cacheable),
		@"configuration": [self checkNull: configuration],
		@"previewFileEntryId": @(previewFileEntryId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/update-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId previewFileEntryId:(long long)previewFileEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryId": @(fragmentEntryId),
		@"previewFileEntryId": @(previewFileEntryId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/update-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentEntryWithFragmentEntry:(LRJSONObjectWrapper *)fragmentEntry error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"fragmentEntry" className:@"com.liferay.fragment.model.FragmentEntry" wrapper:fragmentEntry];

	NSDictionary *_command = @{@"/fragment.fragmententry/update-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId name:(NSString *)name css:(NSString *)css html:(NSString *)html js:(NSString *)js configuration:(NSString *)configuration status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryId": @(fragmentEntryId),
		@"name": [self checkNull: name],
		@"css": [self checkNull: css],
		@"html": [self checkNull: html],
		@"js": [self checkNull: js],
		@"configuration": [self checkNull: configuration],
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/update-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentEntriesWithFragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentCollectionId": @(fragmentCollectionId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryId": @(fragmentEntryId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/fetch-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)copyFragmentEntryWithGroupId:(long long)groupId fragmentEntryId:(long long)fragmentEntryId fragmentCollectionId:(long long)fragmentCollectionId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentEntryId": @(fragmentEntryId),
		@"fragmentCollectionId": @(fragmentCollectionId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/fragment.fragmententry/copy-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryId": @(fragmentEntryId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/delete-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentEntriesCountWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFragmentEntryWithFragmentEntryId:(long long)fragmentEntryId fragmentCollectionId:(long long)fragmentCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryId": @(fragmentEntryId),
		@"fragmentCollectionId": @(fragmentCollectionId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/move-fragment-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteFragmentEntriesWithFragmentEntriesIds:(NSArray *)fragmentEntriesIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntriesIds": [self checkNull: fragmentEntriesIds]
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/delete-fragment-entries": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCompositionsAndFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"name": [self checkNull: name],
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-compositions-and-fragment-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentCompositionsAndFragmentEntriesWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-compositions-and-fragment-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentCompositionsAndFragmentEntriesCountWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"name": [self checkNull: name],
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-compositions-and-fragment-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentCompositionsAndFragmentEntriesCountWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-compositions-and-fragment-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentEntriesByNameWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-by-name": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentEntriesByNameAndStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"name": [self checkNull: name],
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-by-name-and-status": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentEntriesByStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-by-status": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentEntriesByStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-by-status": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentEntriesByTypeWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"type": @(type),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-by-type": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentEntriesByTypeAndStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"type": @(type),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-by-type-and-status": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFragmentEntriesByTypeAndStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"type": @(type),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-by-type-and-status": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentEntriesCountByNameWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-count-by-name": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentEntriesCountByNameAndStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId name:(NSString *)name status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"name": [self checkNull: name],
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-count-by-name-and-status": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentEntriesCountByStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-count-by-status": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentEntriesCountByTypeWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"type": @(type)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-count-by-type": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFragmentEntriesCountByTypeAndStatusWithGroupId:(long long)groupId fragmentCollectionId:(long long)fragmentCollectionId type:(int)type status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"fragmentCollectionId": @(fragmentCollectionId),
		@"type": @(type),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-fragment-entries-count-by-type-and-status": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getDraftWithPrimaryKey:(long long)primaryKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"primaryKey": @(primaryKey)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententry/get-draft": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)publishDraftWithDraftFragmentEntry:(LRJSONObjectWrapper *)draftFragmentEntry error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"draftFragmentEntry" className:@"com.liferay.fragment.model.FragmentEntry" wrapper:draftFragmentEntry];

	NSDictionary *_command = @{@"/fragment.fragmententry/publish-draft": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateDraftWithDraftFragmentEntry:(LRJSONObjectWrapper *)draftFragmentEntry error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"draftFragmentEntry" className:@"com.liferay.fragment.model.FragmentEntry" wrapper:draftFragmentEntry];

	NSDictionary *_command = @{@"/fragment.fragmententry/update-draft": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end