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
@interface AssetVocabularyService_v62 : BaseService

- (NSDictionary *)addVocabulary:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getJsonGroupVocabularies:(long)groupId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSArray *)getVocabularies:(NSArray *)vocabularyIds;
- (int)getGroupVocabulariesCount:(long)groupId name:(NSString *)name;
- (NSArray *)getCompanyVocabularies:(long)companyId;
- (NSDictionary *)getVocabulary:(long)vocabularyId;
- (NSDictionary *)updateVocabulary:(long)vocabularyId title:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getGroupVocabularies:(long)groupId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSArray *)getGroupsVocabularies:(NSArray *)groupIds className:(NSString *)className;
- (NSDictionary *)getGroupVocabulariesDisplay:(long)groupId name:(NSString *)name start:(int)start end:(int)end addDefaultVocabulary:(BOOL)addDefaultVocabulary obc:(NSDictionary *)obc;
- (void)deleteVocabulary:(long)vocabularyId;
- (NSArray *)deleteVocabularies:(NSArray *)vocabularyIds serviceContext:(NSDictionary *)serviceContext;

@end