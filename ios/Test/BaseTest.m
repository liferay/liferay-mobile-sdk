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
}

- (void)test {
	NSString *url = [self.settings objectForKey:@"url"];

	XCTFail(@"%@", url);
}

- (void)tearDown {
	[super tearDown];
}

@end