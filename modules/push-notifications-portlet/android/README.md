![Liferay Mobile SDK logo](../../../logo.png)

# Liferay Push for Android

* [Setup](#setup)
* [Use](#use)
	* [Registering device](#registering-device)
	* [Sending push notifications](#sending-push-notifications)
	* [Unregistering device](#unregistering-device)

## Setup

Add the library as a dependency to your project:

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

#### Registering device

In order to receive push notifications, your app must register itself to the portal first.

On the portal side, each device is tied to an user and one user can have multiple registered devices. A device is represented by a token string, Google calls it `registrationId`.

Read [Android's documentation](http://developer.android.com/google/gcm/client.html) to learn how to get the `registrationId`.

Once you have got the `registrationId` token, you can register the device by calling:


```java
import com.liferay.mobile.push.Push;

Session session = new SessionImpl("http://localhost:8080", new BasicAuthentication("test@liferay.com", "test"));

Push.with(session).register(registrationId);
```

From there, each time the portal wants to send a push notification to the `test@liferay.com` user, it will look up for all registered devices for this user (including the one above you just registered) and send the push notification for each `registrationId` found.

Since all operations are asynchronous you can set callbacks to check if registration was successful or some error happened on the server side:

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

Both `onSuccess` and `onFailure` callbacks are optional, but you should probably implement both of them in order to persist the registrationId or display an error toast to the user in case of failure.

The [Push](src/main/java/com/liferay/mobile/push/Push.java) class is just a wrapper to the Mobile SDK generated services, internally it calls the `PushNotificationsDeviceService` portal remote service, it's just an utility class to make things easier.

Once your device is registered, you have to implement a `BroadcastReceiver` instance in order to listen to push notifications, look at [Android's documentation](http://developer.android.com/google/gcm/client.html#sample-receive) to learn how to receive push notifications in your app.

#### Sending push notifications

There are many ways to send push notifications from the portal, see the [Liferay Push documentation](../README.md) for more details.

Alternatively, you can also send push notifications from your Android app. Make sure the user has proper portal permissions to send push notifications.

```java
JSONObject payload = new JSONObject();
payload.put("message", "Hello!");

Push.with(session).send(toUserId, payload);
```

`toUserId` is the the userId to which you are sending the push notification. As said previously, the portal will look up for all devices registered for this user (both Android and iOS) and send the `payload` as the body of the push notification.

#### Unregistering device


In you case you want to remove the device from the portal to stop receiving push notifications, you can do:

```java
Push.with(session).unregister(registrationId);
```

Users can only unregister devices they own.
