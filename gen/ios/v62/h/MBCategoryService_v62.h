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
@interface MBCategoryService_v62 : BaseService

- (int)getSubscribedCategoriesCount:(long)groupId userId:(long)userId;
- (NSDictionary *)moveCategoryToTrash:(long)categoryId;
- (NSDictionary *)moveCategory:(long)categoryId parentCategoryId:(long)parentCategoryId mergeWithParentCategory:(BOOL)mergeWithParentCategory;
- (NSDictionary *)addCategory:(long)userId parentCategoryId:(long)parentCategoryId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)moveCategoryFromTrash:(long)categoryId newCategoryId:(long)newCategoryId;
- (NSArray *)getCategories:(long)groupId parentCategoryIds:(NSArray *)parentCategoryIds status:(int)status start:(int)start end:(int)end;
- (void)deleteCategory:(long)groupId categoryId:(long)categoryId;
- (void)restoreCategoryFromTrash:(long)categoryId;
- (int)getCategoriesCount:(long)groupId parentCategoryIds:(NSArray *)parentCategoryIds status:(int)status;
- (NSArray *)getSubcategoryIds:(NSArray *)categoryIds groupId:(long)groupId categoryId:(long)categoryId;
- (NSArray *)getCategoryIds:(long)groupId categoryId:(long)categoryId;
- (NSDictionary *)updateCategory:(long)categoryId parentCategoryId:(long)parentCategoryId name:(NSString *)name description:(NSString *)description displayStyle:(NSString *)displayStyle emailAddress:(NSString *)emailAddress inProtocol:(NSString *)inProtocol inServerName:(NSString *)inServerName inServerPort:(int)inServerPort inUseSSL:(BOOL)inUseSSL inUserName:(NSString *)inUserName inPassword:(NSString *)inPassword inReadInterval:(int)inReadInterval outEmailAddress:(NSString *)outEmailAddress outCustom:(BOOL)outCustom outServerName:(NSString *)outServerName outServerPort:(int)outServerPort outUseSSL:(BOOL)outUseSSL outUserName:(NSString *)outUserName outPassword:(NSString *)outPassword mailingListActive:(BOOL)mailingListActive allowAnonymousEmail:(BOOL)allowAnonymousEmail mergeWithParentCategory:(BOOL)mergeWithParentCategory serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getSubscribedCategories:(long)groupId userId:(long)userId start:(int)start end:(int)end;
- (void)unsubscribeCategory:(long)groupId categoryId:(long)categoryId;
- (void)subscribeCategory:(long)groupId categoryId:(long)categoryId;
- (NSDictionary *)getCategory:(long)categoryId;

@end