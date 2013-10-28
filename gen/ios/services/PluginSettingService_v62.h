@interface PluginSettingService_v62 : NSObject

- (NSDictionary *)updatePluginSetting:(NSNumber *)companyId pluginId:(NSString *)pluginId pluginType:(NSString *)pluginType roles:(NSString *)roles active:(BOOL)active;

@end