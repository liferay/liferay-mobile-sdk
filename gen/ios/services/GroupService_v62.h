@interface GroupService_v62 : NSObject

- (void)unsetRoleGroups:(NSNumber *)roleId groupIds:(NSArray *)groupIds;
- (NSDictionary *)addGroup:(NSNumber *)parentGroupId name:(NSString *)name description:(NSString *)description type:(NSNumber *)type friendlyURL:(NSString *)friendlyURL site:(BOOL)site active:(BOOL)active serviceContext:(NSDictionary *)serviceContext;
- (BOOL)hasUserGroup:(NSNumber *)userId groupId:(NSNumber *)groupId;
- (NSDictionary *)updateFriendlyUrl:(NSNumber *)groupId friendlyURL:(NSString *)friendlyURL;
- (NSArray *)getOrganizationsGroups:(NSArray *)organizations;
- (void)checkRemoteStagingGroup:(NSNumber *)groupId;
- (NSNumber *)getUserPlacesCount:;
- (void)enableStaging:(NSNumber *)groupId;
- (NSArray *)getUserGroupsGroups:(NSArray *)userGroups;
- (NSNumber *)getUserSitesGroupsCount:;
- (NSDictionary *)getUserGroup:(NSNumber *)companyId userId:(NSNumber *)userId;
- (NSArray *)getUserOrganizationsGroups:(NSNumber *)userId start:(NSNumber *)start end:(NSNumber *)end;
- (void)setRoleGroups:(NSNumber *)roleId groupIds:(NSArray *)groupIds;
- (NSArray *)getManageableSites:(NSDictionary *)portlets max:(NSNumber *)max;
- (void)addRoleGroups:(NSNumber *)roleId groupIds:(NSArray *)groupIds;
- (NSArray *)getUserSites:;
- (NSDictionary *)getGroup:(NSNumber *)companyId name:(NSString *)name;
- (NSDictionary *)getCompanyGroup:(NSNumber *)companyId;
- (NSArray *)getUserPlaces:(NSNumber *)userId classNames:(NSArray *)classNames name:(NSString *)name active:(BOOL)active includeControlPanel:(BOOL)includeControlPanel start:(NSNumber *)start end:(NSNumber *)end;
- (void)disableStaging:(NSNumber *)groupId;
- (void)deleteGroup:(NSNumber *)groupId;
- (void)updateStagedPortlets:(NSNumber *)groupId stagedPortletIds:(NSDictionary *)stagedPortletIds;
- (NSNumber *)searchCount:(NSNumber *)companyId name:(NSString *)name description:(NSString *)description params:(NSArray *)params;
- (NSArray *)getManageableSiteGroups:(NSDictionary *)portlets max:(NSNumber *)max;
- (NSDictionary *)updateGroup:(NSNumber *)groupId typeSettings:(NSString *)typeSettings;
- (NSArray *)search:(NSNumber *)companyId name:(NSString *)name description:(NSString *)description params:(NSArray *)params start:(NSNumber *)start end:(NSNumber *)end;
- (NSArray *)getUserSitesGroups:(NSNumber *)userId classNames:(NSArray *)classNames name:(NSString *)name active:(BOOL)active includeControlPanel:(BOOL)includeControlPanel start:(NSNumber *)start end:(NSNumber *)end;
- (NSArray *)getGroups:(NSNumber *)companyId parentGroupId:(NSNumber *)parentGroupId site:(BOOL)site;

@end