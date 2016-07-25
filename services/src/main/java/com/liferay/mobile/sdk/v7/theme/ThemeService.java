package com.liferay.mobile.sdk.v7.theme;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import org.json.JSONArray;

@Path("/theme")
public interface ThemeService {
  @Path("/get-themes")
  Call<JSONArray> getThemes(@Param(name = "companyId") long companyId);

  @Path("/get-war-themes")
  Call<JSONArray> getWARThemes();
}
