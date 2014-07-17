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
#import "LRHttpUtil.h"

/**
 * @author Jose M. Navarro
 */
@interface LRHttpUtilTest : BaseTest
@end

@implementation LRHttpUtilTest

- (void)testHandleServerExceptionWithException {
	NSString *json = @"{\"exception\":\"This is the message\"}";
	NSData *jsonData = [json dataUsingEncoding:NSUTF8StringEncoding];
	NSHTTPURLResponse *response = [self _createHTTPResponseWithCode:200];

	NSError *error;
	id parsedResponse = [LRHttpUtil handleServerException:jsonData
		response:response error:&error];

	XCTAssertNil(parsedResponse);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertEqual(LR_ERROR_CODE_SERVER_EXCEPTION, error.code);
	XCTAssertNotNil(error.userInfo);
	XCTAssertEqualObjects(@"This is the message",
		error.userInfo[NSLocalizedDescriptionKey]);
	XCTAssertEqualObjects(LR_ERROR_EXCEPTION_GENERIC,
		error.userInfo[NSLocalizedFailureReasonErrorKey]);
}

- (void)testHandleServerExceptionWithExceptionAndMessage {
	NSString *json = @"{\"exception\":\"com.liferay.MyException\", \
		\"message\":\"This is the message\"}";
	NSData *jsonData = [json dataUsingEncoding:NSUTF8StringEncoding];
	NSHTTPURLResponse *response = [self _createHTTPResponseWithCode:200];

	NSError *error;
	id parsedResponse = [LRHttpUtil handleServerException:jsonData
		response:response error:&error];

	XCTAssertNil(parsedResponse);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertEqual(LR_ERROR_CODE_SERVER_EXCEPTION, error.code);
	XCTAssertNotNil(error.userInfo);
	XCTAssertEqualObjects(@"This is the message",
		error.userInfo[NSLocalizedDescriptionKey]);
	XCTAssertEqualObjects(@"com.liferay.MyException",
		error.userInfo[NSLocalizedFailureReasonErrorKey]);
}

- (void)testHandleServerExceptionWithParseError {
	NSString *json = @"{this_is_an_invalid_json}";
	NSData *jsonData = [json dataUsingEncoding:NSUTF8StringEncoding];
	NSHTTPURLResponse *response = [self _createHTTPResponseWithCode:200];

	NSError *error;
	id parsedResponse = [LRHttpUtil handleServerException:jsonData
		response:response error:&error];

	XCTAssertNil(parsedResponse);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertEqual(LR_ERROR_CODE_PARSE, error.code);
	XCTAssertNotNil(error.userInfo);
	XCTAssertNotNil(error.userInfo[NSLocalizedDescriptionKey]);
	XCTAssertEqualObjects(LR_ERROR_EXCEPTION_PARSE,
		error.userInfo[NSLocalizedFailureReasonErrorKey]);
}

- (void)testHandleServerExceptionWithStatusError {
	NSString *json = @"{}";
	NSData *jsonData = [json dataUsingEncoding:NSUTF8StringEncoding];
	NSHTTPURLResponse *response = [self _createHTTPResponseWithCode:404];

	NSError *error;
	id parsedResponse = [LRHttpUtil handleServerException:jsonData
		response:response error:&error];

	XCTAssertNil(parsedResponse);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertEqual(404, error.code);
	XCTAssertNotNil(error.userInfo);
	XCTAssertNotNil(error.userInfo[NSLocalizedDescriptionKey]);
	XCTAssertEqualObjects(LR_ERROR_EXCEPTION_STATUS,
		error.userInfo[NSLocalizedFailureReasonErrorKey]);
}

- (void)testHandleServerExceptionWithUnauthorizedResponse {
	NSString *json = @"{}";
	NSData *jsonData = [json dataUsingEncoding:NSUTF8StringEncoding];
	NSHTTPURLResponse *response = [self _createHTTPResponseWithCode:401];

	NSError *error;
	id parsedResponse = [LRHttpUtil handleServerException:jsonData
		response:response error:&error];

	XCTAssertNil(parsedResponse);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertEqual(LR_ERROR_CODE_UNAUTHORIZED, error.code);
	XCTAssertNotNil(error.userInfo);
	XCTAssertNotNil(error.userInfo[NSLocalizedDescriptionKey]);
	XCTAssertEqualObjects(LR_ERROR_EXCEPTION_SECURITY,
		error.userInfo[NSLocalizedFailureReasonErrorKey]);
}

- (void)testHandleServerExceptionWithoutError {
	NSString *json = @"{\"key\":\"value\"}";
	NSData *jsonData = [json dataUsingEncoding:NSUTF8StringEncoding];
	NSHTTPURLResponse *response = [self _createHTTPResponseWithCode:200];

	NSError *error;
	id parsedResponse = [LRHttpUtil handleServerException:jsonData
		response:response error:&error];

	XCTAssertNotNil(parsedResponse);
	XCTAssertTrue([parsedResponse isKindOfClass:[NSDictionary class]]);
	XCTAssertEqualObjects(@"value", [parsedResponse valueForKey:@"key"]);

	XCTAssertNil(error);
}


- (NSHTTPURLResponse *)_createHTTPResponseWithCode:(NSInteger)statusCode {
	return [[NSHTTPURLResponse alloc] initWithURL:
		[NSURL URLWithString:@"http://localhost"] statusCode:statusCode
		HTTPVersion:@"1.0" headerFields:[NSDictionary dictionary]];
}

@end