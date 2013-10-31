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

#import "DDMTemplateService_v62.h"

/**
 * author Bruno Farache
 */
@implementation DDMTemplateService_v62

- (NSDictionary *)getTemplate:(NSNumber *)groupId classNameId:(NSNumber *)classNameId templateKey:(NSString *)templateKey includeGlobalTemplates:(BOOL)includeGlobalTemplates {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"classNameId": classNameId,
		@"templateKey": templateKey,
		@"includeGlobalTemplates": includeGlobalTemplates
	};

	NSDictionary *_command = @{@"/ddmtemplate/get-template": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getTemplatesByClassPk:(NSNumber *)groupId classPK:(NSNumber *)classPK {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"classPK": classPK
	};

	NSDictionary *_command = @{@"/ddmtemplate/get-templates-by-class-pk": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getTemplatesByStructureClassNameIdCount:(NSNumber *)groupId structureClassNameId:(NSNumber *)structureClassNameId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"structureClassNameId": structureClassNameId
	};

	NSDictionary *_command = @{@"/ddmtemplate/get-templates-by-structure-class-name-id-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)updateTemplate:(NSNumber *)templateId classPK:(NSNumber *)classPK nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type mode:(NSString *)mode language:(NSString *)language script:(NSString *)script cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallImageFile:(NSDictionary *)smallImageFile serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"templateId": templateId,
		@"classPK": classPK,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"type": type,
		@"mode": mode,
		@"language": language,
		@"script": script,
		@"cacheable": cacheable,
		@"smallImage": smallImage,
		@"smallImageURL": smallImageURL,
		@"smallImageFile": smallImageFile,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddmtemplate/update-template": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getTemplatesByStructureClassNameId:(NSNumber *)groupId structureClassNameId:(NSNumber *)structureClassNameId start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"structureClassNameId": structureClassNameId,
		@"start": start,
		@"end": end,
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/ddmtemplate/get-templates-by-structure-class-name-id": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)copyTemplate:(NSNumber *)templateId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"templateId": templateId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddmtemplate/copy-template": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)fetchTemplate:(NSNumber *)groupId classNameId:(NSNumber *)classNameId templateKey:(NSString *)templateKey {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"classNameId": classNameId,
		@"templateKey": templateKey
	};

	NSDictionary *_command = @{@"/ddmtemplate/fetch-template": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)copyTemplates:(NSNumber *)classNameId classPK:(NSNumber *)classPK newClassPK:(NSNumber *)newClassPK type:(NSString *)type serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"classNameId": classNameId,
		@"classPK": classPK,
		@"newClassPK": newClassPK,
		@"type": type,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddmtemplate/copy-templates": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)deleteTemplate:(NSNumber *)templateId {
	NSDictionary *_params = @{
		@"templateId": templateId
	};

	NSDictionary *_command = @{@"/ddmtemplate/delete-template": _params};

	[session invoke:_command];
}

- (NSArray *)getTemplates:(NSNumber *)groupId classNameId:(NSNumber *)classNameId classPK:(NSNumber *)classPK type:(NSString *)type mode:(NSString *)mode {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"classNameId": classNameId,
		@"classPK": classPK,
		@"type": type,
		@"mode": mode
	};

	NSDictionary *_command = @{@"/ddmtemplate/get-templates": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)addTemplate:(NSNumber *)groupId classNameId:(NSNumber *)classNameId classPK:(NSNumber *)classPK templateKey:(NSString *)templateKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap type:(NSString *)type mode:(NSString *)mode language:(NSString *)language script:(NSString *)script cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallImageFile:(NSDictionary *)smallImageFile serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"classNameId": classNameId,
		@"classPK": classPK,
		@"templateKey": templateKey,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"type": type,
		@"mode": mode,
		@"language": language,
		@"script": script,
		@"cacheable": cacheable,
		@"smallImage": smallImage,
		@"smallImageURL": smallImageURL,
		@"smallImageFile": smallImageFile,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddmtemplate/add-template": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)searchCount:(NSNumber *)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds classPKs:(NSArray *)classPKs keywords:(NSString *)keywords type:(NSString *)type mode:(NSString *)mode {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupIds": groupIds,
		@"classNameIds": classNameIds,
		@"classPKs": classPKs,
		@"keywords": keywords,
		@"type": type,
		@"mode": mode
	};

	NSDictionary *_command = @{@"/ddmtemplate/search-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)search:(NSNumber *)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds classPKs:(NSArray *)classPKs name:(NSString *)name description:(NSString *)description type:(NSString *)type mode:(NSString *)mode language:(NSString *)language andOperator:(BOOL)andOperator start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupIds": groupIds,
		@"classNameIds": classNameIds,
		@"classPKs": classPKs,
		@"name": name,
		@"description": description,
		@"type": type,
		@"mode": mode,
		@"language": language,
		@"andOperator": andOperator,
		@"start": start,
		@"end": end,
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/ddmtemplate/search": _params};

	return (NSArray *)[session invoke:_command];
}

@end