@interface SCProductVersionService_v62 : NSObject

- (NSNumber *)getProductVersionsCount:(NSNumber *)productEntryId;
- (NSDictionary *)updateProductVersion:(NSNumber *)productVersionId version:(NSString *)version changeLog:(NSString *)changeLog downloadPageURL:(NSString *)downloadPageURL directDownloadURL:(NSString *)directDownloadURL testDirectDownloadURL:(BOOL)testDirectDownloadURL repoStoreArtifact:(BOOL)repoStoreArtifact frameworkVersionIds:(NSArray *)frameworkVersionIds;
- (NSDictionary *)addProductVersion:(NSNumber *)productEntryId version:(NSString *)version changeLog:(NSString *)changeLog downloadPageURL:(NSString *)downloadPageURL directDownloadURL:(NSString *)directDownloadURL testDirectDownloadURL:(BOOL)testDirectDownloadURL repoStoreArtifact:(BOOL)repoStoreArtifact frameworkVersionIds:(NSArray *)frameworkVersionIds serviceContext:(NSDictionary *)serviceContext;
- (void)deleteProductVersion:(NSNumber *)productVersionId;
- (NSDictionary *)getProductVersion:(NSNumber *)productVersionId;
- (NSArray *)getProductVersions:(NSNumber *)productEntryId start:(NSNumber *)start end:(NSNumber *)end;

@end