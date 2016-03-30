package com.liferay.mobile.sdk.v62.phone;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/phone")
public interface PhoneService {
  @Path("/add-phone")
  Call<JSONObject> addPhone(@Param("className") String className, @Param("classPK") long classPK, @Param("number") String number, @Param("extension") String extension, @Param("typeId") int typeId, @Param("primary") boolean primary);

  @Path("/add-phone")
  Call<JSONObject> addPhone(@Param("className") String className, @Param("classPK") long classPK, @Param("number") String number, @Param("extension") String extension, @Param("typeId") int typeId, @Param("primary") boolean primary, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-phone")
  Call<Response> deletePhone(@Param("phoneId") long phoneId);

  @Path("/get-phone")
  Call<JSONObject> getPhone(@Param("phoneId") long phoneId);

  @Path("/get-phones")
  Call<JSONArray> getPhones(@Param("className") String className, @Param("classPK") long classPK);

  @Path("/update-phone")
  Call<JSONObject> updatePhone(@Param("phoneId") long phoneId, @Param("number") String number, @Param("extension") String extension, @Param("typeId") int typeId, @Param("primary") boolean primary);
}
