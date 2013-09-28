# Liferay Mobile SDK

With Liferay Mobile SDK, you can quickly build native mobile apps that integrate with Liferay instances and connetct to portal or plugins web services.

It's basically a wrapper for Liferay JSON Web Services. It takes care of authentication, makes RESTful requests (synchronously or asynchronously), parses JSON results, handles server side exceptions, etc.

Currently, it supports Android only, but it's extensible and we plan to make it available for other platforms in the near future, like iOS and PhoneGap.

It's compatible Liferay Portal 6.2 and later. It not only can help you to access portal web services but also any custom plugins or portlets that provide remote web services built with Liferay's Service Builder.

The project is divided in 2: the SDK itself (for Android) and a SDK Builder. The Builder is a code generator that discovers which services are available for a given portal instance and produces most of the code of the SDK. It's template based, that's how we will be able to extend the SDK for other platforms.
