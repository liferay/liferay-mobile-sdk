/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

#import "BaseTest.h"
#import "LRError.h"
#import "LRResponseParser.h"

/**
 * @author Jose M. Navarro
 */
@interface ResponseParserTest : BaseTest
@end

@implementation ResponseParserTest

- (void)testHttpError {
	NSString *json = @"{}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	int notFoundStatusCode = 404;
	NSError *error;
	id response = [LRResponseParser parse:data statusCode:notFoundStatusCode
		error:&error];

	[self _assertWithResponse:response error:error];

	XCTAssertEqual(notFoundStatusCode, error.code);
}

- (void)testParseError {
	NSString *json = @"{this is an invalid json}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	NSError *error;
	id response = [LRResponseParser parse:data statusCode:LR_HTTP_STATUS_OK
		error:&error];

	[self _assertWithResponse:response error:error];

	XCTAssertEqual(LRErrorCodeParse, error.code);
}


- (void)testPortalException {
	NSString *exception = @"No such user with primary key 1";

	NSDictionary *json = @{
		@"exception": exception
	};

	NSError *error;
	NSData *data = [NSJSONSerialization dataWithJSONObject:json options:0
		error:&error];

	id response = [LRResponseParser parse:data statusCode:LR_HTTP_STATUS_OK
		error:&error];

	[self _assertWithResponse:response error:error];

	XCTAssertEqual(LRErrorCodePortalException, error.code);
	XCTAssertEqualObjects(exception, [error localizedDescription]);
}

- (void)testPortalExceptionWithMessage {
	NSString *exception = @"No such user with primary key 1";
	NSString *type = @"com.liferay.portal.NoSuchUserException";

	NSDictionary *json = @{
		@"exception": exception,
		@"type": type
	};

	NSError *error;
	NSData *data = [NSJSONSerialization dataWithJSONObject:json options:0
		error:&error];

	id response = [LRResponseParser parse:data statusCode:LR_HTTP_STATUS_OK
		error:&error];

	[self _assertWithResponse:response error:error];

	XCTAssertEqual(LRErrorCodePortalException, error.code);

	XCTAssertEqualObjects(
		@"The user couldn't be found in the server.",
		[error localizedDescription]
	);

	XCTAssertEqualObjects(exception, [error localizedFailureReason]);
}

- (void)testUnauthorizedError {
	NSString *json = @"{}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	NSError *error;
	id response = [LRResponseParser parse:data
		statusCode:LR_HTTP_STATUS_UNAUTHORIZED error:&error];

	[self _assertWithResponse:response error:error];

	XCTAssertEqual(LRErrorCodeUnauthorized, error.code);
}

- (void)_assertWithResponse:(id)response error:(NSError *)error {
	XCTAssertNil(response);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertNotNil(error.userInfo);
	XCTAssertNotNil([error localizedDescription]);
}

@end