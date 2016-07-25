package com.liferay.mobile.sdk.v7.classname;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/classname")
public interface ClassNameService {
  @Path("/fetch-by-class-name-id")
  Call<JSONObject> fetchByClassNameId(@Param(name = "classNameId") long classNameId);

  @Path("/fetch-class-name")
  Call<JSONObject> fetchClassName(@Param(name = "value") String value);
}
