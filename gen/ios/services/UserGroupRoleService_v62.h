@interface UserGroupRoleService_v62 : NSObject

- (void)addUserGroupRoles:(NSArray *)userIds groupId:(NSNumber *)groupId roleId:(NSNumber *)roleId;
- (void)deleteUserGroupRoles:(NSArray *)userIds groupId:(NSNumber *)groupId roleId:(NSNumber *)roleId;

@end