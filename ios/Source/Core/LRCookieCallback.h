//
//  LRCookieCallback.h
//  Liferay iOS SDK
//
//  Created by Victor Galan on 16/02/2018.
//  Copyright © 2018 Liferay Inc. All rights reserved.
//


@class LRSession;

@protocol LRCookieCallback <NSObject>

- (void)onFailure:(NSError *)error;
- (void)onSuccess:(LRSession *)session;

@end

