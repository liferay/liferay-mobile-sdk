@interface PhoneService_v62 : NSObject

- (NSArray *)getPhones:(NSString *)className classPK:(NSNumber *)classPK;
- (NSDictionary *)getPhone:(NSNumber *)phoneId;
- (NSDictionary *)addPhone:(NSString *)className classPK:(NSNumber *)classPK number:(NSString *)number extension:(NSString *)extension typeId:(NSNumber *)typeId primary:(BOOL)primary serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updatePhone:(NSNumber *)phoneId number:(NSString *)number extension:(NSString *)extension typeId:(NSNumber *)typeId primary:(BOOL)primary;
- (void)deletePhone:(NSNumber *)phoneId;

@end