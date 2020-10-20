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

#import "LRStylebookentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRStylebookentryService_v73

- (NSDictionary *)updateNameWithStyleBookEntryId:(long long)styleBookEntryId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"styleBookEntryId": @(styleBookEntryId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/update-name": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addStyleBookEntryWithGroupId:(long long)groupId name:(NSString *)name styleBookEntryKey:(NSString *)styleBookEntryKey serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"styleBookEntryKey": [self checkNull: styleBookEntryKey],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/add-style-book-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addStyleBookEntryWithGroupId:(long long)groupId frontendTokensValues:(NSString *)frontendTokensValues name:(NSString *)name styleBookEntryKey:(NSString *)styleBookEntryKey serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"frontendTokensValues": [self checkNull: frontendTokensValues],
		@"name": [self checkNull: name],
		@"styleBookEntryKey": [self checkNull: styleBookEntryKey],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/add-style-book-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateStyleBookEntryWithStyleBookEntryId:(long long)styleBookEntryId frontendTokensValues:(NSString *)frontendTokensValues name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"styleBookEntryId": @(styleBookEntryId),
		@"frontendTokensValues": [self checkNull: frontendTokensValues],
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/update-style-book-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)discardDraftStyleBookEntryWithStyleBookEntryId:(long long)styleBookEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"styleBookEntryId": @(styleBookEntryId)
	}];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/discard-draft-style-book-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)copyStyleBookEntryWithGroupId:(long long)groupId styleBookEntryId:(long long)styleBookEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"styleBookEntryId": @(styleBookEntryId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/copy-style-book-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteStyleBookEntryWithStyleBookEntry:(LRJSONObjectWrapper *)styleBookEntry error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"styleBookEntry" className:@"com.liferay.style.book.model.StyleBookEntry" wrapper:styleBookEntry];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/delete-style-book-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteStyleBookEntryWithStyleBookEntryId:(long long)styleBookEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"styleBookEntryId": @(styleBookEntryId)
	}];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/delete-style-book-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateDefaultStyleBookEntryWithStyleBookEntryId:(long long)styleBookEntryId defaultStyleBookEntry:(BOOL)defaultStyleBookEntry error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"styleBookEntryId": @(styleBookEntryId),
		@"defaultStyleBookEntry": @(defaultStyleBookEntry)
	}];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/update-default-style-book-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFrontendTokensValuesWithStyleBookEntryId:(long long)styleBookEntryId frontendTokensValues:(NSString *)frontendTokensValues error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"styleBookEntryId": @(styleBookEntryId),
		@"frontendTokensValues": [self checkNull: frontendTokensValues]
	}];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/update-frontend-tokens-values": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updatePreviewFileEntryIdWithStyleBookEntryId:(long long)styleBookEntryId previewFileEntryId:(long long)previewFileEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"styleBookEntryId": @(styleBookEntryId),
		@"previewFileEntryId": @(previewFileEntryId)
	}];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/update-preview-file-entry-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)publishDraftWithStyleBookEntryId:(long long)styleBookEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"styleBookEntryId": @(styleBookEntryId)
	}];

	NSDictionary *_command = @{@"/stylebook.stylebookentry/publish-draft": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end