package com.liferay.mobile.sdk.v62.portlet;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/portlet")
public interface PortletService {
  @Path("/get-war-portlets")
  Call<JSONArray> getWarPortlets();

  @Path("/update-portlet")
  Call<JSONObject> updatePortlet(@Param(name = "companyId") long companyId, @Param(name = "portletId") String portletId, @Param(name = "roles") String roles, @Param(name = "active") boolean active);
}
