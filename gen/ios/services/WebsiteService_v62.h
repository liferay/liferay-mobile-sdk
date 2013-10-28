@interface WebsiteService_v62 : NSObject

- (NSArray *)getWebsites:(NSString *)className classPK:(NSNumber *)classPK;
- (NSDictionary *)updateWebsite:(NSNumber *)websiteId url:(NSString *)url typeId:(NSNumber *)typeId primary:(BOOL)primary;
- (void)deleteWebsite:(NSNumber *)websiteId;
- (NSDictionary *)addWebsite:(NSString *)className classPK:(NSNumber *)classPK url:(NSString *)url typeId:(NSNumber *)typeId primary:(BOOL)primary serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getWebsite:(NSNumber *)websiteId;

@end