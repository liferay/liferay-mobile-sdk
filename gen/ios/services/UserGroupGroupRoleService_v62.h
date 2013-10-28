@interface UserGroupGroupRoleService_v62 : NSObject

- (void)deleteUserGroupGroupRoles:(NSArray *)userGroupIds groupId:(NSNumber *)groupId roleId:(NSNumber *)roleId;
- (void)addUserGroupGroupRoles:(NSArray *)userGroupIds groupId:(NSNumber *)groupId roleId:(NSNumber *)roleId;

@end