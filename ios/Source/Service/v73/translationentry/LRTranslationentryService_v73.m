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

#import "LRTranslationentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRTranslationentryService_v73

- (NSDictionary *)addOrUpdateTranslationEntryWithGroupId:(long long)groupId languageId:(NSString *)languageId infoItemReference:(LRJSONObjectWrapper *)infoItemReference infoItemFieldValues:(LRJSONObjectWrapper *)infoItemFieldValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"languageId": [self checkNull: languageId],
	}];

	[self mangleWrapperWithParams:_params name:@"infoItemReference" className:@"com.liferay.info.item.InfoItemReference" wrapper:infoItemReference];
	[self mangleWrapperWithParams:_params name:@"infoItemFieldValues" className:@"com.liferay.info.item.InfoItemFieldValues" wrapper:infoItemFieldValues];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/translation.translationentry/add-or-update-translation-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addOrUpdateTranslationEntryWithGroupId:(long long)groupId infoItemReference:(LRJSONObjectWrapper *)infoItemReference content:(NSString *)content contentType:(NSString *)contentType serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"content": [self checkNull: content],
		@"contentType": [self checkNull: contentType],
	}];

	[self mangleWrapperWithParams:_params name:@"infoItemReference" className:@"com.liferay.info.item.InfoItemReference" wrapper:infoItemReference];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/translation.translationentry/add-or-update-translation-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end