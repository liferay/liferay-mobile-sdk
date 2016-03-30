package com.liferay.mobile.sdk.v62.pluginsetting;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/pluginsetting")
public interface PluginSettingService {
  @Path("/update-plugin-setting")
  Call<JSONObject> updatePluginSetting(@Param("companyId") long companyId, @Param("pluginId") String pluginId, @Param("pluginType") String pluginType, @Param("roles") String roles, @Param("active") boolean active);
}
