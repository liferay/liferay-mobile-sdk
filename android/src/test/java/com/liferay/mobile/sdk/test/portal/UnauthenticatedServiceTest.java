/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.sdk.test.portal;

import com.liferay.mobile.android.exception.ServerException;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;
import com.liferay.mobile.android.v62.group.GroupService;
import com.liferay.mobile.sdk.test.BaseTest;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jose M. Navarro
 */
public class UnauthenticatedServiceTest extends BaseTest {

	public UnauthenticatedServiceTest() throws IOException {
		super();
	}

	@Test
	public void serviceWithNullUsername() throws Exception {
		Session anonymousSession = new SessionImpl(session);
		
		anonymousSession.setUsername(null);
		
		_callSecureService(anonymousSession);
	}
	
	@Test
	public void serviceWithEmptyUsername() throws Exception {
		Session anonymousSession = new SessionImpl(session);
		
		anonymousSession.setUsername("");
		
		_callSecureService(anonymousSession);
	}
	
	private void _callSecureService(Session session) throws Exception {
		GroupService service = new GroupService(session);

		try {
			service.getUserSites();
			fail();
		} catch (ServerException serverException) {
			assertEquals("Authenticated access required", 
				serverException.getMessage());
		}
	}
	

}