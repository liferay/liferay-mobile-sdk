package com.liferay.mobile.sdk.v62.image;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import org.json.JSONObject;

@Path("/image")
public interface ImageService {
  @Path("/get-image")
  Call<JSONObject> getImage(@Param("imageId") long imageId);
}
