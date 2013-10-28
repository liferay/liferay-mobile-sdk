@interface ContactService_v62 : NSObject

- (NSDictionary *)getContact:(NSNumber *)contactId;
- (NSNumber *)getContactsCount:(NSNumber *)classNameId classPK:(NSNumber *)classPK;
- (NSArray *)getContacts:(NSNumber *)classNameId classPK:(NSNumber *)classPK start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator;

@end