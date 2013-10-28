@interface ResourcePermissionService_v62 : NSObject

- (void)removeResourcePermissions:(NSNumber *)groupId companyId:(NSNumber *)companyId name:(NSString *)name scope:(NSNumber *)scope roleId:(NSNumber *)roleId actionId:(NSString *)actionId;
- (void)addResourcePermission:(NSNumber *)groupId companyId:(NSNumber *)companyId name:(NSString *)name scope:(NSNumber *)scope primKey:(NSString *)primKey roleId:(NSNumber *)roleId actionId:(NSString *)actionId;
- (void)setIndividualResourcePermissions:(NSNumber *)groupId companyId:(NSNumber *)companyId name:(NSString *)name primKey:(NSString *)primKey roleId:(NSNumber *)roleId actionIds:(NSArray *)actionIds;
- (void)removeResourcePermission:(NSNumber *)groupId companyId:(NSNumber *)companyId name:(NSString *)name scope:(NSNumber *)scope primKey:(NSString *)primKey roleId:(NSNumber *)roleId actionId:(NSString *)actionId;

@end