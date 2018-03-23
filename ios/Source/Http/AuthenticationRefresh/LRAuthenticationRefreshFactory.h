//
//  LRAuthenticationRefreshFactory.h
//  Liferay iOS SDK
//
//  Created by Victor Galan on 14/03/2018.
//  Copyright © 2018 Liferay Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "LRAuthenticationRefreshHandler.h"
#import "LRAuthentication.h"

@interface LRAuthenticationRefreshFactory : NSObject

- (id<LRAuthenticationRefreshHandler>)
	authenticationRefreshHandlerForAuthentication:(id<LRAuthentication>)authentication;


@end
