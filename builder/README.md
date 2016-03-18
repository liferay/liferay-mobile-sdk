![Liferay Mobile SDK logo](../logo.png)

# Liferay SDK Builder

* [What's the SDK Builder](#whats-the-sdk-builder)
* [Configuring your Portlet's Remote Services](#configuring-your-portlets-remote-services)
* [Running](#running)
	* [Download](#download)
	* [Create your own module](#create-your-own-module)
	* [Properties](#properties)
	* [Updating remote services](#updating-remote-services)
* [Building a Liferay Android SDK](#building-a-liferay-android-sdk)
* [Building a Liferay iOS SDK](#building-a-liferay-ios-sdk)
* [Other platforms](#other-platforms)

## What's the SDK Builder?

The Liferay Mobile SDK project comes with an SDK Builder that generates the
Liferay Mobile SDK for the Android and iOS platforms. Think of it as a Service
Builder on the client side; it generates code that allows your mobile app to
access your portlet's custom services. The SDK Builder generates client
libraries that allow your native mobile apps to invoke remote web services of a
portal instance and any of its custom portlets built with Liferay's [Service
Builder](http://www.liferay.com/documentation/liferay-portal/6.2/development/-/ai/generating-your-service-layer-liferay-portal-6-2-dev-guide-04-en).

Since the SDK Builder is template-based, it's easy to extend to various mobile
platforms. For example, the Liferay community has built an extension for
[Windows mobile apps](https://github.com/ithildir/liferay-sdk-builder-windows),
and we can extend it to other platforms in the future.

## Configuring your Portlet's Remote Services

In order for the SDK Builder to discover a portlet's remote services, the
portlet's services must be made available and be accompanied by a Web Service
Deployment Descriptor (WSDD).

If you're in the process of developing the portlet, see [Generating Your Service
Layer](http://www.liferay.com/documentation/liferay-portal/6.2/development/-/ai/generating-your-service-layer-liferay-portal-6-2-dev-guide-04-en)
for in-depth instructions on implementing remote services. For your convenience,
the following steps outline how to implement remote services for your portlet
and make them available for the SDK Builder to discover: 

1. Set your entity's `remote-service="true"` in your portlet's `service.xml`
file and run `ant build-service`.

2. Implement your remote services in the generated `[Entity]ServiceImpl.java`
source files and run `ant build-service` again. 

3. Run `ant build-wsdd` to build your Web Service Deployment Descriptor (WSDD).
The SDK Builder relies on the WSDD to discover your portlet's remote services;
so make sure to run `ant build-wsdd` before deploying your portlet.

4. Run `ant deploy` to deploy your portlet with its WSDD.

Now, you are ready to use the SDK Builder to generate a custom portlet SDK for
developing your mobile app. You'll be able to invoke your service's methods,
like `[Entity]Service.bar();`, from your mobile app. The Liferay Mobile SDK
takes care of making JSON Web Services requests to your portlet.

Next, let's configure the SDK Builder for generating your custom portlet client
side services.

## Running

#### Download

In order to use the SDK Builder, you'll need to have the Liferay Mobile SDK
project on your local machine. If you haven't done so already, download the
Mobile SDK project using Git: 

```sh
git clone git@github.com:liferay/liferay-mobile-sdk.git
```

Since the SDK Builder changes frequently, it's safer to checkout the latest 
stable release. Stable SDK Builder releases correspond to tags with the 
`builder-` prefix in GitHub. For example, you can use the following command to 
check out the `builder-6.2.0.17` tag in a new branch of the same name: 

```sh
git checkout tags/builder-6.2.0.17 -b builder-6.2.0.17
```

Check for the latest stable SDK Builder version 
[here in GitHub](https://github.com/liferay/liferay-mobile-sdk/tags).

Alternatively, you can use the SDK Builder as a standalone library, its jar
is available of both JCenter and Maven Central repositories:

```xml
<dependency>
    <groupId>com.liferay.mobile</groupId>
    <artifactId>liferay-sdk-builder</artifactId>
    <version>LATEST</version>
</dependency>
```

Check the [SDKBuilder.java](src/main/java/com/liferay/mobile/sdk/SDKBuilder.java)
main method to see how you can use this class in your project.

#### Create your own module

After you have downloaded the source code from Git, follow these steps to create
a Mobile SDK for you portlet.

From the root folder, run the following command to start up the wizard:

    ./gradlew createModule

This will start a wizard with the most common required [properties](#properties)
it needs to generate code for your portlet. If for some reason you need more
control over these properties, run the same command with the `all` argument:

    ./gradlew createModule -P=all

It should print out something like this:

![Create module screenshot](create_module.png)

After you have filled up all properties, it will generate your portlet client
code in the following folder: `modules/${your_portlet_context}`.

#### Properties

The properties bellow can be set while running the `createModule` or after
your module is created, in the `gradle.properties` file inside your module
folder.

Values in parenthesis are the keys used in `gradle.properties`.

* `Context (context)` - Your portlet's web context. Say for example you are
generating an SDK for Liferay's Calendar portlet, which is generally deployed
to the `calendar-portlet` context, then you should set your context value to
`context=calendar-portlet`. Under the hood, the SDK Builder will try to
access `http://localhost:8080/calendar-portlet/api/jsonws?discover` to find
out which services are available for this portlet. Check in a browser if
this URL is working before running the SDK. If it's not running, you may
have forgotten to run `ant build-wsdd` on the portlet.

* `Platforms (platforms)` - By default, you can generate code for Android and
iOS  (`android,ios`). You can also generate code for
[Windows](https://github.com/ithildir/liferay-sdk-builder-windows),
a community supported extension, just type `windows` and will download the
extension for you.

* `Server URL (url)` - The URL to your Liferay instance, the SDK Builder will
connect to this instance and find out metadata about your services.

* `Filter (filter)` - Specifies your portlet's entities whose services to access;
a blank value indicates the services of all of the portlet's entities. For
example, the Calendar portlet has entities such as `CalendarBooking` and
`CalendarResource`. To generate an SDK for only the `CalendarBooking`
entity, set the filter's value to `calendarbooking`, all in lowercase. The
SDK Builder will then make requests to the
`http://localhost:8080/calendar-portlet/api/jsonws?discover=/calendarbooking/*`.
If you set `filter=`, specifying no filter value, the remote services of
*all* of the portlet's entities will be made available to your mobile SDK.

* `Module Version (version)` - The version number is appended to the JAR and ZIP file
names, see more about that in the following sections.

* `Package Name (packageName)` - On Android, this is the package to which your SDK's
classes are written. The iOS platform does not use packages. Note, that the Liferay
Portal version is appended to the end of the package name. So, if you
specified `com.liferay.mobile.android` as your package, the SDK
Builder appends the Liferay Portal version (e.g., `v62`) to it, 
like `com.liferay.mobile.android.v62`. Appending the Liferay Portal version
prevents collisions between classes with the same names written for
different versions of Liferay Portal. The portal version can also be changed
with the `Portal Version` property.

* `POM Description (description)` - This is only needed if you are building for Android
and want to publish your JAR file to Maven.

There is also a `destination` property that can be only set in `gradle.properties`. This
property refers to the destination folder where the generate source files will be stored,
you generally won't need to changes this.

#### Updating remote services

After you have created your module, check the `modules/${your_portlet_context}` folder,
it should contain the generated code for your portlet client API.

The source files will be written by default to `android/src/gen/java` and `ios/Source`.

If you have updated your remote portlet services on the server side and need to update
the generated code, run the following command from your module folder:

    ../../gradlew generate

This will run builders for each platform and regenerate the client side code in the same
default folders.

### Building a Liferay Android SDK

To build a `.jar` file containing the generated service and utility classes, run
the following command from your module folder:

    ../../gradlew jar

The `liferay-${your_portlet_context}-android-sdk-${version}.jar` file is written to
your `android/build/libs` folder. You're ready to use this JAR file in your Android
project.

You can update the version of your module in the `gradle.properties` file, for example
`version=1.1`.

To learn how to use the Liferay Android SDK in your mobile app, see the
[Liferay Android SDK documentation](../android/README.md).

### Building a Liferay iOS SDK

To build a `.zip` file containing the generated service and utility classes, run
the following command from your module folder:

    ../../gradlew zip

The `liferay-${your_portlet_context}-ios-sdk-${version}.zip` file is written to
your `ios/build` folder. You're ready to use the contents this file in your iOS
project. Simply unzip its contents and add all of the files to your
XCode project.

To learn how to use the Liferay iOS SDK in your mobile app, see the
[Liferay iOS SDK documentation](../ios/README.md).

### Other platforms

Besides Android and iOS, there's an
[Windows](https://github.com/ithildir/liferay-sdk-builder-windows) extension of
the SDK Builder implemented by a community member, in order to use it, type windows
in the `Platforms` property.