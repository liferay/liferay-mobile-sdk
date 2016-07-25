package com.liferay.mobile.sdk.v7.layoutrevision;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/layoutrevision")
public interface LayoutRevisionService {
  @Path("/add-layout-revision")
  Call<JSONObject> addLayoutRevision(@Param(name = "userId") long userId, @Param(name = "layoutSetBranchId") long layoutSetBranchId, @Param(name = "layoutBranchId") long layoutBranchId, @Param(name = "parentLayoutRevisionId") long parentLayoutRevisionId, @Param(name = "head") boolean head, @Param(name = "plid") long plid, @Param(name = "portletPreferencesPlid") long portletPreferencesPlid, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "name") String name, @Param(name = "title") String title, @Param(name = "description") String description, @Param(name = "keywords") String keywords, @Param(name = "robots") String robots, @Param(name = "typeSettings") String typeSettings, @Param(name = "iconImage") boolean iconImage, @Param(name = "iconImageId") long iconImageId, @Param(name = "themeId") String themeId, @Param(name = "colorSchemeId") String colorSchemeId, @Param(name = "css") String css, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
