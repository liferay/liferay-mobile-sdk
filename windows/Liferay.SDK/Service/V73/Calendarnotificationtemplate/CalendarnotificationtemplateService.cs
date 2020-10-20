/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V73.Calendarnotificationtemplate
{
	public class CalendarnotificationtemplateService : ServiceBase
	{
		public CalendarnotificationtemplateService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCalendarNotificationTemplateAsync(long calendarId, JsonObjectWrapper notificationType, string notificationTypeSettings, JsonObjectWrapper notificationTemplateType, string subject, string body, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarId", calendarId);
			this.MangleWrapper(_parameters, "notificationType", "$languageUtil.getJSONWrapperClassName($parameter.type)", notificationType);
			_parameters.Add("notificationTypeSettings", notificationTypeSettings);
			this.MangleWrapper(_parameters, "notificationTemplateType", "$languageUtil.getJSONWrapperClassName($parameter.type)", notificationTemplateType);
			_parameters.Add("subject", subject);
			_parameters.Add("body", body);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarnotificationtemplate/add-calendar-notification-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCalendarNotificationTemplateAsync(long calendarNotificationTemplateId, string notificationTypeSettings, string subject, string body, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("calendarNotificationTemplateId", calendarNotificationTemplateId);
			_parameters.Add("notificationTypeSettings", notificationTypeSettings);
			_parameters.Add("subject", subject);
			_parameters.Add("body", body);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/calendar.calendarnotificationtemplate/update-calendar-notification-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}