package com.liferay.mobile.sdk.v62.shoppingcoupon;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/shoppingcoupon")
public interface ShoppingCouponService {
  @Path("/add-coupon")
  Call<JSONObject> addCoupon(@Param("code") String code, @Param("autoCode") boolean autoCode, @Param("name") String name, @Param("description") String description, @Param("startDateMonth") int startDateMonth, @Param("startDateDay") int startDateDay, @Param("startDateYear") int startDateYear, @Param("startDateHour") int startDateHour, @Param("startDateMinute") int startDateMinute, @Param("endDateMonth") int endDateMonth, @Param("endDateDay") int endDateDay, @Param("endDateYear") int endDateYear, @Param("endDateHour") int endDateHour, @Param("endDateMinute") int endDateMinute, @Param("neverExpire") boolean neverExpire, @Param("active") boolean active, @Param("limitCategories") String limitCategories, @Param("limitSkus") String limitSkus, @Param("minOrder") double minOrder, @Param("discount") double discount, @Param("discountType") String discountType, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-coupon")
  Call<Response> deleteCoupon(@Param("groupId") long groupId, @Param("couponId") long couponId);

  @Path("/get-coupon")
  Call<JSONObject> getCoupon(@Param("groupId") long groupId, @Param("couponId") long couponId);

  @Path("/search")
  Call<JSONArray> search(@Param("groupId") long groupId, @Param("companyId") long companyId, @Param("code") String code, @Param("active") boolean active, @Param("discountType") String discountType, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end);

  @Path("/update-coupon")
  Call<JSONObject> updateCoupon(@Param("couponId") long couponId, @Param("name") String name, @Param("description") String description, @Param("startDateMonth") int startDateMonth, @Param("startDateDay") int startDateDay, @Param("startDateYear") int startDateYear, @Param("startDateHour") int startDateHour, @Param("startDateMinute") int startDateMinute, @Param("endDateMonth") int endDateMonth, @Param("endDateDay") int endDateDay, @Param("endDateYear") int endDateYear, @Param("endDateHour") int endDateHour, @Param("endDateMinute") int endDateMinute, @Param("neverExpire") boolean neverExpire, @Param("active") boolean active, @Param("limitCategories") String limitCategories, @Param("limitSkus") String limitSkus, @Param("minOrder") double minOrder, @Param("discount") double discount, @Param("discountType") String discountType, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
