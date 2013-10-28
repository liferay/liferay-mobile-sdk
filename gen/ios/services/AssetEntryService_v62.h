@interface AssetEntryService_v62 : NSObject

- (NSDictionary *)updateEntry:(NSNumber *)groupId createDate:(NSNumber *)createDate modifiedDate:(NSNumber *)modifiedDate className:(NSString *)className classPK:(NSNumber *)classPK classUuid:(NSString *)classUuid classTypeId:(NSNumber *)classTypeId categoryIds:(NSArray *)categoryIds tagNames:(NSArray *)tagNames visible:(BOOL)visible startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate expirationDate:(NSNumber *)expirationDate mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description summary:(NSString *)summary url:(NSString *)url layoutUuid:(NSString *)layoutUuid height:(NSNumber *)height width:(NSNumber *)width priority:(NSDictionary *)priority sync:(BOOL)sync;
- (NSArray *)getEntries:(NSDictionary *)entryQuery;
- (NSArray *)getCompanyEntries:(NSNumber *)companyId start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)incrementViewCounter:(NSString *)className classPK:(NSNumber *)classPK;
- (NSNumber *)getEntriesCount:(NSDictionary *)entryQuery;
- (NSNumber *)getCompanyEntriesCount:(NSNumber *)companyId;
- (NSDictionary *)getEntry:(NSNumber *)entryId;

@end