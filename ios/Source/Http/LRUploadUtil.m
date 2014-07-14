/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

#import "LRUploadUtil.h"

#import "AFNetworking.h"
#import "LRUploadData.h"
#import "LRHttpUtil.h"

/**
 * @author Bruno Farache
 */
@implementation LRUploadUtil

+ (id)upload:(LRSession *)session command:(NSDictionary *)command
		error:(NSError **)error {

	NSArray *keys = [command allKeys];

	if ([keys count] > 1) {
		return nil;
	}

	NSString *path = keys[0];
	NSString *URL = [[LRHttpUtil getURL:session path:path] absoluteString];

	NSMutableDictionary *parameters = [NSMutableDictionary
		dictionaryWithDictionary:[command valueForKey:path]];

	LRUploadData *data = [self _extractUploadData:parameters];

	[self _post:session data:data URL:URL parameters:parameters
		constructingBodyWithBlock:^(id<AFMultipartFormData> form) {
			if (data.data) {
				[form appendPartWithFileData:data.data name:data.parameterName
					fileName:data.fileName mimeType:data.mimeType];
			}
			else if (data.inputStream) {
				[form appendPartWithInputStream:data.inputStream
					name:data.parameterName fileName:data.fileName
					length:data.length mimeType:data.mimeType];
			}
		}
		success:^(AFHTTPRequestOperation *operation, id json) {
			NSError *serverError;

			[LRHttpUtil handleServerException:json response:operation.response
				error:&serverError];

			if (serverError) {
				[session.callback onFailure:serverError];

				return;
			}

			[session.callback onSuccess:json];
		}
		failure:^(AFHTTPRequestOperation *operation, NSError *error) {
			[session.callback onFailure:error];
		}
		error:error
	];

	return nil;
}

+ (LRUploadData *)_extractUploadData:(NSMutableDictionary *)parameters {
	for (NSString *key in parameters) {
		id parameter = [parameters objectForKey:key];

		if ([parameter isKindOfClass:[LRUploadData class]]) {
			[parameters removeObjectForKey:key];
			[parameter setParameterName:key];

			return parameter;
		}
	}

	return nil;
}

+ (void)_post:(LRSession *)session data:(LRUploadData *)data URL:(NSString *)URL
		parameters:(id)parameters
		constructingBodyWithBlock:(void (^)(id <AFMultipartFormData> form))block
		success:(void (^)(AFHTTPRequestOperation *o, id json))success
		failure:(void (^)(AFHTTPRequestOperation *o, NSError *error))failure
		error:(NSError **)error {

	AFHTTPRequestOperationManager *manager =
		[AFHTTPRequestOperationManager manager];

    NSMutableURLRequest *request = [manager.requestSerializer
		multipartFormRequestWithMethod:LR_POST URLString:URL
		parameters:parameters constructingBodyWithBlock:block error:nil];

	NSString *authHeader = [session authHeader];
	if (authHeader) {
		[request setValue:authHeader forHTTPHeaderField:@"Authorization"];
	}

    AFHTTPRequestOperation *operation = [manager
		HTTPRequestOperationWithRequest:request success:success
		failure:failure];

	if (data.progressDelegate) {
		[operation setUploadProgressBlock:
			^(NSUInteger bytes, long long sent, long long total) {
				[data.progressDelegate onProgressBytes:bytes sent:sent
					total:total];
			}
		];
	}

    [manager.operationQueue addOperation:operation];
}

@end