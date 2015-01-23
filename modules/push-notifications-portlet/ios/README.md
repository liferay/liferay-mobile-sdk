![Liferay Mobile SDK logo](../../../logo.png)

# Liferay Push for iOS

* [Setup](#setup)
* [Use](#use)
	* [Registering device](#registering-a-device)
	* [Sending push notifications](#sending-push-notifications)
	* [Unregistering device](#unregistering-a-device)

## Setup

This library is a CocoaPods subspec of the Mobile SDK for iOS. This library becomes available once you install the Mobile SDK as a dependency. See the [Mobile SDK documentation](https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/mobile) to learn how to include it as a dependency to your project.

## Use

### Registering a Device

To receive push notifications, your app must register itself to the portal first. On the portal side, each device is tied to a user. Each user can have multiple registered devices. A device is represented by a device token string.

Read [Apple's documentation](https://developer.apple.com/library/ios/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/Chapters/IPhoneOSClientImp.html#//apple_ref/doc/uid/TP40008194-CH103-SW2) to learn how to get the device token. This [tutorial](http://www.raywenderlich.com/32960/apple-push-notification-services-in-ios-6-tutorial-part-1) is very useful to learn how Apple Push Notification works.

Once you have the device token, you can register the device to the portal by calling:

```objective-c
#import "Push.h"

LRSession *session = [[LRSession alloc] initWithServer:@"http://localhost:8080" username:@"test@liferay.com" password:@"test"];

[[Push withSession:session] registerToken:deviceToken];
```

Now each time the portal wants to send a push notification to the user `test@liferay.com`, it looks up all registered devices for the user (including the one just registered) and sends the push notification for each `deviceToken` found.

Since all operations are asynchronous, you can set callbacks to check if the registration succeeded or an error occurred on the server side:

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

The `onSuccess` and `onFailure` blocks are optional, but it's good practice to implement both. Doing so persists the device token or tells the user that an error ocurred.

You should note that the [`Push`](Source/Core/Push.m) class is a wrapper for the Mobile SDK generated services. Internally, it calls the portal's remote service `LRPushNotificationsDeviceService_v62`. While you can still use `LRPushNotificationsDeviceService_v62` directly, using the wrapper class is easier.

Once your device is registered, your app must be able to listen for notifications. [Apple's developer documentation](https://developer.apple.com/library/ios/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/Chapters/IPhoneOSClientImp.html#//apple_ref/doc/uid/TP40008194-CH103-SW4) shows how to implement this in your app.

### Sending Push Notifications

There are many ways to send push notifications from Liferay Portal. See the [Liferay Push documentation](../README.md) for more details. Alternatively, you can send push notifications from your iOS app. Just make sure the user has the proper permissions in the portal to send push notifications.

```objective-c
NSDictionary notification = @{
    @"message": @"hello!"
};

[[Push withSession:session] sendToUserId:123 notification:notification];
```

In this code, the push notification is sent to the user specified by `sendToUserId`. Upon receiving the notification, the portal looks up all the user's registered devices (both Android and iOS devices) and sends `notification` as the body of the push notification.

### Unregistering a Device

If you want to stop receiving push notifications on a device, you can unregister it from from the portal with the following code:

```objective-c
[[Push withSession:session] unregisterToken:deviceToken];
```
    
Users can only unregister devices they own.
