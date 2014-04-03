//
//  SyncWebServiceTest.m
//  Liferay iOS SDK
//
//	Bruno Farache
//

#import "SyncWebServiceTest.h"

@implementation SyncWebServiceTest

- (void)testGetUserSitesGroups {
	LRSyncDLObjectService_v62 *service =
		[[LRSyncDLObjectService_v62 alloc] initWithSession:self.session];

	NSError *error = nil;

	NSArray *groups = [service getUserSitesGroups:&error];
	XCTAssertNil(error);
	XCTAssertEqual(2, [groups count]);

	NSDictionary *group = groups[1];
	XCTAssertEqualObjects(@"/guest", group[@"friendlyURL"]);
}

@end