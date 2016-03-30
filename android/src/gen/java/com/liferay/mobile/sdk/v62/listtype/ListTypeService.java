package com.liferay.mobile.sdk.v62.listtype;

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
  Call<JSONObject> getListType(@Param("listTypeId") int listTypeId);

  @Path("/get-list-types")
  Call<JSONArray> getListTypes(@Param("type") String type);

  @Path("/validate")
  Call<Response> validate(@Param("listTypeId") int listTypeId, @Param("type") String type);

  @Path("/validate")
  Call<Response> validate(@Param("listTypeId") int listTypeId, @Param("classNameId") long classNameId, @Param("type") String type);
}
