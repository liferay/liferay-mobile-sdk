@interface AnnouncementsFlagService_v62 : NSObject

- (void)addFlag:(NSNumber *)entryId value:(NSNumber *)value;
- (void)deleteFlag:(NSNumber *)flagId;
- (NSDictionary *)getFlag:(NSNumber *)entryId value:(NSNumber *)value;

@end