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
@interface LRLayoutService_v73 : LRBaseService

- (NSDictionary *)fetchLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId error:(NSError **)error;
- (NSArray *)getLayoutsWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId error:(NSError **)error;
- (NSArray *)getLayoutsWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId incomplete:(BOOL)incomplete start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getLayoutsWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout type:(NSString *)type error:(NSError **)error;
- (NSArray *)getLayoutsWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout type:(NSString *)type start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getLayoutsWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout error:(NSError **)error;
- (NSArray *)getLayoutsWithGroupId:(long long)groupId type:(NSString *)type error:(NSError **)error;
- (NSArray *)getLayoutsWithGroupId:(long long)groupId type:(NSString *)type start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getLayoutsWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout keywords:(NSString *)keywords types:(NSArray *)types start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)addLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId classNameId:(long long)classNameId classPK:(long long)classPK localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type typeSettings:(NSString *)typeSettings hidden:(BOOL)hidden system:(BOOL)system friendlyURLMap:(NSDictionary *)friendlyURLMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId classNameId:(long long)classNameId classPK:(long long)classPK localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type typeSettings:(NSString *)typeSettings hidden:(BOOL)hidden system:(BOOL)system friendlyURLMap:(NSDictionary *)friendlyURLMap masterLayoutPlid:(long long)masterLayoutPlid serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId classNameId:(long long)classNameId classPK:(long long)classPK localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type typeSettings:(NSString *)typeSettings hidden:(BOOL)hidden system:(BOOL)system masterLayoutPlid:(long long)masterLayoutPlid friendlyURLMap:(NSDictionary *)friendlyURLMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId name:(NSString *)name title:(NSString *)title description:(NSString *)description type:(NSString *)type hidden:(BOOL)hidden friendlyURL:(NSString *)friendlyURL serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type typeSettings:(NSString *)typeSettings hidden:(BOOL)hidden masterLayoutPlid:(long long)masterLayoutPlid friendlyURLMap:(NSDictionary *)friendlyURLMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type typeSettings:(NSString *)typeSettings hidden:(BOOL)hidden friendlyURLMap:(NSDictionary *)friendlyURLMap masterLayoutPlid:(long long)masterLayoutPlid serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type typeSettings:(NSString *)typeSettings hidden:(BOOL)hidden friendlyURLMap:(NSDictionary *)friendlyURLMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId typeSettings:(NSString *)typeSettings error:(NSError **)error;
- (NSDictionary *)updateLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId parentLayoutId:(long long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type hidden:(BOOL)hidden friendlyURLMap:(NSDictionary *)friendlyURLMap hasIconImage:(BOOL)hasIconImage iconBytes:(NSData *)iconBytes serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId parentLayoutId:(long long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type hidden:(BOOL)hidden friendlyURLMap:(NSDictionary *)friendlyURLMap hasIconImage:(BOOL)hasIconImage iconBytes:(NSData *)iconBytes masterLayoutPlid:(long long)masterLayoutPlid serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId parentLayoutId:(long long)parentLayoutId localeNamesMap:(NSDictionary *)localeNamesMap localeTitlesMap:(NSDictionary *)localeTitlesMap descriptionMap:(NSDictionary *)descriptionMap keywordsMap:(NSDictionary *)keywordsMap robotsMap:(NSDictionary *)robotsMap type:(NSString *)type hidden:(BOOL)hidden friendlyURLMap:(NSDictionary *)friendlyURLMap hasIconImage:(BOOL)hasIconImage iconBytes:(NSData *)iconBytes masterLayoutPlid:(long long)masterLayoutPlid styleBookEntryId:(long long)styleBookEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSNumber *)getDefaultPlidWithGroupId:(long long)groupId scopeGroupId:(long long)scopeGroupId privateLayout:(BOOL)privateLayout portletId:(NSString *)portletId error:(NSError **)error;
- (NSNumber *)getDefaultPlidWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout error:(NSError **)error;
- (NSNumber *)getDefaultPlidWithGroupId:(long long)groupId scopeGroupId:(long long)scopeGroupId portletId:(NSString *)portletId error:(NSError **)error;
- (NSNumber *)getLayoutsCountWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout type:(NSString *)type error:(NSError **)error;
- (NSNumber *)getLayoutsCountWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId priority:(int)priority error:(NSError **)error;
- (NSNumber *)getLayoutsCountWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout error:(NSError **)error;
- (NSNumber *)getLayoutsCountWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout keywords:(NSString *)keywords types:(NSArray *)types error:(NSError **)error;
- (NSNumber *)getLayoutsCountWithGroupId:(long long)groupId type:(NSString *)type error:(NSError **)error;
- (NSNumber *)getLayoutsCountWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId error:(NSError **)error;
- (BOOL)hasPortletIdWithPlid:(long long)plid portletId:(NSString *)portletId error:(NSError **)error;
- (NSDictionary *)getLayoutByUuidAndGroupIdWithUuid:(NSString *)uuid groupId:(long long)groupId privateLayout:(BOOL)privateLayout error:(NSError **)error;
- (void)deleteTempFileEntryWithGroupId:(long long)groupId folderName:(NSString *)folderName fileName:(NSString *)fileName error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getTempFileNamesWithGroupId:(long long)groupId folderName:(NSString *)folderName error:(NSError **)error;
- (BOOL)hasLayoutWithUuid:(NSString *)uuid groupId:(long long)groupId privateLayout:(BOOL)privateLayout error:(NSError **)error;
- (void)deleteLayoutWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteLayoutWithPlid:(long long)plid serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateLookAndFeelWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId css:(NSString *)css error:(NSError **)error;
- (void)setLayoutsWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout parentLayoutId:(long long)parentLayoutId layoutIds:(NSArray *)layoutIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateIconImageWithPlid:(long long)plid bytes:(NSData *)bytes error:(NSError **)error;
- (NSDictionary *)updateNameWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId name:(NSString *)name languageId:(NSString *)languageId error:(NSError **)error;
- (NSDictionary *)updateNameWithPlid:(long long)plid name:(NSString *)name languageId:(NSString *)languageId error:(NSError **)error;
- (NSDictionary *)updateParentLayoutIdWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId parentLayoutId:(long long)parentLayoutId error:(NSError **)error;
- (NSDictionary *)updateParentLayoutIdWithPlid:(long long)plid parentPlid:(long long)parentPlid error:(NSError **)error;
- (NSDictionary *)updateParentLayoutIdAndPriorityWithPlid:(long long)plid parentPlid:(long long)parentPlid priority:(int)priority error:(NSError **)error;
- (NSDictionary *)updatePriorityWithPlid:(long long)plid priority:(int)priority error:(NSError **)error;
- (NSDictionary *)updatePriorityWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId priority:(int)priority error:(NSError **)error;
- (NSDictionary *)updatePriorityWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId nextLayoutId:(long long)nextLayoutId previousLayoutId:(long long)previousLayoutId error:(NSError **)error;
- (NSDictionary *)updateTypeWithPlid:(long long)plid type:(NSString *)type error:(NSError **)error;
- (NSArray *)getAncestorLayoutsWithPlid:(long long)plid error:(NSError **)error;
- (NSNumber *)getControlPanelLayoutPlid:(NSError **)error;
- (NSString *)getLayoutNameWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutId:(long long)layoutId languageId:(NSString *)languageId error:(NSError **)error;
- (NSNumber *)getLayoutPlidWithUuid:(NSString *)uuid groupId:(long long)groupId privateLayout:(BOOL)privateLayout error:(NSError **)error;
- (NSArray *)getLayoutReferencesWithCompanyId:(long long)companyId portletId:(NSString *)portletId preferencesKey:(NSString *)preferencesKey preferencesValue:(NSString *)preferencesValue error:(NSError **)error;
- (void)schedulePublishToLiveWithSourceGroupId:(long long)sourceGroupId targetGroupId:(long long)targetGroupId privateLayout:(BOOL)privateLayout layoutIds:(NSArray *)layoutIds parameterMap:(NSDictionary *)parameterMap groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(long long)schedulerStartDate schedulerEndDate:(long long)schedulerEndDate description:(NSString *)description error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)schedulePublishToRemoteWithSourceGroupId:(long long)sourceGroupId privateLayout:(BOOL)privateLayout layoutIdMap:(NSDictionary *)layoutIdMap parameterMap:(NSDictionary *)parameterMap remoteAddress:(NSString *)remoteAddress remotePort:(int)remotePort remotePathContext:(NSString *)remotePathContext secureConnection:(BOOL)secureConnection remoteGroupId:(long long)remoteGroupId remotePrivateLayout:(BOOL)remotePrivateLayout startDate:(long long)startDate endDate:(long long)endDate groupName:(NSString *)groupName cronText:(NSString *)cronText schedulerStartDate:(long long)schedulerStartDate schedulerEndDate:(long long)schedulerEndDate description:(NSString *)description error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unschedulePublishToLiveWithGroupId:(long long)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unschedulePublishToRemoteWithGroupId:(long long)groupId jobName:(NSString *)jobName groupName:(NSString *)groupName error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end