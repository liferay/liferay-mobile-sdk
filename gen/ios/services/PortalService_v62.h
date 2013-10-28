@interface PortalService_v62 : NSObject

- (void)testGetUserId:;
- (void)testAutoSyncHibernateSessionStateOnTxCreation:;
- (void)testAddClassNameAndTestTransactionPortletBar_PortalRollback:(NSString *)transactionPortletBarText;
- (void)testAddClassNameAndTestTransactionPortletBar_Success:(NSString *)transactionPortletBarText;
- (void)testDeleteClassName:;
- (void)testAddClassNameAndTestTransactionPortletBar_PortletRollback:(NSString *)transactionPortletBarText;
- (BOOL)testHasClassName:;
- (NSString *)getAutoDeployDirectory:;
- (NSNumber *)getBuildNumber:;
- (void)testAddClassName_Success:(NSString *)classNameValue;
- (void)testAddClassName_Rollback:(NSString *)classNameValue;
- (NSNumber *)testGetBuildNumber:;

@end