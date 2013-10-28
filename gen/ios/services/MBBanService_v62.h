@interface MBBanService_v62 : NSObject

- (void)deleteBan:(NSNumber *)banUserId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addBan:(NSNumber *)banUserId serviceContext:(NSDictionary *)serviceContext;

@end