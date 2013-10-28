@interface AnnouncementsDeliveryService_v62 : NSObject

- (NSDictionary *)updateDelivery:(NSNumber *)userId type:(NSString *)type email:(BOOL)email sms:(BOOL)sms website:(BOOL)website;

@end