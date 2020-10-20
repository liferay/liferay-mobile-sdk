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

#import "LRCpattachmentfileentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpattachmentfileentryService_v73

- (NSDictionary *)fetchCpAttachmentFileEntryWithCpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpAttachmentFileEntryId": @(cpAttachmentFileEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.cpattachmentfileentry/fetch-cp-attachment-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.cpattachmentfileentry/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpAttachmentFileEntryWithUserId:(long long)userId groupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK fileEntryId:(long long)fileEntryId displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire titleMap:(NSDictionary *)titleMap json:(NSString *)json priority:(double)priority type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"fileEntryId": @(fileEntryId),
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
		@"titleMap": [self checkNull: titleMap],
		@"json": [self checkNull: json],
		@"priority": @(priority),
		@"type": @(type),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpattachmentfileentry/add-cp-attachment-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpAttachmentFileEntryWithCpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpAttachmentFileEntryId": @(cpAttachmentFileEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.cpattachmentfileentry/delete-cp-attachment-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCpAttachmentFileEntriesWithClassNameId:(long long)classNameId classPK:(long long)classPK type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"type": @(type),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPAttachmentFileEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpattachmentfileentry/get-cp-attachment-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpAttachmentFileEntriesWithClassNameId:(long long)classNameId classPK:(long long)classPK type:(int)type status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"type": @(type),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.cpattachmentfileentry/get-cp-attachment-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpAttachmentFileEntriesCountWithClassNameId:(long long)classNameId classPK:(long long)classPK type:(int)type status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"type": @(type),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/commerce.cpattachmentfileentry/get-cp-attachment-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpAttachmentFileEntryWithCpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId fileEntryId:(long long)fileEntryId displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire titleMap:(NSDictionary *)titleMap json:(NSString *)json priority:(double)priority type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpAttachmentFileEntryId": @(cpAttachmentFileEntryId),
		@"fileEntryId": @(fileEntryId),
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
		@"titleMap": [self checkNull: titleMap],
		@"json": [self checkNull: json],
		@"priority": @(priority),
		@"type": @(type),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpattachmentfileentry/update-cp-attachment-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCpAttachmentFileEntryWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK cpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId fileEntryId:(long long)fileEntryId displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire titleMap:(NSDictionary *)titleMap json:(NSString *)json priority:(double)priority type:(int)type externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"cpAttachmentFileEntryId": @(cpAttachmentFileEntryId),
		@"fileEntryId": @(fileEntryId),
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
		@"titleMap": [self checkNull: titleMap],
		@"json": [self checkNull: json],
		@"priority": @(priority),
		@"type": @(type),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpattachmentfileentry/upsert-cp-attachment-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCpAttachmentFileEntryWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK fileEntryId:(long long)fileEntryId displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire titleMap:(NSDictionary *)titleMap json:(NSString *)json priority:(double)priority type:(int)type externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"fileEntryId": @(fileEntryId),
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
		@"titleMap": [self checkNull: titleMap],
		@"json": [self checkNull: json],
		@"priority": @(priority),
		@"type": @(type),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpattachmentfileentry/upsert-cp-attachment-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpAttachmentFileEntryWithCpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpAttachmentFileEntryId": @(cpAttachmentFileEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.cpattachmentfileentry/get-cp-attachment-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end