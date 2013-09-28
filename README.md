# Liferay Mobile SDK

With Liferay Mobile SDK, you can quickly build native mobile apps that integrate with Liferay instances and connect to portal or plugins web services.

It's a wrapper for Liferay JSON Web Services. It takes care of authentication, makes RESTful requests (synchronously or asynchronously), parses JSON results, handles server side exceptions, etc.

Currently, it only supports Android, but it's extensible and we plan to make it available for other platforms in the near future, like iOS and PhoneGap.

It's compatible Liferay Portal 6.2 and later. It not only helps you to access portal web services but also any custom plugins or portlets that were built with Liferay's Service Builder.

The project is divided in 2: the SDK itself (for Android) and a SDK Builder. The Builder is a code generator that discovers which services are available for a given portal instance and produces most of the code of the SDK. It's template based, that's how we are able to extend the SDK to other platforms.


## Liferay Android SDK

Check out the [Android app sample](https://github.com/brunofarache/liferay-mobile-sdk-sample-android). It's a Contacts app that lists all Liferay users and shows contact details about them. It contains many examples on how to use the Liferay Android SDK and it's a good way to learn how to use the SDK.

### Setup

1. [Download](https://github.com/brunofarache/liferay-mobile-sdk/releases/) the latest version of `liferay-android-sdk.jar`. iIf you want to debug the SDK source code, you can also download `liferay-android-sdk-sources.jar` and attach the source code to your IDE project.
2. Within your Android project, drop the jar into the `/libs` folder. Android Developer Tools should automatically add this jar to your classpath, if you are using a different IDE, make sure this jar is added to the project classpath.
3. Import the necessary classes and start using it!

### Usage

1. Check which Liferay services you need in order to build your app by going to [http://localhost:8080/api/jsonws](http://localhost:8080/api/jsonws).
2. If you are building a blogs app, for example, you can import `BlogsEntryService`:

```java
import com.liferay.mobile.android.v62.blogsentry.BlogsEntryService;
```

Since the SDK is built for each Liferay version, service classes are separate by their package name, in this case `.v62`, which means this SDK is built for Liferay 6.2. You can use several SDKs to support different Liferay versions at the same time.

