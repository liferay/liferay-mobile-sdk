package com.liferay.mobile.sdk.v62.image;

import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import org.json.JSONObject;

@Path("/image")
public interface ImageService {
  @Path("/get-image")
  Call<JSONObject> getImage(@Param("imageId") long imageId);
}
