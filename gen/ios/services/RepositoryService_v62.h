@interface RepositoryService_v62 : NSObject

- (NSDictionary *)getRepositoryImpl:(NSNumber *)folderId fileEntryId:(NSNumber *)fileEntryId fileVersionId:(NSNumber *)fileVersionId;
- (NSDictionary *)addRepository:(NSNumber *)groupId classNameId:(NSNumber *)classNameId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description portletId:(NSString *)portletId typeSettingsProperties:(NSDictionary *)typeSettingsProperties serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getLocalRepositoryImpl:(NSNumber *)folderId fileEntryId:(NSNumber *)fileEntryId fileVersionId:(NSNumber *)fileVersionId;
- (NSDictionary *)getRepository:(NSNumber *)repositoryId;
- (NSArray *)getSupportedParameters:(NSNumber *)classNameId configuration:(NSString *)configuration;
- (void)updateRepository:(NSNumber *)repositoryId name:(NSString *)name description:(NSString *)description;
- (NSDictionary *)getTypeSettingsProperties:(NSNumber *)repositoryId;
- (void)deleteRepository:(NSNumber *)repositoryId;
- (NSArray *)getSupportedConfigurations:(NSNumber *)classNameId;
- (void)checkRepository:(NSNumber *)repositoryId;

@end