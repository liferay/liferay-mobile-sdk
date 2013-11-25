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
@interface LRLayoutService_v62 : LRBaseService

- (NSDictionary *)addLayoutWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId name:(NSString *)name title:(NSString *)title description:(NSString *)description type:(NSString *)type hidden:(BOOL)hidden friendlyURL:(NSString *)friendlyURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type hidden:(BOOL)hidden friendlyURL:(NSString *)friendlyURL serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type typeSettings:(NSString *)typeSettings hidden:(BOOL)hidden friendlyURLMap:(NSDictionary *)friendlyURLMap serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteLayoutWithPlid:(long)plid serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteLayoutWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteTempFileEntryWithGroupId:(long)groupId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName error:(NSError **)error;
- (NSArray *)exportLayoutsWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate error:(NSError **)error;
- (NSArray *)exportLayoutsWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate error:(NSError **)error;
- (NSDictionary *)exportLayoutsAsFileWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate error:(NSError **)error;
- (NSNumber *)exportLayoutsAsFileInBackgroundWithTaskName:(NSString *)taskName groupId:(long)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate fileName:(NSString *)fileName error:(NSError **)error;
- (NSArray *)exportPortletInfoWithCompanyId:(long)companyId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate error:(NSError **)error;
- (NSArray *)exportPortletInfoWithPlid:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate error:(NSError **)error;
- (NSDictionary *)exportPortletInfoAsFileWithPortletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate error:(NSError **)error;
- (NSDictionary *)exportPortletInfoAsFileWithPlid:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate error:(NSError **)error;
- (NSNumber *)exportPortletInfoAsFileInBackgroundWithTaskName:(NSString *)taskName portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate fileName:(NSString *)fileName error:(NSError **)error;
- (NSNumber *)exportPortletInfoAsFileInBackgroundWithTaskName:(NSString *)taskName plid:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate fileName:(NSString *)fileName error:(NSError **)error;
- (NSArray *)getAncestorLayoutsWithPlid:(long)plid error:(NSError **)error;
- (NSNumber *)getDefaultPlidWithGroupId:(long)groupId scopeGroupId:(long)scopeGroupId portletId:(NSString *)portletId error:(NSError **)error;
- (NSNumber *)getDefaultPlidWithGroupId:(long)groupId scopeGroupId:(long)scopeGroupId privateLayout:(BOOL)privateLayout portletId:(NSString *)portletId error:(NSError **)error;
- (NSDictionary *)getLayoutByUuidAndGroupIdWithUuid:(NSString *)uuid groupId:(long)groupId privateLayout:(BOOL)privateLayout error:(NSError **)error;
- (NSString *)getLayoutNameWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId languageId:(NSString *)languageId error:(NSError **)error;
- (NSArray *)getLayoutReferencesWithCompanyId:(long)companyId portletId:(NSString *)portletId preferencesKey:(NSString *)preferencesKey preferencesValue:(NSString *)preferencesValue error:(NSError **)error;
- (NSArray *)getLayoutsWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout error:(NSError **)error;
- (NSArray *)getLayoutsWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId error:(NSError **)error;
- (NSArray *)getLayoutsWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId incomplete:(BOOL)incomplete start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getTempFileEntryNamesWithGroupId:(long)groupId tempFolderName:(NSString *)tempFolderName error:(NSError **)error;
- (void)importLayoutsWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap bytes:(NSArray *)bytes error:(NSError **)error;
- (void)importLayoutsWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file error:(NSError **)error;
- (NSNumber *)importLayoutsInBackgroundWithTaskName:(NSString *)taskName groupId:(long)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file error:(NSError **)error;
- (void)importPortletInfoWithPortletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file error:(NSError **)error;
- (void)importPortletInfoWithPlid:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file error:(NSError **)error;
- (void)importPortletInfoInBackgroundWithTaskName:(NSString *)taskName portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file error:(NSError **)error;
- (NSNumber *)importPortletInfoInBackgroundWithTaskName:(NSString *)taskName plid:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file error:(NSError **)error;
- (void)schedulePublishToLiveWithSourceGroupId:(long)sourceGroupId targetGroupId:(long)targetGroupId privateLayout:(BOOL)privateLayout layoutIdMap:(NSDictionary *)layoutIdMap parameterMap:(NSDictionary *)parameterMap scope:(NSString *)scope startDate:(long)startDate endDate:(long)endDate groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(long)schedulerStartDate schedulerEndDate:(long)schedulerEndDate description:(NSString *)description error:(NSError **)error;
- (void)schedulePublishToRemoteWithSourceGroupId:(long)sourceGroupId privateLayout:(BOOL)privateLayout layoutIdMap:(NSDictionary *)layoutIdMap parameterMap:(NSDictionary *)parameterMap remoteAddress:(NSString *)remoteAddress remotePort:(int)remotePort remotePathContext:(NSString *)remotePathContext secureConnection:(BOOL)secureConnection remoteGroupId:(long)remoteGroupId remotePrivateLayout:(BOOL)remotePrivateLayout startDate:(long)startDate endDate:(long)endDate groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(long)schedulerStartDate schedulerEndDate:(long)schedulerEndDate description:(NSString *)description error:(NSError **)error;
- (void)setLayoutsWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId layoutIds:(NSArray *)layoutIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)unschedulePublishToLiveWithGroupId:(long)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName error:(NSError **)error;
- (void)unschedulePublishToRemoteWithGroupId:(long)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName error:(NSError **)error;
- (NSDictionary *)updateLayoutWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId parentLayoutId:(long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type hidden:(BOOL)hidden friendlyURL:(NSString *)friendlyURL iconImage:(NSDictionary *)iconImage iconBytes:(NSArray *)iconBytes serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateLayoutWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId parentLayoutId:(long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type hidden:(BOOL)hidden friendlyURLMap:(NSDictionary *)friendlyURLMap iconImage:(NSDictionary *)iconImage iconBytes:(NSArray *)iconBytes serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateLayoutWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId typeSettings:(NSString *)typeSettings error:(NSError **)error;
- (NSDictionary *)updateLookAndFeelWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId css:(NSString *)css wapTheme:(BOOL)wapTheme error:(NSError **)error;
- (NSDictionary *)updateNameWithPlid:(long)plid name:(NSString *)name languageId:(NSString *)languageId error:(NSError **)error;
- (NSDictionary *)updateNameWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId name:(NSString *)name languageId:(NSString *)languageId error:(NSError **)error;
- (NSDictionary *)updateParentLayoutIdWithPlid:(long)plid parentPlid:(long)parentPlid error:(NSError **)error;
- (NSDictionary *)updateParentLayoutIdWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId parentLayoutId:(long)parentLayoutId error:(NSError **)error;
- (NSDictionary *)updatePriorityWithPlid:(long)plid priority:(int)priority error:(NSError **)error;
- (NSDictionary *)updatePriorityWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId priority:(int)priority error:(NSError **)error;
- (NSDictionary *)updatePriorityWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId nextLayoutId:(long)nextLayoutId previousLayoutId:(long)previousLayoutId error:(NSError **)error;
- (NSDictionary *)validateImportLayoutsFileWithGroupId:(long)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file error:(NSError **)error;
- (NSDictionary *)validateImportPortletInfoWithPlid:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file error:(NSError **)error;

@end