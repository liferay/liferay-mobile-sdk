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

#import "LayoutSetBranchService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LayoutSetBranchService_v62

- (void)deleteLayoutSetBranch:(NSNumber *)layoutSetBranchId {
}

- (NSArray *)getLayoutSetBranches:(NSNumber *)groupId privateLayout:(BOOL)privateLayout {
}

- (NSDictionary *)addLayoutSetBranch:(NSNumber *)groupId privateLayout:(BOOL)privateLayout name:(NSString *)name description:(NSString *)description master:(BOOL)master copyLayoutSetBranchId:(NSNumber *)copyLayoutSetBranchId serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)updateLayoutSetBranch:(NSNumber *)groupId layoutSetBranchId:(NSNumber *)layoutSetBranchId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)mergeLayoutSetBranch:(NSNumber *)layoutSetBranchId mergeLayoutSetBranchId:(NSNumber *)mergeLayoutSetBranchId serviceContext:(NSDictionary *)serviceContext {
}

@end