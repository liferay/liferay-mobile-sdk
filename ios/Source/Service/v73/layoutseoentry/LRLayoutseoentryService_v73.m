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

#import "LRLayoutseoentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRLayoutseoentryService_v73

- (NSDictionary *)updateLayoutSeoEntryWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId canonicalURLEnabled:(BOOL)canonicalURLEnabled canonicalURLMap:(NSDictionary *)canonicalURLMap openGraphDescriptionEnabled:(BOOL)openGraphDescriptionEnabled openGraphDescriptionMap:(NSDictionary *)openGraphDescriptionMap openGraphImageAltMap:(NSDictionary *)openGraphImageAltMap openGraphImageFileEntryId:(long long)openGraphImageFileEntryId openGraphTitleEnabled:(BOOL)openGraphTitleEnabled openGraphTitleMap:(NSDictionary *)openGraphTitleMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutId": @(layoutId),
		@"canonicalURLEnabled": @(canonicalURLEnabled),
		@"canonicalURLMap": [self checkNull: canonicalURLMap],
		@"openGraphDescriptionEnabled": @(openGraphDescriptionEnabled),
		@"openGraphDescriptionMap": [self checkNull: openGraphDescriptionMap],
		@"openGraphImageAltMap": [self checkNull: openGraphImageAltMap],
		@"openGraphImageFileEntryId": @(openGraphImageFileEntryId),
		@"openGraphTitleEnabled": @(openGraphTitleEnabled),
		@"openGraphTitleMap": [self checkNull: openGraphTitleMap],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/layout.layoutseoentry/update-layout-seo-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateLayoutSeoEntryWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId enabledCanonicalURLMap:(BOOL)enabledCanonicalURLMap canonicalURLMap:(NSDictionary *)canonicalURLMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutId": @(layoutId),
		@"enabledCanonicalURLMap": @(enabledCanonicalURLMap),
		@"canonicalURLMap": [self checkNull: canonicalURLMap],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/layout.layoutseoentry/update-layout-seo-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end