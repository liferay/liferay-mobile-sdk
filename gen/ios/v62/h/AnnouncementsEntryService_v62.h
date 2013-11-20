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
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface AnnouncementsEntryService_v62 : BaseService

- (NSDictionary *)addEntryWithPlid:(long)plid classNameId:(long)classNameId classPK:(long)classPK title:(NSString *)title content:(NSString *)content url:(NSString *)url type:(NSString *)type displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute priority:(int)priority alert:(BOOL)alert error:(NSError **)error;
- (NSDictionary *)addEntryWithPlid:(long)plid classNameId:(long)classNameId classPK:(long)classPK title:(NSString *)title content:(NSString *)content url:(NSString *)url type:(NSString *)type displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute displayImmediately:(BOOL)displayImmediately expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute priority:(int)priority alert:(BOOL)alert error:(NSError **)error;
- (void)deleteEntryWithEntryId:(long)entryId error:(NSError **)error;
- (NSDictionary *)getEntryWithEntryId:(long)entryId error:(NSError **)error;
- (NSDictionary *)updateEntryWithEntryId:(long)entryId title:(NSString *)title content:(NSString *)content url:(NSString *)url type:(NSString *)type displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute displayImmediately:(BOOL)displayImmediately expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute priority:(int)priority error:(NSError **)error;

@end