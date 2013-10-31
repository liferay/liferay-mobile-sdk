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

#import "JournalArticleService_v62.h"

/**
 * author Bruno Farache
 */
@implementation JournalArticleService_v62

- (NSArray *)getArticlesByArticleId:(NSNumber *)groupId articleId:(NSString *)articleId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-by-article-id": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)search:(NSNumber *)groupId creatorUserId:(NSNumber *)creatorUserId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"creatorUserId": creatorUserId,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/journalarticle/search": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)removeArticleLocale:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version languageId:(NSString *)languageId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId,
		@"version": version,
		@"languageId": languageId
	};

	NSDictionary *_command = @{@"/journalarticle/remove-article-locale": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)moveArticleFromTrash:(NSNumber *)groupId resourcePrimKey:(NSNumber *)resourcePrimKey newFolderId:(NSNumber *)newFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"resourcePrimKey": resourcePrimKey,
		@"newFolderId": newFolderId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/move-article-from-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getGroupArticlesCount:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userId": userId,
		@"rootFolderId": rootFolderId,
		@"status": status
	};

	NSDictionary *_command = @{@"/journalarticle/get-group-articles-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getArticlesByStructureId:(NSNumber *)groupId classNameId:(NSNumber *)classNameId ddmStructureKey:(NSString *)ddmStructureKey status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"classNameId": classNameId,
		@"ddmStructureKey": ddmStructureKey,
		@"status": status,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-by-structure-id": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getArticlesByLayoutUuid:(NSNumber *)groupId layoutUuid:(NSString *)layoutUuid {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"layoutUuid": layoutUuid
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-by-layout-uuid": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)moveArticleToTrash:(NSNumber *)groupId articleId:(NSString *)articleId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId
	};

	NSDictionary *_command = @{@"/journalarticle/move-article-to-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)unsubscribe:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/journalarticle/unsubscribe": _params};

	[session invoke:_command];
}

- (NSArray *)getGroupArticles:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userId": userId,
		@"rootFolderId": rootFolderId,
		@"status": status,
		@"start": start,
		@"end": end,
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/journalarticle/get-group-articles": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)restoreArticleFromTrash:(NSNumber *)groupId articleId:(NSString *)articleId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId
	};

	NSDictionary *_command = @{@"/journalarticle/restore-article-from-trash": _params};

	[session invoke:_command];
}

- (NSDictionary *)updateArticleTranslation:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version locale:(NSString *)locale title:(NSString *)title description:(NSString *)description content:(NSString *)content images:(NSDictionary *)images serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId,
		@"version": version,
		@"locale": locale,
		@"title": title,
		@"description": description,
		@"content": content,
		@"images": images,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/update-article-translation": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getLatestArticle:(NSNumber *)groupId className:(NSString *)className classPK:(NSNumber *)classPK {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"className": className,
		@"classPK": classPK
	};

	NSDictionary *_command = @{@"/journalarticle/get-latest-article": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)copyArticle:(NSNumber *)groupId oldArticleId:(NSString *)oldArticleId newArticleId:(NSString *)newArticleId autoArticleId:(BOOL)autoArticleId version:(NSNumber *)version {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"oldArticleId": oldArticleId,
		@"newArticleId": newArticleId,
		@"autoArticleId": autoArticleId,
		@"version": version
	};

	NSDictionary *_command = @{@"/journalarticle/copy-article": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)subscribe:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/journalarticle/subscribe": _params};

	[session invoke:_command];
}

- (NSDictionary *)expireArticle:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId,
		@"version": version,
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/expire-article": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getDisplayArticleByUrlTitle:(NSNumber *)groupId urlTitle:(NSString *)urlTitle {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"urlTitle": urlTitle
	};

	NSDictionary *_command = @{@"/journalarticle/get-display-article-by-url-title": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateContent:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version content:(NSString *)content {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId,
		@"version": version,
		@"content": content
	};

	NSDictionary *_command = @{@"/journalarticle/update-content": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getArticlesCountByStructureId:(NSNumber *)groupId classNameId:(NSNumber *)classNameId ddmStructureKey:(NSString *)ddmStructureKey status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"classNameId": classNameId,
		@"ddmStructureKey": ddmStructureKey,
		@"status": status
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-count-by-structure-id": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)updateArticle:(NSNumber *)groupId folderId:(NSNumber *)folderId articleId:(NSString *)articleId version:(NSNumber *)version content:(NSString *)content serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"articleId": articleId,
		@"version": version,
		@"content": content,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/update-article": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getArticles:(NSNumber *)groupId folderId:(NSNumber *)folderId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getFoldersAndArticlesCount:(NSNumber *)groupId folderIds:(NSArray *)folderIds {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderIds": folderIds
	};

	NSDictionary *_command = @{@"/journalarticle/get-folders-and-articles-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (void)deleteArticle:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId,
		@"version": version,
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/delete-article": _params};

	[session invoke:_command];
}

- (NSDictionary *)getArticle:(NSNumber *)groupId className:(NSString *)className classPK:(NSNumber *)classPK {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"className": className,
		@"classPK": classPK
	};

	NSDictionary *_command = @{@"/journalarticle/get-article": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addArticle:(NSNumber *)groupId folderId:(NSNumber *)folderId classNameId:(NSNumber *)classNameId classPK:(NSNumber *)classPK articleId:(NSString *)articleId autoArticleId:(BOOL)autoArticleId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey layoutUuid:(NSString *)layoutUuid displayDateMonth:(NSNumber *)displayDateMonth displayDateDay:(NSNumber *)displayDateDay displayDateYear:(NSNumber *)displayDateYear displayDateHour:(NSNumber *)displayDateHour displayDateMinute:(NSNumber *)displayDateMinute expirationDateMonth:(NSNumber *)expirationDateMonth expirationDateDay:(NSNumber *)expirationDateDay expirationDateYear:(NSNumber *)expirationDateYear expirationDateHour:(NSNumber *)expirationDateHour expirationDateMinute:(NSNumber *)expirationDateMinute neverExpire:(BOOL)neverExpire reviewDateMonth:(NSNumber *)reviewDateMonth reviewDateDay:(NSNumber *)reviewDateDay reviewDateYear:(NSNumber *)reviewDateYear reviewDateHour:(NSNumber *)reviewDateHour reviewDateMinute:(NSNumber *)reviewDateMinute neverReview:(BOOL)neverReview indexable:(BOOL)indexable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile images:(NSDictionary *)images articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"classNameId": classNameId,
		@"classPK": classPK,
		@"articleId": articleId,
		@"autoArticleId": autoArticleId,
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"content": content,
		@"type": type,
		@"ddmStructureKey": ddmStructureKey,
		@"ddmTemplateKey": ddmTemplateKey,
		@"layoutUuid": layoutUuid,
		@"displayDateMonth": displayDateMonth,
		@"displayDateDay": displayDateDay,
		@"displayDateYear": displayDateYear,
		@"displayDateHour": displayDateHour,
		@"displayDateMinute": displayDateMinute,
		@"expirationDateMonth": expirationDateMonth,
		@"expirationDateDay": expirationDateDay,
		@"expirationDateYear": expirationDateYear,
		@"expirationDateHour": expirationDateHour,
		@"expirationDateMinute": expirationDateMinute,
		@"neverExpire": neverExpire,
		@"reviewDateMonth": reviewDateMonth,
		@"reviewDateDay": reviewDateDay,
		@"reviewDateYear": reviewDateYear,
		@"reviewDateHour": reviewDateHour,
		@"reviewDateMinute": reviewDateMinute,
		@"neverReview": neverReview,
		@"indexable": indexable,
		@"smallImage": smallImage,
		@"smallImageURL": smallImageURL,
		@"smallFile": smallFile,
		@"images": images,
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/add-article": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getArticleByUrlTitle:(NSNumber *)groupId urlTitle:(NSString *)urlTitle {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"urlTitle": urlTitle
	};

	NSDictionary *_command = @{@"/journalarticle/get-article-by-url-title": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)moveArticle:(NSNumber *)groupId articleId:(NSString *)articleId newFolderId:(NSNumber *)newFolderId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId,
		@"newFolderId": newFolderId
	};

	NSDictionary *_command = @{@"/journalarticle/move-article": _params};

	[session invoke:_command];
}

- (NSString *)getArticleContent:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version languageId:(NSString *)languageId themeDisplay:(NSDictionary *)themeDisplay {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId,
		@"version": version,
		@"languageId": languageId,
		@"themeDisplay": themeDisplay
	};

	NSDictionary *_command = @{@"/journalarticle/get-article-content": _params};

	return (NSString *)[session invoke:_command];
}

- (NSNumber *)searchCount:(NSNumber *)companyId groupId:(NSNumber *)groupId folderIds:(NSArray *)folderIds classNameId:(NSNumber *)classNameId articleId:(NSString *)articleId version:(NSDictionary *)version title:(NSString *)title description:(NSString *)description content:(NSString *)content type:(NSString *)type ddmStructureKeys:(NSArray *)ddmStructureKeys ddmTemplateKeys:(NSArray *)ddmTemplateKeys displayDateGT:(NSNumber *)displayDateGT displayDateLT:(NSNumber *)displayDateLT status:(NSNumber *)status reviewDate:(NSNumber *)reviewDate andOperator:(BOOL)andOperator {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupId": groupId,
		@"folderIds": folderIds,
		@"classNameId": classNameId,
		@"articleId": articleId,
		@"version": version,
		@"title": title,
		@"description": description,
		@"content": content,
		@"type": type,
		@"ddmStructureKeys": ddmStructureKeys,
		@"ddmTemplateKeys": ddmTemplateKeys,
		@"displayDateGT": displayDateGT,
		@"displayDateLT": displayDateLT,
		@"status": status,
		@"reviewDate": reviewDate,
		@"andOperator": andOperator
	};

	NSDictionary *_command = @{@"/journalarticle/search-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)updateStatus:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version status:(NSNumber *)status articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId,
		@"version": version,
		@"status": status,
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/update-status": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getArticlesCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"status": status
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSNumber *)getArticlesCountByArticleId:(NSNumber *)groupId articleId:(NSString *)articleId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"articleId": articleId
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-count-by-article-id": _params};

	return (NSNumber *)[session invoke:_command];
}

@end