@interface SCProductEntryService_v62 : NSObject

- (NSDictionary *)addProductEntry:(NSString *)name type:(NSString *)type tags:(NSString *)tags shortDescription:(NSString *)shortDescription longDescription:(NSString *)longDescription pageURL:(NSString *)pageURL author:(NSString *)author repoGroupId:(NSString *)repoGroupId repoArtifactId:(NSString *)repoArtifactId licenseIds:(NSArray *)licenseIds thumbnails:(NSArray *)thumbnails fullImages:(NSArray *)fullImages serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateProductEntry:(NSNumber *)productEntryId name:(NSString *)name type:(NSString *)type tags:(NSString *)tags shortDescription:(NSString *)shortDescription longDescription:(NSString *)longDescription pageURL:(NSString *)pageURL author:(NSString *)author repoGroupId:(NSString *)repoGroupId repoArtifactId:(NSString *)repoArtifactId licenseIds:(NSArray *)licenseIds thumbnails:(NSArray *)thumbnails fullImages:(NSArray *)fullImages;
- (NSDictionary *)getProductEntry:(NSNumber *)productEntryId;
- (void)deleteProductEntry:(NSNumber *)productEntryId;

@end