package com.liferay.mobile.android.v62.classname;

import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Long;
import java.lang.String;
import org.json.JSONObject;

@Path("/classname")
public interface ClassNameService {
  @Path("/fetch-class-name")
  Call<JSONObject> fetchClassName(@Param("value") String value);

  @Path("/fetch-class-name-id")
  Call<Long> fetchClassNameId(@Param("clazz") JSONObject clazz);

  @Path("/fetch-class-name-id")
  Call<Long> fetchClassNameId(@Param("value") String value);
}
