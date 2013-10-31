/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

#import "JournalFeedService_v62.h"

/**
 * author Bruno Farache
 */
@implementation JournalFeedService_v62

- (NSDictionary *)addFeed:(NSNumber *)groupId feedId:(NSString *)feedId autoFeedId:(BOOL)autoFeedId name:(NSString *)name description:(NSString *)description type:(NSString *)type structureId:(NSString *)structureId templateId:(NSString *)templateId rendererTemplateId:(NSString *)rendererTemplateId delta:(NSNumber *)delta orderByCol:(NSString *)orderByCol orderByType:(NSString *)orderByType targetLayoutFriendlyUrl:(NSString *)targetLayoutFriendlyUrl targetPortletId:(NSString *)targetPortletId contentField:(NSString *)contentField feedType:(NSString *)feedType feedVersion:(NSNumber *)feedVersion serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"feedId": feedId,
		@"autoFeedId": autoFeedId,
		@"name": name,
		@"description": description,
		@"type": type,
		@"structureId": structureId,
		@"templateId": templateId,
		@"rendererTemplateId": rendererTemplateId,
		@"delta": delta,
		@"orderByCol": orderByCol,
		@"orderByType": orderByType,
		@"targetLayoutFriendlyUrl": targetLayoutFriendlyUrl,
		@"targetPortletId": targetPortletId,
		@"contentField": contentField,
		@"feedType": feedType,
		@"feedVersion": feedVersion,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalfeed/add-feed": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getFeed:(NSNumber *)groupId feedId:(NSNumber *)feedId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"feedId": feedId
	};

	NSDictionary *_command = @{@"/journalfeed/get-feed": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteFeed:(NSNumber *)groupId feedId:(NSNumber *)feedId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"feedId": feedId
	};

	NSDictionary *_command = @{@"/journalfeed/delete-feed": _params};

	[session invoke:_command];
}

- (NSDictionary *)updateFeed:(NSNumber *)groupId feedId:(NSString *)feedId name:(NSString *)name description:(NSString *)description type:(NSString *)type structureId:(NSString *)structureId templateId:(NSString *)templateId rendererTemplateId:(NSString *)rendererTemplateId delta:(NSNumber *)delta orderByCol:(NSString *)orderByCol orderByType:(NSString *)orderByType targetLayoutFriendlyUrl:(NSString *)targetLayoutFriendlyUrl targetPortletId:(NSString *)targetPortletId contentField:(NSString *)contentField feedType:(NSString *)feedType feedVersion:(NSNumber *)feedVersion serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"feedId": feedId,
		@"name": name,
		@"description": description,
		@"type": type,
		@"structureId": structureId,
		@"templateId": templateId,
		@"rendererTemplateId": rendererTemplateId,
		@"delta": delta,
		@"orderByCol": orderByCol,
		@"orderByType": orderByType,
		@"targetLayoutFriendlyUrl": targetLayoutFriendlyUrl,
		@"targetPortletId": targetPortletId,
		@"contentField": contentField,
		@"feedType": feedType,
		@"feedVersion": feedVersion,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalfeed/update-feed": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end