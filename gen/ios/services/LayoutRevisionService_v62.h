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

/**
 * author: Bruno Farache
 */
@interface LayoutRevisionService_v62 : NSObject

- (NSDictionary *)addLayoutRevision:(NSNumber *)userId layoutSetBranchId:(NSNumber *)layoutSetBranchId layoutBranchId:(NSNumber *)layoutBranchId parentLayoutRevisionId:(NSNumber *)parentLayoutRevisionId head:(BOOL)head plid:(NSNumber *)plid portletPreferencesPlid:(NSNumber *)portletPreferencesPlid privateLayout:(BOOL)privateLayout name:(NSString *)name title:(NSString *)title description:(NSString *)description keywords:(NSString *)keywords robots:(NSString *)robots typeSettings:(NSString *)typeSettings iconImage:(BOOL)iconImage iconImageId:(NSNumber *)iconImageId themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId wapThemeId:(NSString *)wapThemeId wapColorSchemeId:(NSString *)wapColorSchemeId css:(NSString *)css serviceContext:(NSDictionary *)serviceContext;

@end