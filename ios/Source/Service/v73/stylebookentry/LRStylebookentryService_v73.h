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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LRStylebookentryService_v73 : LRBaseService

- (NSDictionary *)updateNameWithStyleBookEntryId:(long long)styleBookEntryId name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)addStyleBookEntryWithGroupId:(long long)groupId name:(NSString *)name styleBookEntryKey:(NSString *)styleBookEntryKey serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addStyleBookEntryWithGroupId:(long long)groupId frontendTokensValues:(NSString *)frontendTokensValues name:(NSString *)name styleBookEntryKey:(NSString *)styleBookEntryKey serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateStyleBookEntryWithStyleBookEntryId:(long long)styleBookEntryId frontendTokensValues:(NSString *)frontendTokensValues name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)discardDraftStyleBookEntryWithStyleBookEntryId:(long long)styleBookEntryId error:(NSError **)error;
- (NSDictionary *)copyStyleBookEntryWithGroupId:(long long)groupId styleBookEntryId:(long long)styleBookEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteStyleBookEntryWithStyleBookEntry:(LRJSONObjectWrapper *)styleBookEntry error:(NSError **)error;
- (NSDictionary *)deleteStyleBookEntryWithStyleBookEntryId:(long long)styleBookEntryId error:(NSError **)error;
- (NSDictionary *)updateDefaultStyleBookEntryWithStyleBookEntryId:(long long)styleBookEntryId defaultStyleBookEntry:(BOOL)defaultStyleBookEntry error:(NSError **)error;
- (NSDictionary *)updateFrontendTokensValuesWithStyleBookEntryId:(long long)styleBookEntryId frontendTokensValues:(NSString *)frontendTokensValues error:(NSError **)error;
- (NSDictionary *)updatePreviewFileEntryIdWithStyleBookEntryId:(long long)styleBookEntryId previewFileEntryId:(long long)previewFileEntryId error:(NSError **)error;
- (NSDictionary *)publishDraftWithStyleBookEntryId:(long long)styleBookEntryId error:(NSError **)error;

@end