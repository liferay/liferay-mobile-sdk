/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

#import "LRCommercediscountService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercediscountService_v73

- (NSDictionary *)addCommerceDiscountWithUserId:(long long)userId title:(NSString *)title target:(NSString *)target useCouponCode:(BOOL)useCouponCode couponCode:(NSString *)couponCode usePercentage:(BOOL)usePercentage maximumDiscountAmount:(NSDictionary *)maximumDiscountAmount level:(NSString *)level level1:(NSDictionary *)level1 level2:(NSDictionary *)level2 level3:(NSDictionary *)level3 level4:(NSDictionary *)level4 limitationType:(NSString *)limitationType limitationTimes:(int)limitationTimes rulesConjunction:(BOOL)rulesConjunction active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"useCouponCode": @(useCouponCode),
		@"couponCode": [self checkNull: couponCode],
		@"usePercentage": @(usePercentage),
		@"maximumDiscountAmount": [self checkNull: maximumDiscountAmount],
		@"level": [self checkNull: level],
		@"level1": [self checkNull: level1],
		@"level2": [self checkNull: level2],
		@"level3": [self checkNull: level3],
		@"level4": [self checkNull: level4],
		@"limitationType": [self checkNull: limitationType],
		@"limitationTimes": @(limitationTimes),
		@"rulesConjunction": @(rulesConjunction),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscount/add-commerce-discount": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceDiscountWithUserId:(long long)userId title:(NSString *)title target:(NSString *)target useCouponCode:(BOOL)useCouponCode couponCode:(NSString *)couponCode usePercentage:(BOOL)usePercentage maximumDiscountAmount:(NSDictionary *)maximumDiscountAmount level1:(NSDictionary *)level1 level2:(NSDictionary *)level2 level3:(NSDictionary *)level3 level4:(NSDictionary *)level4 limitationType:(NSString *)limitationType limitationTimes:(int)limitationTimes active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"useCouponCode": @(useCouponCode),
		@"couponCode": [self checkNull: couponCode],
		@"usePercentage": @(usePercentage),
		@"maximumDiscountAmount": [self checkNull: maximumDiscountAmount],
		@"level1": [self checkNull: level1],
		@"level2": [self checkNull: level2],
		@"level3": [self checkNull: level3],
		@"level4": [self checkNull: level4],
		@"limitationType": [self checkNull: limitationType],
		@"limitationTimes": @(limitationTimes),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscount/add-commerce-discount": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceDiscountWithUserId:(long long)userId title:(NSString *)title target:(NSString *)target useCouponCode:(BOOL)useCouponCode couponCode:(NSString *)couponCode usePercentage:(BOOL)usePercentage maximumDiscountAmount:(NSDictionary *)maximumDiscountAmount level:(NSString *)level level1:(NSDictionary *)level1 level2:(NSDictionary *)level2 level3:(NSDictionary *)level3 level4:(NSDictionary *)level4 limitationType:(NSString *)limitationType limitationTimes:(int)limitationTimes limitationTimesPerAccount:(int)limitationTimesPerAccount rulesConjunction:(BOOL)rulesConjunction active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute externalReferenceCode:(NSString *)externalReferenceCode neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"useCouponCode": @(useCouponCode),
		@"couponCode": [self checkNull: couponCode],
		@"usePercentage": @(usePercentage),
		@"maximumDiscountAmount": [self checkNull: maximumDiscountAmount],
		@"level": [self checkNull: level],
		@"level1": [self checkNull: level1],
		@"level2": [self checkNull: level2],
		@"level3": [self checkNull: level3],
		@"level4": [self checkNull: level4],
		@"limitationType": [self checkNull: limitationType],
		@"limitationTimes": @(limitationTimes),
		@"limitationTimesPerAccount": @(limitationTimesPerAccount),
		@"rulesConjunction": @(rulesConjunction),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscount/add-commerce-discount": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscount/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceDiscountWithCommerceDiscountId:(long long)commerceDiscountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscount/delete-commerce-discount": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceDiscountWithCommerceDiscountId:(long long)commerceDiscountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscount/fetch-commerce-discount": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceDiscountWithCommerceDiscountId:(long long)commerceDiscountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscount/get-commerce-discount": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceDiscountsWithCompanyId:(long long)companyId couponCode:(NSString *)couponCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"couponCode": [self checkNull: couponCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscount/get-commerce-discounts": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceDiscountsCountWithCompanyId:(long long)companyId couponCode:(NSString *)couponCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"couponCode": [self checkNull: couponCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscount/get-commerce-discounts-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceDiscountsCountByPricingClassIdWithCommercePricingClassId:(long long)commercePricingClassId title:(NSString *)title error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassId": @(commercePricingClassId),
		@"title": [self checkNull: title]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscount/get-commerce-discounts-count-by-pricing-class-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)searchByCommercePricingClassIdWithCommercePricingClassId:(long long)commercePricingClassId title:(NSString *)title start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassId": @(commercePricingClassId),
		@"title": [self checkNull: title],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscount/search-by-commerce-pricing-class-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCommerceDiscountsWithCompanyId:(long long)companyId keywords:(NSString *)keywords status:(int)status start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commercediscount/search-commerce-discounts": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceDiscountWithCommerceDiscountId:(long long)commerceDiscountId title:(NSString *)title target:(NSString *)target useCouponCode:(BOOL)useCouponCode couponCode:(NSString *)couponCode usePercentage:(BOOL)usePercentage maximumDiscountAmount:(NSDictionary *)maximumDiscountAmount level1:(NSDictionary *)level1 level2:(NSDictionary *)level2 level3:(NSDictionary *)level3 level4:(NSDictionary *)level4 limitationType:(NSString *)limitationType limitationTimes:(int)limitationTimes active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"useCouponCode": @(useCouponCode),
		@"couponCode": [self checkNull: couponCode],
		@"usePercentage": @(usePercentage),
		@"maximumDiscountAmount": [self checkNull: maximumDiscountAmount],
		@"level1": [self checkNull: level1],
		@"level2": [self checkNull: level2],
		@"level3": [self checkNull: level3],
		@"level4": [self checkNull: level4],
		@"limitationType": [self checkNull: limitationType],
		@"limitationTimes": @(limitationTimes),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscount/update-commerce-discount": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceDiscountWithCommerceDiscountId:(long long)commerceDiscountId title:(NSString *)title target:(NSString *)target useCouponCode:(BOOL)useCouponCode couponCode:(NSString *)couponCode usePercentage:(BOOL)usePercentage maximumDiscountAmount:(NSDictionary *)maximumDiscountAmount level:(NSString *)level level1:(NSDictionary *)level1 level2:(NSDictionary *)level2 level3:(NSDictionary *)level3 level4:(NSDictionary *)level4 limitationType:(NSString *)limitationType limitationTimes:(int)limitationTimes limitationTimesPerAccount:(int)limitationTimesPerAccount rulesConjunction:(BOOL)rulesConjunction active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"useCouponCode": @(useCouponCode),
		@"couponCode": [self checkNull: couponCode],
		@"usePercentage": @(usePercentage),
		@"maximumDiscountAmount": [self checkNull: maximumDiscountAmount],
		@"level": [self checkNull: level],
		@"level1": [self checkNull: level1],
		@"level2": [self checkNull: level2],
		@"level3": [self checkNull: level3],
		@"level4": [self checkNull: level4],
		@"limitationType": [self checkNull: limitationType],
		@"limitationTimes": @(limitationTimes),
		@"limitationTimesPerAccount": @(limitationTimesPerAccount),
		@"rulesConjunction": @(rulesConjunction),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscount/update-commerce-discount": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceDiscountWithCommerceDiscountId:(long long)commerceDiscountId title:(NSString *)title target:(NSString *)target useCouponCode:(BOOL)useCouponCode couponCode:(NSString *)couponCode usePercentage:(BOOL)usePercentage maximumDiscountAmount:(NSDictionary *)maximumDiscountAmount level:(NSString *)level level1:(NSDictionary *)level1 level2:(NSDictionary *)level2 level3:(NSDictionary *)level3 level4:(NSDictionary *)level4 limitationType:(NSString *)limitationType limitationTimes:(int)limitationTimes rulesConjunction:(BOOL)rulesConjunction active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"useCouponCode": @(useCouponCode),
		@"couponCode": [self checkNull: couponCode],
		@"usePercentage": @(usePercentage),
		@"maximumDiscountAmount": [self checkNull: maximumDiscountAmount],
		@"level": [self checkNull: level],
		@"level1": [self checkNull: level1],
		@"level2": [self checkNull: level2],
		@"level3": [self checkNull: level3],
		@"level4": [self checkNull: level4],
		@"limitationType": [self checkNull: limitationType],
		@"limitationTimes": @(limitationTimes),
		@"rulesConjunction": @(rulesConjunction),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscount/update-commerce-discount": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceDiscountExternalReferenceCodeWithCommerceDiscountId:(long long)commerceDiscountId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscount/update-commerce-discount-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceDiscountWithUserId:(long long)userId commerceDiscountId:(long long)commerceDiscountId title:(NSString *)title target:(NSString *)target useCouponCode:(BOOL)useCouponCode couponCode:(NSString *)couponCode usePercentage:(BOOL)usePercentage maximumDiscountAmount:(NSDictionary *)maximumDiscountAmount level1:(NSDictionary *)level1 level2:(NSDictionary *)level2 level3:(NSDictionary *)level3 level4:(NSDictionary *)level4 limitationType:(NSString *)limitationType limitationTimes:(int)limitationTimes active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute externalReferenceCode:(NSString *)externalReferenceCode neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceDiscountId": @(commerceDiscountId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"useCouponCode": @(useCouponCode),
		@"couponCode": [self checkNull: couponCode],
		@"usePercentage": @(usePercentage),
		@"maximumDiscountAmount": [self checkNull: maximumDiscountAmount],
		@"level1": [self checkNull: level1],
		@"level2": [self checkNull: level2],
		@"level3": [self checkNull: level3],
		@"level4": [self checkNull: level4],
		@"limitationType": [self checkNull: limitationType],
		@"limitationTimes": @(limitationTimes),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscount/upsert-commerce-discount": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceDiscountWithUserId:(long long)userId commerceDiscountId:(long long)commerceDiscountId title:(NSString *)title target:(NSString *)target useCouponCode:(BOOL)useCouponCode couponCode:(NSString *)couponCode usePercentage:(BOOL)usePercentage maximumDiscountAmount:(NSDictionary *)maximumDiscountAmount level:(NSString *)level level1:(NSDictionary *)level1 level2:(NSDictionary *)level2 level3:(NSDictionary *)level3 level4:(NSDictionary *)level4 limitationType:(NSString *)limitationType limitationTimes:(int)limitationTimes rulesConjunction:(BOOL)rulesConjunction active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute externalReferenceCode:(NSString *)externalReferenceCode neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceDiscountId": @(commerceDiscountId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"useCouponCode": @(useCouponCode),
		@"couponCode": [self checkNull: couponCode],
		@"usePercentage": @(usePercentage),
		@"maximumDiscountAmount": [self checkNull: maximumDiscountAmount],
		@"level": [self checkNull: level],
		@"level1": [self checkNull: level1],
		@"level2": [self checkNull: level2],
		@"level3": [self checkNull: level3],
		@"level4": [self checkNull: level4],
		@"limitationType": [self checkNull: limitationType],
		@"limitationTimes": @(limitationTimes),
		@"rulesConjunction": @(rulesConjunction),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscount/upsert-commerce-discount": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceDiscountWithUserId:(long long)userId commerceDiscountId:(long long)commerceDiscountId title:(NSString *)title target:(NSString *)target useCouponCode:(BOOL)useCouponCode couponCode:(NSString *)couponCode usePercentage:(BOOL)usePercentage maximumDiscountAmount:(NSDictionary *)maximumDiscountAmount level:(NSString *)level level1:(NSDictionary *)level1 level2:(NSDictionary *)level2 level3:(NSDictionary *)level3 level4:(NSDictionary *)level4 limitationType:(NSString *)limitationType limitationTimes:(int)limitationTimes limitationTimesPerAccount:(int)limitationTimesPerAccount rulesConjunction:(BOOL)rulesConjunction active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute externalReferenceCode:(NSString *)externalReferenceCode neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceDiscountId": @(commerceDiscountId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"useCouponCode": @(useCouponCode),
		@"couponCode": [self checkNull: couponCode],
		@"usePercentage": @(usePercentage),
		@"maximumDiscountAmount": [self checkNull: maximumDiscountAmount],
		@"level": [self checkNull: level],
		@"level1": [self checkNull: level1],
		@"level2": [self checkNull: level2],
		@"level3": [self checkNull: level3],
		@"level4": [self checkNull: level4],
		@"limitationType": [self checkNull: limitationType],
		@"limitationTimes": @(limitationTimes),
		@"limitationTimesPerAccount": @(limitationTimesPerAccount),
		@"rulesConjunction": @(rulesConjunction),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscount/upsert-commerce-discount": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end