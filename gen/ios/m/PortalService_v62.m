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

#import "PortalService_v62.h"

/**
 * author Bruno Farache
 */
@implementation PortalService_v62

- (void)testGetUserId: {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/portal/test-get-user-id": _params};

	[session invoke:_command];
}

- (void)testAutoSyncHibernateSessionStateOnTxCreation: {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/portal/test-auto-sync-hibernate-session-state-on-tx-creation": _params};

	[session invoke:_command];
}

- (void)testAddClassNameAndTestTransactionPortletBar_PortalRollback:(NSString *)transactionPortletBarText {
	NSDictionary *_params = @{
		@"transactionPortletBarText": transactionPortletBarText
	};

	NSDictionary *_command = @{@"/portal/test-add-class-name-and-test-transaction-portlet-bar_-portal-rollback": _params};

	[session invoke:_command];
}

- (void)testAddClassNameAndTestTransactionPortletBar_Success:(NSString *)transactionPortletBarText {
	NSDictionary *_params = @{
		@"transactionPortletBarText": transactionPortletBarText
	};

	NSDictionary *_command = @{@"/portal/test-add-class-name-and-test-transaction-portlet-bar_-success": _params};

	[session invoke:_command];
}

- (void)testDeleteClassName: {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/portal/test-delete-class-name": _params};

	[session invoke:_command];
}

- (void)testAddClassNameAndTestTransactionPortletBar_PortletRollback:(NSString *)transactionPortletBarText {
	NSDictionary *_params = @{
		@"transactionPortletBarText": transactionPortletBarText
	};

	NSDictionary *_command = @{@"/portal/test-add-class-name-and-test-transaction-portlet-bar_-portlet-rollback": _params};

	[session invoke:_command];
}

- (BOOL)testHasClassName: {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/portal/test-has-class-name": _params};

	return (BOOL)[session invoke:_command];
}

- (NSString *)getAutoDeployDirectory: {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/portal/get-auto-deploy-directory": _params};

	return (NSString *)[session invoke:_command];
}

- (NSNumber *)getBuildNumber: {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/portal/get-build-number": _params};

	return (NSNumber *)[session invoke:_command];
}

- (void)testAddClassName_Success:(NSString *)classNameValue {
	NSDictionary *_params = @{
		@"classNameValue": classNameValue
	};

	NSDictionary *_command = @{@"/portal/test-add-class-name_-success": _params};

	[session invoke:_command];
}

- (void)testAddClassName_Rollback:(NSString *)classNameValue {
	NSDictionary *_params = @{
		@"classNameValue": classNameValue
	};

	NSDictionary *_command = @{@"/portal/test-add-class-name_-rollback": _params};

	[session invoke:_command];
}

- (NSNumber *)testGetBuildNumber: {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/portal/test-get-build-number": _params};

	return (NSNumber *)[session invoke:_command];
}

@end