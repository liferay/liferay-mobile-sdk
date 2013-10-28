@interface MDRActionService_v62 : NSObject

- (NSDictionary *)updateAction:(NSNumber *)actionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type typeSettingsProperties:(NSDictionary *)typeSettingsProperties serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addAction:(NSNumber *)ruleGroupInstanceId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type typeSettingsProperties:(NSDictionary *)typeSettingsProperties serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getAction:(NSNumber *)actionId;
- (void)deleteAction:(NSNumber *)actionId;
- (NSDictionary *)fetchAction:(NSNumber *)actionId;

@end