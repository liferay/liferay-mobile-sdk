Pod::Spec.new do |s|
	s.name					= "Liferay-Sync"
	s.module_name			= "LRSync"
	s.version				= "1.3"
	s.summary				= "Library for accessing Liferay Sync services."
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
								:tag => "sync-1.3"
							}
	s.source_files			= "modules/sync-web/ios/Source/**/*.{h,m}"
	s.requires_arc			= true
	s.dependency			"Liferay-iOS-SDK", "6.2.0.21"
end