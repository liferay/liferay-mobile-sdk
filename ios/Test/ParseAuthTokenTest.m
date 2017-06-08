//
//  ParseAuthTokenTest.m
//  Liferay iOS SDK
//
//  Created by Victor Galán on 08/06/2017.
//  Copyright © 2017 Liferay Inc. All rights reserved.
//

#import <XCTest/XCTest.h>
#import "LRCookieSignIn+Test.h"
#import "LRCookieSignIn.h"

@interface ParseAuthTokenTest : XCTestCase

@end

@implementation ParseAuthTokenTest

- (void)testParseAuthTokenWithQuotes {
	LRCookieSignIn *signIn = [LRCookieSignIn new];
	NSString *tokenString = @"Liferay.authToken=\"12345678\"";

	NSString *parsedToken = [signIn _getAuthToken: tokenString];

	XCTAssertTrue([parsedToken isEqualToString:@"12345678"]);
}

- (void)testParseAuthTokenWithSimpleQuotes {
	LRCookieSignIn *signIn = [LRCookieSignIn new];
	NSString *tokenString = @"Liferay.authToken='12345678'";

	NSString *parsedToken = [signIn _getAuthToken: tokenString];

	XCTAssertTrue([parsedToken isEqualToString:@"12345678"]);
}

- (void)testParseAuthTokenWithQuotesAndSpaces {
	LRCookieSignIn *signIn = [LRCookieSignIn new];
	NSString *tokenString = @"   Liferay.authToken=    \"12345678\"  ";

	NSString *parsedToken = [signIn _getAuthToken: tokenString];

	XCTAssertTrue([parsedToken isEqualToString:@"12345678"]);
}

- (void)testParseAuthTokenWithSimpleQuotesAndSpaces {
	LRCookieSignIn *signIn = [LRCookieSignIn new];
	NSString *tokenString = @"Liferay.authToken=    '12345678'  ";

	NSString *parsedToken = [signIn _getAuthToken: tokenString];

	XCTAssertTrue([parsedToken isEqualToString:@"12345678"]);
}

- (void)testParseAuthTokenWithInvalidToken {
	LRCookieSignIn *signIn = [LRCookieSignIn new];
	NSString *tokenString = @"Liferay.authToken=\"1234\"";

	NSString *parsedToken = [signIn _getAuthToken: tokenString];

	XCTAssertNil(parsedToken);
}

- (void)testParseAuthTokenWithoutToken {
	LRCookieSignIn *signIn = [LRCookieSignIn new];
	NSString *tokenString = @"This is a string without a token";

	NSString *parsedToken = [signIn _getAuthToken: tokenString];

	XCTAssertNil(parsedToken);
}

- (void)testParseAuthTokenWithTokenAndMoreStrings {
	LRCookieSignIn *signIn = [LRCookieSignIn new];
	NSString *tokenString = @"This is a test stringLiferay.authToken=    '12345678'  this is a test string";

	NSString *parsedToken = [signIn _getAuthToken: tokenString];

	XCTAssertTrue([parsedToken isEqualToString:@"12345678"]);
}


@end
