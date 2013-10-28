@interface RatingsEntryService_v62 : NSObject

- (NSDictionary *)updateEntry:(NSString *)className classPK:(NSNumber *)classPK score:(NSNumber *)score;
- (void)deleteEntry:(NSString *)className classPK:(NSNumber *)classPK;

@end