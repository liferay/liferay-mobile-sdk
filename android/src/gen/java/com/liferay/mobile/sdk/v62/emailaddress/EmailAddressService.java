package com.liferay.mobile.sdk.v62.emailaddress;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/emailaddress")
public interface EmailAddressService {
  @Path("/add-email-address")
  Call<JSONObject> addEmailAddress(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "address") String address, @Param(name = "typeId") int typeId, @Param(name = "primary") boolean primary);

  @Path("/add-email-address")
  Call<JSONObject> addEmailAddress(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "address") String address, @Param(name = "typeId") int typeId, @Param(name = "primary") boolean primary, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-email-address")
  Call<Response> deleteEmailAddress(@Param(name = "emailAddressId") long emailAddressId);

  @Path("/get-email-address")
  Call<JSONObject> getEmailAddress(@Param(name = "emailAddressId") long emailAddressId);

  @Path("/get-email-addresses")
  Call<JSONArray> getEmailAddresses(@Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/update-email-address")
  Call<JSONObject> updateEmailAddress(@Param(name = "emailAddressId") long emailAddressId, @Param(name = "address") String address, @Param(name = "typeId") int typeId, @Param(name = "primary") boolean primary);
}
