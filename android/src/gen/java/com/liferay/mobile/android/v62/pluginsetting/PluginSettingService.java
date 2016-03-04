package com.liferay.mobile.android.v62.pluginsetting;

import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/pluginsetting")
public interface PluginSettingService {
  @Path("/update-plugin-setting")
  Call<JSONObject> updatePluginSetting(@Param("companyId") long companyId, @Param("pluginId") String pluginId, @Param("pluginType") String pluginType, @Param("roles") String roles, @Param("active") boolean active);
}
