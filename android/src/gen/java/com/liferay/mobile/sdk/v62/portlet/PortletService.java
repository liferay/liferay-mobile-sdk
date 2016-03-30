package com.liferay.mobile.sdk.v62.portlet;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/portlet")
public interface PortletService {
  @Path("/get-war-portlets")
  Call<JSONArray> getWarPortlets();

  @Path("/update-portlet")
  Call<JSONObject> updatePortlet(@Param("companyId") long companyId, @Param("portletId") String portletId, @Param("roles") String roles, @Param("active") boolean active);
}
