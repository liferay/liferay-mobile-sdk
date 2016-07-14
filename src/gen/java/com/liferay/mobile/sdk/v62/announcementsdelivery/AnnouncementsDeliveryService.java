package com.liferay.mobile.sdk.v62.announcementsdelivery;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONObject;

@Path("/announcementsdelivery")
public interface AnnouncementsDeliveryService {
  @Path("/update-delivery")
  Call<JSONObject> updateDelivery(@Param(name = "userId") long userId, @Param(name = "type") String type, @Param(name = "email") boolean email, @Param(name = "sms") boolean sms, @Param(name = "website") boolean website);
}
