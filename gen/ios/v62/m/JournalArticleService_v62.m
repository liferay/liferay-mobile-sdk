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

- (NSDictionary *)addArticleWithGroupId:(long)groupId folderId:(long)folderId classNameId:(long)classNameId classPK:(long)classPK articleId:(NSString *)articleId autoArticleId:(BOOL)autoArticleId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey layoutUuid:(NSString *)layoutUuid displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire reviewDateMonth:(int)reviewDateMonth reviewDateDay:(int)reviewDateDay reviewDateYear:(int)reviewDateYear reviewDateHour:(int)reviewDateHour reviewDateMinute:(int)reviewDateMinute neverReview:(BOOL)neverReview indexable:(BOOL)indexable articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"articleId": articleId,
		@"autoArticleId": @(autoArticleId),
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"content": content,
		@"type": type,
		@"ddmStructureKey": ddmStructureKey,
		@"ddmTemplateKey": ddmTemplateKey,
		@"layoutUuid": layoutUuid,
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
		@"reviewDateMonth": @(reviewDateMonth),
		@"reviewDateDay": @(reviewDateDay),
		@"reviewDateYear": @(reviewDateYear),
		@"reviewDateHour": @(reviewDateHour),
		@"reviewDateMinute": @(reviewDateMinute),
		@"neverReview": @(neverReview),
		@"indexable": @(indexable),
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/add-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addArticleWithGroupId:(long)groupId folderId:(long)folderId classNameId:(long)classNameId classPK:(long)classPK articleId:(NSString *)articleId autoArticleId:(BOOL)autoArticleId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey layoutUuid:(NSString *)layoutUuid displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire reviewDateMonth:(int)reviewDateMonth reviewDateDay:(int)reviewDateDay reviewDateYear:(int)reviewDateYear reviewDateHour:(int)reviewDateHour reviewDateMinute:(int)reviewDateMinute neverReview:(BOOL)neverReview indexable:(BOOL)indexable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile images:(NSDictionary *)images articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"articleId": articleId,
		@"autoArticleId": @(autoArticleId),
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"content": content,
		@"type": type,
		@"ddmStructureKey": ddmStructureKey,
		@"ddmTemplateKey": ddmTemplateKey,
		@"layoutUuid": layoutUuid,
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
		@"reviewDateMonth": @(reviewDateMonth),
		@"reviewDateDay": @(reviewDateDay),
		@"reviewDateYear": @(reviewDateYear),
		@"reviewDateHour": @(reviewDateHour),
		@"reviewDateMinute": @(reviewDateMinute),
		@"neverReview": @(neverReview),
		@"indexable": @(indexable),
		@"smallImage": @(smallImage),
		@"smallImageURL": smallImageURL,
		@"smallFile": smallFile,
		@"images": images,
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/add-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)copyArticleWithGroupId:(long)groupId oldArticleId:(NSString *)oldArticleId newArticleId:(NSString *)newArticleId autoArticleId:(BOOL)autoArticleId version:(double)version error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"oldArticleId": oldArticleId,
		@"newArticleId": newArticleId,
		@"autoArticleId": @(autoArticleId),
		@"version": @(version)
	};

	NSDictionary *_command = @{@"/journalarticle/copy-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteArticleWithGroupId:(long)groupId articleId:(NSString *)articleId articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/delete-article": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteArticleWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"version": @(version),
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/delete-article": _params};

	[self.session invoke:_command error:error];
}

- (void)expireArticleWithGroupId:(long)groupId articleId:(NSString *)articleId articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/expire-article": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)expireArticleWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"version": @(version),
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/expire-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getArticleWithId:(long)id error:(NSError **)error {
	NSDictionary *_params = @{
		@"id": @(id)
	};

	NSDictionary *_command = @{@"/journalarticle/get-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getArticleWithGroupId:(long)groupId articleId:(NSString *)articleId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId
	};

	NSDictionary *_command = @{@"/journalarticle/get-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getArticleWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"version": @(version)
	};

	NSDictionary *_command = @{@"/journalarticle/get-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getArticleWithGroupId:(long)groupId className:(NSString *)className classPK:(long)classPK error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"className": className,
		@"classPK": @(classPK)
	};

	NSDictionary *_command = @{@"/journalarticle/get-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getArticleByUrlTitleWithGroupId:(long)groupId urlTitle:(NSString *)urlTitle error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"urlTitle": urlTitle
	};

	NSDictionary *_command = @{@"/journalarticle/get-article-by-url-title": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSString *)getArticleContentWithGroupId:(long)groupId articleId:(NSString *)articleId languageId:(NSString *)languageId themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"languageId": languageId,
		@"themeDisplay": themeDisplay
	};

	NSDictionary *_command = @{@"/journalarticle/get-article-content": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSString *)getArticleContentWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version languageId:(NSString *)languageId themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"version": @(version),
		@"languageId": languageId,
		@"themeDisplay": themeDisplay
	};

	NSDictionary *_command = @{@"/journalarticle/get-article-content": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSArray *)getArticlesWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getArticlesWithGroupId:(long)groupId folderId:(long)folderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getArticlesByArticleIdWithGroupId:(long)groupId articleId:(NSString *)articleId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-by-article-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getArticlesByLayoutUuidWithGroupId:(long)groupId layoutUuid:(NSString *)layoutUuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"layoutUuid": layoutUuid
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-by-layout-uuid": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getArticlesByStructureIdWithGroupId:(long)groupId ddmStructureKey:(NSString *)ddmStructureKey start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"ddmStructureKey": ddmStructureKey,
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-by-structure-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getArticlesByStructureIdWithGroupId:(long)groupId classNameId:(long)classNameId ddmStructureKey:(NSString *)ddmStructureKey status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"ddmStructureKey": ddmStructureKey,
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-by-structure-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (int)getArticlesCountWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (int)getArticlesCountWithGroupId:(long)groupId folderId:(long)folderId status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (int)getArticlesCountByArticleIdWithGroupId:(long)groupId articleId:(NSString *)articleId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-count-by-article-id": _params};

	return (int)[self.session invoke:_command error:error];
}

- (int)getArticlesCountByStructureIdWithGroupId:(long)groupId ddmStructureKey:(NSString *)ddmStructureKey error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"ddmStructureKey": ddmStructureKey
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-count-by-structure-id": _params};

	return (int)[self.session invoke:_command error:error];
}

- (int)getArticlesCountByStructureIdWithGroupId:(long)groupId classNameId:(long)classNameId ddmStructureKey:(NSString *)ddmStructureKey status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"ddmStructureKey": ddmStructureKey,
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/journalarticle/get-articles-count-by-structure-id": _params};

	return (int)[self.session invoke:_command error:error];
}

- (NSDictionary *)getDisplayArticleByUrlTitleWithGroupId:(long)groupId urlTitle:(NSString *)urlTitle error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"urlTitle": urlTitle
	};

	NSDictionary *_command = @{@"/journalarticle/get-display-article-by-url-title": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (int)getFoldersAndArticlesCountWithGroupId:(long)groupId folderIds:(NSArray *)folderIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderIds": folderIds
	};

	NSDictionary *_command = @{@"/journalarticle/get-folders-and-articles-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupArticlesWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId),
		@"start": @(start),
		@"end": @(end),
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/journalarticle/get-group-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupArticlesWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId status:(int)status start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/journalarticle/get-group-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (int)getGroupArticlesCountWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId)
	};

	NSDictionary *_command = @{@"/journalarticle/get-group-articles-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (int)getGroupArticlesCountWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/journalarticle/get-group-articles-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (NSDictionary *)getLatestArticleWithResourcePrimKey:(long)resourcePrimKey error:(NSError **)error {
	NSDictionary *_params = @{
		@"resourcePrimKey": @(resourcePrimKey)
	};

	NSDictionary *_command = @{@"/journalarticle/get-latest-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getLatestArticleWithGroupId:(long)groupId articleId:(NSString *)articleId status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/journalarticle/get-latest-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getLatestArticleWithGroupId:(long)groupId className:(NSString *)className classPK:(long)classPK error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"className": className,
		@"classPK": @(classPK)
	};

	NSDictionary *_command = @{@"/journalarticle/get-latest-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)moveArticleWithGroupId:(long)groupId articleId:(NSString *)articleId newFolderId:(long)newFolderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"newFolderId": @(newFolderId)
	};

	NSDictionary *_command = @{@"/journalarticle/move-article": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)moveArticleFromTrashWithGroupId:(long)groupId articleId:(NSString *)articleId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"newFolderId": @(newFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/move-article-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveArticleFromTrashWithGroupId:(long)groupId resourcePrimKey:(long)resourcePrimKey newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"resourcePrimKey": @(resourcePrimKey),
		@"newFolderId": @(newFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/move-article-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveArticleToTrashWithGroupId:(long)groupId articleId:(NSString *)articleId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId
	};

	NSDictionary *_command = @{@"/journalarticle/move-article-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)removeArticleLocaleWithCompanyId:(long)companyId languageId:(NSString *)languageId error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"languageId": languageId
	};

	NSDictionary *_command = @{@"/journalarticle/remove-article-locale": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)removeArticleLocaleWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version languageId:(NSString *)languageId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"version": @(version),
		@"languageId": languageId
	};

	NSDictionary *_command = @{@"/journalarticle/remove-article-locale": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)restoreArticleFromTrashWithResourcePrimKey:(long)resourcePrimKey error:(NSError **)error {
	NSDictionary *_params = @{
		@"resourcePrimKey": @(resourcePrimKey)
	};

	NSDictionary *_command = @{@"/journalarticle/restore-article-from-trash": _params};

	[self.session invoke:_command error:error];
}

- (void)restoreArticleFromTrashWithGroupId:(long)groupId articleId:(NSString *)articleId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId
	};

	NSDictionary *_command = @{@"/journalarticle/restore-article-from-trash": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)searchWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId keywords:(NSString *)keywords version:(NSDictionary *)version type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"folderIds": folderIds,
		@"classNameId": @(classNameId),
		@"keywords": keywords,
		@"version": version,
		@"type": type,
		@"ddmStructureKey": ddmStructureKey,
		@"ddmTemplateKey": ddmTemplateKey,
		@"displayDateGT": @(displayDateGT),
		@"displayDateLT": @(displayDateLT),
		@"status": @(status),
		@"reviewDate": @(reviewDate),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalarticle/search": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)searchWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId articleId:(NSString *)articleId version:(NSDictionary *)version title:(NSString *)title description:(NSString *)description content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate andOperator:(BOOL)andOperator start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"folderIds": folderIds,
		@"classNameId": @(classNameId),
		@"articleId": articleId,
		@"version": version,
		@"title": title,
		@"description": description,
		@"content": content,
		@"type": type,
		@"ddmStructureKey": ddmStructureKey,
		@"ddmTemplateKey": ddmTemplateKey,
		@"displayDateGT": @(displayDateGT),
		@"displayDateLT": @(displayDateLT),
		@"status": @(status),
		@"reviewDate": @(reviewDate),
		@"andOperator": @(andOperator),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalarticle/search": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)searchWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId articleId:(NSString *)articleId version:(NSDictionary *)version title:(NSString *)title description:(NSString *)description content:(NSString *)content type:(NSString *)type ddmStructureKeys:(NSArray *)ddmStructureKeys ddmTemplateKeys:(NSArray *)ddmTemplateKeys displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate andOperator:(BOOL)andOperator start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"folderIds": folderIds,
		@"classNameId": @(classNameId),
		@"articleId": articleId,
		@"version": version,
		@"title": title,
		@"description": description,
		@"content": content,
		@"type": type,
		@"ddmStructureKeys": ddmStructureKeys,
		@"ddmTemplateKeys": ddmTemplateKeys,
		@"displayDateGT": @(displayDateGT),
		@"displayDateLT": @(displayDateLT),
		@"status": @(status),
		@"reviewDate": @(reviewDate),
		@"andOperator": @(andOperator),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalarticle/search": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithGroupId:(long)groupId creatorUserId:(long)creatorUserId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"creatorUserId": @(creatorUserId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/journalarticle/search": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (int)searchCountWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId keywords:(NSString *)keywords version:(NSDictionary *)version type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"folderIds": folderIds,
		@"classNameId": @(classNameId),
		@"keywords": keywords,
		@"version": version,
		@"type": type,
		@"ddmStructureKey": ddmStructureKey,
		@"ddmTemplateKey": ddmTemplateKey,
		@"displayDateGT": @(displayDateGT),
		@"displayDateLT": @(displayDateLT),
		@"status": @(status),
		@"reviewDate": @(reviewDate)
	};

	NSDictionary *_command = @{@"/journalarticle/search-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (int)searchCountWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId articleId:(NSString *)articleId version:(NSDictionary *)version title:(NSString *)title description:(NSString *)description content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate andOperator:(BOOL)andOperator error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"folderIds": folderIds,
		@"classNameId": @(classNameId),
		@"articleId": articleId,
		@"version": version,
		@"title": title,
		@"description": description,
		@"content": content,
		@"type": type,
		@"ddmStructureKey": ddmStructureKey,
		@"ddmTemplateKey": ddmTemplateKey,
		@"displayDateGT": @(displayDateGT),
		@"displayDateLT": @(displayDateLT),
		@"status": @(status),
		@"reviewDate": @(reviewDate),
		@"andOperator": @(andOperator)
	};

	NSDictionary *_command = @{@"/journalarticle/search-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (int)searchCountWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId articleId:(NSString *)articleId version:(NSDictionary *)version title:(NSString *)title description:(NSString *)description content:(NSString *)content type:(NSString *)type ddmStructureKeys:(NSArray *)ddmStructureKeys ddmTemplateKeys:(NSArray *)ddmTemplateKeys displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate andOperator:(BOOL)andOperator error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"folderIds": folderIds,
		@"classNameId": @(classNameId),
		@"articleId": articleId,
		@"version": version,
		@"title": title,
		@"description": description,
		@"content": content,
		@"type": type,
		@"ddmStructureKeys": ddmStructureKeys,
		@"ddmTemplateKeys": ddmTemplateKeys,
		@"displayDateGT": @(displayDateGT),
		@"displayDateLT": @(displayDateLT),
		@"status": @(status),
		@"reviewDate": @(reviewDate),
		@"andOperator": @(andOperator)
	};

	NSDictionary *_command = @{@"/journalarticle/search-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (void)subscribeWithGroupId:(long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/journalarticle/subscribe": _params};

	[self.session invoke:_command error:error];
}

- (void)unsubscribeWithGroupId:(long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/journalarticle/unsubscribe": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateArticleWithUserId:(long)userId groupId:(long)groupId folderId:(long)folderId articleId:(NSString *)articleId version:(double)version titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap content:(NSString *)content layoutUuid:(NSString *)layoutUuid serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"articleId": articleId,
		@"version": @(version),
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"content": content,
		@"layoutUuid": layoutUuid,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/update-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateArticleWithGroupId:(long)groupId folderId:(long)folderId articleId:(NSString *)articleId version:(double)version titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey layoutUuid:(NSString *)layoutUuid displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire reviewDateMonth:(int)reviewDateMonth reviewDateDay:(int)reviewDateDay reviewDateYear:(int)reviewDateYear reviewDateHour:(int)reviewDateHour reviewDateMinute:(int)reviewDateMinute neverReview:(BOOL)neverReview indexable:(BOOL)indexable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile images:(NSDictionary *)images articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"articleId": articleId,
		@"version": @(version),
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"content": content,
		@"type": type,
		@"ddmStructureKey": ddmStructureKey,
		@"ddmTemplateKey": ddmTemplateKey,
		@"layoutUuid": layoutUuid,
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
		@"reviewDateMonth": @(reviewDateMonth),
		@"reviewDateDay": @(reviewDateDay),
		@"reviewDateYear": @(reviewDateYear),
		@"reviewDateHour": @(reviewDateHour),
		@"reviewDateMinute": @(reviewDateMinute),
		@"neverReview": @(neverReview),
		@"indexable": @(indexable),
		@"smallImage": @(smallImage),
		@"smallImageURL": smallImageURL,
		@"smallFile": smallFile,
		@"images": images,
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/update-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateArticleWithGroupId:(long)groupId folderId:(long)folderId articleId:(NSString *)articleId version:(double)version content:(NSString *)content serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"articleId": articleId,
		@"version": @(version),
		@"content": content,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/update-article": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateArticleTranslationWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version locale:(NSString *)locale title:(NSString *)title description:(NSString *)description content:(NSString *)content images:(NSDictionary *)images error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"version": @(version),
		@"locale": locale,
		@"title": title,
		@"description": description,
		@"content": content,
		@"images": images
	};

	NSDictionary *_command = @{@"/journalarticle/update-article-translation": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateArticleTranslationWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version locale:(NSString *)locale title:(NSString *)title description:(NSString *)description content:(NSString *)content images:(NSDictionary *)images serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"version": @(version),
		@"locale": locale,
		@"title": title,
		@"description": description,
		@"content": content,
		@"images": images,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/update-article-translation": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateContentWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version content:(NSString *)content error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"version": @(version),
		@"content": content
	};

	NSDictionary *_command = @{@"/journalarticle/update-content": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateStatusWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version status:(int)status articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"articleId": articleId,
		@"version": @(version),
		@"status": @(status),
		@"articleURL": articleURL,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalarticle/update-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end