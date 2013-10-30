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

#import "MBCategoryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation MBCategoryService_v62

- (NSNumber *)getSubscribedCategoriesCount:(NSNumber *)groupId userId:(NSNumber *)userId {
}

- (NSDictionary *)moveCategoryToTrash:(NSNumber *)categoryId {
}

- (NSDictionary *)moveCategory:(NSNumber *)categoryId parentCategoryId:(NSNumber *)parentCategoryId mergeWithParentCategory:(BOOL)mergeWithParentCategory {
}

- (NSDictionary *)addCategory:(NSNumber *)userId parentCategoryId:(NSNumber *)parentCategoryId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)moveCategoryFromTrash:(NSNumber *)categoryId newCategoryId:(NSNumber *)newCategoryId {
}

- (NSArray *)getCategories:(NSNumber *)groupId parentCategoryIds:(NSArray *)parentCategoryIds status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
}

- (void)deleteCategory:(NSNumber *)groupId categoryId:(NSNumber *)categoryId {
}

- (void)restoreCategoryFromTrash:(NSNumber *)categoryId {
}

- (NSNumber *)getCategoriesCount:(NSNumber *)groupId parentCategoryIds:(NSArray *)parentCategoryIds status:(NSNumber *)status {
}

- (NSArray *)getSubcategoryIds:(NSArray *)categoryIds groupId:(NSNumber *)groupId categoryId:(NSNumber *)categoryId {
}

- (NSArray *)getCategoryIds:(NSNumber *)groupId categoryId:(NSNumber *)categoryId {
}

- (NSDictionary *)updateCategory:(NSNumber *)categoryId parentCategoryId:(NSNumber *)parentCategoryId name:(NSString *)name description:(NSString *)description displayStyle:(NSString *)displayStyle emailAddress:(NSString *)emailAddress inProtocol:(NSString *)inProtocol inServerName:(NSString *)inServerName inServerPort:(NSNumber *)inServerPort inUseSSL:(BOOL)inUseSSL inUserName:(NSString *)inUserName inPassword:(NSString *)inPassword inReadInterval:(NSNumber *)inReadInterval outEmailAddress:(NSString *)outEmailAddress outCustom:(BOOL)outCustom outServerName:(NSString *)outServerName outServerPort:(NSNumber *)outServerPort outUseSSL:(BOOL)outUseSSL outUserName:(NSString *)outUserName outPassword:(NSString *)outPassword mailingListActive:(BOOL)mailingListActive allowAnonymousEmail:(BOOL)allowAnonymousEmail mergeWithParentCategory:(BOOL)mergeWithParentCategory serviceContext:(NSDictionary *)serviceContext {
}

- (NSArray *)getSubscribedCategories:(NSNumber *)groupId userId:(NSNumber *)userId start:(NSNumber *)start end:(NSNumber *)end {
}

- (void)unsubscribeCategory:(NSNumber *)groupId categoryId:(NSNumber *)categoryId {
}

- (void)subscribeCategory:(NSNumber *)groupId categoryId:(NSNumber *)categoryId {
}

- (NSDictionary *)getCategory:(NSNumber *)categoryId {
}

@end