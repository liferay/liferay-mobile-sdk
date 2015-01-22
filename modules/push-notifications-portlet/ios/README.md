![Liferay Mobile SDK logo](../../../logo.png)

# Liferay Push for iOS

* [Setup](#setup)
* [Use](#use)
	* [Registering device](#registering-device)
	* [Sending push notifications](#sending-push-notifications)
	* [Unregistering device](#unregistering-device)

## Setup

This library is a Cocoapods Subspec of the Mobile SDK for iOS, once you install the Mobile SDK as a dependency, this library will be available. Look at the [Mobile SDK documentation](../../../ios/README.md) to see how to include it as a dependency to your project.

## Use

#### Registering device

In order to receive push notifications, your app must register itself to the portal first.

On the portal side, each device is tied to an user and one user can have multiple registered devices. A device is represented by a device token string.

Read [Apple's documentation](https://developer.apple.com/library/ios/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/Chapters/IPhoneOSClientImp.html#//apple_ref/doc/uid/TP40008194-CH103-SW2) to learn how to get the `device token`. This [tutorial](http://www.raywenderlich.com/32960/apple-push-notification-services-in-ios-6-tutorial-part-1) is very useful to learn how Apple Push Notifications works.

Once you have got the token, you can register the device to the portal by calling:


```objective-c
#import "Push.h"

LRSession *session = [[LRSession alloc] initWithServer:@"http://localhost:8080" username:@"test@liferay.com" password:@"test"];

[[Push withSession:session] registerToken:deviceToken];
```

From there, each time the portal wants to send a push notification to the `test@liferay.com` user, it will look up for all registered devices for this user (including the one above you just registered) and send the push notification for each `deviceToken` found.

Since all operations are asynchronous you can set callbacks to check if registration was successful or some error happened on the server side:

```objective-c
[[[[Push withSession:self.session]
	onSuccess:^(NSDictionary *device) {
		NSLog(@"Device was registered!");
	}]
 	onFailure:^(NSError *e) {
 		NSLog(@"Some error occurred!");
	}]
	registerToken:deviceToken];
```

Both `onSuccess` and `onFailure` blocks are optional, but you should probably implement both of them in order to persist the device token or tell an error ocurred to the user.

The [Push](Source/Core/Push.m) class is just a wrapper to the Mobile SDK generated services, internally it calls the `LRPushNotificationsDeviceService_v62` portal remote service, it's just an utility class to make things easier, you can still use `LRPushNotificationsDeviceService_v62` directly.

Once your device is registered, your app must listen to notifications, look at the [Apple's documentation](https://developer.apple.com/library/ios/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/Chapters/IPhoneOSClientImp.html#//apple_ref/doc/uid/TP40008194-CH103-SW4) to learn how to do it.

#### Sending push notifications

There are many ways to send push notifications from the portal, see the [Liferay Push documentation](../README.md) for more details.

Alternatively, you can also send push notifications from your iOS app. Make sure the user has proper portal permissions to send push notifications.

```objective-c
NSDictionary notification = @{
	@"message": @"hello!"
};

[[Push withSession:session] sendToUserId:123 notification:notification];
```

`toUserId` is the the userId to which you are sending the push notification. As said previously, the portal will look up for all devices registered for this user (both Android and iOS) and send the `notification` as the body of the push notification.

#### Unregistering device


In you case you want to remove the device from the portal to stop receiving push notifications, you can do:

```objective-c
[[Push withSession:session] unregisterToken:deviceToken];
```

Users can only unregister devices they own.
