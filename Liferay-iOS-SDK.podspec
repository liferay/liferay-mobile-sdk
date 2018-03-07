Pod::Spec.new do |s|
	s.name					= "Liferay-iOS-SDK"
	s.module_name			= "LRMobileSDK"
	s.version				= "7.1-beta1"
	s.summary				= "Build iOS apps for Liferay."
	s.homepage				= "https://github.com/liferay/liferay-mobile-sdk"
	s.license				= {
								:type => "LPGL 2.1",
								:file => "ios/copyright.txt"
							}
	s.authors				= {
								"Bruno Farache" => "bruno.farache@liferay.com"
							}
	s.platform				= :ios
	s.ios.deployment_target	= '7.0'
	s.source				= {
								:git => "https://github.com/liferay/liferay-mobile-sdk.git",
								:tag => "ios-7.1-beta1"
							}
	s.source_files			= "ios/Source/**/*.{h,m}"
	s.resource_bundles		= {
								"Liferay-iOS-SDK" => [
									"ios/Source/Util/Localization/*.lproj"
								]
							}
	s.requires_arc			= true
	s.dependency			"AFNetworking", "= 2.6.3"
	s.pod_target_xcconfig = { 'OTHER_CFLAGS' => '-DLIFERAY_MOBILE_SDK_FRAMEWORK=1' }
	s.user_target_xcconfig = { 'GCC_PREPROCESSOR_DEFINITIONS' => 'LIFERAY_MOBILE_SDK_APP=1' }
	s.private_header_files = [
								'ios/Source/Core/Auth/LRCookieExpirationHandler.h'
							]
end
