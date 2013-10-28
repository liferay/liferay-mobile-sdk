@interface RegionService_v62 : NSObject

- (NSDictionary *)fetchRegion:(NSNumber *)countryId regionCode:(NSString *)regionCode;
- (NSArray *)getRegions:(NSNumber *)countryId active:(BOOL)active;
- (NSDictionary *)getRegion:(NSNumber *)countryId regionCode:(NSString *)regionCode;
- (NSDictionary *)addRegion:(NSNumber *)countryId regionCode:(NSString *)regionCode name:(NSString *)name active:(BOOL)active;

@end