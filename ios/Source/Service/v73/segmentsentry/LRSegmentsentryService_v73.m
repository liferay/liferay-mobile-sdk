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

#import "LRSegmentsentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRSegmentsentryService_v73

- (NSDictionary *)getSegmentsEntryWithSegmentsEntryId:(long long)segmentsEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsentry/get-segments-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addSegmentsEntryWithSegmentsEntryKey:(NSString *)segmentsEntryKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap active:(BOOL)active criteria:(NSString *)criteria type:(NSString *)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryKey": [self checkNull: segmentsEntryKey],
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"active": @(active),
		@"criteria": [self checkNull: criteria],
		@"type": [self checkNull: type],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/segments.segmentsentry/add-segments-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addSegmentsEntryWithSegmentsEntryKey:(NSString *)segmentsEntryKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap active:(BOOL)active criteria:(NSString *)criteria source:(NSString *)source type:(NSString *)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryKey": [self checkNull: segmentsEntryKey],
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"active": @(active),
		@"criteria": [self checkNull: criteria],
		@"source": [self checkNull: source],
		@"type": [self checkNull: type],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/segments.segmentsentry/add-segments-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSegmentsEntryWithSegmentsEntryId:(long long)segmentsEntryId segmentsEntryKey:(NSString *)segmentsEntryKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap active:(BOOL)active criteria:(NSString *)criteria serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId),
		@"segmentsEntryKey": [self checkNull: segmentsEntryKey],
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"active": @(active),
		@"criteria": [self checkNull: criteria],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/segments.segmentsentry/update-segments-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteSegmentsEntryWithSegmentsEntryId:(long long)segmentsEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsentry/delete-segments-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)addSegmentsEntryClassPKsWithSegmentsEntryId:(long long)segmentsEntryId classPKs:(NSArray *)classPKs serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId),
		@"classPKs": [self checkNull: classPKs],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/segments.segmentsentry/add-segments-entry-class-p-ks": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteSegmentsEntryClassPKsWithSegmentsEntryId:(long long)segmentsEntryId classPKs:(NSArray *)classPKs error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId),
		@"classPKs": [self checkNull: classPKs]
	}];

	NSDictionary *_command = @{@"/segments.segmentsentry/delete-segments-entry-class-p-ks": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getSegmentsEntriesWithGroupId:(long long)groupId includeAncestorSegmentsEntries:(BOOL)includeAncestorSegmentsEntries start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"includeAncestorSegmentsEntries": @(includeAncestorSegmentsEntries),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.segments.model.SegmentsEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/segments.segmentsentry/get-segments-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getSegmentsEntriesWithGroupId:(long long)groupId includeAncestorSegmentsEntries:(BOOL)includeAncestorSegmentsEntries error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"includeAncestorSegmentsEntries": @(includeAncestorSegmentsEntries)
	}];

	NSDictionary *_command = @{@"/segments.segmentsentry/get-segments-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getSegmentsEntriesCountWithGroupId:(long long)groupId includeAncestorSegmentsEntries:(BOOL)includeAncestorSegmentsEntries error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"includeAncestorSegmentsEntries": @(includeAncestorSegmentsEntries)
	}];

	NSDictionary *_command = @{@"/segments.segmentsentry/get-segments-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchSegmentsEntriesWithCompanyId:(long long)companyId groupId:(long long)groupId keywords:(NSString *)keywords includeAncestorSegmentsEntries:(BOOL)includeAncestorSegmentsEntries start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords],
		@"includeAncestorSegmentsEntries": @(includeAncestorSegmentsEntries),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/segments.segmentsentry/search-segments-entries": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end