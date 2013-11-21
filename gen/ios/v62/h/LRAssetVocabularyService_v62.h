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
@interface LRAssetVocabularyService_v62 : BaseService

- (NSDictionary *)addVocabularyWithTitle:(NSString *)title serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addVocabularyWithTitleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addVocabularyWithTitle:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteVocabulariesWithVocabularyIds:(NSArray *)vocabularyIds error:(NSError **)error;
- (NSArray *)deleteVocabulariesWithVocabularyIds:(NSArray *)vocabularyIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteVocabularyWithVocabularyId:(long)vocabularyId error:(NSError **)error;
- (NSArray *)getCompanyVocabulariesWithCompanyId:(long)companyId error:(NSError **)error;
- (NSArray *)getGroupVocabulariesWithGroupId:(long)groupId error:(NSError **)error;
- (NSArray *)getGroupVocabulariesWithGroupId:(long)groupId createDefaultVocabulary:(BOOL)createDefaultVocabulary error:(NSError **)error;
- (NSArray *)getGroupVocabulariesWithGroupId:(long)groupId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getGroupVocabulariesWithGroupId:(long)groupId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getGroupVocabulariesCountWithGroupId:(long)groupId error:(NSError **)error;
- (int)getGroupVocabulariesCountWithGroupId:(long)groupId name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)getGroupVocabulariesDisplayWithGroupId:(long)groupId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSDictionary *)getGroupVocabulariesDisplayWithGroupId:(long)groupId name:(NSString *)name start:(int)start end:(int)end addDefaultVocabulary:(BOOL)addDefaultVocabulary obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getGroupsVocabulariesWithGroupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSArray *)getGroupsVocabulariesWithGroupIds:(NSArray *)groupIds className:(NSString *)className error:(NSError **)error;
- (NSDictionary *)getJsonGroupVocabulariesWithGroupId:(long)groupId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getVocabulariesWithVocabularyIds:(NSArray *)vocabularyIds error:(NSError **)error;
- (NSDictionary *)getVocabularyWithVocabularyId:(long)vocabularyId error:(NSError **)error;
- (NSDictionary *)updateVocabularyWithVocabularyId:(long)vocabularyId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateVocabularyWithVocabularyId:(long)vocabularyId title:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end