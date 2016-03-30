package com.liferay.mobile.sdk.v62.layoutrevision;

import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/layoutrevision")
public interface LayoutRevisionService {
  @Path("/add-layout-revision")
  Call<JSONObject> addLayoutRevision(@Param("userId") long userId, @Param("layoutSetBranchId") long layoutSetBranchId, @Param("layoutBranchId") long layoutBranchId, @Param("parentLayoutRevisionId") long parentLayoutRevisionId, @Param("head") boolean head, @Param("plid") long plid, @Param("portletPreferencesPlid") long portletPreferencesPlid, @Param("privateLayout") boolean privateLayout, @Param("name") String name, @Param("title") String title, @Param("description") String description, @Param("keywords") String keywords, @Param("robots") String robots, @Param("typeSettings") String typeSettings, @Param("iconImage") boolean iconImage, @Param("iconImageId") long iconImageId, @Param("themeId") String themeId, @Param("colorSchemeId") String colorSchemeId, @Param("wapThemeId") String wapThemeId, @Param("wapColorSchemeId") String wapColorSchemeId, @Param("css") String css, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
