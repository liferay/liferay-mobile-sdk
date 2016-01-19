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

package com.liferay.mobile.android.v2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.liferay.mobile.android.BaseTest;

import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class GroupServiceTest extends BaseTest {

	public GroupServiceTest() throws IOException {
		super();
	}

	@Test
	public void async() throws Exception {
		GroupService service = new GroupService(session);
		Call<List<Site>> call = service.getUserSites();

		final CountDownLatch lock = new CountDownLatch(1);

		call.async(new Callback<List<Site>>() {

			@Override
			public void onSuccess(List<Site> sites) {
				assertUserSites(sites);
				lock.countDown();
			}

			@Override
			public void onFailure(Exception exception) {
				fail(exception.getMessage());
				lock.countDown();
			}

		});

		lock.await(500, TimeUnit.MILLISECONDS);
	}

	@Test
	public void execute() throws Exception {
		GroupService service = new GroupService(session);
		Call<List<Site>> call = service.getUserSites();
		assertUserSites(call.execute(session));
	}

	@Test
	public void gson() throws Exception {
		Gson gson = new Gson();

		String json = "[{\"classNameId\":\"20005\",\"classPK\":\"20247\",\"companyId\":\"20202\",\"creatorUserId\":\"20247\",\"description\":\"\",\"descriptionCurrentValue\":\"\",\"friendlyURL\":\"\\/test\",\"groupId\":\"20249\",\"groupKey\":\"20247\",\"liveGroupId\":\"0\",\"membershipRestriction\":0,\"mvccVersion\":\"0\",\"name\":\"\",\"nameCurrentValue\":\"\",\"parentGroupId\":\"0\",\"remoteStagingGroupCount\":0,\"treePath\":\"\\/20249\\/\",\"type\":0,\"typeSettings\":\"\",\"uuid\":\"9cb53101-c40a-e531-4c1d-41dce639d11f\"},{\"classNameId\":\"20019\",\"classPK\":\"20202\",\"companyId\":\"20202\",\"creatorUserId\":\"20205\",\"description\":\"\",\"descriptionCurrentValue\":\"\",\"friendlyURL\":\"\\/global\",\"groupId\":\"20243\",\"groupKey\":\"20202\",\"liveGroupId\":\"0\",\"membershipRestriction\":0,\"mvccVersion\":\"0\",\"name\":\"<?xml version='1.0' encoding='UTF-8'?><root available-locales=\\\"en_US\\\" default-locale=\\\"en_US\\\"><Name language-id=\\\"en_US\\\">Global<\\/Name><\\/root>\",\"nameCurrentValue\":\"Global\",\"parentGroupId\":\"0\",\"remoteStagingGroupCount\":0,\"treePath\":\"\\/20243\\/\",\"type\":0,\"typeSettings\":\"\",\"uuid\":\"930b9fe3-f6aa-52a6-b543-677f649a29e3\"},{\"classNameId\":\"20001\",\"classPK\":\"20229\",\"companyId\":\"20202\",\"creatorUserId\":\"20205\",\"description\":\"\",\"descriptionCurrentValue\":\"\",\"friendlyURL\":\"\\/guest\",\"groupId\":\"20229\",\"groupKey\":\"Guest\",\"liveGroupId\":\"0\",\"membershipRestriction\":0,\"mvccVersion\":\"0\",\"name\":\"<?xml version='1.0' encoding='UTF-8'?><root available-locales=\\\"en_US\\\" default-locale=\\\"en_US\\\"><Name language-id=\\\"en_US\\\">Guest<\\/Name><\\/root>\",\"nameCurrentValue\":\"Guest\",\"parentGroupId\":\"0\",\"remoteStagingGroupCount\":0,\"treePath\":\"\\/20229\\/\",\"type\":1,\"typeSettings\":\"\",\"uuid\":\"27ea3725-f4f8-7478-030c-78f8470869e4\"}]";
		Type type = new TypeToken<List<Site>>(){}.getType();
		List<Site> sites = gson.fromJson(json, type);

		assertUserSites(sites);
	}

	protected void assertUserSites(List<Site> sites) {
		assertNotNull(sites);
		assertTrue(sites.size() > 0);

		Site site = sites.get(0);
		assertEquals("/test", site.friendlyURL);

		site = sites.get(1);
		assertEquals("/global", site.friendlyURL);

		site = sites.get(2);
		assertEquals("/guest", site.friendlyURL);
	}

}