package com.liferay.mobile.android.v62.announcementsdelivery;

import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/announcementsdelivery")
public interface AnnouncementsDeliveryService {
  @Path("/update-delivery")
  Call<JSONObject> updateDelivery(@Param("userId") long userId, @Param("type") String type, @Param("email") boolean email, @Param("sms") boolean sms, @Param("website") boolean website);
}
