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

#import <Foundation/Foundation.h>
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface JournalArticleService_v62 : BaseService

- (NSArray *)getArticlesByArticleId:(long)groupId articleId:(NSString *)articleId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSDictionary *)search:(long)groupId creatorUserId:(long)creatorUserId status:(int)status start:(int)start end:(int)end;
- (NSDictionary *)removeArticleLocale:(long)groupId articleId:(NSString *)articleId version:(double)version languageId:(NSString *)languageId;
- (NSDictionary *)moveArticleFromTrash:(long)groupId resourcePrimKey:(long)resourcePrimKey newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext;
- (int)getGroupArticlesCount:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId status:(int)status;
- (NSArray *)getArticlesByStructureId:(long)groupId classNameId:(long)classNameId ddmStructureKey:(NSString *)ddmStructureKey status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSArray *)getArticlesByLayoutUuid:(long)groupId layoutUuid:(NSString *)layoutUuid;
- (NSDictionary *)moveArticleToTrash:(long)groupId articleId:(NSString *)articleId;
- (void)unsubscribe:(long)groupId;
- (NSArray *)getGroupArticles:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId status:(int)status start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator;
- (void)restoreArticleFromTrash:(long)groupId articleId:(NSString *)articleId;
- (NSDictionary *)updateArticleTranslation:(long)groupId articleId:(NSString *)articleId version:(double)version locale:(NSString *)locale title:(NSString *)title description:(NSString *)description content:(NSString *)content images:(NSDictionary *)images serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getLatestArticle:(long)groupId className:(NSString *)className classPK:(long)classPK;
- (NSDictionary *)copyArticle:(long)groupId oldArticleId:(NSString *)oldArticleId newArticleId:(NSString *)newArticleId autoArticleId:(BOOL)autoArticleId version:(double)version;
- (void)subscribe:(long)groupId;
- (NSDictionary *)expireArticle:(long)groupId articleId:(NSString *)articleId version:(double)version articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getDisplayArticleByUrlTitle:(long)groupId urlTitle:(NSString *)urlTitle;
- (NSDictionary *)updateContent:(long)groupId articleId:(NSString *)articleId version:(double)version content:(NSString *)content;
- (int)getArticlesCountByStructureId:(long)groupId classNameId:(long)classNameId ddmStructureKey:(NSString *)ddmStructureKey status:(int)status;
- (NSDictionary *)updateArticle:(long)groupId folderId:(long)folderId articleId:(NSString *)articleId version:(double)version content:(NSString *)content serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getArticles:(long)groupId folderId:(long)folderId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (int)getFoldersAndArticlesCount:(long)groupId folderIds:(NSArray *)folderIds;
- (void)deleteArticle:(long)groupId articleId:(NSString *)articleId version:(double)version articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getArticle:(long)groupId className:(NSString *)className classPK:(long)classPK;
- (NSDictionary *)addArticle:(long)groupId folderId:(long)folderId classNameId:(long)classNameId classPK:(long)classPK articleId:(NSString *)articleId autoArticleId:(BOOL)autoArticleId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey layoutUuid:(NSString *)layoutUuid displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire reviewDateMonth:(int)reviewDateMonth reviewDateDay:(int)reviewDateDay reviewDateYear:(int)reviewDateYear reviewDateHour:(int)reviewDateHour reviewDateMinute:(int)reviewDateMinute neverReview:(BOOL)neverReview indexable:(BOOL)indexable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile images:(NSDictionary *)images articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getArticleByUrlTitle:(long)groupId urlTitle:(NSString *)urlTitle;
- (void)moveArticle:(long)groupId articleId:(NSString *)articleId newFolderId:(long)newFolderId;
- (NSString *)getArticleContent:(long)groupId articleId:(NSString *)articleId version:(double)version languageId:(NSString *)languageId themeDisplay:(NSDictionary *)themeDisplay;
- (int)searchCount:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId articleId:(NSString *)articleId version:(NSDictionary *)version title:(NSString *)title description:(NSString *)description content:(NSString *)content type:(NSString *)type ddmStructureKeys:(NSArray *)ddmStructureKeys ddmTemplateKeys:(NSArray *)ddmTemplateKeys displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate andOperator:(BOOL)andOperator;
- (NSDictionary *)updateStatus:(long)groupId articleId:(NSString *)articleId version:(double)version status:(int)status articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext;
- (int)getArticlesCount:(long)groupId folderId:(long)folderId status:(int)status;
- (int)getArticlesCountByArticleId:(long)groupId articleId:(NSString *)articleId;

@end