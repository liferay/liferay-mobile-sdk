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

#import "CompanyService_v62.h"

/**
 * author Bruno Farache
 */
@implementation CompanyService_v62

- (void)updateDisplay:(long)companyId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"languageId": languageId,
		@"timeZoneId": timeZoneId
	};

	NSDictionary *_command = @{@"/company/update-display": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getCompanyByWebId:(NSString *)webId {
	NSDictionary *_params = @{
		@"webId": webId
	};

	NSDictionary *_command = @{@"/company/get-company-by-web-id": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getCompanyByLogoId:(long)logoId {
	NSDictionary *_params = @{
		@"logoId": @(logoId)
	};

	NSDictionary *_command = @{@"/company/get-company-by-logo-id": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getCompanyByVirtualHost:(NSString *)virtualHost {
	NSDictionary *_params = @{
		@"virtualHost": virtualHost
	};

	NSDictionary *_command = @{@"/company/get-company-by-virtual-host": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)updateLogo:(long)companyId bytes:(NSArray *)bytes {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"bytes": bytes
	};

	NSDictionary *_command = @{@"/company/update-logo": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getCompanyById:(long)companyId {
	NSDictionary *_params = @{
		@"companyId": @(companyId)
	};

	NSDictionary *_command = @{@"/company/get-company-by-id": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getCompanyByMx:(NSString *)mx {
	NSDictionary *_params = @{
		@"mx": mx
	};

	NSDictionary *_command = @{@"/company/get-company-by-mx": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteLogo:(long)companyId {
	NSDictionary *_params = @{
		@"companyId": @(companyId)
	};

	NSDictionary *_command = @{@"/company/delete-logo": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)updateCompany:(long)companyId virtualHost:(NSString *)virtualHost mx:(NSString *)mx maxUsers:(int)maxUsers active:(BOOL)active {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"virtualHost": virtualHost,
		@"mx": mx,
		@"maxUsers": @(maxUsers),
		@"active": @(active)
	};

	NSDictionary *_command = @{@"/company/update-company": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end