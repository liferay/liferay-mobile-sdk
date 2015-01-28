/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
#import "LRLocalizationUtil.h"
#import "LRResponseParser.h"

/**
 * @author Jose M. Navarro
 */
@interface ResponseParserTest : BaseTest
@end

@implementation ResponseParserTest

- (void)testHTTPError {
	NSString *json = @"{}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	int statusCode = 404;
	NSURLRequest *request = [self _createRequest];
	NSHTTPURLResponse *response = [self
		_createResponseWithStatusCode:statusCode];

	NSError *error;

	id result = [LRResponseParser parse:data request:request response:response
		error:&error];

	[self _assertWithResult:result error:error];

	XCTAssertEqual(statusCode, error.code);
}

- (void)testParseError {
	NSString *json = @"{this is an invalid json}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	NSURLRequest *request = [self _createRequest];
	NSHTTPURLResponse *response = [self
		_createResponseWithStatusCode:LR_HTTP_STATUS_OK];

	NSError *error;

	id result = [LRResponseParser parse:data request:request response:response
		error:&error];

	[self _assertWithResult:result error:error];

	XCTAssertEqual(LRErrorCodeParse, error.code);

	NSString *localizedDescription = [LRLocalizationUtil
		localize:@"json-parsing-error"];

	XCTAssertEqualObjects(localizedDescription, [error localizedDescription]);
}

- (void)testPortalException {
	NSString *exception = @"No such user with primary key 1";

	NSDictionary *json = @{
		@"exception": exception
	};

	NSError *error;

	NSData *data = [NSJSONSerialization dataWithJSONObject:json options:0
		error:&error];

	NSURLRequest *request = [self _createRequest];
	NSHTTPURLResponse *response = [self
		_createResponseWithStatusCode:LR_HTTP_STATUS_OK];

	id result = [LRResponseParser parse:data request:request response:response
		error:&error];

	[self _assertWithResult:result error:error];

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

	NSURLRequest *request = [self _createRequest];
	NSHTTPURLResponse *response = [self
		_createResponseWithStatusCode:LR_HTTP_STATUS_OK];

	id result = [LRResponseParser parse:data request:request
		response:response error:&error];

	[self _assertWithResult:result error:error];

	XCTAssertEqual(LRErrorCodePortalException, error.code);

	NSString *localizedDescription = [LRLocalizationUtil localize:type];
	XCTAssertEqualObjects(localizedDescription, [error localizedDescription]);
	XCTAssertEqualObjects(exception, [error localizedFailureReason]);
}

- (void)testRedirect {
	NSString *json = @"{}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	int statusCode = 301;
	NSURLRequest *request = [self _createRequest];
	NSString *redirectedURL = @"http://redirected";

	NSHTTPURLResponse *response = [self
		_createResponseWithStatusCode:statusCode redirectURL:redirectedURL];

	NSError *error;

	id result = [LRResponseParser parse:data request:request response:response
		error:&error];

	[self _assertWithResult:result error:error];

	XCTAssertEqual(LRErrorCodeRedirect, error.code);
	XCTAssertEqualObjects(redirectedURL, [error userInfo][NSURLErrorKey]);

	NSString *localizedDescription = [LRLocalizationUtil
		localize:@"url-has-moved"];

	XCTAssertEqualObjects(localizedDescription, [error localizedDescription]);
}

- (void)testUnauthorizedError {
	NSString *json = @"{}";
	NSData *data = [json dataUsingEncoding:NSUTF8StringEncoding];

	NSURLRequest *request = [self _createRequest];
	NSHTTPURLResponse *response = [self
	   _createResponseWithStatusCode:LR_HTTP_STATUS_UNAUTHORIZED];

	NSError *error;

	id result = [LRResponseParser parse:data request:request response:response
		error:&error];

	[self _assertWithResult:result error:error];

	XCTAssertEqual(LRErrorCodeUnauthorized, error.code);

	NSString *localizedDescription = [LRLocalizationUtil
		localize:@"wrong-credentials"];

	XCTAssertEqualObjects(localizedDescription, [error localizedDescription]);
}

- (void)_assertWithResult:(id)result error:(NSError *)error {
	XCTAssertNil(result);

	XCTAssertNotNil(error);
	XCTAssertEqualObjects(LR_ERROR_DOMAIN, error.domain);
	XCTAssertNotNil(error.userInfo);
	XCTAssertNotNil([error localizedDescription]);
}

- (NSURLRequest *)_createRequest {
	return [NSURLRequest
		requestWithURL:[NSURL URLWithString:self.session.server]];
}

- (NSHTTPURLResponse *)_createResponseWithStatusCode:(long)statusCode {
	return [self _createResponseWithStatusCode:statusCode redirectURL:nil];
}

- (NSHTTPURLResponse *)_createResponseWithStatusCode:(long)statusCode
		redirectURL:(NSString *)redirectURL {

	NSURL *url = [NSURL URLWithString:redirectURL];
	NSDictionary *headers = @{};

	if (!url) {
		url = [NSURL URLWithString:self.session.server];
	}
	else {
		headers = @{
			@"Location": redirectURL
		};
	}

	return [[NSHTTPURLResponse alloc] initWithURL:url statusCode:statusCode
		HTTPVersion:@"HTTP/1.1" headerFields:headers];
}

@end