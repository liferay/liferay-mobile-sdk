package com.liferay.mobile.sdk.v62.classname;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Long;
import java.lang.String;
import org.json.JSONObject;

@Path("/classname")
public interface ClassNameService {
  @Path("/fetch-class-name")
  Call<JSONObject> fetchClassName(@Param("value") String value);

  @Path("/fetch-class-name-id")
  Call<Long> fetchClassNameId(@JsonObject(name = "clazz", className = "") JSONObject clazz);

  @Path("/fetch-class-name-id")
  Call<Long> fetchClassNameId(@Param("value") String value);
}
