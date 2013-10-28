@interface MDRRuleService_v62 : NSObject

- (NSDictionary *)updateRule:(NSNumber *)ruleId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type typeSettingsProperties:(NSDictionary *)typeSettingsProperties serviceContext:(NSDictionary *)serviceContext;
- (void)deleteRule:(NSNumber *)ruleId;
- (NSDictionary *)addRule:(NSNumber *)ruleGroupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type typeSettings:(NSString *)typeSettings serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getRule:(NSNumber *)ruleId;
- (NSDictionary *)fetchRule:(NSNumber *)ruleId;

@end