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

#import "LRKbarticleService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRKbarticleService_v72

- (NSDictionary *)deleteKbArticleWithResourcePrimKey:(long long)resourcePrimKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"resourcePrimKey": @(resourcePrimKey)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/delete-kb-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)unsubscribeGroupKbArticlesWithGroupId:(long long)groupId portletId:(NSString *)portletId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"portletId": [self checkNull: portletId]
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/unsubscribe-group-kb-articles": _params};

	[self.session invoke:_command error:error];
}

- (void)subscribeGroupKbArticlesWithGroupId:(long long)groupId portletId:(NSString *)portletId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"portletId": [self checkNull: portletId]
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/subscribe-group-kb-articles": _params};

	[self.session invoke:_command error:error];
}

- (NSString *)getGroupKbArticlesRssWithStatus:(int)status rssDelta:(int)rssDelta rssDisplayStyle:(NSString *)rssDisplayStyle rssFormat:(NSString *)rssFormat themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"status": @(status),
		@"rssDelta": @(rssDelta),
		@"rssDisplayStyle": [self checkNull: rssDisplayStyle],
		@"rssFormat": [self checkNull: rssFormat],
	}];

	[self mangleWrapperWithParams:_params name:@"themeDisplay" className:@"com.liferay.portal.kernel.theme.ThemeDisplay" wrapper:themeDisplay];

	NSDictionary *_command = @{@"/kb.kbarticle/get-group-kb-articles-rss": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSString *)getKbArticleRssWithResourcePrimKey:(long long)resourcePrimKey status:(int)status rssDelta:(int)rssDelta rssDisplayStyle:(NSString *)rssDisplayStyle rssFormat:(NSString *)rssFormat themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"resourcePrimKey": @(resourcePrimKey),
		@"status": @(status),
		@"rssDelta": @(rssDelta),
		@"rssDisplayStyle": [self checkNull: rssDisplayStyle],
		@"rssFormat": [self checkNull: rssFormat],
	}];

	[self mangleWrapperWithParams:_params name:@"themeDisplay" className:@"com.liferay.portal.kernel.theme.ThemeDisplay" wrapper:themeDisplay];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-article-rss": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getKbArticleSearchDisplayWithGroupId:(long long)groupId title:(NSString *)title content:(NSString *)content status:(int)status startDate:(long long)startDate endDate:(long long)endDate andOperator:(BOOL)andOperator curStartValues:(NSArray *)curStartValues cur:(int)cur delta:(int)delta orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"title": [self checkNull: title],
		@"content": [self checkNull: content],
		@"status": @(status),
		@"startDate": @(startDate),
		@"endDate": @(endDate),
		@"andOperator": @(andOperator),
		@"curStartValues": [self checkNull: curStartValues],
		@"cur": @(cur),
		@"delta": @(delta),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-article-search-display": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbArticleVersionsWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"resourcePrimKey": @(resourcePrimKey),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-article-versions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)deleteTempAttachmentWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"resourcePrimKey": @(resourcePrimKey),
		@"fileName": [self checkNull: fileName],
		@"tempFolderName": [self checkNull: tempFolderName]
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/delete-temp-attachment": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getTempAttachmentNamesWithGroupId:(long long)groupId tempFolderName:(NSString *)tempFolderName error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"tempFolderName": [self checkNull: tempFolderName]
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/get-temp-attachment-names": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)deleteKbArticlesWithGroupId:(long long)groupId resourcePrimKeys:(NSArray *)resourcePrimKeys error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"resourcePrimKeys": [self checkNull: resourcePrimKeys]
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/delete-kb-articles": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchFirstChildKbArticleWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/fetch-first-child-kb-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchFirstChildKbArticleWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentResourcePrimKey": @(parentResourcePrimKey)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/fetch-first-child-kb-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchKbArticleByUrlTitleWithGroupId:(long long)groupId kbFolderId:(long long)kbFolderId urlTitle:(NSString *)urlTitle error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"kbFolderId": @(kbFolderId),
		@"urlTitle": [self checkNull: urlTitle]
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/fetch-kb-article-by-url-title": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchLatestKbArticleWithResourcePrimKey:(long long)resourcePrimKey status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"resourcePrimKey": @(resourcePrimKey),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/fetch-latest-kb-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchLatestKbArticleByUrlTitleWithGroupId:(long long)groupId kbFolderId:(long long)kbFolderId urlTitle:(NSString *)urlTitle status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"kbFolderId": @(kbFolderId),
		@"urlTitle": [self checkNull: urlTitle],
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/fetch-latest-kb-article-by-url-title": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getAllDescendantKbArticlesWithResourcePrimKey:(long long)resourcePrimKey status:(int)status orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"resourcePrimKey": @(resourcePrimKey),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-all-descendant-kb-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getAllDescendantKbArticlesWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey status:(int)status orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"resourcePrimKey": @(resourcePrimKey),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-all-descendant-kb-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupKbArticlesWithGroupId:(long long)groupId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-group-kb-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupKbArticlesCountWithGroupId:(long long)groupId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/get-group-kb-articles-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbArticleAndAllDescendantKbArticlesWithResourcePrimKey:(long long)resourcePrimKey status:(int)status orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"resourcePrimKey": @(resourcePrimKey),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-article-and-all-descendant-kb-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbArticleAndAllDescendantsWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey status:(int)status orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"resourcePrimKey": @(resourcePrimKey),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-article-and-all-descendants": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbArticlesWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbArticlesWithGroupId:(long long)groupId resourcePrimKeys:(NSArray *)resourcePrimKeys status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"resourcePrimKeys": [self checkNull: resourcePrimKeys],
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbArticlesWithGroupId:(long long)groupId resourcePrimKeys:(NSArray *)resourcePrimKeys status:(int)status orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"resourcePrimKeys": [self checkNull: resourcePrimKeys],
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getKbArticlesCountWithGroupId:(long long)groupId resourcePrimKeys:(NSArray *)resourcePrimKeys status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"resourcePrimKeys": [self checkNull: resourcePrimKeys],
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-articles-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getKbArticlesCountWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-articles-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getKbArticleVersionsCountWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"resourcePrimKey": @(resourcePrimKey),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-article-versions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getPreviousAndNextKbArticlesWithKbArticleId:(long long)kbArticleId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbArticleId": @(kbArticleId)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/get-previous-and-next-kb-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getSectionsKbArticlesWithGroupId:(long long)groupId sections:(NSArray *)sections status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"sections": [self checkNull: sections],
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-sections-kb-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getSectionsKbArticlesCountWithGroupId:(long long)groupId sections:(NSArray *)sections status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"sections": [self checkNull: sections],
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/get-sections-kb-articles-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getSiblingKbArticlesWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbarticle/get-sibling-kb-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getSiblingKbArticlesCountWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/get-sibling-kb-articles-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)moveKbArticleWithResourcePrimKey:(long long)resourcePrimKey parentResourceClassNameId:(long long)parentResourceClassNameId parentResourcePrimKey:(long long)parentResourcePrimKey priority:(double)priority error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"resourcePrimKey": @(resourcePrimKey),
		@"parentResourceClassNameId": @(parentResourceClassNameId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"priority": @(priority)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/move-kb-article": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)revertKbArticleWithResourcePrimKey:(long long)resourcePrimKey version:(int)version serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"resourcePrimKey": @(resourcePrimKey),
		@"version": @(version),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kb.kbarticle/revert-kb-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)subscribeKbArticleWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"resourcePrimKey": @(resourcePrimKey)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/subscribe-kb-article": _params};

	[self.session invoke:_command error:error];
}

- (void)unsubscribeKbArticleWithResourcePrimKey:(long long)resourcePrimKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"resourcePrimKey": @(resourcePrimKey)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/unsubscribe-kb-article": _params};

	[self.session invoke:_command error:error];
}

- (void)updateKbArticlesPrioritiesWithGroupId:(long long)groupId resourcePrimKeyToPriorityMap:(NSDictionary *)resourcePrimKeyToPriorityMap error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"resourcePrimKeyToPriorityMap": [self checkNull: resourcePrimKeyToPriorityMap]
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/update-kb-articles-priorities": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getLatestKbArticleWithResourcePrimKey:(long long)resourcePrimKey status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"resourcePrimKey": @(resourcePrimKey),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/get-latest-kb-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addKbArticleWithPortletId:(NSString *)portletId parentResourceClassNameId:(long long)parentResourceClassNameId parentResourcePrimKey:(long long)parentResourcePrimKey title:(NSString *)title urlTitle:(NSString *)urlTitle content:(NSString *)content description:(NSString *)description sourceURL:(NSString *)sourceURL sections:(NSArray *)sections selectedFileNames:(NSArray *)selectedFileNames serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"portletId": [self checkNull: portletId],
		@"parentResourceClassNameId": @(parentResourceClassNameId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"title": [self checkNull: title],
		@"urlTitle": [self checkNull: urlTitle],
		@"content": [self checkNull: content],
		@"description": [self checkNull: description],
		@"sourceURL": [self checkNull: sourceURL],
		@"sections": [self checkNull: sections],
		@"selectedFileNames": [self checkNull: selectedFileNames],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kb.kbarticle/add-kb-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateKbArticleWithResourcePrimKey:(long long)resourcePrimKey title:(NSString *)title content:(NSString *)content description:(NSString *)description sourceURL:(NSString *)sourceURL sections:(NSArray *)sections selectedFileNames:(NSArray *)selectedFileNames removeFileEntryIds:(NSArray *)removeFileEntryIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"resourcePrimKey": @(resourcePrimKey),
		@"title": [self checkNull: title],
		@"content": [self checkNull: content],
		@"description": [self checkNull: description],
		@"sourceURL": [self checkNull: sourceURL],
		@"sections": [self checkNull: sections],
		@"selectedFileNames": [self checkNull: selectedFileNames],
		@"removeFileEntryIds": [self checkNull: removeFileEntryIds],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kb.kbarticle/update-kb-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getKbArticleWithResourcePrimKey:(long long)resourcePrimKey version:(int)version error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"resourcePrimKey": @(resourcePrimKey),
		@"version": @(version)
	}];

	NSDictionary *_command = @{@"/kb.kbarticle/get-kb-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end