package com.liferay.mobile.sdk.v7.listtype;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/listtype")
public interface ListTypeService {
  @Path("/get-list-type")
  Call<JSONObject> getListType(@Param(name = "listTypeId") long listTypeId);

  @Path("/get-list-types")
  Call<JSONArray> getListTypes(@Param(name = "type") String type);

  @Path("/validate")
  Call<Response> validate(@Param(name = "listTypeId") long listTypeId, @Param(name = "type") String type);

  @Path("/validate")
  Call<Response> validate(@Param(name = "listTypeId") long listTypeId, @Param(name = "classNameId") long classNameId, @Param(name = "type") String type);
}
