@interface RoleService_v62 : NSObject

- (BOOL)hasUserRole:(NSNumber *)userId companyId:(NSNumber *)companyId name:(NSString *)name inherited:(BOOL)inherited;
- (NSArray *)getUserGroupRoles:(NSNumber *)userId groupId:(NSNumber *)groupId;
- (NSDictionary *)addRole:(NSString *)className classPK:(NSNumber *)classPK name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap type:(NSNumber *)type subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext;
- (void)unsetUserRoles:(NSNumber *)userId roleIds:(NSArray *)roleIds;
- (NSArray *)getUserRoles:(NSNumber *)userId;
- (NSArray *)getUserRelatedRoles:(NSNumber *)userId groups:(NSArray *)groups;
- (NSDictionary *)getRole:(NSNumber *)companyId name:(NSString *)name;
- (NSDictionary *)updateRole:(NSNumber *)roleId name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getGroupRoles:(NSNumber *)groupId;
- (void)deleteRole:(NSNumber *)roleId;
- (BOOL)hasUserRoles:(NSNumber *)userId companyId:(NSNumber *)companyId names:(NSArray *)names inherited:(BOOL)inherited;
- (void)addUserRoles:(NSNumber *)userId roleIds:(NSArray *)roleIds;
- (NSArray *)getUserGroupGroupRoles:(NSNumber *)userId groupId:(NSNumber *)groupId;

@end