//
//  PortletServiceTest.m
//  Liferay iOS SDK
//
//  Bruno Farache
//

#import "LRPortletService_v62.h"
#import "PortletServiceTest.h"

@implementation PortletServiceTest

- (void)testGetUserSitesGroups {
	LRPortletService_v62 *service =
		[[LRPortletService_v62 alloc] initWithSession:self.session];

	NSError *error;
	NSArray *array = [service getWarPortlets:&error];

	XCTAssertNil(error);
	XCTAssertNotNil(array);
	XCTAssertTrue([array count] > 0);
}

@end