package com.liferay.mobile.sdk.v7.ddmstructureversion;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/ddm.ddmstructureversion")
public interface DDMStructureVersionService {
  @Path("/get-latest-structure-version")
  Call<JSONObject> getLatestStructureVersion(@Param(name = "structureId") long structureId);

  @Path("/get-structure-version")
  Call<JSONObject> getStructureVersion(@Param(name = "structureVersionId") long structureVersionId);

  @Path("/get-structure-versions")
  Call<JSONArray> getStructureVersions(@Param(name = "structureId") long structureId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "") JSONObject orderByComparator);

  @Path("/get-structure-versions-count")
  Call<Integer> getStructureVersionsCount(@Param(name = "structureId") long structureId);
}
