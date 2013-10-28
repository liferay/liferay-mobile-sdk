@interface CompanyService_v62 : NSObject

- (void)updateDisplay:(NSNumber *)companyId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId;
- (NSDictionary *)getCompanyByWebId:(NSString *)webId;
- (NSDictionary *)getCompanyByLogoId:(NSNumber *)logoId;
- (NSDictionary *)getCompanyByVirtualHost:(NSString *)virtualHost;
- (NSDictionary *)updateLogo:(NSNumber *)companyId bytes:(NSArray *)bytes;
- (NSDictionary *)getCompanyById:(NSNumber *)companyId;
- (NSDictionary *)getCompanyByMx:(NSString *)mx;
- (void)deleteLogo:(NSNumber *)companyId;
- (NSDictionary *)updateCompany:(NSNumber *)companyId virtualHost:(NSString *)virtualHost mx:(NSString *)mx maxUsers:(NSNumber *)maxUsers active:(BOOL)active;

@end