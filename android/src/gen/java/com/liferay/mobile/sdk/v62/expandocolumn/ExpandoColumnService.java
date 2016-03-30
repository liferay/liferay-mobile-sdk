package com.liferay.mobile.sdk.v62.expandocolumn;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/expandocolumn")
public interface ExpandoColumnService {
  @Path("/add-column")
  Call<JSONObject> addColumn(@Param("tableId") long tableId, @Param("name") String name, @Param("type") int type);

  @Path("/add-column")
  Call<JSONObject> addColumn(@Param("tableId") long tableId, @Param("name") String name, @Param("type") int type, @JsonObject(name = "defaultData", className = "") JSONObject defaultData);

  @Path("/delete-column")
  Call<Response> deleteColumn(@Param("columnId") long columnId);

  @Path("/update-column")
  Call<JSONObject> updateColumn(@Param("columnId") long columnId, @Param("name") String name, @Param("type") int type);

  @Path("/update-column")
  Call<JSONObject> updateColumn(@Param("columnId") long columnId, @Param("name") String name, @Param("type") int type, @JsonObject(name = "defaultData", className = "") JSONObject defaultData);

  @Path("/update-type-settings")
  Call<JSONObject> updateTypeSettings(@Param("columnId") long columnId, @Param("typeSettings") String typeSettings);
}
