//
//  DLAppServiceTest.m
//  Liferay iOS SDK
//
//  Jose Navarro
//	Bruno Farache
//

#import "DLAppServiceTest.h"

@implementation DLAppServiceTest

- (void)testAddFolder {
	LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:self.session];

	long long repositoryId = [self.settings[@"repositoryId"] longLongValue];

	NSString *name =
		[NSString stringWithFormat:@"test-name-%@", [[NSUUID UUID] UUIDString]];

	NSString *description =
		[NSString stringWithFormat:@"test-desc-%@", [[NSUUID UUID] UUIDString]];

    NSError *error = nil;
    NSDictionary *result = [service addFolderWithRepositoryId:repositoryId
		parentFolderId:0 name:name description:description serviceContext:@{}
		error:&error];

    XCTAssertNil(error);
    XCTAssertNotNil(result);

    XCTAssertEqualObjects(name, result[@"name"]);
    XCTAssertEqualObjects(description, result[@"description"]);

    long long folderId = [result[@"folderId"] longLongValue];

    [self getFolderWithId:folderId exists:YES];
    [self deleteFolderWithId:folderId];
}

- (void)deleteFolderWithId:(long long)folderId {
	LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:self.session];

    NSError *error = nil;
    [service deleteFolderWithFolderId:folderId error:&error];

    XCTAssertNil(error);

    [self getFolderWithId:folderId exists:NO];
}

- (void)getFolderWithId:(long long)folderId exists:(BOOL)exists {
	LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:self.session];

    NSError *error = nil;
    NSDictionary *result =
		[service getFolderWithFolderId:folderId error:&error];

    if (exists) {
        XCTAssertNil(error);
        XCTAssertNotNil(result);
        XCTAssertEqualObjects(result[@"folderId"], @(folderId));
    }
    else {
        XCTAssertNil(result);
        XCTAssertNotNil(error);

		NSString *description = [error localizedDescription];
        XCTAssertTrue(
			[description hasPrefix:@"No DLFolder exists with the primary key"]);
    }
}

- (void)testBatchAddFolders {
    LRBatchSession *batch = [[LRBatchSession alloc] init:self.session];
    LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:batch];

    long long repositoryId = [self.settings[@"repositoryId"] longLongValue];

	NSString *uuid = [[NSUUID UUID] UUIDString];
    NSString *name1 = [NSString stringWithFormat:@"1-test-name-%@", uuid];

	uuid = [[NSUUID UUID] UUIDString];
    NSString *name2 = [NSString stringWithFormat:@"2-test-name-%@", uuid];

	uuid = [[NSUUID UUID] UUIDString];
    NSString *description1 =
		[NSString stringWithFormat:@"1-test-desc-%@", uuid];

	uuid = [[NSUUID UUID] UUIDString];
    NSString *description2 =
		[NSString stringWithFormat:@"2-test-desc-%@", uuid];

    NSError *error = nil;
    [service addFolderWithRepositoryId:repositoryId parentFolderId:0 name:name1
		description:description1 serviceContext:@{} error:&error];

    XCTAssertNil(error);

    [service addFolderWithRepositoryId:repositoryId parentFolderId:0 name:name2
		description:description2 serviceContext:@{} error:&error];

    XCTAssertNil(error);
    NSArray *result = [batch invoke:&error];

    XCTAssertNil(error);
    XCTAssertNotNil(result);
    XCTAssertEqual(2, [result count]);

    XCTAssertEqualObjects(name1, result[0][@"name"]);
    XCTAssertEqualObjects(description1, result[0][@"description"]);

    XCTAssertEqualObjects(name2, result[1][@"name"]);
    XCTAssertEqualObjects(description2, result[1][@"description"]);

    NSArray *ids = [result valueForKey:@"folderId"];

    [self batchGetFoldersWithIds:ids exists:YES];
    [self batchDeleteFoldersWithIds:ids];
}

- (void)batchDeleteFoldersWithIds:(NSArray *)folderIds {
    LRBatchSession *batch = [[LRBatchSession alloc] init:self.session];

	LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:batch];

    NSError *error = nil;

    for (id folderId in folderIds) {
        [service deleteFolderWithFolderId:[folderId longLongValue]
			error:&error];

        XCTAssertNil(error);
    }

    NSArray *results = [batch invoke:&error];

    XCTAssertNil(error);
    XCTAssertNotNil(results);
    XCTAssertEqual([folderIds count], [results count]);

    [self batchGetFoldersWithIds:folderIds exists:NO];
}

- (void)batchGetFoldersWithIds:(NSArray*)folderIds exists:(BOOL)exists {
    LRBatchSession *batch = [[LRBatchSession alloc] init:self.session];

	LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:batch];

    NSError *error = nil;

    for (id folderId in folderIds) {
        [service getFolderWithFolderId:[folderId longLongValue] error:&error];
        XCTAssertNil(error);
    }

    NSArray *results = [batch invoke:&error];

    if (exists) {
        XCTAssertNil(error);
        XCTAssertNotNil(results);
        XCTAssertEqual([folderIds count], [results count]);

        for (int i = 0; i < [results count]; i++) {
            XCTAssertEqualObjects(results[i][@"folderId"], folderIds[i]);
        }
    }
    else {
        XCTAssertNil(results);
        XCTAssertNotNil(error);

		NSString *description = [error localizedDescription];
        XCTAssertTrue(
			[description hasPrefix:@"No DLFolder exists with the primary key"]);
    }
}

@end