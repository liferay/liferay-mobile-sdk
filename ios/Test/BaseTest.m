//
//  BaseTest.m
//  Liferay iOS SDK
//
//  Jose Navarro
//	Bruno Farache
//

#import "BaseTest.h"

@implementation BaseTest

- (void)setUp {
	[super setUp];

	NSBundle *bundle =
		[NSBundle bundleWithIdentifier:@"com.liferay.mobile.sdk.Test"];

	NSString *path = [bundle pathForResource:@"settings" ofType:@"plist"];

    self.settings = [[NSDictionary alloc] initWithContentsOfFile:path];

	NSString *url = self.settings[@"url"];
	NSString *username = self.settings[@"username"];
	NSString *password = self.settings[@"password"];
	
	self.session =
		[[LRSession alloc] init:url username:username password:password];
}

- (void)tearDown {
	[super tearDown];
}

@end