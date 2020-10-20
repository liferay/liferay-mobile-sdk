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
@interface LRCpattachmentfileentryService_v73 : LRBaseService

- (NSDictionary *)fetchCpAttachmentFileEntryWithCpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId error:(NSError **)error;
- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCpAttachmentFileEntryWithUserId:(long long)userId groupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK fileEntryId:(long long)fileEntryId displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire titleMap:(NSDictionary *)titleMap json:(NSString *)json priority:(double)priority type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCpAttachmentFileEntryWithCpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCpAttachmentFileEntriesWithClassNameId:(long long)classNameId classPK:(long long)classPK type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCpAttachmentFileEntriesWithClassNameId:(long long)classNameId classPK:(long long)classPK type:(int)type status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCpAttachmentFileEntriesCountWithClassNameId:(long long)classNameId classPK:(long long)classPK type:(int)type status:(int)status error:(NSError **)error;
- (NSDictionary *)updateCpAttachmentFileEntryWithCpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId fileEntryId:(long long)fileEntryId displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire titleMap:(NSDictionary *)titleMap json:(NSString *)json priority:(double)priority type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)upsertCpAttachmentFileEntryWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK cpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId fileEntryId:(long long)fileEntryId displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire titleMap:(NSDictionary *)titleMap json:(NSString *)json priority:(double)priority type:(int)type externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)upsertCpAttachmentFileEntryWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK fileEntryId:(long long)fileEntryId displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire titleMap:(NSDictionary *)titleMap json:(NSString *)json priority:(double)priority type:(int)type externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getCpAttachmentFileEntryWithCpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId error:(NSError **)error;

@end