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
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"parentLayoutId": parentLayoutId,
		@"localeNamesMap": localeNamesMap,
		@"localeTitlesMap": localeTitlesMap,
		@"descriptionMap": descriptionMap,
		@"keywordsMap": keywordsMap,
		@"robotsMap": robotsMap,
		@"type": type,
		@"typeSettings": typeSettings,
		@"hidden": hidden,
		@"friendlyURLMap": friendlyURLMap,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layout/add-layout": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)setLayouts:(NSNumber *)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(NSNumber *)parentLayoutId layoutIds:(NSArray *)layoutIds serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"parentLayoutId": parentLayoutId,
		@"layoutIds": layoutIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layout/set-layouts": _params};

	[session invoke:_command];
}

- (NSDictionary *)updateLayout:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId typeSettings:(NSString *)typeSettings {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"layoutId": layoutId,
		@"typeSettings": typeSettings
	};

	NSDictionary *_command = @{@"/layout/update-layout": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)unschedulePublishToRemote:(NSNumber *)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"jobName": jobName,
		@"groupName": groupName
	};

	NSDictionary *_command = @{@"/layout/unschedule-publish-to-remote": _params};

	[session invoke:_command];
}

- (void)importPortletInfo:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"plid": plid,
		@"groupId": groupId,
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/import-portlet-info": _params};

	[session invoke:_command];
}

- (NSDictionary *)updateLookAndFeel:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId css:(NSString *)css wapTheme:(BOOL)wapTheme {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"layoutId": layoutId,
		@"themeId": themeId,
		@"colorSchemeId": colorSchemeId,
		@"css": css,
		@"wapTheme": wapTheme
	};

	NSDictionary *_command = @{@"/layout/update-look-and-feel": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)exportPortletInfoAsFileInBackground:(NSString *)taskName plid:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate fileName:(NSString *)fileName {
	NSDictionary *_params = @{
		@"taskName": taskName,
		@"plid": plid,
		@"groupId": groupId,
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"startDate": startDate,
		@"endDate": endDate,
		@"fileName": fileName
	};

	NSDictionary *_command = @{@"/layout/export-portlet-info-as-file-in-background": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getAncestorLayouts:(NSNumber *)plid {
	NSDictionary *_params = @{
		@"plid": plid
	};

	NSDictionary *_command = @{@"/layout/get-ancestor-layouts": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updatePriority:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId nextLayoutId:(NSNumber *)nextLayoutId previousLayoutId:(NSNumber *)previousLayoutId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"layoutId": layoutId,
		@"nextLayoutId": nextLayoutId,
		@"previousLayoutId": previousLayoutId
	};

	NSDictionary *_command = @{@"/layout/update-priority": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)validateImportPortletInfo:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"plid": plid,
		@"groupId": groupId,
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/validate-import-portlet-info": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getLayoutByUuidAndGroupId:(NSString *)uuid groupId:(NSNumber *)groupId privateLayout:(BOOL)privateLayout {
	NSDictionary *_params = @{
		@"uuid": uuid,
		@"groupId": groupId,
		@"privateLayout": privateLayout
	};

	NSDictionary *_command = @{@"/layout/get-layout-by-uuid-and-group-id": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteLayout:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"layoutId": layoutId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layout/delete-layout": _params};

	[session invoke:_command];
}

- (NSDictionary *)exportPortletInfoAsFile:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate {
	NSDictionary *_params = @{
		@"plid": plid,
		@"groupId": groupId,
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"startDate": startDate,
		@"endDate": endDate
	};

	NSDictionary *_command = @{@"/layout/export-portlet-info-as-file": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)validateImportLayoutsFile:(NSNumber *)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/validate-import-layouts-file": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateParentLayoutId:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId parentLayoutId:(NSNumber *)parentLayoutId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"layoutId": layoutId,
		@"parentLayoutId": parentLayoutId
	};

	NSDictionary *_command = @{@"/layout/update-parent-layout-id": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)exportLayouts:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"layoutIds": layoutIds,
		@"parameterMap": parameterMap,
		@"startDate": startDate,
		@"endDate": endDate
	};

	NSDictionary *_command = @{@"/layout/export-layouts": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getDefaultPlid:(NSNumber *)groupId scopeGroupId:(NSNumber *)scopeGroupId privateLayout:(BOOL)privateLayout portletId:(NSString *)portletId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"scopeGroupId": scopeGroupId,
		@"privateLayout": privateLayout,
		@"portletId": portletId
	};

	NSDictionary *_command = @{@"/layout/get-default-plid": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getTempFileEntryNames:(NSNumber *)groupId tempFolderName:(NSString *)tempFolderName {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/layout/get-temp-file-entry-names": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updateName:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId name:(NSString *)name languageId:(NSString *)languageId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"layoutId": layoutId,
		@"name": name,
		@"languageId": languageId
	};

	NSDictionary *_command = @{@"/layout/update-name": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)importPortletInfoInBackground:(NSString *)taskName plid:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"taskName": taskName,
		@"plid": plid,
		@"groupId": groupId,
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/import-portlet-info-in-background": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getLayoutReferences:(NSNumber *)companyId portletId:(NSString *)portletId preferencesKey:(NSString *)preferencesKey preferencesValue:(NSString *)preferencesValue {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"portletId": portletId,
		@"preferencesKey": preferencesKey,
		@"preferencesValue": preferencesValue
	};

	NSDictionary *_command = @{@"/layout/get-layout-references": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)schedulePublishToRemote:(NSNumber *)sourceGroupId privateLayout:(BOOL)privateLayout layoutIdMap:(NSDictionary *)layoutIdMap parameterMap:(NSDictionary *)parameterMap remoteAddress:(NSString *)remoteAddress remotePort:(NSNumber *)remotePort remotePathContext:(NSString *)remotePathContext secureConnection:(BOOL)secureConnection remoteGroupId:(NSNumber *)remoteGroupId remotePrivateLayout:(BOOL)remotePrivateLayout startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(NSNumber *)schedulerStartDate schedulerEndDate:(NSNumber *)schedulerEndDate description:(NSString *)description {
	NSDictionary *_params = @{
		@"sourceGroupId": sourceGroupId,
		@"privateLayout": privateLayout,
		@"layoutIdMap": layoutIdMap,
		@"parameterMap": parameterMap,
		@"remoteAddress": remoteAddress,
		@"remotePort": remotePort,
		@"remotePathContext": remotePathContext,
		@"secureConnection": secureConnection,
		@"remoteGroupId": remoteGroupId,
		@"remotePrivateLayout": remotePrivateLayout,
		@"startDate": startDate,
		@"endDate": endDate,
		@"groupName": groupName,
		@"cronText": cronText,
		@"schedulerStartDate": schedulerStartDate,
		@"schedulerEndDate": schedulerEndDate,
		@"description": description
	};

	NSDictionary *_command = @{@"/layout/schedule-publish-to-remote": _params};

	[session invoke:_command];
}

- (NSArray *)exportPortletInfo:(NSNumber *)plid groupId:(NSNumber *)groupId portletId:(NSString *)portletId parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate {
	NSDictionary *_params = @{
		@"plid": plid,
		@"groupId": groupId,
		@"portletId": portletId,
		@"parameterMap": parameterMap,
		@"startDate": startDate,
		@"endDate": endDate
	};

	NSDictionary *_command = @{@"/layout/export-portlet-info": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getLayouts:(NSNumber *)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(NSNumber *)parentLayoutId incomplete:(BOOL)incomplete start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"parentLayoutId": parentLayoutId,
		@"incomplete": incomplete,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/layout/get-layouts": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)importLayouts:(NSNumber *)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/import-layouts": _params};

	[session invoke:_command];
}

- (void)deleteTempFileEntry:(NSNumber *)groupId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"fileName": fileName,
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/layout/delete-temp-file-entry": _params};

	[session invoke:_command];
}

- (NSNumber *)importLayoutsInBackground:(NSString *)taskName groupId:(NSNumber *)groupId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"taskName": taskName,
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"parameterMap": parameterMap,
		@"file": file
	};

	NSDictionary *_command = @{@"/layout/import-layouts-in-background": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSNumber *)exportLayoutsAsFileInBackground:(NSString *)taskName groupId:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate fileName:(NSString *)fileName {
	NSDictionary *_params = @{
		@"taskName": taskName,
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"layoutIds": layoutIds,
		@"parameterMap": parameterMap,
		@"startDate": startDate,
		@"endDate": endDate,
		@"fileName": fileName
	};

	NSDictionary *_command = @{@"/layout/export-layouts-as-file-in-background": _params};

	return (NSNumber *)[session invoke:_command];
}

- (void)schedulePublishToLive:(NSNumber *)sourceGroupId targetGroupId:(NSNumber *)targetGroupId privateLayout:(BOOL)privateLayout layoutIdMap:(NSDictionary *)layoutIdMap parameterMap:(NSDictionary *)parameterMap scope:(NSString *)scope startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(NSNumber *)schedulerStartDate schedulerEndDate:(NSNumber *)schedulerEndDate description:(NSString *)description {
	NSDictionary *_params = @{
		@"sourceGroupId": sourceGroupId,
		@"targetGroupId": targetGroupId,
		@"privateLayout": privateLayout,
		@"layoutIdMap": layoutIdMap,
		@"parameterMap": parameterMap,
		@"scope": scope,
		@"startDate": startDate,
		@"endDate": endDate,
		@"groupName": groupName,
		@"cronText": cronText,
		@"schedulerStartDate": schedulerStartDate,
		@"schedulerEndDate": schedulerEndDate,
		@"description": description
	};

	NSDictionary *_command = @{@"/layout/schedule-publish-to-live": _params};

	[session invoke:_command];
}

- (NSString *)getLayoutName:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutId:(NSNumber *)layoutId languageId:(NSString *)languageId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"layoutId": layoutId,
		@"languageId": languageId
	};

	NSDictionary *_command = @{@"/layout/get-layout-name": _params};

	return (NSString *)[session invoke:_command];
}

- (NSDictionary *)exportLayoutsAsFile:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"layoutIds": layoutIds,
		@"parameterMap": parameterMap,
		@"startDate": startDate,
		@"endDate": endDate
	};

	NSDictionary *_command = @{@"/layout/export-layouts-as-file": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)unschedulePublishToLive:(NSNumber *)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"jobName": jobName,
		@"groupName": groupName
	};

	NSDictionary *_command = @{@"/layout/unschedule-publish-to-live": _params};

	[session invoke:_command];
}

@end