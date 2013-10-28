@interface PortletPreferencesService_v62 : NSObject

- (void)updateArchivePreferences:(NSNumber *)userId groupId:(NSNumber *)groupId name:(NSString *)name portletId:(NSString *)portletId preferences:(NSDictionary *)preferences;
- (void)restoreArchivedPreferences:(NSNumber *)groupId name:(NSString *)name layout:(NSDictionary *)layout portletId:(NSString *)portletId preferences:(NSDictionary *)preferences;
- (void)deleteArchivedPreferences:(NSNumber *)portletItemId;

@end