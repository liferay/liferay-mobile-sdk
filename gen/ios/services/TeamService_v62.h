@interface TeamService_v62 : NSObject

- (NSDictionary *)addTeam:(NSNumber *)groupId name:(NSString *)name description:(NSString *)description;
- (NSArray *)getUserTeams:(NSNumber *)userId groupId:(NSNumber *)groupId;
- (NSDictionary *)updateTeam:(NSNumber *)teamId name:(NSString *)name description:(NSString *)description;
- (BOOL)hasUserTeam:(NSNumber *)userId teamId:(NSNumber *)teamId;
- (NSDictionary *)getTeam:(NSNumber *)groupId name:(NSString *)name;
- (NSArray *)getGroupTeams:(NSNumber *)groupId;
- (void)deleteTeam:(NSNumber *)teamId;

@end