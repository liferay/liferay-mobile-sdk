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

#import "JournalTemplateService_v62.h"

/**
 * author Bruno Farache
 */
@implementation JournalTemplateService_v62

- (NSDictionary *)updateTemplate:(NSNumber *)groupId templateId:(NSString *)templateId structureId:(NSString *)structureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsl:(NSString *)xsl formatXsl:(BOOL)formatXsl langType:(NSString *)langType cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"templateId": templateId,
		@"structureId": structureId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"xsl": xsl,
		@"formatXsl": formatXsl,
		@"langType": langType,
		@"cacheable": cacheable,
		@"smallImage": smallImage,
		@"smallImageURL": smallImageURL,
		@"smallFile": smallFile,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journaltemplate/update-template": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)copyTemplate:(NSNumber *)groupId oldTemplateId:(NSString *)oldTemplateId newTemplateId:(NSString *)newTemplateId autoTemplateId:(BOOL)autoTemplateId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"oldTemplateId": oldTemplateId,
		@"newTemplateId": newTemplateId,
		@"autoTemplateId": autoTemplateId
	};

	NSDictionary *_command = @{@"/journaltemplate/copy-template": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteTemplate:(NSNumber *)groupId templateId:(NSString *)templateId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"templateId": templateId
	};

	NSDictionary *_command = @{@"/journaltemplate/delete-template": _params};

	[session invoke:_command];
}

- (NSNumber *)searchCount:(NSNumber *)companyId groupIds:(NSArray *)groupIds templateId:(NSString *)templateId structureId:(NSString *)structureId structureIdComparator:(NSString *)structureIdComparator name:(NSString *)name description:(NSString *)description andOperator:(BOOL)andOperator {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupIds": groupIds,
		@"templateId": templateId,
		@"structureId": structureId,
		@"structureIdComparator": structureIdComparator,
		@"name": name,
		@"description": description,
		@"andOperator": andOperator
	};

	NSDictionary *_command = @{@"/journaltemplate/search-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)addTemplate:(NSNumber *)groupId templateId:(NSString *)templateId autoTemplateId:(BOOL)autoTemplateId structureId:(NSString *)structureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsl:(NSString *)xsl formatXsl:(BOOL)formatXsl langType:(NSString *)langType cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"templateId": templateId,
		@"autoTemplateId": autoTemplateId,
		@"structureId": structureId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"xsl": xsl,
		@"formatXsl": formatXsl,
		@"langType": langType,
		@"cacheable": cacheable,
		@"smallImage": smallImage,
		@"smallImageURL": smallImageURL,
		@"smallFile": smallFile,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journaltemplate/add-template": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)search:(NSNumber *)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords structureId:(NSString *)structureId structureIdComparator:(NSString *)structureIdComparator start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupIds": groupIds,
		@"keywords": keywords,
		@"structureId": structureId,
		@"structureIdComparator": structureIdComparator,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journaltemplate/search": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)getTemplate:(NSNumber *)groupId templateId:(NSString *)templateId includeGlobalTemplates:(BOOL)includeGlobalTemplates {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"templateId": templateId,
		@"includeGlobalTemplates": includeGlobalTemplates
	};

	NSDictionary *_command = @{@"/journaltemplate/get-template": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getStructureTemplates:(NSNumber *)groupId structureId:(NSString *)structureId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"structureId": structureId
	};

	NSDictionary *_command = @{@"/journaltemplate/get-structure-templates": _params};

	return (NSArray *)[session invoke:_command];
}

@end