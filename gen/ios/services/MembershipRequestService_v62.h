@interface MembershipRequestService_v62 : NSObject

- (NSDictionary *)addMembershipRequest:(NSNumber *)groupId comments:(NSString *)comments serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getMembershipRequest:(NSNumber *)membershipRequestId;
- (void)updateStatus:(NSNumber *)membershipRequestId reviewComments:(NSString *)reviewComments statusId:(NSNumber *)statusId serviceContext:(NSDictionary *)serviceContext;
- (void)deleteMembershipRequests:(NSNumber *)groupId statusId:(NSNumber *)statusId;

@end