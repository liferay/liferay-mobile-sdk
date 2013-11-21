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
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LRJournalArticleService_v62 : LRBaseService

- (NSDictionary *)addArticleWithGroupId:(long)groupId folderId:(long)folderId classNameId:(long)classNameId classPK:(long)classPK articleId:(NSString *)articleId autoArticleId:(BOOL)autoArticleId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey layoutUuid:(NSString *)layoutUuid displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire reviewDateMonth:(int)reviewDateMonth reviewDateDay:(int)reviewDateDay reviewDateYear:(int)reviewDateYear reviewDateHour:(int)reviewDateHour reviewDateMinute:(int)reviewDateMinute neverReview:(BOOL)neverReview indexable:(BOOL)indexable articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addArticleWithGroupId:(long)groupId folderId:(long)folderId classNameId:(long)classNameId classPK:(long)classPK articleId:(NSString *)articleId autoArticleId:(BOOL)autoArticleId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey layoutUuid:(NSString *)layoutUuid displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire reviewDateMonth:(int)reviewDateMonth reviewDateDay:(int)reviewDateDay reviewDateYear:(int)reviewDateYear reviewDateHour:(int)reviewDateHour reviewDateMinute:(int)reviewDateMinute neverReview:(BOOL)neverReview indexable:(BOOL)indexable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile images:(NSDictionary *)images articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)copyArticleWithGroupId:(long)groupId oldArticleId:(NSString *)oldArticleId newArticleId:(NSString *)newArticleId autoArticleId:(BOOL)autoArticleId version:(double)version error:(NSError **)error;
- (void)deleteArticleWithGroupId:(long)groupId articleId:(NSString *)articleId articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteArticleWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)expireArticleWithGroupId:(long)groupId articleId:(NSString *)articleId articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)expireArticleWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)getArticleWithId:(long)id error:(NSError **)error;
- (NSDictionary *)getArticleWithGroupId:(long)groupId articleId:(NSString *)articleId error:(NSError **)error;
- (NSDictionary *)getArticleWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version error:(NSError **)error;
- (NSDictionary *)getArticleWithGroupId:(long)groupId className:(NSString *)className classPK:(long)classPK error:(NSError **)error;
- (NSDictionary *)getArticleByUrlTitleWithGroupId:(long)groupId urlTitle:(NSString *)urlTitle error:(NSError **)error;
- (NSString *)getArticleContentWithGroupId:(long)groupId articleId:(NSString *)articleId languageId:(NSString *)languageId themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error;
- (NSString *)getArticleContentWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version languageId:(NSString *)languageId themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error;
- (NSArray *)getArticlesWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (NSArray *)getArticlesWithGroupId:(long)groupId folderId:(long)folderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getArticlesByArticleIdWithGroupId:(long)groupId articleId:(NSString *)articleId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getArticlesByLayoutUuidWithGroupId:(long)groupId layoutUuid:(NSString *)layoutUuid error:(NSError **)error;
- (NSArray *)getArticlesByStructureIdWithGroupId:(long)groupId ddmStructureKey:(NSString *)ddmStructureKey start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getArticlesByStructureIdWithGroupId:(long)groupId classNameId:(long)classNameId ddmStructureKey:(NSString *)ddmStructureKey status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getArticlesCountWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (int)getArticlesCountWithGroupId:(long)groupId folderId:(long)folderId status:(int)status error:(NSError **)error;
- (int)getArticlesCountByArticleIdWithGroupId:(long)groupId articleId:(NSString *)articleId error:(NSError **)error;
- (int)getArticlesCountByStructureIdWithGroupId:(long)groupId ddmStructureKey:(NSString *)ddmStructureKey error:(NSError **)error;
- (int)getArticlesCountByStructureIdWithGroupId:(long)groupId classNameId:(long)classNameId ddmStructureKey:(NSString *)ddmStructureKey status:(int)status error:(NSError **)error;
- (NSDictionary *)getDisplayArticleByUrlTitleWithGroupId:(long)groupId urlTitle:(NSString *)urlTitle error:(NSError **)error;
- (int)getFoldersAndArticlesCountWithGroupId:(long)groupId folderIds:(NSArray *)folderIds error:(NSError **)error;
- (NSArray *)getGroupArticlesWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error;
- (NSArray *)getGroupArticlesWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId status:(int)status start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error;
- (int)getGroupArticlesCountWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId error:(NSError **)error;
- (int)getGroupArticlesCountWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId status:(int)status error:(NSError **)error;
- (NSDictionary *)getLatestArticleWithResourcePrimKey:(long)resourcePrimKey error:(NSError **)error;
- (NSDictionary *)getLatestArticleWithGroupId:(long)groupId articleId:(NSString *)articleId status:(int)status error:(NSError **)error;
- (NSDictionary *)getLatestArticleWithGroupId:(long)groupId className:(NSString *)className classPK:(long)classPK error:(NSError **)error;
- (void)moveArticleWithGroupId:(long)groupId articleId:(NSString *)articleId newFolderId:(long)newFolderId error:(NSError **)error;
- (NSDictionary *)moveArticleFromTrashWithGroupId:(long)groupId articleId:(NSString *)articleId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)moveArticleFromTrashWithGroupId:(long)groupId resourcePrimKey:(long)resourcePrimKey newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)moveArticleToTrashWithGroupId:(long)groupId articleId:(NSString *)articleId error:(NSError **)error;
- (void)removeArticleLocaleWithCompanyId:(long)companyId languageId:(NSString *)languageId error:(NSError **)error;
- (NSDictionary *)removeArticleLocaleWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version languageId:(NSString *)languageId error:(NSError **)error;
- (void)restoreArticleFromTrashWithResourcePrimKey:(long)resourcePrimKey error:(NSError **)error;
- (void)restoreArticleFromTrashWithGroupId:(long)groupId articleId:(NSString *)articleId error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId keywords:(NSString *)keywords version:(NSDictionary *)version type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId articleId:(NSString *)articleId version:(NSDictionary *)version title:(NSString *)title description:(NSString *)description content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate andOperator:(BOOL)andOperator start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId articleId:(NSString *)articleId version:(NSDictionary *)version title:(NSString *)title description:(NSString *)description content:(NSString *)content type:(NSString *)type ddmStructureKeys:(NSArray *)ddmStructureKeys ddmTemplateKeys:(NSArray *)ddmTemplateKeys displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate andOperator:(BOOL)andOperator start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSDictionary *)searchWithGroupId:(long)groupId creatorUserId:(long)creatorUserId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (int)searchCountWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId keywords:(NSString *)keywords version:(NSDictionary *)version type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate error:(NSError **)error;
- (int)searchCountWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId articleId:(NSString *)articleId version:(NSDictionary *)version title:(NSString *)title description:(NSString *)description content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate andOperator:(BOOL)andOperator error:(NSError **)error;
- (int)searchCountWithCompanyId:(long)companyId groupId:(long)groupId folderIds:(NSArray *)folderIds classNameId:(long)classNameId articleId:(NSString *)articleId version:(NSDictionary *)version title:(NSString *)title description:(NSString *)description content:(NSString *)content type:(NSString *)type ddmStructureKeys:(NSArray *)ddmStructureKeys ddmTemplateKeys:(NSArray *)ddmTemplateKeys displayDateGT:(long)displayDateGT displayDateLT:(long)displayDateLT status:(int)status reviewDate:(long)reviewDate andOperator:(BOOL)andOperator error:(NSError **)error;
- (void)subscribeWithGroupId:(long)groupId error:(NSError **)error;
- (void)unsubscribeWithGroupId:(long)groupId error:(NSError **)error;
- (NSDictionary *)updateArticleWithUserId:(long)userId groupId:(long)groupId folderId:(long)folderId articleId:(NSString *)articleId version:(double)version titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap content:(NSString *)content layoutUuid:(NSString *)layoutUuid serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateArticleWithGroupId:(long)groupId folderId:(long)folderId articleId:(NSString *)articleId version:(double)version titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap content:(NSString *)content type:(NSString *)type ddmStructureKey:(NSString *)ddmStructureKey ddmTemplateKey:(NSString *)ddmTemplateKey layoutUuid:(NSString *)layoutUuid displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire reviewDateMonth:(int)reviewDateMonth reviewDateDay:(int)reviewDateDay reviewDateYear:(int)reviewDateYear reviewDateHour:(int)reviewDateHour reviewDateMinute:(int)reviewDateMinute neverReview:(BOOL)neverReview indexable:(BOOL)indexable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile images:(NSDictionary *)images articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateArticleWithGroupId:(long)groupId folderId:(long)folderId articleId:(NSString *)articleId version:(double)version content:(NSString *)content serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateArticleTranslationWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version locale:(NSString *)locale title:(NSString *)title description:(NSString *)description content:(NSString *)content images:(NSDictionary *)images error:(NSError **)error;
- (NSDictionary *)updateArticleTranslationWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version locale:(NSString *)locale title:(NSString *)title description:(NSString *)description content:(NSString *)content images:(NSDictionary *)images serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateContentWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version content:(NSString *)content error:(NSError **)error;
- (NSDictionary *)updateStatusWithGroupId:(long)groupId articleId:(NSString *)articleId version:(double)version status:(int)status articleURL:(NSString *)articleURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end