@interface UserGroupService_v62 : NSObject

- (void)unsetTeamUserGroups:(NSNumber *)teamId userGroupIds:(NSArray *)userGroupIds;
- (void)addTeamUserGroups:(NSNumber *)teamId userGroupIds:(NSArray *)userGroupIds;
- (void)addGroupUserGroups:(NSNumber *)groupId userGroupIds:(NSArray *)userGroupIds;
- (NSDictionary *)getUserGroup:(NSNumber *)userGroupId;
- (NSDictionary *)updateUserGroup:(NSNumber *)userGroupId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addUserGroup:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)deleteUserGroup:(NSNumber *)userGroupId;
- (void)unsetGroupUserGroups:(NSNumber *)groupId userGroupIds:(NSArray *)userGroupIds;
- (NSArray *)getUserUserGroups:(NSNumber *)userId;

@end