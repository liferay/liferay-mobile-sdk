/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

#import <Foundation/Foundation.h>

/**
 * author Bruno Farache
 */
@interface AnnouncementsEntryService_v62 : NSObject

- (NSDictionary *)addEntry:(NSNumber *)plid classNameId:(NSNumber *)classNameId classPK:(NSNumber *)classPK title:(NSString *)title content:(NSString *)content url:(NSString *)url type:(NSString *)type displayDateMonth:(NSNumber *)displayDateMonth displayDateDay:(NSNumber *)displayDateDay displayDateYear:(NSNumber *)displayDateYear displayDateHour:(NSNumber *)displayDateHour displayDateMinute:(NSNumber *)displayDateMinute displayImmediately:(BOOL)displayImmediately expirationDateMonth:(NSNumber *)expirationDateMonth expirationDateDay:(NSNumber *)expirationDateDay expirationDateYear:(NSNumber *)expirationDateYear expirationDateHour:(NSNumber *)expirationDateHour expirationDateMinute:(NSNumber *)expirationDateMinute priority:(NSNumber *)priority alert:(BOOL)alert;
- (NSDictionary *)getEntry:(NSNumber *)entryId;
- (NSDictionary *)updateEntry:(NSNumber *)entryId title:(NSString *)title content:(NSString *)content url:(NSString *)url type:(NSString *)type displayDateMonth:(NSNumber *)displayDateMonth displayDateDay:(NSNumber *)displayDateDay displayDateYear:(NSNumber *)displayDateYear displayDateHour:(NSNumber *)displayDateHour displayDateMinute:(NSNumber *)displayDateMinute expirationDateMonth:(NSNumber *)expirationDateMonth expirationDateDay:(NSNumber *)expirationDateDay expirationDateYear:(NSNumber *)expirationDateYear expirationDateHour:(NSNumber *)expirationDateHour expirationDateMinute:(NSNumber *)expirationDateMinute priority:(NSNumber *)priority;
- (void)deleteEntry:(NSNumber *)entryId;

@end