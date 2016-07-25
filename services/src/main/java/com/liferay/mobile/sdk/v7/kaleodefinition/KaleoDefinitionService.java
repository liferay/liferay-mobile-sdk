package com.liferay.mobile.sdk.v7.kaleodefinition;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import org.json.JSONArray;

@Path("/kaleo.kaleodefinition")
public interface KaleoDefinitionService {
  @Path("/get-kaleo-definitions")
  Call<JSONArray> getKaleoDefinitions(@Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-kaleo-definitions")
  Call<JSONArray> getKaleoDefinitions(@Param(name = "companyId") long companyId, @Param(name = "start") int start, @Param(name = "end") int end);
}
