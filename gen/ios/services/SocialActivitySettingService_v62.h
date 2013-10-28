@interface SocialActivitySettingService_v62 : NSObject

- (NSDictionary *)getActivityDefinition:(NSNumber *)groupId className:(NSString *)className activityType:(NSNumber *)activityType;
- (NSArray *)getActivityDefinitions:(NSNumber *)groupId className:(NSString *)className;
- (NSDictionary *)getJsonActivityDefinitions:(NSNumber *)groupId className:(NSString *)className;
- (void)updateActivitySettings:(NSNumber *)groupId className:(NSString *)className activityType:(NSNumber *)activityType activityCounterDefinitions:(NSArray *)activityCounterDefinitions;
- (NSArray *)getActivitySettings:(NSNumber *)groupId;
- (void)updateActivitySetting:(NSNumber *)groupId className:(NSString *)className activityType:(NSNumber *)activityType activityCounterDefinition:(NSDictionary *)activityCounterDefinition;

@end