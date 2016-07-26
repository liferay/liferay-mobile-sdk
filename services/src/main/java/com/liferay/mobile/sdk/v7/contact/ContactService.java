package com.liferay.mobile.sdk.v7.contact;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/contact")
public interface ContactService {
  @Path("/get-contact")
  Call<JSONObject> getContact(@Param(name = "contactId") long contactId);

  @Path("/get-contacts")
  Call<JSONArray> getContacts(@Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject orderByComparator);

  @Path("/get-contacts-count")
  Call<Integer> getContactsCount(@Param(name = "classNameId") long classNameId, @Param(name = "classPK") long classPK);
}
