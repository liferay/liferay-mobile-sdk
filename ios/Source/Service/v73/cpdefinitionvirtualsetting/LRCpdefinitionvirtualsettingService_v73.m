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

#import "LRCpdefinitionvirtualsettingService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpdefinitionvirtualsettingService_v73

- (NSDictionary *)addCpDefinitionVirtualSettingWithClassName:(NSString *)className classPK:(long long)classPK fileEntryId:(long long)fileEntryId url:(NSString *)url activationStatus:(int)activationStatus duration:(long long)duration maxUsages:(int)maxUsages useSample:(BOOL)useSample sampleFileEntryId:(long long)sampleFileEntryId sampleUrl:(NSString *)sampleUrl termsOfUseRequired:(BOOL)termsOfUseRequired termsOfUseContentMap:(NSDictionary *)termsOfUseContentMap termsOfUseJournalArticleResourcePrimKey:(long long)termsOfUseJournalArticleResourcePrimKey serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"fileEntryId": @(fileEntryId),
		@"url": [self checkNull: url],
		@"activationStatus": @(activationStatus),
		@"duration": @(duration),
		@"maxUsages": @(maxUsages),
		@"useSample": @(useSample),
		@"sampleFileEntryId": @(sampleFileEntryId),
		@"sampleUrl": [self checkNull: sampleUrl],
		@"termsOfUseRequired": @(termsOfUseRequired),
		@"termsOfUseContentMap": [self checkNull: termsOfUseContentMap],
		@"termsOfUseJournalArticleResourcePrimKey": @(termsOfUseJournalArticleResourcePrimKey),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionvirtualsetting/add-cp-definition-virtual-setting": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpDefinitionVirtualSettingWithClassName:(NSString *)className classPK:(long long)classPK fileEntryId:(long long)fileEntryId url:(NSString *)url activationStatus:(int)activationStatus duration:(long long)duration maxUsages:(int)maxUsages useSample:(BOOL)useSample sampleFileEntryId:(long long)sampleFileEntryId sampleUrl:(NSString *)sampleUrl termsOfUseRequired:(BOOL)termsOfUseRequired termsOfUseContentMap:(NSDictionary *)termsOfUseContentMap termsOfUseJournalArticleResourcePrimKey:(long long)termsOfUseJournalArticleResourcePrimKey override:(BOOL)override serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"fileEntryId": @(fileEntryId),
		@"url": [self checkNull: url],
		@"activationStatus": @(activationStatus),
		@"duration": @(duration),
		@"maxUsages": @(maxUsages),
		@"useSample": @(useSample),
		@"sampleFileEntryId": @(sampleFileEntryId),
		@"sampleUrl": [self checkNull: sampleUrl],
		@"termsOfUseRequired": @(termsOfUseRequired),
		@"termsOfUseContentMap": [self checkNull: termsOfUseContentMap],
		@"termsOfUseJournalArticleResourcePrimKey": @(termsOfUseJournalArticleResourcePrimKey),
		@"override": @(override),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionvirtualsetting/add-cp-definition-virtual-setting": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDefinitionVirtualSettingWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionvirtualsetting/fetch-cp-definition-virtual-setting": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionVirtualSettingWithCpDefinitionVirtualSettingId:(long long)cpDefinitionVirtualSettingId fileEntryId:(long long)fileEntryId url:(NSString *)url activationStatus:(int)activationStatus duration:(long long)duration maxUsages:(int)maxUsages useSample:(BOOL)useSample sampleFileEntryId:(long long)sampleFileEntryId sampleUrl:(NSString *)sampleUrl termsOfUseRequired:(BOOL)termsOfUseRequired termsOfUseContentMap:(NSDictionary *)termsOfUseContentMap termsOfUseJournalArticleResourcePrimKey:(long long)termsOfUseJournalArticleResourcePrimKey serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionVirtualSettingId": @(cpDefinitionVirtualSettingId),
		@"fileEntryId": @(fileEntryId),
		@"url": [self checkNull: url],
		@"activationStatus": @(activationStatus),
		@"duration": @(duration),
		@"maxUsages": @(maxUsages),
		@"useSample": @(useSample),
		@"sampleFileEntryId": @(sampleFileEntryId),
		@"sampleUrl": [self checkNull: sampleUrl],
		@"termsOfUseRequired": @(termsOfUseRequired),
		@"termsOfUseContentMap": [self checkNull: termsOfUseContentMap],
		@"termsOfUseJournalArticleResourcePrimKey": @(termsOfUseJournalArticleResourcePrimKey),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionvirtualsetting/update-cp-definition-virtual-setting": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionVirtualSettingWithCpDefinitionVirtualSettingId:(long long)cpDefinitionVirtualSettingId fileEntryId:(long long)fileEntryId url:(NSString *)url activationStatus:(int)activationStatus duration:(long long)duration maxUsages:(int)maxUsages useSample:(BOOL)useSample sampleFileEntryId:(long long)sampleFileEntryId sampleUrl:(NSString *)sampleUrl termsOfUseRequired:(BOOL)termsOfUseRequired termsOfUseContentMap:(NSDictionary *)termsOfUseContentMap termsOfUseJournalArticleResourcePrimKey:(long long)termsOfUseJournalArticleResourcePrimKey override:(BOOL)override serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionVirtualSettingId": @(cpDefinitionVirtualSettingId),
		@"fileEntryId": @(fileEntryId),
		@"url": [self checkNull: url],
		@"activationStatus": @(activationStatus),
		@"duration": @(duration),
		@"maxUsages": @(maxUsages),
		@"useSample": @(useSample),
		@"sampleFileEntryId": @(sampleFileEntryId),
		@"sampleUrl": [self checkNull: sampleUrl],
		@"termsOfUseRequired": @(termsOfUseRequired),
		@"termsOfUseContentMap": [self checkNull: termsOfUseContentMap],
		@"termsOfUseJournalArticleResourcePrimKey": @(termsOfUseJournalArticleResourcePrimKey),
		@"override": @(override),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionvirtualsetting/update-cp-definition-virtual-setting": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end