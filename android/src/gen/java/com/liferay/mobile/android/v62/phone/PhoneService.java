package com.liferay.mobile.android.v62.phone;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/phone")
public interface PhoneService {
  @Path("/add-phone")
  Call<JSONObject> addPhone(@Param("className") String className, @Param("classPK") long classPK, @Param("number") String number, @Param("extension") String extension, @Param("typeId") int typeId, @Param("primary") boolean primary);

  @Path("/add-phone")
  Call<JSONObject> addPhone(@Param("className") String className, @Param("classPK") long classPK, @Param("number") String number, @Param("extension") String extension, @Param("typeId") int typeId, @Param("primary") boolean primary, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-phone")
  Call<Response> deletePhone(@Param("phoneId") long phoneId);

  @Path("/get-phone")
  Call<JSONObject> getPhone(@Param("phoneId") long phoneId);

  @Path("/get-phones")
  Call<JSONArray> getPhones(@Param("className") String className, @Param("classPK") long classPK);

  @Path("/update-phone")
  Call<JSONObject> updatePhone(@Param("phoneId") long phoneId, @Param("number") String number, @Param("extension") String extension, @Param("typeId") int typeId, @Param("primary") boolean primary);
}
