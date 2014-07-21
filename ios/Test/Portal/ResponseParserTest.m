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
#import "LRResponseParser.h"
#import "NSError+LRError.h"

/**
 * @author Jose M. Navarro
 */
@interface ResponseParserTest : BaseTest
@end

@implementation ResponseParserTest

- (void)testHttpError {
	NSString *json = @"{}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	NSError *error;
	id response = [LRResponseParser parse:data statusCode:404 error:&error];

	XCTAssertNil(response);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertEqual(404, error.code);
	XCTAssertNotNil(error.userInfo);
	XCTAssertNotNil(error.userInfo[NSLocalizedDescriptionKey]);
}

- (void)testParseError {
	NSString *json = @"{this_is_an_invalid_json}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	NSError *error;
	id response = [LRResponseParser parse:data statusCode:LR_HTTP_STATUS_OK
		error:&error];

	XCTAssertNil(response);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertEqual(LRErrorCodeParse, error.code);
	XCTAssertNotNil(error.userInfo);
	XCTAssertNotNil(error.userInfo[NSLocalizedDescriptionKey]);
}


- (void)testPortalException {
	NSString *json = @"{\"exception\":\"This is the message\"}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	NSError *error;
	id response = [LRResponseParser parse:data statusCode:LR_HTTP_STATUS_OK
		error:&error];

	XCTAssertNil(response);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertEqual(LRErrorCodePortalException, error.code);
	XCTAssertNotNil(error.userInfo);

	XCTAssertEqualObjects(
		@"This is the message",
		error.userInfo[NSLocalizedDescriptionKey]
	);
}

- (void)testPortalExceptionWithMessage {
	NSString *json = @"{\"exception\":\"com.liferay.MyException\", \
		\"message\":\"This is the message\"}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	NSError *error;
	id response = [LRResponseParser parse:data statusCode:LR_HTTP_STATUS_OK
		error:&error];

	XCTAssertNil(response);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertEqual(LRErrorCodePortalException, error.code);
	XCTAssertNotNil(error.userInfo);
	XCTAssertEqualObjects(
		@"This is the message",
		error.userInfo[NSLocalizedDescriptionKey]
	);

	XCTAssertEqualObjects(
		@"com.liferay.MyException",
		error.userInfo[NSLocalizedFailureReasonErrorKey]
	);
}

- (void)testUnauthorizedError {
	NSString *json = @"{}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	NSError *error;
	id response = [LRResponseParser parse:data
		statusCode:LR_HTTP_STATUS_UNAUTHORIZED error:&error];

	XCTAssertNil(response);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertEqual(LRErrorCodeUnauthorized, error.code);
	XCTAssertNotNil(error.userInfo);
	XCTAssertNotNil(error.userInfo[NSLocalizedDescriptionKey]);
}

@end