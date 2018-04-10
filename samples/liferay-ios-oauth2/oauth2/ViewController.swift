/**
* Copyright (c) 2000-present Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/

import UIKit
import LRMobileSDK

class ViewController: UIViewController {
	let oauth2TestServer = "https://liferay-oauth2.wedeploy.io"
	
	@IBOutlet weak var label1: UILabel!

	@IBAction func login(_ sender: Any) {
		let session = LRSession(server: oauth2TestServer)
		// You need to add a redirect URL on your Info.plist (URL Schemes) of your application
		let redirectUrl = URL(string: "liferayoauth://callback")!
		
		let appDelegate = UIApplication.shared.delegate as! AppDelegate
		// You need to save the AuthorizationFlow object and call 'resumeAuthorizationFlow'method on your AppDelegate
		appDelegate.authorizationFlow =
			LROAuth2SignIn.signIn(withRedirectURL: redirectUrl, session: session, clientId: "54321", scopes: []) { [weak self] (session, error) in
			if let oauth2Auth = session?.authentication as? LROAuth2Authentication {
				self?.label1.text = """
				|accessTokenExpirationDate: \(oauth2Auth.accessTokenExpirationDate)
				|accessToken: \(oauth2Auth.accessToken)
				|refreshToken: \(oauth2Auth.refreshToken)
				|clientId: \(oauth2Auth.clientId)
				|clientSecret: \(oauth2Auth.clientSecret)
				|scope: \(oauth2Auth.scope)
				"""
			}
		}
	}
}

