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
}

- (NSDictionary *)getFeed:(NSNumber *)groupId feedId:(NSNumber *)feedId {
}

- (void)deleteFeed:(NSNumber *)groupId feedId:(NSNumber *)feedId {
}

- (NSDictionary *)updateFeed:(NSNumber *)groupId feedId:(NSString *)feedId name:(NSString *)name description:(NSString *)description type:(NSString *)type structureId:(NSString *)structureId templateId:(NSString *)templateId rendererTemplateId:(NSString *)rendererTemplateId delta:(NSNumber *)delta orderByCol:(NSString *)orderByCol orderByType:(NSString *)orderByType targetLayoutFriendlyUrl:(NSString *)targetLayoutFriendlyUrl targetPortletId:(NSString *)targetPortletId contentField:(NSString *)contentField feedType:(NSString *)feedType feedVersion:(NSNumber *)feedVersion serviceContext:(NSDictionary *)serviceContext {
}

@end