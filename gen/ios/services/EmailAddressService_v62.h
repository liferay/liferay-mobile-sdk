@interface EmailAddressService_v62 : NSObject

- (NSDictionary *)updateEmailAddress:(NSNumber *)emailAddressId address:(NSString *)address typeId:(NSNumber *)typeId primary:(BOOL)primary;
- (NSArray *)getEmailAddresses:(NSString *)className classPK:(NSNumber *)classPK;
- (NSDictionary *)getEmailAddress:(NSNumber *)emailAddressId;
- (NSDictionary *)addEmailAddress:(NSString *)className classPK:(NSNumber *)classPK address:(NSString *)address typeId:(NSNumber *)typeId primary:(BOOL)primary serviceContext:(NSDictionary *)serviceContext;
- (void)deleteEmailAddress:(NSNumber *)emailAddressId;

@end