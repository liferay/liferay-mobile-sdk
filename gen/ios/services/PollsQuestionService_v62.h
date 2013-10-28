@interface PollsQuestionService_v62 : NSObject

- (NSDictionary *)addQuestion:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap expirationDateMonth:(NSNumber *)expirationDateMonth expirationDateDay:(NSNumber *)expirationDateDay expirationDateYear:(NSNumber *)expirationDateYear expirationDateHour:(NSNumber *)expirationDateHour expirationDateMinute:(NSNumber *)expirationDateMinute neverExpire:(BOOL)neverExpire choices:(NSArray *)choices serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getQuestion:(NSNumber *)questionId;
- (NSDictionary *)updateQuestion:(NSNumber *)questionId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap expirationDateMonth:(NSNumber *)expirationDateMonth expirationDateDay:(NSNumber *)expirationDateDay expirationDateYear:(NSNumber *)expirationDateYear expirationDateHour:(NSNumber *)expirationDateHour expirationDateMinute:(NSNumber *)expirationDateMinute neverExpire:(BOOL)neverExpire choices:(NSArray *)choices serviceContext:(NSDictionary *)serviceContext;
- (void)deleteQuestion:(NSNumber *)questionId;

@end