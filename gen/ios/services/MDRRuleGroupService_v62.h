@interface MDRRuleGroupService_v62 : NSObject

- (NSDictionary *)copyRuleGroup:(NSNumber *)ruleGroupId groupId:(NSNumber *)groupId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateRuleGroup:(NSNumber *)ruleGroupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext;
- (void)deleteRuleGroup:(NSNumber *)ruleGroupId;
- (NSDictionary *)fetchRuleGroup:(NSNumber *)ruleGroupId;
- (NSDictionary *)addRuleGroup:(NSNumber *)groupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getRuleGroup:(NSNumber *)ruleGroupId;

@end