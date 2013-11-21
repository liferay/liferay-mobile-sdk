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
@interface LRMBCategoryService_v62 : BaseService

- (NSDictionary *)addCategoryWithParentCategoryId:(long)parentCategoryId name:(NSString *)name description:(NSString *)description displayStyle:(NSString *)displayStyle emailAddress:(NSString *)emailAddress inProtocol:(NSString *)inProtocol inServerName:(NSString *)inServerName inServerPort:(int)inServerPort inUseSSL:(BOOL)inUseSSL inUserName:(NSString *)inUserName inPassword:(NSString *)inPassword inReadInterval:(int)inReadInterval outEmailAddress:(NSString *)outEmailAddress outCustom:(BOOL)outCustom outServerName:(NSString *)outServerName outServerPort:(int)outServerPort outUseSSL:(BOOL)outUseSSL outUserName:(NSString *)outUserName outPassword:(NSString *)outPassword mailingListActive:(BOOL)mailingListActive allowAnonymousEmail:(BOOL)allowAnonymousEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCategoryWithUserId:(long)userId parentCategoryId:(long)parentCategoryId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteCategoryWithCategoryId:(long)categoryId includeTrashedEntries:(BOOL)includeTrashedEntries error:(NSError **)error;
- (void)deleteCategoryWithGroupId:(long)groupId categoryId:(long)categoryId error:(NSError **)error;
- (NSArray *)getCategoriesWithGroupId:(long)groupId error:(NSError **)error;
- (NSArray *)getCategoriesWithGroupId:(long)groupId status:(int)status error:(NSError **)error;
- (NSArray *)getCategoriesWithGroupId:(long)groupId parentCategoryId:(long)parentCategoryId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCategoriesWithGroupId:(long)groupId parentCategoryIds:(NSArray *)parentCategoryIds start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCategoriesWithGroupId:(long)groupId parentCategoryId:(long)parentCategoryId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCategoriesWithGroupId:(long)groupId parentCategoryIds:(NSArray *)parentCategoryIds status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (int)getCategoriesCountWithGroupId:(long)groupId parentCategoryId:(long)parentCategoryId error:(NSError **)error;
- (int)getCategoriesCountWithGroupId:(long)groupId parentCategoryIds:(NSArray *)parentCategoryIds error:(NSError **)error;
- (int)getCategoriesCountWithGroupId:(long)groupId parentCategoryId:(long)parentCategoryId status:(int)status error:(NSError **)error;
- (int)getCategoriesCountWithGroupId:(long)groupId parentCategoryIds:(NSArray *)parentCategoryIds status:(int)status error:(NSError **)error;
- (NSDictionary *)getCategoryWithCategoryId:(long)categoryId error:(NSError **)error;
- (NSArray *)getCategoryIdsWithGroupId:(long)groupId categoryId:(long)categoryId error:(NSError **)error;
- (NSArray *)getSubcategoryIdsWithCategoryIds:(NSArray *)categoryIds groupId:(long)groupId categoryId:(long)categoryId error:(NSError **)error;
- (NSArray *)getSubscribedCategoriesWithGroupId:(long)groupId userId:(long)userId start:(int)start end:(int)end error:(NSError **)error;
- (int)getSubscribedCategoriesCountWithGroupId:(long)groupId userId:(long)userId error:(NSError **)error;
- (NSDictionary *)moveCategoryWithCategoryId:(long)categoryId parentCategoryId:(long)parentCategoryId mergeWithParentCategory:(BOOL)mergeWithParentCategory error:(NSError **)error;
- (NSDictionary *)moveCategoryFromTrashWithCategoryId:(long)categoryId newCategoryId:(long)newCategoryId error:(NSError **)error;
- (NSDictionary *)moveCategoryToTrashWithCategoryId:(long)categoryId error:(NSError **)error;
- (void)restoreCategoryFromTrashWithCategoryId:(long)categoryId error:(NSError **)error;
- (void)subscribeCategoryWithGroupId:(long)groupId categoryId:(long)categoryId error:(NSError **)error;
- (void)unsubscribeCategoryWithGroupId:(long)groupId categoryId:(long)categoryId error:(NSError **)error;
- (NSDictionary *)updateCategoryWithCategoryId:(long)categoryId parentCategoryId:(long)parentCategoryId name:(NSString *)name description:(NSString *)description displayStyle:(NSString *)displayStyle emailAddress:(NSString *)emailAddress inProtocol:(NSString *)inProtocol inServerName:(NSString *)inServerName inServerPort:(int)inServerPort inUseSSL:(BOOL)inUseSSL inUserName:(NSString *)inUserName inPassword:(NSString *)inPassword inReadInterval:(int)inReadInterval outEmailAddress:(NSString *)outEmailAddress outCustom:(BOOL)outCustom outServerName:(NSString *)outServerName outServerPort:(int)outServerPort outUseSSL:(BOOL)outUseSSL outUserName:(NSString *)outUserName outPassword:(NSString *)outPassword mailingListActive:(BOOL)mailingListActive allowAnonymousEmail:(BOOL)allowAnonymousEmail mergeWithParentCategory:(BOOL)mergeWithParentCategory serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end