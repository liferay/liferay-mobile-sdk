package com.liferay.mobile.android.v62.image;

import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import org.json.JSONObject;

@Path("/image")
public interface ImageService {
  @Path("/get-image")
  Call<JSONObject> getImage(@Param("imageId") long imageId);
}
