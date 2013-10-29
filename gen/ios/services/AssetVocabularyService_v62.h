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

/**
 * author: Bruno Farache
 */
@interface AssetVocabularyService_v62 : NSObject

- (NSDictionary *)addVocabulary:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getJsonGroupVocabularies:(NSNumber *)groupId name:(NSString *)name start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (NSArray *)getVocabularies:(NSArray *)vocabularyIds;
- (NSNumber *)getGroupVocabulariesCount:(NSNumber *)groupId name:(NSString *)name;
- (NSArray *)getCompanyVocabularies:(NSNumber *)companyId;
- (NSDictionary *)getVocabulary:(NSNumber *)vocabularyId;
- (NSDictionary *)updateVocabulary:(NSNumber *)vocabularyId title:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getGroupVocabularies:(NSNumber *)groupId name:(NSString *)name start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (NSArray *)getGroupsVocabularies:(NSArray *)groupIds className:(NSString *)className;
- (NSDictionary *)getGroupVocabulariesDisplay:(NSNumber *)groupId name:(NSString *)name start:(NSNumber *)start end:(NSNumber *)end addDefaultVocabulary:(BOOL)addDefaultVocabulary obc:(NSDictionary *)obc;
- (void)deleteVocabulary:(NSNumber *)vocabularyId;
- (NSArray *)deleteVocabularies:(NSArray *)vocabularyIds serviceContext:(NSDictionary *)serviceContext;

@end