@interface BlogsEntryService_v62 : NSObject

- (void)unsubscribe:(NSNumber *)groupId;
- (NSDictionary *)getEntry:(NSNumber *)groupId urlTitle:(NSString *)urlTitle;
- (NSArray *)getGroupsEntries:(NSNumber *)companyId groupId:(NSNumber *)groupId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max;
- (NSArray *)getCompanyEntries:(NSNumber *)companyId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max;
- (void)deleteEntry:(NSNumber *)entryId;
- (NSDictionary *)moveEntryToTrash:(NSNumber *)entryId;
- (NSString *)getCompanyEntriesRss:(NSNumber *)companyId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (NSString *)getGroupEntriesRss:(NSNumber *)groupId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (NSArray *)getGroupEntries:(NSNumber *)groupId displayDate:(NSNumber *)displayDate status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (NSNumber *)getGroupEntriesCount:(NSNumber *)groupId displayDate:(NSNumber *)displayDate status:(NSNumber *)status;
- (void)restoreEntryFromTrash:(NSNumber *)entryId;
- (void)subscribe:(NSNumber *)groupId;
- (NSString *)getOrganizationEntriesRss:(NSNumber *)organizationId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (NSArray *)getOrganizationEntries:(NSNumber *)organizationId displayDate:(NSNumber *)displayDate status:(NSNumber *)status max:(NSNumber *)max;

@end