![Liferay Mobile SDK logo](../../logo.png)

# Liferay Push

* [About](#about)
* [Setup](#setup)
	* [Android](#android)
	* [iOS](#ios)
	* [Test](#testing-your-configuration)
* [Using Liferay Push in Your Plugins](#using-liferay-push-in-your-plugins)

## About

The Liferay Push framework is comprised of 3 main components:

* Liferay Push Notifications Portlet
* [Liferay Push Android API](android/README.md)
* [Liferay Push iOS API](ios/README.md)

This document describes how to install and configure the Liferay Push Notifications Portlet. This portlet is necessary to enable Liferay Push. It's responsible for making the bridge between mobile apps, your Liferay Portal instance, and the iOS and Android push notification services. Once you install this portlet, mobile users can register their devices with your portal instance. The Push Notifications Portlet also provides an API that developers can leverage to send push notifications from their plugins.

For example, if you've developed your own blogs portlet and a corresponding mobile app, you can use Liferay Push to notify users on their mobile devices whenever a new blog post is made. Instead of having to poll the server every few seconds, your mobile app can just wait for announcements. In other words, you can use Liferay Push so that the server only communicates with your mobile app when there's something to communicate. This is one of the main benefits of using push notifications.

In addition to the Liferay Push Notifications Portlet, Liferay Push also has client libraries for Android and iOS. To see how your mobile app can leverage the Liferay Push framework, see the client library documentation for [Android](android/README.md) and [iOS](ios/README.md). 

## Setup

You first need to download and install the Liferay Push Notifications Portlet from the [Liferay Marketplace](https://www.liferay.com/marketplace). Once installed, you can find the portlet in the *Configuration* section of the Control Panel. Click *Push Notifications* to access it: 

![Click *Push Notifications* under the *Configuration* section of the Control Panel.](./images/controlpanel.png)

Before you can send push notifcations to your users' mobile devices, you need to configure the portlet. The next section walks you through the configuration steps for sending push notifications to Android and iOS devices.

### Configuration

The portlet's *Configuration* tab is where you specify the settings for sending push notifications from your portal. Note that there are separate settings for Android and iOS. This is because Android and iOS use different push notification services. Note that if you don't need to send notifications to both platforms, you only need to set the properties for the platform you're sending them to. 

Also, you don't have to use this UI to configure the portlet. You can manually set the properties in the portlet's `portlet.properties` file, which is located in the `/push-notifications-portlet/WEB-INF/classes` folder. However, each time you make changes to this file you need to restart your portal for them to take effect. You should also note that any changes made through the UI take precedence over those set manually in `portlet.properties`.

![Configuration tab](./images/configuration.png)

Next, you'll learn how to configure the portlet for sending push notifications to Android and iOS devices.

#### Android

Push notifications sent to Android devices use the Google Cloud Messaging service (GCM). The Liferay Push Notifications Portlet has two settings for configuring your portal to use GCM:

**API Key**: The API key to use when communicating with the GCM servers. More specifically, the API key is used to authorize the portlet to send notifications to your mobile app. Note that your app must also be configured with a GCM sender ID that is linked to this API key. Without this linkage, your app can't be registered with your server and sending push notifications isn't possible. For more information on how to obtain the API key, see [Google's documentation](https://developer.android.com/google/gcm/gs.html#access-key). Be sure that your API key and sender ID remain secret. If others know them, then they can also send push notifications to your app!

**Retries**: When sending a notification fails, this is the number of times to retry sending that notification. 

Next, the portlet's configuration for sending push notifications to iOS devices is presented. If you don't need to send push notfications to iOS devices, you can skip this and proceed to the section on testing your configuration.

#### iOS

Push notfications to iOS devices use the Apple Push Notification service (APN). For more information on how this service works, see [Apple's documentation](https://developer.apple.com/library/ios/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/Chapters/ApplePushService.html). The Liferay Push Notifications Portlet has two settings for configuring your portal to use APN: 

**Certificate Path**: The path to the `.p12` certificate file that authorizes the portlet to send notifications to APN. To generate this certificate, carefully follow the steps described [here](https://parse.com/tutorials/ios-push-notifications) or [here](http://www.raywenderlich.com/32960/apple-push-notification-services-in-ios-6-tutorial-part-1). After generating the `.p12` file, store it on your server. The Certificate Path property points to this file on your server.

**Certificate Password**: The password you used during the creation of the certificate.

Great! Now that you've configured the Liferay Push Notifications Portlet to send 
push notifications, you're ready to test it out.

### Testing Your Configuration

Click the *Test* tab of the portlet to access the screen for sending a test notification via push. However, be careful not to send a test notification from a production Liferay instance. Doing so sends a message to all devices registered with your portal! Type your message into the *Message* text box and press *Send*.

![Send a test notification using push.](./images/testing.png)

A success or failure message appears to let you know if your test was successful. You should also check your console log for any exceptions. Super! Now you know how to install, configure, and test the Liferay Push Notifications Portlet. Next, you'll learn how to leverage the API to send push notifications from your own plugins.

## Using Liferay Push in Your Plugins

Once you've successfully configured the Liferay Push Notifications Portlet to send push notifications, you can use the Push Notifications API in your own plugin. You first need add the `push-notifications-portlet` as a dependency to your plugin inside `docroot/WEB-INF/liferay-plugin-package.properties`. This is shown here:

    required-deployment-contexts=\
        push-notifications-portlet

Now you're ready to send the notification! You can do so with the following code:

```java
PushNotificationsDeviceLocalServiceUtil.sendPushNotification(toUserId, notificationJSONObject);
```

When this code runs, the portlet first finds all devices registered to the user indicated by `toUserId`. The `notificationJSONObject` is then sent to each device. If you want to send the same notification to all users, use the version of this method that has no `toUserId`.
