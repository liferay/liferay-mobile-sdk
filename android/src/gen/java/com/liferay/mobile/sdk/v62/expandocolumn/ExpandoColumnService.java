package com.liferay.mobile.sdk.v62.expandocolumn;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/expandocolumn")
public interface ExpandoColumnService {
  @Path("/add-column")
  Call<JSONObject> addColumn(@Param("tableId") long tableId, @Param("name") String name, @Param("type") int type);

  @Path("/add-column")
  Call<JSONObject> addColumn(@Param("tableId") long tableId, @Param("name") String name, @Param("type") int type, @ParamObject(name = "defaultData", className = "") JSONObject defaultData);

  @Path("/delete-column")
  Call<Response> deleteColumn(@Param("columnId") long columnId);

  @Path("/update-column")
  Call<JSONObject> updateColumn(@Param("columnId") long columnId, @Param("name") String name, @Param("type") int type);

  @Path("/update-column")
  Call<JSONObject> updateColumn(@Param("columnId") long columnId, @Param("name") String name, @Param("type") int type, @ParamObject(name = "defaultData", className = "") JSONObject defaultData);

  @Path("/update-type-settings")
  Call<JSONObject> updateTypeSettings(@Param("columnId") long columnId, @Param("typeSettings") String typeSettings);
}