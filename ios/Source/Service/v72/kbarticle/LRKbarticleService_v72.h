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
@interface LRKbarticleService_v72 : LRBaseService

- (NSDictionary *)deleteKbArticleWithResourcePrimKey:(long long)resourcePrimKey error:(NSError **)error;
- (void)unsubscribeGroupKbArticlesWithGroupId:(long long)groupId portletId:(NSString *)portletId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)subscribeGroupKbArticlesWithGroupId:(long long)groupId portletId:(NSString *)portletId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSString *)getGroupKbArticlesRssWithStatus:(int)status rssDelta:(int)rssDelta rssDisplayStyle:(NSString *)rssDisplayStyle rssFormat:(NSString *)rssFormat themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error;
- (NSString *)getKbArticleRssWithResourcePrimKey:(long long)resourcePrimKey status:(int)status rssDelta:(int)rssDelta rssDisplayStyle:(NSString *)rssDisplayStyle rssFormat:(NSString *)rssFormat themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error;
- (NSDictionary *)getKbArticleSearchDisplayWithGroupId:(long long)groupId title:(NSString *)title content:(NSString *)content status:(int)status startDate:(long long)startDate endDate:(long long)endDate andOperator:(BOOL)andOperator curStartValues:(NSArray *)curStartValues cur:(int)cur delta:(int)delta orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getKbArticleVersionsWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (void)deleteTempAttachmentWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getTempAttachmentNamesWithGroupId:(long long)groupId tempFolderName:(NSString *)tempFolderName error:(NSError **)error;
- (void)deleteKbArticlesWithGroupId:(long long)groupId resourcePrimKeys:(NSArray *)resourcePrimKeys error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchFirstChildKbArticleWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status error:(NSError **)error;
- (NSDictionary *)fetchFirstChildKbArticleWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey error:(NSError **)error;
- (NSDictionary *)fetchKbArticleByUrlTitleWithGroupId:(long long)groupId kbFolderId:(long long)kbFolderId urlTitle:(NSString *)urlTitle error:(NSError **)error;
- (NSDictionary *)fetchLatestKbArticleWithResourcePrimKey:(long long)resourcePrimKey status:(int)status error:(NSError **)error;
- (NSDictionary *)fetchLatestKbArticleByUrlTitleWithGroupId:(long long)groupId kbFolderId:(long long)kbFolderId urlTitle:(NSString *)urlTitle status:(int)status error:(NSError **)error;
- (NSArray *)getAllDescendantKbArticlesWithResourcePrimKey:(long long)resourcePrimKey status:(int)status orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getAllDescendantKbArticlesWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey status:(int)status orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getGroupKbArticlesWithGroupId:(long long)groupId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getGroupKbArticlesCountWithGroupId:(long long)groupId status:(int)status error:(NSError **)error;
- (NSArray *)getKbArticleAndAllDescendantKbArticlesWithResourcePrimKey:(long long)resourcePrimKey status:(int)status orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getKbArticleAndAllDescendantsWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey status:(int)status orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getKbArticlesWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getKbArticlesWithGroupId:(long long)groupId resourcePrimKeys:(NSArray *)resourcePrimKeys status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getKbArticlesWithGroupId:(long long)groupId resourcePrimKeys:(NSArray *)resourcePrimKeys status:(int)status orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getKbArticlesCountWithGroupId:(long long)groupId resourcePrimKeys:(NSArray *)resourcePrimKeys status:(int)status error:(NSError **)error;
- (NSNumber *)getKbArticlesCountWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status error:(NSError **)error;
- (NSNumber *)getKbArticleVersionsCountWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey status:(int)status error:(NSError **)error;
- (NSArray *)getPreviousAndNextKbArticlesWithKbArticleId:(long long)kbArticleId error:(NSError **)error;
- (NSArray *)getSectionsKbArticlesWithGroupId:(long long)groupId sections:(NSArray *)sections status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getSectionsKbArticlesCountWithGroupId:(long long)groupId sections:(NSArray *)sections status:(int)status error:(NSError **)error;
- (NSArray *)getSiblingKbArticlesWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getSiblingKbArticlesCountWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status error:(NSError **)error;
- (void)moveKbArticleWithResourcePrimKey:(long long)resourcePrimKey parentResourceClassNameId:(long long)parentResourceClassNameId parentResourcePrimKey:(long long)parentResourcePrimKey priority:(double)priority error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)revertKbArticleWithResourcePrimKey:(long long)resourcePrimKey version:(int)version serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)subscribeKbArticleWithGroupId:(long long)groupId resourcePrimKey:(long long)resourcePrimKey error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unsubscribeKbArticleWithResourcePrimKey:(long long)resourcePrimKey error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)updateKbArticlesPrioritiesWithGroupId:(long long)groupId resourcePrimKeyToPriorityMap:(NSDictionary *)resourcePrimKeyToPriorityMap error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)getLatestKbArticleWithResourcePrimKey:(long long)resourcePrimKey status:(int)status error:(NSError **)error;
- (NSDictionary *)addKbArticleWithPortletId:(NSString *)portletId parentResourceClassNameId:(long long)parentResourceClassNameId parentResourcePrimKey:(long long)parentResourcePrimKey title:(NSString *)title urlTitle:(NSString *)urlTitle content:(NSString *)content description:(NSString *)description sourceURL:(NSString *)sourceURL sections:(NSArray *)sections selectedFileNames:(NSArray *)selectedFileNames serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateKbArticleWithResourcePrimKey:(long long)resourcePrimKey title:(NSString *)title content:(NSString *)content description:(NSString *)description sourceURL:(NSString *)sourceURL sections:(NSArray *)sections selectedFileNames:(NSArray *)selectedFileNames removeFileEntryIds:(NSArray *)removeFileEntryIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getKbArticleWithResourcePrimKey:(long long)resourcePrimKey version:(int)version error:(NSError **)error;

@end