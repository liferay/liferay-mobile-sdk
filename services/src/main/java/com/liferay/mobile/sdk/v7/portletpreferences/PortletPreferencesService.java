package com.liferay.mobile.sdk.v7.portletpreferences;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;

@Path("/portletpreferences")
public interface PortletPreferencesService {
  @Path("/delete-archived-preferences")
  Call<Response> deleteArchivedPreferences(@Param(name = "portletItemId") long portletItemId);
}
