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

/**
 * author Bruno Farache
 */
@interface PortalService_v62 : NSObject

- (void)testGetUserId:;
- (void)testAutoSyncHibernateSessionStateOnTxCreation:;
- (void)testAddClassNameAndTestTransactionPortletBar_PortalRollback:(NSString *)transactionPortletBarText;
- (void)testAddClassNameAndTestTransactionPortletBar_Success:(NSString *)transactionPortletBarText;
- (void)testDeleteClassName:;
- (void)testAddClassNameAndTestTransactionPortletBar_PortletRollback:(NSString *)transactionPortletBarText;
- (BOOL)testHasClassName:;
- (NSString *)getAutoDeployDirectory:;
- (NSNumber *)getBuildNumber:;
- (void)testAddClassName_Success:(NSString *)classNameValue;
- (void)testAddClassName_Rollback:(NSString *)classNameValue;
- (NSNumber *)testGetBuildNumber:;

@end