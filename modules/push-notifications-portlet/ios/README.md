![Liferay Mobile SDK logo](../../../logo.png)

# Liferay Push for iOS

* [Setup](#setup)
* [Use](#use)
	* [Registering device](#registering-device)
	* [Sending push notifications](#sending-push-notifications)
	* [Unregistering device](#unregistering-device)

## Setup

This library is a CocoaPods subspec of the Mobile SDK for iOS. This library becomes available once you install the Mobile SDK as a dependency. See the [Mobile SDK documentation](https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/mobile) to learn how to include it as a dependency to your project.

## Use

### Registering a Device

To receive push notifications, your app must register itself to the portal first. On the portal side, each device is tied to a user. Each user can have multiple registered devices. A device is represented by a device token string.

Read [Apple's documentation](https://developer.apple.com/library/ios/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/Chapters/IPhoneOSClientImp.html#//apple_ref/doc/uid/TP40008194-CH103-SW2) to learn how to get the device token. This [tutorial](http://www.raywenderlich.com/32960/apple-push-notification-services-in-ios-6-tutorial-part-1) is very useful to learn how Apple Push Notification works.

Once you have the device token, you can register the device to the portal by calling:

    #import "Push.h"

    LRSession *session = [[LRSession alloc] initWithServer:@"http://localhost:8080" username:@"test@liferay.com" password:@"test"];

    [[Push withSession:session] registerToken:deviceToken];

Now each time the portal wants to send a push notification to the user `test@liferay.com`, it looks up all registered devices for the user (including the one just registered) and sends the push notification for each `deviceToken` found.

Since all operations are asynchronous, you can set callbacks to check if the registration succeeded or an error occurred on the server side:


    [[[[Push withSession:self.session]
        onSuccess:^(NSDictionary *device) {
            NSLog(@"Device was registered!");
            }]
        onFailure:^(NSError *e) {
            NSLog(@"Some error occurred!");
            }]
        registerToken:deviceToken];

The `onSuccess` and `onFailure` blocks are optional, but it's good practice to implement both. Doing so persists the device token or tells the user that an error ocurred.

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
