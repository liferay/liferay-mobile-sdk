@interface FlagsEntryService_v62 : NSObject

- (void)addEntry:(NSString *)className classPK:(NSNumber *)classPK reporterEmailAddress:(NSString *)reporterEmailAddress reportedUserId:(NSNumber *)reportedUserId contentTitle:(NSString *)contentTitle contentURL:(NSString *)contentURL reason:(NSString *)reason serviceContext:(NSDictionary *)serviceContext;

@end