//
//  GroupServiceTest.m
//  Liferay iOS SDK
//
//  Jose Navarro
//	Bruno Farache
//

#import "GroupServiceTest.h"

@implementation GroupServiceTest

- (void)testGetUserSites {
    LRGroupService_v62 *service =
		[[LRGroupService_v62 alloc] initWithSession:self.session];

    NSError *error = nil;
    NSArray *groups = [service getUserSites:&error];

    XCTAssertNil(error);
    XCTAssertEqual(2, [groups count]);

    NSDictionary *group = groups[0];
    XCTAssertEqualObjects(@"/test", group[@"friendlyURL"]);

    group = groups[1];
    XCTAssertEqualObjects(@"/guest", group[@"friendlyURL"]);
}

@end