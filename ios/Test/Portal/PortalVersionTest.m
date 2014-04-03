//
//  PortalVersion.m
//  Liferay iOS SDK
//
//  Jose Navarro
//	Bruno Farache
//

#import "PortalVersionTest.h"

@implementation PortalVersion

- (void)testGetPortalVersion {
	NSError *error = nil;
	int version = [LRHttpUtil getPortalVersion:self.session error:&error];

	XCTAssertNil(error);
	XCTAssertEqual(6200, version);
}

@end