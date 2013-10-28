@interface ShoppingOrderService_v62 : NSObject

- (NSDictionary *)updateOrder:(NSNumber *)groupId orderId:(NSNumber *)orderId ppTxnId:(NSString *)ppTxnId ppPaymentStatus:(NSString *)ppPaymentStatus ppPaymentGross:(NSNumber *)ppPaymentGross ppReceiverEmail:(NSString *)ppReceiverEmail ppPayerEmail:(NSString *)ppPayerEmail;
- (void)deleteOrder:(NSNumber *)groupId orderId:(NSNumber *)orderId;
- (NSDictionary *)getOrder:(NSNumber *)groupId orderId:(NSNumber *)orderId;
- (void)completeOrder:(NSNumber *)groupId number:(NSString *)number ppTxnId:(NSString *)ppTxnId ppPaymentStatus:(NSString *)ppPaymentStatus ppPaymentGross:(NSNumber *)ppPaymentGross ppReceiverEmail:(NSString *)ppReceiverEmail ppPayerEmail:(NSString *)ppPayerEmail serviceContext:(NSDictionary *)serviceContext;
- (void)sendEmail:(NSNumber *)groupId orderId:(NSNumber *)orderId emailType:(NSString *)emailType serviceContext:(NSDictionary *)serviceContext;

@end