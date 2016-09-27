//
//  CookieAuthenticationTest.m
//  Liferay iOS SDK
//
//  Created by Victor Galán on 27/09/16.
//  Copyright © 2016 Liferay Inc. All rights reserved.
//

#import "BaseTest.h"
#import "LRGroupService_v7.h"
#import "LRCookieSignIn.h"
#import "TRVSMonitor.h"

@interface CookieAuthenticationTest : BaseTest <LRCookieCallback>

@property (nonatomic, strong) NSError *error;
@property (nonatomic, strong) NSArray *groups;
@property (nonatomic) TRVSMonitor *monitor;

@end

@implementation CookieAuthenticationTest

- (void)testCookieSignIn {
	LRSession *session = [[LRSession alloc] initWithSession:self.session];
	self.monitor = [TRVSMonitor monitor];

	[LRCookieSignIn signInWithSession:session callback:self];
	
	[self.monitor wait];

	[self assert:self.groups error:self.error];
}

- (void) onSuccess:(LRSession *)session {
	LRGroupService_v7 *service = [[LRGroupService_v7 alloc] initWithSession:session];
	
	NSError *error;
	self.groups = [service getUserSitesGroups:&error];

	[self.monitor signal];
}

- (void)onFailure:(NSError *)error {
	[self setError:error];
	[self.monitor signal];
}

- (void)assert:(NSArray *)groups error:(NSError *)error {
	XCTAssertNil(error);
	XCTAssertEqual(3, [groups count]);

	NSDictionary *group = groups[0];
	XCTAssertEqualObjects(@"/test", group[@"friendlyURL"]);

	group = groups[1];
	XCTAssertEqualObjects(@"/global", group[@"friendlyURL"]);

	group = groups[2];
	XCTAssertEqualObjects(@"/guest", group[@"friendlyURL"]);
}

@end
