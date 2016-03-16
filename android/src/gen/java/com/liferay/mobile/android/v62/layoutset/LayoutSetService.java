package com.liferay.mobile.android.v62.layoutset;

import com.liferay.mobile.android.http.Headers;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.http.file.UploadData;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/layoutset")
public interface LayoutSetService {
  @Path("/update-layout-set-prototype-link-enabled")
  Call<Response> updateLayoutSetPrototypeLinkEnabled(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("layoutSetPrototypeLinkEnabled") boolean layoutSetPrototypeLinkEnabled, @Param("layoutSetPrototypeUuid") String layoutSetPrototypeUuid);

  @Path("/update-logo")
  Call<Response> updateLogo(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("logo") boolean logo, @Param("bytes") byte[] bytes);

  @Path(
      value = "/update-logo",
      contentType = Headers.ContentType.MULTIPART
  )
  Call<Response> updateLogo(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("logo") boolean logo, @Param("file") UploadData file);

  @Path("/update-look-and-feel")
  Call<JSONObject> updateLookAndFeel(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("themeId") String themeId, @Param("colorSchemeId") String colorSchemeId, @Param("css") String css, @Param("wapTheme") boolean wapTheme);

  @Path("/update-settings")
  Call<JSONObject> updateSettings(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("settings") String settings);

  @Path("/update-virtual-host")
  Call<JSONObject> updateVirtualHost(@Param("groupId") long groupId, @Param("privateLayout") boolean privateLayout, @Param("virtualHost") String virtualHost);
}
