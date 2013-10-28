@interface SCLicenseService_v62 : NSObject

- (void)deleteLicense:(NSNumber *)licenseId;
- (NSDictionary *)updateLicense:(NSNumber *)licenseId name:(NSString *)name url:(NSString *)url openSource:(BOOL)openSource active:(BOOL)active recommended:(BOOL)recommended;
- (NSDictionary *)getLicense:(NSNumber *)licenseId;
- (NSDictionary *)addLicense:(NSString *)name url:(NSString *)url openSource:(BOOL)openSource active:(BOOL)active recommended:(BOOL)recommended;

@end