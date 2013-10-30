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

#import "LayoutService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LayoutService_v62

- (NSDictionary *)addLayout:(NSNumber *)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(NSNumber *)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type typeSettings:(NSString *)typeSettings hidden:(BOOL)hidden friendlyURLMap:(NSDictionary *)friendlyURLMap serviceContext:(NSDictionary *)serviceContext {
}

- (void)setLayouts:(NSNumber *)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(NSNumber *)parentLayoutId layoutIds:(NSArray *)layoutIds serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)updateLayout:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId typeSettings:(NSString *)typeSettings {
}

- (void)unschedulePublishToRemote:(NSNumber *)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName {
}

- (void)importPortletInfo:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
}

- (NSDictionary *)updateLookAndFeel:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId css:(NSString *)css wapTheme:(BOOL)wapTheme {
}

- (NSNumber *)exportPortletInfoAsFileInBackground:(NSString *)taskName plid:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate fileName:(NSString *)fileName {
}

- (NSArray *)getAncestorLayouts:(NSNumber *)plid {
}

- (NSDictionary *)updatePriority:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId nextLayoutId:(NSNumber *)nextLayoutId previousLayoutId:(NSNumber *)previousLayoutId {
}

- (NSDictionary *)validateImportPortletInfo:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
}

- (NSDictionary *)getLayoutByUuidAndGroupId:(NSString *)uuid groupId:(NSNumber *)groupId privateLayout:(BOOL)privateLayout {
}

- (void)deleteLayout:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)exportPortletInfoAsFile:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate {
}

- (NSDictionary *)validateImportLayoutsFile:(NSNumber *)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
}

- (NSDictionary *)updateParentLayoutId:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId parentLayoutId:(NSNumber *)parentLayoutId {
}

- (NSArray *)exportLayouts:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate {
}

- (NSNumber *)getDefaultPlid:(NSNumber *)groupId scopeGroupId:(NSNumber *)scopeGroupId privateLayout:(BOOL)privateLayout portletId:(NSString *)portletId {
}

- (NSArray *)getTempFileEntryNames:(NSNumber *)groupId tempFolderName:(NSString *)tempFolderName {
}

- (NSDictionary *)updateName:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId name:(NSString *)name languageId:(NSString *)languageId {
}

- (NSNumber *)importPortletInfoInBackground:(NSString *)taskName plid:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
}

- (NSArray *)getLayoutReferences:(NSNumber *)companyId portletId:(NSString *)portletId preferencesKey:(NSString *)preferencesKey preferencesValue:(NSString *)preferencesValue {
}

- (void)schedulePublishToRemote:(NSNumber *)sourceGroupId privateLayout:(BOOL)privateLayout layoutIdMap:(NSDictionary *)layoutIdMap parameterMap:(NSDictionary *)parameterMap remoteAddress:(NSString *)remoteAddress remotePort:(NSNumber *)remotePort remotePathContext:(NSString *)remotePathContext secureConnection:(BOOL)secureConnection remoteGroupId:(NSNumber *)remoteGroupId remotePrivateLayout:(BOOL)remotePrivateLayout startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(NSNumber *)schedulerStartDate schedulerEndDate:(NSNumber *)schedulerEndDate description:(NSString *)description {
}

- (NSArray *)exportPortletInfo:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate {
}

- (NSArray *)getLayouts:(NSNumber *)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(NSNumber *)parentLayoutId incomplete:(BOOL)incomplete start:(NSNumber *)start end:(NSNumber *)end {
}

- (void)importLayouts:(NSNumber *)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
}

- (void)deleteTempFileEntry:(NSNumber *)groupId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName {
}

- (NSNumber *)importLayoutsInBackground:(NSString *)taskName groupId:(NSNumber *)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
}

- (NSNumber *)exportLayoutsAsFileInBackground:(NSString *)taskName groupId:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate fileName:(NSString *)fileName {
}

- (void)schedulePublishToLive:(NSNumber *)sourceGroupId targetGroupId:(NSNumber *)targetGroupId privateLayout:(BOOL)privateLayout layoutIdMap:(NSDictionary *)layoutIdMap parameterMap:(NSDictionary *)parameterMap scope:(NSString *)scope startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(NSNumber *)schedulerStartDate schedulerEndDate:(NSNumber *)schedulerEndDate description:(NSString *)description {
}

- (NSString *)getLayoutName:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId languageId:(NSString *)languageId {
}

- (NSDictionary *)exportLayoutsAsFile:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate {
}

- (void)unschedulePublishToLive:(NSNumber *)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName {
}

@end