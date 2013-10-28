@interface PollsVoteService_v62 : NSObject

- (NSDictionary *)addVote:(NSNumber *)questionId choiceId:(NSNumber *)choiceId serviceContext:(NSDictionary *)serviceContext;

@end