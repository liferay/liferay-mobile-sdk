package com.liferay.mobile.sdk.v7.ddmtemplateversion;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.Integer;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/ddm.ddmtemplateversion")
public interface DDMTemplateVersionService {
  @Path("/get-latest-template-version")
  Call<JSONObject> getLatestTemplateVersion(@Param(name = "templateId") long templateId);

  @Path("/get-template-version")
  Call<JSONObject> getTemplateVersion(@Param(name = "templateVersionId") long templateVersionId);

  @Path("/get-template-versions")
  Call<JSONArray> getTemplateVersions(@Param(name = "templateId") long templateId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "orderByComparator", className = "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMTemplateVersion>") JSONObject orderByComparator);

  @Path("/get-template-versions-count")
  Call<Integer> getTemplateVersionsCount(@Param(name = "templateId") long templateId);
}
