package com.liferay.mobile.sdk.v7.expandocolumn;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/expandocolumn")
public interface ExpandoColumnService {
  @Path("/add-column")
  Call<JSONObject> addColumn(@Param(name = "tableId") long tableId, @Param(name = "name") String name, @Param(name = "type") int type);

  @Path("/add-column")
  Call<JSONObject> addColumn(@Param(name = "tableId") long tableId, @Param(name = "name") String name, @Param(name = "type") int type, @Param(name = "defaultData", className = "") JSONObject defaultData);

  @Path("/delete-column")
  Call<Response> deleteColumn(@Param(name = "columnId") long columnId);

  @Path("/fetch-expando-column")
  Call<JSONObject> fetchExpandoColumn(@Param(name = "columnId") long columnId);

  @Path("/update-column")
  Call<JSONObject> updateColumn(@Param(name = "columnId") long columnId, @Param(name = "name") String name, @Param(name = "type") int type);

  @Path("/update-column")
  Call<JSONObject> updateColumn(@Param(name = "columnId") long columnId, @Param(name = "name") String name, @Param(name = "type") int type, @Param(name = "defaultData", className = "") JSONObject defaultData);

  @Path("/update-type-settings")
  Call<JSONObject> updateTypeSettings(@Param(name = "columnId") long columnId, @Param(name = "typeSettings") String typeSettings);
}
