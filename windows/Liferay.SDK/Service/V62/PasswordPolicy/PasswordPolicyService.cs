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

namespace Liferay.SDK.Service.V62.PasswordPolicy
{
	public class PasswordPolicyService : ServiceBase
	{
		public PasswordPolicyService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddPasswordPolicyAsync(string name, string description, bool changeable, bool changeRequired, long minAge, bool checkSyntax, bool allowDictionaryWords, int minAlphanumeric, int minLength, int minLowerCase, int minNumbers, int minSymbols, int minUpperCase, bool history, int historyCount, bool expireable, long maxAge, long warningTime, int graceLimit, bool lockout, int maxFailure, long lockoutDuration, long resetFailureCount, long resetTicketMaxAge)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("changeable", changeable);
			_parameters.Add("changeRequired", changeRequired);
			_parameters.Add("minAge", minAge);
			_parameters.Add("checkSyntax", checkSyntax);
			_parameters.Add("allowDictionaryWords", allowDictionaryWords);
			_parameters.Add("minAlphanumeric", minAlphanumeric);
			_parameters.Add("minLength", minLength);
			_parameters.Add("minLowerCase", minLowerCase);
			_parameters.Add("minNumbers", minNumbers);
			_parameters.Add("minSymbols", minSymbols);
			_parameters.Add("minUpperCase", minUpperCase);
			_parameters.Add("history", history);
			_parameters.Add("historyCount", historyCount);
			_parameters.Add("expireable", expireable);
			_parameters.Add("maxAge", maxAge);
			_parameters.Add("warningTime", warningTime);
			_parameters.Add("graceLimit", graceLimit);
			_parameters.Add("lockout", lockout);
			_parameters.Add("maxFailure", maxFailure);
			_parameters.Add("lockoutDuration", lockoutDuration);
			_parameters.Add("resetFailureCount", resetFailureCount);
			_parameters.Add("resetTicketMaxAge", resetTicketMaxAge);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/add-password-policy", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddPasswordPolicyAsync(string name, string description, bool changeable, bool changeRequired, long minAge, bool checkSyntax, bool allowDictionaryWords, int minAlphanumeric, int minLength, int minLowerCase, int minNumbers, int minSymbols, int minUpperCase, string regex, bool history, int historyCount, bool expireable, long maxAge, long warningTime, int graceLimit, bool lockout, int maxFailure, long lockoutDuration, long resetFailureCount, long resetTicketMaxAge, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("changeable", changeable);
			_parameters.Add("changeRequired", changeRequired);
			_parameters.Add("minAge", minAge);
			_parameters.Add("checkSyntax", checkSyntax);
			_parameters.Add("allowDictionaryWords", allowDictionaryWords);
			_parameters.Add("minAlphanumeric", minAlphanumeric);
			_parameters.Add("minLength", minLength);
			_parameters.Add("minLowerCase", minLowerCase);
			_parameters.Add("minNumbers", minNumbers);
			_parameters.Add("minSymbols", minSymbols);
			_parameters.Add("minUpperCase", minUpperCase);
			_parameters.Add("regex", regex);
			_parameters.Add("history", history);
			_parameters.Add("historyCount", historyCount);
			_parameters.Add("expireable", expireable);
			_parameters.Add("maxAge", maxAge);
			_parameters.Add("warningTime", warningTime);
			_parameters.Add("graceLimit", graceLimit);
			_parameters.Add("lockout", lockout);
			_parameters.Add("maxFailure", maxFailure);
			_parameters.Add("lockoutDuration", lockoutDuration);
			_parameters.Add("resetFailureCount", resetFailureCount);
			_parameters.Add("resetTicketMaxAge", resetTicketMaxAge);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/add-password-policy", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeletePasswordPolicyAsync(long passwordPolicyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/delete-password-policy", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdatePasswordPolicyAsync(long passwordPolicyId, string name, string description, bool changeable, bool changeRequired, long minAge, bool checkSyntax, bool allowDictionaryWords, int minAlphanumeric, int minLength, int minLowerCase, int minNumbers, int minSymbols, int minUpperCase, bool history, int historyCount, bool expireable, long maxAge, long warningTime, int graceLimit, bool lockout, int maxFailure, long lockoutDuration, long resetFailureCount, long resetTicketMaxAge)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("changeable", changeable);
			_parameters.Add("changeRequired", changeRequired);
			_parameters.Add("minAge", minAge);
			_parameters.Add("checkSyntax", checkSyntax);
			_parameters.Add("allowDictionaryWords", allowDictionaryWords);
			_parameters.Add("minAlphanumeric", minAlphanumeric);
			_parameters.Add("minLength", minLength);
			_parameters.Add("minLowerCase", minLowerCase);
			_parameters.Add("minNumbers", minNumbers);
			_parameters.Add("minSymbols", minSymbols);
			_parameters.Add("minUpperCase", minUpperCase);
			_parameters.Add("history", history);
			_parameters.Add("historyCount", historyCount);
			_parameters.Add("expireable", expireable);
			_parameters.Add("maxAge", maxAge);
			_parameters.Add("warningTime", warningTime);
			_parameters.Add("graceLimit", graceLimit);
			_parameters.Add("lockout", lockout);
			_parameters.Add("maxFailure", maxFailure);
			_parameters.Add("lockoutDuration", lockoutDuration);
			_parameters.Add("resetFailureCount", resetFailureCount);
			_parameters.Add("resetTicketMaxAge", resetTicketMaxAge);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/update-password-policy", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePasswordPolicyAsync(long passwordPolicyId, string name, string description, bool changeable, bool changeRequired, long minAge, bool checkSyntax, bool allowDictionaryWords, int minAlphanumeric, int minLength, int minLowerCase, int minNumbers, int minSymbols, int minUpperCase, string regex, bool history, int historyCount, bool expireable, long maxAge, long warningTime, int graceLimit, bool lockout, int maxFailure, long lockoutDuration, long resetFailureCount, long resetTicketMaxAge, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("changeable", changeable);
			_parameters.Add("changeRequired", changeRequired);
			_parameters.Add("minAge", minAge);
			_parameters.Add("checkSyntax", checkSyntax);
			_parameters.Add("allowDictionaryWords", allowDictionaryWords);
			_parameters.Add("minAlphanumeric", minAlphanumeric);
			_parameters.Add("minLength", minLength);
			_parameters.Add("minLowerCase", minLowerCase);
			_parameters.Add("minNumbers", minNumbers);
			_parameters.Add("minSymbols", minSymbols);
			_parameters.Add("minUpperCase", minUpperCase);
			_parameters.Add("regex", regex);
			_parameters.Add("history", history);
			_parameters.Add("historyCount", historyCount);
			_parameters.Add("expireable", expireable);
			_parameters.Add("maxAge", maxAge);
			_parameters.Add("warningTime", warningTime);
			_parameters.Add("graceLimit", graceLimit);
			_parameters.Add("lockout", lockout);
			_parameters.Add("maxFailure", maxFailure);
			_parameters.Add("lockoutDuration", lockoutDuration);
			_parameters.Add("resetFailureCount", resetFailureCount);
			_parameters.Add("resetTicketMaxAge", resetTicketMaxAge);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/update-password-policy", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}