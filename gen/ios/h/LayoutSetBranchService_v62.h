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
@interface LayoutSetBranchService_v62 : BaseService

- (void)deleteLayoutSetBranch:(long)layoutSetBranchId;
- (NSArray *)getLayoutSetBranches:(long)groupId privateLayout:(BOOL)privateLayout;
- (NSDictionary *)addLayoutSetBranch:(long)groupId privateLayout:(BOOL)privateLayout name:(NSString *)name description:(NSString *)description master:(BOOL)master copyLayoutSetBranchId:(long)copyLayoutSetBranchId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateLayoutSetBranch:(long)groupId layoutSetBranchId:(long)layoutSetBranchId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)mergeLayoutSetBranch:(long)layoutSetBranchId mergeLayoutSetBranchId:(long)mergeLayoutSetBranchId serviceContext:(NSDictionary *)serviceContext;

@end