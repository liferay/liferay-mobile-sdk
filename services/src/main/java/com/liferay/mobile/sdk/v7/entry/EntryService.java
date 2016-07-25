package com.liferay.mobile.sdk.v7.entry;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONArray;

@Path("/contacts.entry")
public interface EntryService {
  @Path("/search-users-and-contacts")
  Call<JSONArray> searchUsersAndContacts(@Param(name = "companyId") long companyId, @Param(name = "keywords") String keywords, @Param(name = "start") int start, @Param(name = "end") int end);
}
