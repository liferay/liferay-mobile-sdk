package com.liferay.mobile.sdk.v62.pluginsetting;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/pluginsetting")
public interface PluginSettingService {
  @Path("/update-plugin-setting")
  Call<JSONObject> updatePluginSetting(@Param(name = "companyId") long companyId, @Param(name = "pluginId") String pluginId, @Param(name = "pluginType") String pluginType, @Param(name = "roles") String roles, @Param(name = "active") boolean active);
}
