@interface ResourceBlockService_v62 : NSObject

- (void)setCompanyScopePermissions:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionIds:(NSArray *)actionIds;
- (void)addGroupScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId;
- (void)addCompanyScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId;
- (void)removeGroupScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId;
- (void)setGroupScopePermissions:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name roleId:(NSNumber *)roleId actionIds:(NSArray *)actionIds;
- (void)removeCompanyScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId;
- (void)removeIndividualScopePermission:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name primKey:(NSNumber *)primKey roleId:(NSNumber *)roleId actionId:(NSString *)actionId;
- (void)removeAllGroupScopePermissions:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId;
- (void)addIndividualScopePermission:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name primKey:(NSNumber *)primKey roleId:(NSNumber *)roleId actionId:(NSString *)actionId;
- (void)setIndividualScopePermissions:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name primKey:(NSNumber *)primKey roleId:(NSNumber *)roleId actionIds:(NSArray *)actionIds;

@end