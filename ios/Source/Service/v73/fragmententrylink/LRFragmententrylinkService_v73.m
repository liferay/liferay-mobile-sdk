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

#import "LRFragmententrylinkService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRFragmententrylinkService_v73

- (NSDictionary *)addFragmentEntryLinkWithGroupId:(long long)groupId originalFragmentEntryLinkId:(long long)originalFragmentEntryLinkId fragmentEntryId:(long long)fragmentEntryId segmentsExperienceId:(long long)segmentsExperienceId classNameId:(long long)classNameId classPK:(long long)classPK css:(NSString *)css html:(NSString *)html js:(NSString *)js configuration:(NSString *)configuration editableValues:(NSString *)editableValues namespace:(NSString *)namespace position:(int)position rendererKey:(NSString *)rendererKey serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"originalFragmentEntryLinkId": @(originalFragmentEntryLinkId),
		@"fragmentEntryId": @(fragmentEntryId),
		@"segmentsExperienceId": @(segmentsExperienceId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"css": [self checkNull: css],
		@"html": [self checkNull: html],
		@"js": [self checkNull: js],
		@"configuration": [self checkNull: configuration],
		@"editableValues": [self checkNull: editableValues],
		@"namespace": [self checkNull: namespace],
		@"position": @(position),
		@"rendererKey": [self checkNull: rendererKey],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/fragment.fragmententrylink/add-fragment-entry-link": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFragmentEntryLinkWithGroupId:(long long)groupId originalFragmentEntryLinkId:(long long)originalFragmentEntryLinkId fragmentEntryId:(long long)fragmentEntryId segmentsExperienceId:(long long)segmentsExperienceId plid:(long long)plid css:(NSString *)css html:(NSString *)html js:(NSString *)js configuration:(NSString *)configuration editableValues:(NSString *)editableValues namespace:(NSString *)namespace position:(int)position rendererKey:(NSString *)rendererKey serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"originalFragmentEntryLinkId": @(originalFragmentEntryLinkId),
		@"fragmentEntryId": @(fragmentEntryId),
		@"segmentsExperienceId": @(segmentsExperienceId),
		@"plid": @(plid),
		@"css": [self checkNull: css],
		@"html": [self checkNull: html],
		@"js": [self checkNull: js],
		@"configuration": [self checkNull: configuration],
		@"editableValues": [self checkNull: editableValues],
		@"namespace": [self checkNull: namespace],
		@"position": @(position),
		@"rendererKey": [self checkNull: rendererKey],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/fragment.fragmententrylink/add-fragment-entry-link": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentEntryLinkWithFragmentEntryLinkId:(long long)fragmentEntryLinkId editableValues:(NSString *)editableValues error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryLinkId": @(fragmentEntryLinkId),
		@"editableValues": [self checkNull: editableValues]
	}];

	NSDictionary *_command = @{@"/fragment.fragmententrylink/update-fragment-entry-link": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFragmentEntryLinkWithFragmentEntryLinkId:(long long)fragmentEntryLinkId editableValues:(NSString *)editableValues updateClassedModel:(BOOL)updateClassedModel error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryLinkId": @(fragmentEntryLinkId),
		@"editableValues": [self checkNull: editableValues],
		@"updateClassedModel": @(updateClassedModel)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententrylink/update-fragment-entry-link": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteFragmentEntryLinkWithFragmentEntryLinkId:(long long)fragmentEntryLinkId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryLinkId": @(fragmentEntryLinkId)
	}];

	NSDictionary *_command = @{@"/fragment.fragmententrylink/delete-fragment-entry-link": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)updateFragmentEntryLinksWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK fragmentEntryIds:(NSArray *)fragmentEntryIds editableValues:(NSString *)editableValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"fragmentEntryIds": [self checkNull: fragmentEntryIds],
		@"editableValues": [self checkNull: editableValues],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/fragment.fragmententrylink/update-fragment-entry-links": _params};

	[self.session invoke:_command error:error];
}

- (void)updateFragmentEntryLinksWithGroupId:(long long)groupId plid:(long long)plid fragmentEntryIds:(NSArray *)fragmentEntryIds editableValues:(NSString *)editableValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"plid": @(plid),
		@"fragmentEntryIds": [self checkNull: fragmentEntryIds],
		@"editableValues": [self checkNull: editableValues],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/fragment.fragmententrylink/update-fragment-entry-links": _params};

	[self.session invoke:_command error:error];
}

- (void)updateFragmentEntryLinksWithFragmentEntryLinksEditableValuesMap:(NSDictionary *)fragmentEntryLinksEditableValuesMap error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fragmentEntryLinksEditableValuesMap": [self checkNull: fragmentEntryLinksEditableValuesMap]
	}];

	NSDictionary *_command = @{@"/fragment.fragmententrylink/update-fragment-entry-links": _params};

	[self.session invoke:_command error:error];
}

@end