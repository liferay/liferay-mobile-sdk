@interface CountryService_v62 : NSObject

- (NSDictionary *)getCountryByName:(NSString *)name;
- (NSDictionary *)getCountryByA2:(NSString *)a2;
- (NSDictionary *)getCountryByA3:(NSString *)a3;
- (NSDictionary *)fetchCountry:(NSNumber *)countryId;
- (NSDictionary *)getCountry:(NSNumber *)countryId;
- (NSDictionary *)fetchCountryByA3:(NSString *)a3;
- (NSDictionary *)fetchCountryByA2:(NSString *)a2;
- (NSArray *)getCountries:(BOOL)active;
- (NSDictionary *)addCountry:(NSString *)name a2:(NSString *)a2 a3:(NSString *)a3 number:(NSString *)number idd:(NSString *)idd active:(BOOL)active;

@end