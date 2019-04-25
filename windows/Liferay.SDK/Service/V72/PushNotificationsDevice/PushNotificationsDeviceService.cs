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

namespace Liferay.SDK.Service.V72.PushNotificationsDevice
{
	public class PushNotificationsDeviceService : ServiceBase
	{
		public PushNotificationsDeviceService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddPushNotificationsDeviceAsync(string token, string platform)
		{
			var _parameters = new JsonObject();

			_parameters.Add("token", token);
			_parameters.Add("platform", platform);

			var _command = new JsonObject()
			{
				{ "/pushnotifications.pushnotificationsdevice/add-push-notifications-device", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeletePushNotificationsDeviceAsync(string token)
		{
			var _parameters = new JsonObject();

			_parameters.Add("token", token);

			var _command = new JsonObject()
			{
				{ "/pushnotifications.pushnotificationsdevice/delete-push-notifications-device", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeletePushNotificationsDeviceAsync(long pushNotificationsDeviceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("pushNotificationsDeviceId", pushNotificationsDeviceId);

			var _command = new JsonObject()
			{
				{ "/pushnotifications.pushnotificationsdevice/delete-push-notifications-device", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task SendPushNotificationAsync(string platform, IEnumerable<string> tokens, string payload)
		{
			var _parameters = new JsonObject();

			_parameters.Add("platform", platform);
			_parameters.Add("tokens", tokens);
			_parameters.Add("payload", payload);

			var _command = new JsonObject()
			{
				{ "/pushnotifications.pushnotificationsdevice/send-push-notification", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SendPushNotificationAsync(IEnumerable<long> toUserIds, string payload)
		{
			var _parameters = new JsonObject();

			_parameters.Add("toUserIds", toUserIds);
			_parameters.Add("payload", payload);

			var _command = new JsonObject()
			{
				{ "/pushnotifications.pushnotificationsdevice/send-push-notification", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}