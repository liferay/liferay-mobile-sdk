@interface LayoutSetService_v62 : NSObject

- (NSDictionary *)updateSettings:(NSNumber *)groupId privateLayout:(BOOL)privateLayout settings:(NSString *)settings;
- (NSDictionary *)updateLookAndFeel:(NSNumber *)groupId privateLayout:(BOOL)privateLayout themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId css:(NSString *)css wapTheme:(BOOL)wapTheme;
- (void)updateLogo:(NSNumber *)groupId privateLayout:(BOOL)privateLayout logo:(BOOL)logo file:(NSDictionary *)file;
- (void)updateLayoutSetPrototypeLinkEnabled:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutSetPrototypeLinkEnabled:(BOOL)layoutSetPrototypeLinkEnabled layoutSetPrototypeUuid:(NSString *)layoutSetPrototypeUuid;
- (NSDictionary *)updateVirtualHost:(NSNumber *)groupId privateLayout:(BOOL)privateLayout virtualHost:(NSString *)virtualHost;

@end