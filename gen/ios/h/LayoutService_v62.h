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
@interface LayoutService_v62 : BaseService

- (NSDictionary *)addLayout:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type typeSettings:(NSString *)typeSettings hidden:(BOOL)hidden friendlyURLMap:(NSDictionary *)friendlyURLMap serviceContext:(NSDictionary *)serviceContext;
- (void)setLayouts:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId layoutIds:(NSArray *)layoutIds serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateLayout:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId typeSettings:(NSString *)typeSettings;
- (void)unschedulePublishToRemote:(long)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName;
- (void)importPortletInfo:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file;
- (NSDictionary *)updateLookAndFeel:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId css:(NSString *)css wapTheme:(BOOL)wapTheme;
- (long)exportPortletInfoAsFileInBackground:(NSString *)taskName plid:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate fileName:(NSString *)fileName;
- (NSArray *)getAncestorLayouts:(long)plid;
- (NSDictionary *)updatePriority:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId nextLayoutId:(long)nextLayoutId previousLayoutId:(long)previousLayoutId;
- (NSDictionary *)validateImportPortletInfo:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file;
- (NSDictionary *)getLayoutByUuidAndGroupId:(NSString *)uuid groupId:(long)groupId privateLayout:(BOOL)privateLayout;
- (void)deleteLayout:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)exportPortletInfoAsFile:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate;
- (NSDictionary *)validateImportLayoutsFile:(long)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file;
- (NSDictionary *)updateParentLayoutId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId parentLayoutId:(long)parentLayoutId;
- (NSArray *)exportLayouts:(long)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate;
- (long)getDefaultPlid:(long)groupId scopeGroupId:(long)scopeGroupId privateLayout:(BOOL)privateLayout portletId:(NSString *)portletId;
- (NSArray *)getTempFileEntryNames:(long)groupId tempFolderName:(NSString *)tempFolderName;
- (NSDictionary *)updateName:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId name:(NSString *)name languageId:(NSString *)languageId;
- (long)importPortletInfoInBackground:(NSString *)taskName plid:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file;
- (NSArray *)getLayoutReferences:(long)companyId portletId:(NSString *)portletId preferencesKey:(NSString *)preferencesKey preferencesValue:(NSString *)preferencesValue;
- (void)schedulePublishToRemote:(long)sourceGroupId privateLayout:(BOOL)privateLayout layoutIdMap:(NSDictionary *)layoutIdMap parameterMap:(NSDictionary *)parameterMap remoteAddress:(NSString *)remoteAddress remotePort:(int)remotePort remotePathContext:(NSString *)remotePathContext secureConnection:(BOOL)secureConnection remoteGroupId:(long)remoteGroupId remotePrivateLayout:(BOOL)remotePrivateLayout startDate:(long)startDate endDate:(long)endDate groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(long)schedulerStartDate schedulerEndDate:(long)schedulerEndDate description:(NSString *)description;
- (NSArray *)exportPortletInfo:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate;
- (NSArray *)getLayouts:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId incomplete:(BOOL)incomplete start:(int)start end:(int)end;
- (void)importLayouts:(long)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file;
- (void)deleteTempFileEntry:(long)groupId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName;
- (long)importLayoutsInBackground:(NSString *)taskName groupId:(long)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file;
- (long)exportLayoutsAsFileInBackground:(NSString *)taskName groupId:(long)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate fileName:(NSString *)fileName;
- (void)schedulePublishToLive:(long)sourceGroupId targetGroupId:(long)targetGroupId privateLayout:(BOOL)privateLayout layoutIdMap:(NSDictionary *)layoutIdMap parameterMap:(NSDictionary *)parameterMap scope:(NSString *)scope startDate:(long)startDate endDate:(long)endDate groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(long)schedulerStartDate schedulerEndDate:(long)schedulerEndDate description:(NSString *)description;
- (NSString *)getLayoutName:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId languageId:(NSString *)languageId;
- (NSDictionary *)exportLayoutsAsFile:(long)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate;
- (void)unschedulePublishToLive:(long)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName;

@end