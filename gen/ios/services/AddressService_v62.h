@interface AddressService_v62 : NSObject

- (void)deleteAddress:(NSNumber *)addressId;
- (NSDictionary *)getAddress:(NSNumber *)addressId;
- (NSDictionary *)updateAddress:(NSNumber *)addressId street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip regionId:(NSNumber *)regionId countryId:(NSNumber *)countryId typeId:(NSNumber *)typeId mailing:(BOOL)mailing primary:(BOOL)primary;
- (NSArray *)getAddresses:(NSString *)className classPK:(NSNumber *)classPK;
- (NSDictionary *)addAddress:(NSString *)className classPK:(NSNumber *)classPK street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip regionId:(NSNumber *)regionId countryId:(NSNumber *)countryId typeId:(NSNumber *)typeId mailing:(BOOL)mailing primary:(BOOL)primary serviceContext:(NSDictionary *)serviceContext;

@end