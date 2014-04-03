//
//  BaseTest.h
//  Liferay iOS SDK
//
//  Jose Navarro
//	Bruno Farache
//

#import "LRSession.h"

@interface BaseTest : XCTestCase

@property (nonatomic, strong) LRSession *session;
@property (nonatomic, strong) NSDictionary *settings;

@end