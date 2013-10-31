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

- (NSDictionary *)addLayout:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type typeSettings:(NSString *)typeSettings hidden:(BOOL)hidden friendlyURLMap:(NSDictionary *)friendlyURLMap serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"parentLayoutId": @(parentLayoutId),
		@"localeNamesMap": localeNamesMap,
		@"localeTitlesMap": localeTitlesMap,
		@"descriptionMap": descriptionMap,
		@"keywordsMap": keywordsMap,
		@"robotsMap": robotsMap,
		@"type": type,
		@"typeSettings": typeSettings,
		@"hidden": @(hidden),
		@"friendlyURLMap": friendlyURLMap,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layout/add-layout": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)setLayouts:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId layoutIds:(NSArray *)layoutIds serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"parentLayoutId": @(parentLayoutId),
		@"layoutIds": layoutIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layout/set-layouts": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)updateLayout:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId typeSettings:(NSString *)typeSettings {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutId": @(layoutId),
		@"typeSettings": typeSettings
	};

	NSDictionary *_command = @{@"/layout/update-layout": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)unschedulePublishToRemote:(long)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"jobName": jobName,
		@"groupName": groupName
	};

	NSDictionary *_command = @{@"/layout/unschedule-publish-to-remote": _params};

	[self.session invoke:_command];
}

- (void)importPortletInfo:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"plid": @(plid),
		@"groupId": @(groupId),
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/import-portlet-info": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)updateLookAndFeel:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId css:(NSString *)css wapTheme:(BOOL)wapTheme {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutId": @(layoutId),
		@"themeId": themeId,
		@"colorSchemeId": colorSchemeId,
		@"css": css,
		@"wapTheme": @(wapTheme)
	};

	NSDictionary *_command = @{@"/layout/update-look-and-feel": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (long)exportPortletInfoAsFileInBackground:(NSString *)taskName plid:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate fileName:(NSString *)fileName {
	NSDictionary *_params = @{
		@"taskName": taskName,
		@"plid": @(plid),
		@"groupId": @(groupId),
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"startDate": @(startDate),
		@"endDate": @(endDate),
		@"fileName": fileName
	};

	NSDictionary *_command = @{@"/layout/export-portlet-info-as-file-in-background": _params};

	return (long)[self.session invoke:_command];
}

- (NSArray *)getAncestorLayouts:(long)plid {
	NSDictionary *_params = @{
		@"plid": @(plid)
	};

	NSDictionary *_command = @{@"/layout/get-ancestor-layouts": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)updatePriority:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId nextLayoutId:(long)nextLayoutId previousLayoutId:(long)previousLayoutId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutId": @(layoutId),
		@"nextLayoutId": @(nextLayoutId),
		@"previousLayoutId": @(previousLayoutId)
	};

	NSDictionary *_command = @{@"/layout/update-priority": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)validateImportPortletInfo:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"plid": @(plid),
		@"groupId": @(groupId),
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/validate-import-portlet-info": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getLayoutByUuidAndGroupId:(NSString *)uuid groupId:(long)groupId privateLayout:(BOOL)privateLayout {
	NSDictionary *_params = @{
		@"uuid": uuid,
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout)
	};

	NSDictionary *_command = @{@"/layout/get-layout-by-uuid-and-group-id": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteLayout:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutId": @(layoutId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layout/delete-layout": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)exportPortletInfoAsFile:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate {
	NSDictionary *_params = @{
		@"plid": @(plid),
		@"groupId": @(groupId),
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"startDate": @(startDate),
		@"endDate": @(endDate)
	};

	NSDictionary *_command = @{@"/layout/export-portlet-info-as-file": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)validateImportLayoutsFile:(long)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/validate-import-layouts-file": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)updateParentLayoutId:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId parentLayoutId:(long)parentLayoutId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutId": @(layoutId),
		@"parentLayoutId": @(parentLayoutId)
	};

	NSDictionary *_command = @{@"/layout/update-parent-layout-id": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)exportLayouts:(long)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutIds": layoutIds,
		@"parameterMap": parameterMap,
		@"startDate": @(startDate),
		@"endDate": @(endDate)
	};

	NSDictionary *_command = @{@"/layout/export-layouts": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (long)getDefaultPlid:(long)groupId scopeGroupId:(long)scopeGroupId privateLayout:(BOOL)privateLayout portletId:(NSString *)portletId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"scopeGroupId": @(scopeGroupId),
		@"privateLayout": @(privateLayout),
		@"portletId": portletId
	};

	NSDictionary *_command = @{@"/layout/get-default-plid": _params};

	return (long)[self.session invoke:_command];
}

- (NSArray *)getTempFileEntryNames:(long)groupId tempFolderName:(NSString *)tempFolderName {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/layout/get-temp-file-entry-names": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)updateName:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId name:(NSString *)name languageId:(NSString *)languageId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutId": @(layoutId),
		@"name": name,
		@"languageId": languageId
	};

	NSDictionary *_command = @{@"/layout/update-name": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (long)importPortletInfoInBackground:(NSString *)taskName plid:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"taskName": taskName,
		@"plid": @(plid),
		@"groupId": @(groupId),
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/import-portlet-info-in-background": _params};

	return (long)[self.session invoke:_command];
}

- (NSArray *)getLayoutReferences:(long)companyId portletId:(NSString *)portletId preferencesKey:(NSString *)preferencesKey preferencesValue:(NSString *)preferencesValue {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"portletId": portletId,
		@"preferencesKey": preferencesKey,
		@"preferencesValue": preferencesValue
	};

	NSDictionary *_command = @{@"/layout/get-layout-references": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)schedulePublishToRemote:(long)sourceGroupId privateLayout:(BOOL)privateLayout layoutIdMap:(NSDictionary *)layoutIdMap parameterMap:(NSDictionary *)parameterMap remoteAddress:(NSString *)remoteAddress remotePort:(int)remotePort remotePathContext:(NSString *)remotePathContext secureConnection:(BOOL)secureConnection remoteGroupId:(long)remoteGroupId remotePrivateLayout:(BOOL)remotePrivateLayout startDate:(long)startDate endDate:(long)endDate groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(long)schedulerStartDate schedulerEndDate:(long)schedulerEndDate description:(NSString *)description {
	NSDictionary *_params = @{
		@"sourceGroupId": @(sourceGroupId),
		@"privateLayout": @(privateLayout),
		@"layoutIdMap": layoutIdMap,
		@"parameterMap": parameterMap,
		@"remoteAddress": remoteAddress,
		@"remotePort": @(remotePort),
		@"remotePathContext": remotePathContext,
		@"secureConnection": @(secureConnection),
		@"remoteGroupId": @(remoteGroupId),
		@"remotePrivateLayout": @(remotePrivateLayout),
		@"startDate": @(startDate),
		@"endDate": @(endDate),
		@"groupName": groupName,
		@"cronText": cronText,
		@"schedulerStartDate": @(schedulerStartDate),
		@"schedulerEndDate": @(schedulerEndDate),
		@"description": description
	};

	NSDictionary *_command = @{@"/layout/schedule-publish-to-remote": _params};

	[self.session invoke:_command];
}

- (NSArray *)exportPortletInfo:(long)plid groupId:(long)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate {
	NSDictionary *_params = @{
		@"plid": @(plid),
		@"groupId": @(groupId),
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"startDate": @(startDate),
		@"endDate": @(endDate)
	};

	NSDictionary *_command = @{@"/layout/export-portlet-info": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getLayouts:(long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long)parentLayoutId incomplete:(BOOL)incomplete start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"parentLayoutId": @(parentLayoutId),
		@"incomplete": @(incomplete),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/layout/get-layouts": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)importLayouts:(long)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/import-layouts": _params};

	[self.session invoke:_command];
}

- (void)deleteTempFileEntry:(long)groupId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"fileName": fileName,
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/layout/delete-temp-file-entry": _params};

	[self.session invoke:_command];
}

- (long)importLayoutsInBackground:(NSString *)taskName groupId:(long)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"taskName": taskName,
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/import-layouts-in-background": _params};

	return (long)[self.session invoke:_command];
}

- (long)exportLayoutsAsFileInBackground:(NSString *)taskName groupId:(long)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate fileName:(NSString *)fileName {
	NSDictionary *_params = @{
		@"taskName": taskName,
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutIds": layoutIds,
		@"parameterMap": parameterMap,
		@"startDate": @(startDate),
		@"endDate": @(endDate),
		@"fileName": fileName
	};

	NSDictionary *_command = @{@"/layout/export-layouts-as-file-in-background": _params};

	return (long)[self.session invoke:_command];
}

- (void)schedulePublishToLive:(long)sourceGroupId targetGroupId:(long)targetGroupId privateLayout:(BOOL)privateLayout layoutIdMap:(NSDictionary *)layoutIdMap parameterMap:(NSDictionary *)parameterMap scope:(NSString *)scope startDate:(long)startDate endDate:(long)endDate groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(long)schedulerStartDate schedulerEndDate:(long)schedulerEndDate description:(NSString *)description {
	NSDictionary *_params = @{
		@"sourceGroupId": @(sourceGroupId),
		@"targetGroupId": @(targetGroupId),
		@"privateLayout": @(privateLayout),
		@"layoutIdMap": layoutIdMap,
		@"parameterMap": parameterMap,
		@"scope": scope,
		@"startDate": @(startDate),
		@"endDate": @(endDate),
		@"groupName": groupName,
		@"cronText": cronText,
		@"schedulerStartDate": @(schedulerStartDate),
		@"schedulerEndDate": @(schedulerEndDate),
		@"description": description
	};

	NSDictionary *_command = @{@"/layout/schedule-publish-to-live": _params};

	[self.session invoke:_command];
}

- (NSString *)getLayoutName:(long)groupId privateLayout:(BOOL)privateLayout layoutId:(long)layoutId languageId:(NSString *)languageId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutId": @(layoutId),
		@"languageId": languageId
	};

	NSDictionary *_command = @{@"/layout/get-layout-name": _params};

	return (NSString *)[self.session invoke:_command];
}

- (NSDictionary *)exportLayoutsAsFile:(long)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(long)startDate endDate:(long)endDate {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"layoutIds": layoutIds,
		@"parameterMap": parameterMap,
		@"startDate": @(startDate),
		@"endDate": @(endDate)
	};

	NSDictionary *_command = @{@"/layout/export-layouts-as-file": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)unschedulePublishToLive:(long)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"jobName": jobName,
		@"groupName": groupName
	};

	NSDictionary *_command = @{@"/layout/unschedule-publish-to-live": _params};

	[self.session invoke:_command];
}

@end