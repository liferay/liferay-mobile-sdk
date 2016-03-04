package com.liferay.mobile.android.v62.theme;

import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import org.json.JSONArray;

@Path("/theme")
public interface ThemeService {
  @Path("/get-themes")
  Call<JSONArray> getThemes(@Param("companyId") long companyId);

  @Path("/get-war-themes")
  Call<JSONArray> getWarThemes();
}
