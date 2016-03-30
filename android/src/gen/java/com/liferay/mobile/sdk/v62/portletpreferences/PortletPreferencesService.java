package com.liferay.mobile.sdk.v62.portletpreferences;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONObject;

@Path("/portletpreferences")
public interface PortletPreferencesService {
  @Path("/delete-archived-preferences")
  Call<Response> deleteArchivedPreferences(@Param("portletItemId") long portletItemId);

  @Path("/restore-archived-preferences")
  Call<Response> restoreArchivedPreferences(@Param("groupId") long groupId, @ParamObject(name = "layout", className = "com.liferay.portal.model.Layout") JSONObject layout, @Param("portletId") String portletId, @ParamObject(name = "portletItem", className = "com.liferay.portal.model.PortletItem") JSONObject portletItem, @ParamObject(name = "preferences", className = "javax.portlet.PortletPreferences") JSONObject preferences);

  @Path("/restore-archived-preferences")
  Call<Response> restoreArchivedPreferences(@Param("groupId") long groupId, @ParamObject(name = "layout", className = "com.liferay.portal.model.Layout") JSONObject layout, @Param("portletId") String portletId, @Param("portletItemId") long portletItemId, @ParamObject(name = "preferences", className = "javax.portlet.PortletPreferences") JSONObject preferences);

  @Path("/restore-archived-preferences")
  Call<Response> restoreArchivedPreferences(@Param("groupId") long groupId, @Param("name") String name, @ParamObject(name = "layout", className = "com.liferay.portal.model.Layout") JSONObject layout, @Param("portletId") String portletId, @ParamObject(name = "preferences", className = "javax.portlet.PortletPreferences") JSONObject preferences);

  @Path("/update-archive-preferences")
  Call<Response> updateArchivePreferences(@Param("userId") long userId, @Param("groupId") long groupId, @Param("name") String name, @Param("portletId") String portletId, @ParamObject(name = "preferences", className = "javax.portlet.PortletPreferences") JSONObject preferences);
}
