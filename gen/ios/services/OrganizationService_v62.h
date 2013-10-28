@interface OrganizationService_v62 : NSObject

- (NSNumber *)getOrganizationsCount:(NSNumber *)companyId parentOrganizationId:(NSNumber *)parentOrganizationId;
- (void)unsetGroupOrganizations:(NSNumber *)groupId organizationIds:(NSArray *)organizationIds;
- (NSArray *)getUserOrganizations:(NSNumber *)userId;
- (NSArray *)getOrganizations:(NSNumber *)companyId parentOrganizationId:(NSNumber *)parentOrganizationId start:(NSNumber *)start end:(NSNumber *)end;
- (void)addPasswordPolicyOrganizations:(NSNumber *)passwordPolicyId organizationIds:(NSArray *)organizationIds;
- (void)deleteOrganization:(NSNumber *)organizationId;
- (NSDictionary *)updateOrganization:(NSNumber *)organizationId parentOrganizationId:(NSNumber *)parentOrganizationId name:(NSString *)name type:(NSString *)type recursable:(BOOL)recursable regionId:(NSNumber *)regionId countryId:(NSNumber *)countryId statusId:(NSNumber *)statusId comments:(NSString *)comments site:(BOOL)site addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses orgLabors:(NSArray *)orgLabors phones:(NSArray *)phones websites:(NSArray *)websites serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getOrganization:(NSNumber *)organizationId;
- (void)deleteLogo:(NSNumber *)organizationId;
- (NSNumber *)getOrganizationId:(NSNumber *)companyId name:(NSString *)name;
- (NSDictionary *)addOrganization:(NSNumber *)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(NSNumber *)regionId countryId:(NSNumber *)countryId statusId:(NSNumber *)statusId comments:(NSString *)comments site:(BOOL)site serviceContext:(NSDictionary *)serviceContext;
- (void)addGroupOrganizations:(NSNumber *)groupId organizationIds:(NSArray *)organizationIds;
- (void)unsetPasswordPolicyOrganizations:(NSNumber *)passwordPolicyId organizationIds:(NSArray *)organizationIds;
- (NSArray *)getManageableOrganizations:(NSString *)actionId max:(NSNumber *)max;
- (void)setGroupOrganizations:(NSNumber *)groupId organizationIds:(NSArray *)organizationIds;

@end