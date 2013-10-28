@interface PortletService_v62 : NSObject

- (NSDictionary *)updatePortlet:(NSNumber *)companyId portletId:(NSString *)portletId roles:(NSString *)roles active:(BOOL)active;
- (NSDictionary *)getWarPortlets:;

@end