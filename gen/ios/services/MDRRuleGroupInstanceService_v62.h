@interface MDRRuleGroupInstanceService_v62 : NSObject

- (void)deleteRuleGroupInstance:(NSNumber *)ruleGroupInstanceId;
- (NSDictionary *)updateRuleGroupInstance:(NSNumber *)ruleGroupInstanceId priority:(NSNumber *)priority;
- (NSDictionary *)addRuleGroupInstance:(NSNumber *)groupId className:(NSString *)className classPK:(NSNumber *)classPK ruleGroupId:(NSNumber *)ruleGroupId priority:(NSNumber *)priority serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getRuleGroupInstances:(NSString *)className classPK:(NSNumber *)classPK start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator;
- (NSNumber *)getRuleGroupInstancesCount:(NSString *)className classPK:(NSNumber *)classPK;

@end