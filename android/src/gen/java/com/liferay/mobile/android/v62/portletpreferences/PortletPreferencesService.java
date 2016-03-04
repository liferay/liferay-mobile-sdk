package com.liferay.mobile.android.v62.portletpreferences;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;

@Path("/portletpreferences")
public interface PortletPreferencesService {
  @Path("/delete-archived-preferences")
  Call<Response> deleteArchivedPreferences(@Param("portletItemId") long portletItemId);

  @Path("/restore-archived-preferences")
  Call<Response> restoreArchivedPreferences(@Param("groupId") long groupId, @Param("layout") JSONObjectWrapper layout, @Param("portletId") String portletId, @Param("portletItem") JSONObjectWrapper portletItem, @Param("preferences") JSONObjectWrapper preferences);

  @Path("/restore-archived-preferences")
  Call<Response> restoreArchivedPreferences(@Param("groupId") long groupId, @Param("layout") JSONObjectWrapper layout, @Param("portletId") String portletId, @Param("portletItemId") long portletItemId, @Param("preferences") JSONObjectWrapper preferences);

  @Path("/restore-archived-preferences")
  Call<Response> restoreArchivedPreferences(@Param("groupId") long groupId, @Param("name") String name, @Param("layout") JSONObjectWrapper layout, @Param("portletId") String portletId, @Param("preferences") JSONObjectWrapper preferences);

  @Path("/update-archive-preferences")
  Call<Response> updateArchivePreferences(@Param("userId") long userId, @Param("groupId") long groupId, @Param("name") String name, @Param("portletId") String portletId, @Param("preferences") JSONObjectWrapper preferences);
}
