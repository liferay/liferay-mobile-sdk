/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.mobile.android.auth;

import com.liferay.mobile.android.exception.AuthenticationException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Víctor Galán
 */
public class ParseAuthTokenTest {

    @Test
    public void parseAuthTokenWithQuotes() throws Exception {
        String tokenString = "Liferay.authToken=\"12345678\"";

        String parsedToken = CookieSignIn.parseAuthToken(tokenString);

        assertEquals("12345678", parsedToken);
    }

    @Test
    public void parseAuthTokenWithSingleQuotes() throws Exception {
        String tokenString = "Liferay.authToken='12345678'";

        String parsedToken = CookieSignIn.parseAuthToken(tokenString);

        assertEquals("12345678", parsedToken);
    }

    @Test
    public void parseAuthTokenWithSingleQuotesAndSpaces() throws Exception {
        String tokenString = "Liferay.authToken    =   '12345678'";

        String parsedToken = CookieSignIn.parseAuthToken(tokenString);

        assertEquals("12345678", parsedToken);
    }

    @Test
    public void parseAuthTokenWithQuotesAndSpaces() throws Exception {
        String tokenString = "Liferay.authToken    =   \"12345678\"";

        String parsedToken = CookieSignIn.parseAuthToken(tokenString);

        assertEquals("12345678", parsedToken);
    }

    @Test(expected = AuthenticationException.class)
    public void parseAuthTokenWithoutToken() throws Exception {
        String tokenString = "This is a string without token";

        String parsedToken = CookieSignIn.parseAuthToken(tokenString);

        assertEquals("12345678", parsedToken);
    }

    @Test(expected = AuthenticationException.class)
    public void parseAuthTokenWithIncorrectToken() throws Exception {
        String tokenString = "Liferay.authToken = \"12345\"";

        String parsedToken = CookieSignIn.parseAuthToken(tokenString);

        assertEquals("12345678", parsedToken);
    }

    @Test
    public void parseAuthTokenInsideMoreText() throws Exception {
        String tokenString = "This is more test stringLiferay.authToken = \"12345678\"This is more test string";

        String parsedToken = CookieSignIn.parseAuthToken(tokenString);

        assertEquals("12345678", parsedToken);
    }
}
