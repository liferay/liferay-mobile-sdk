![Liferay Mobile SDK logo](../../../logo.png)

# Liferay Push for Android

* [Setup](#setup)
* [Use](#use)
	* [Registering device](#registering-a-device)
	* [Sending push notifications](#sending-push-notifications)
	* [Unregistering device](#unregistering-a-device)

## Setup

Add the library as a dependency to your project, as shown in the following Groovy code:

```groovy
repositories {
	jcenter()
	mavenCentral()
}

dependencies {
	compile group: 'com.liferay.mobile', name: 'liferay-push-notifications-portlet-android-sdk', version: '6.2.0.+'
}
```

## Use

#### Registering a Device

To receive push notifications, your app must register itself to the portal first. On the portal side, each device is tied to a user. Each user can have multiple registered devices. A device is represented by a device token string. Google calls this the `registrationId`.

Read [Android's documentation](http://developer.android.com/google/gcm/client.html) to learn how to get the `registrationId`.

Once you have the `registrationId` token, you can register the device to the portal by calling:

```java
import com.liferay.mobile.push.Push;

Session session = new SessionImpl("http://localhost:8080", new BasicAuthentication("test@liferay.com", "test"));

Push.with(session).register(registrationId);
```

Now each time the portal wants to send a push notification to the user `test@liferay.com`, it looks up all registered devices for the user (including the one just registered) and sends the push notification for each `registrationId` found.

Since all operations are asynchronous, you can set callbacks to check if the registration succeeded or an error occurred on the server side:

```java
Push.with(session)
	.onSuccess(new Push.OnSuccess() {
			
		@Override
		public void onSuccess(Object result) {
		}

	})
	.onFailure(new Push.OnFailure() {

		@Override
		public void onFailure(Exception e) {
		}

	})
	.register(registrationId);
```

The `onSuccess` and `onFailure` callbacks are optional, but it's good practice to implement both. By doing so, your app can persist the device token or tell the user that an error ocurred.

You should note that the [Push](src/main/java/com/liferay/mobile/push/Push.java) class is a wrapper for the Mobile SDK generated services. Internally, it calls the portal's remote service `PushNotificationsDeviceService`. While you can still use `PushNotificationsDeviceService` directly, using the wrapper class is easier.

Once your device is registered, your app must be able to listen for notifications. To do this, you must implement a `BroadcastReceiver` instance in your app. [Android's developer documentation](http://developer.android.com/google/gcm/client.html#sample-receive) shows you how to do this.

### Sending Push Notifications

There are many ways to send push notifications from Liferay Portal. See the [Liferay Push documentation](../README.md) for more details. Alternatively, you can send push notifications from your Android app. Just make sure the user has the proper permissions in the portal to send push notifications.

```java
JSONObject notification = new JSONObject();
notification("message", "Hello!");

Push.with(session).send(toUserId, notification);
```

In this code, the push notification is sent to the user specified by `toUserId`. Upon receiving the notification, the portal looks up all the user's registered devices (both Android and iOS devices) and sends `notification` as the body of the push notification.

### Unregistering a Device

If you want to stop receiving push notifications on a device, you can unregister it from from the portal with the following code:

```java
Push.with(session).unregister(registrationId);
```

Users can only unregister devices they own.
