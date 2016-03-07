package com.liferay.mobile.android.v62.expandocolumn;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
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
