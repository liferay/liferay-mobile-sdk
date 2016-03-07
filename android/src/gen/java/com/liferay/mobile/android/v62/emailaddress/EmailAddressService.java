package com.liferay.mobile.android.v62.emailaddress;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/emailaddress")
public interface EmailAddressService {
  @Path("/add-email-address")
  Call<JSONObject> addEmailAddress(@Param("className") String className, @Param("classPK") long classPK, @Param("address") String address, @Param("typeId") int typeId, @Param("primary") boolean primary);

  @Path("/add-email-address")
  Call<JSONObject> addEmailAddress(@Param("className") String className, @Param("classPK") long classPK, @Param("address") String address, @Param("typeId") int typeId, @Param("primary") boolean primary, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-email-address")
  Call<Response> deleteEmailAddress(@Param("emailAddressId") long emailAddressId);

  @Path("/get-email-address")
  Call<JSONObject> getEmailAddress(@Param("emailAddressId") long emailAddressId);

  @Path("/get-email-addresses")
  Call<JSONArray> getEmailAddresses(@Param("className") String className, @Param("classPK") long classPK);

  @Path("/update-email-address")
  Call<JSONObject> updateEmailAddress(@Param("emailAddressId") long emailAddressId, @Param("address") String address, @Param("typeId") int typeId, @Param("primary") boolean primary);
}
