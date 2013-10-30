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
}

- (NSDictionary *)search:(NSNumber *)groupId creatorUserId:(NSNumber *)creatorUserId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
}

- (NSDictionary *)removeArticleLocale:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version languageId:(NSString *)languageId {
}

- (NSDictionary *)moveArticleFromTrash:(NSNumber *)groupId resourcePrimKey:(NSNumber *)resourcePrimKey newFolderId:(NSNumber *)newFolderId serviceContext:(NSDictionary *)serviceContext {
}

- (NSNumber *)getGroupArticlesCount:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId status:(NSNumber *)status {
}

- (NSArray *)getArticlesByStructureId:(NSNumber *)groupId classNameId:(NSNumber *)classNameId ddmStructureKey:(NSString *)ddmStructureKey status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
}

- (NSArray *)getArticlesByLayoutUuid:(NSNumber *)groupId layoutUuid:(NSString *)layoutUuid {
}

- (NSDictionary *)moveArticleToTrash:(NSNumber *)groupId articleId:(NSString *)articleId {
}

- (void)unsubscribe:(NSNumber *)groupId {
}

- (NSArray *)getGroupArticles:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator {
}

- (void)restoreArticleFromTrash:(NSNumber *)groupId articleId:(NSString *)articleId {
}

- (NSDictionary *)updateArticleTranslation:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version locale:(NSString *)locale title:(NSString *)title description:(NSString *)description content:(NSString *)content images:(NSDictionary *)images serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)getLatestArticle:(NSNumber *)groupId className:(NSString *)className classPK:(NSNumber *)classPK {
}

- (NSDictionary *)copyArticle:(NSNumber *)groupId oldArticleId:(NSString *)oldArticleId newArticleId:(NSString *)newArticleId autoArticleId:(BOOL)autoArticleId version:(NSNumber *)version {
}

- (void)subscribe:(NSNumber *)groupId {
}

- (NSDictionary *)expireArticle:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)getDisplayArticleByUrlTitle:(NSNumber *)groupId urlTitle:(NSString *)urlTitle {
}

- (NSDictionary *)updateContent:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version content:(NSString *)content {
}

- (NSNumber *)getArticlesCountByStructureId:(NSNumber *)groupId classNameId:(NSNumber *)classNameId ddmStructureKey:(NSString *)ddmStructureKey status:(NSNumber *)status {
}

- (NSDictionary *)updateArticle:(NSNumber *)groupId folderId:(NSNumber *)folderId articleId:(NSString *)articleId version:(NSNumber *)version content:(NSString *)content serviceContext:(NSDictionary *)serviceContext {
}

- (NSArray *)getArticles:(NSNumber *)groupId folderId:(NSNumber *)folderId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
}

- (NSNumber *)getFoldersAndArticlesCount:(NSNumber *)groupId folderIds:(NSArray *)folderIds {
}

- (void)deleteArticle:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)getArticle:(NSNumber *)groupId className:(NSString *)className classPK:(NSNumber *)classPK {
}

- (NSDictionary *)addArticle:(NSNumber *)groupId folderId:(NSNumber *)folderId classNameId:(NSNumber *)classNameId classPK:(NSNumber *)classPK articleId:(NSString *)articleId autoArticleId:(BOOL)autoArticleId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey layoutUuid:(NSString *)layoutUuid displayDateMonth:(NSNumber *)displayDateMonth displayDateDay:(NSNumber *)displayDateDay displayDateYear:(NSNumber *)displayDateYear displayDateHour:(NSNumber *)displayDateHour displayDateMinute:(NSNumber *)displayDateMinute expirationDateMonth:(NSNumber *)expirationDateMonth expirationDateDay:(NSNumber *)expirationDateDay expirationDateYear:(NSNumber *)expirationDateYear expirationDateHour:(NSNumber *)expirationDateHour expirationDateMinute:(NSNumber *)expirationDateMinute neverExpire:(BOOL)neverExpire reviewDateMonth:(NSNumber *)reviewDateMonth reviewDateDay:(NSNumber *)reviewDateDay reviewDateYear:(NSNumber *)reviewDateYear reviewDateHour:(NSNumber *)reviewDateHour reviewDateMinute:(NSNumber *)reviewDateMinute neverReview:(BOOL)neverReview indexable:(BOOL)indexable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile images:(NSDictionary *)images articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)getArticleByUrlTitle:(NSNumber *)groupId urlTitle:(NSString *)urlTitle {
}

- (void)moveArticle:(NSNumber *)groupId articleId:(NSString *)articleId newFolderId:(NSNumber *)newFolderId {
}

- (NSString *)getArticleContent:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version languageId:(NSString *)languageId themeDisplay:(NSDictionary *)themeDisplay {
}

- (NSNumber *)searchCount:(NSNumber *)companyId groupId:(NSNumber *)groupId folderIds:(NSArray *)folderIds classNameId:(NSNumber *)classNameId articleId:(NSString *)articleId version:(NSDictionary *)version title:(NSString *)title description:(NSString *)description content:(NSString *)content type:(NSString *)type ddmStructureKeys:(NSArray *)ddmStructureKeys ddmTemplateKeys:(NSArray *)ddmTemplateKeys displayDateGT:(NSNumber *)displayDateGT displayDateLT:(NSNumber *)displayDateLT status:(NSNumber *)status reviewDate:(NSNumber *)reviewDate andOperator:(BOOL)andOperator {
}

- (NSDictionary *)updateStatus:(NSNumber *)groupId articleId:(NSString *)articleId version:(NSNumber *)version status:(NSNumber *)status articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext {
}

- (NSNumber *)getArticlesCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status {
}

- (NSNumber *)getArticlesCountByArticleId:(NSNumber *)groupId articleId:(NSString *)articleId {
}

@end