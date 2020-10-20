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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LRCommercepricemodifierrelService_v73 : LRBaseService

- (NSArray *)getClassPKsWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId className:(NSString *)className error:(NSError **)error;
- (NSDictionary *)addCommercePriceModifierRelWithCommercePriceModifierId:(long long)commercePriceModifierId className:(NSString *)className classPK:(long long)classPK serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommercePriceModifierRelWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommercePriceModifierRelWithCommercePriceModifierId:(long long)commercePriceModifierId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSArray *)getCategoriesCommercePriceModifierRelsWithCommercePriceModifierId:(long long)commercePriceModifierId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCategoriesCommercePriceModifierRelsCountWithCommercePriceModifierId:(long long)commercePriceModifierId name:(NSString *)name error:(NSError **)error;
- (NSArray *)getCommercePriceModifierRelsWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId className:(NSString *)className start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommercePriceModifierRelsWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId className:(NSString *)className error:(NSError **)error;
- (NSNumber *)getCommercePriceModifierRelsCountWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId className:(NSString *)className error:(NSError **)error;
- (NSArray *)getCommercePriceModifiersRelsWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSArray *)getCommercePricingClassesCommercePriceModifierRelsWithCommercePriceModifierId:(long long)commercePriceModifierId title:(NSString *)title start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommercePricingClassesCommercePriceModifierRelsCountWithCommercePriceModifierId:(long long)commercePriceModifierId title:(NSString *)title error:(NSError **)error;
- (NSArray *)getCpDefinitionsCommercePriceModifierRelsWithCommercePriceModifierId:(long long)commercePriceModifierId name:(NSString *)name languageId:(NSString *)languageId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCpDefinitionsCommercePriceModifierRelsCountWithCommercePriceModifierId:(long long)commercePriceModifierId name:(NSString *)name languageId:(NSString *)languageId error:(NSError **)error;
- (NSDictionary *)getCommercePriceModifierRelWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId error:(NSError **)error;

@end