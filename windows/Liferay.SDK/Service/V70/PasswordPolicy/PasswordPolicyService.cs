//------------------------------------------------------------------------------
// <copyright file="PasswordPolicyService.cs">
//    Copyright (c) 2014-present Andrea Di Giorgi
//
//    Permission is hereby granted, free of charge, to any person obtaining a
//    copy of this software and associated documentation files (the "Software"),
//    to deal in the Software without restriction, including without limitation
//    the rights to use, copy, modify, merge, publish, distribute, sublicense,
//    and/or sell copies of the Software, and to permit persons to whom the
//    Software is furnished to do so, subject to the following conditions:
//
//    The above copyright notice and this permission notice shall be included in
//    all copies or substantial portions of the Software.
//
//    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
//    THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
//    DEALINGS IN THE SOFTWARE.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/Ithildir/liferay-sdk-builder-windows</website>
//------------------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V70.PasswordPolicy
{
	public class PasswordPolicyService : ServiceBase
	{
		public PasswordPolicyService(ISession session)
			: base(session)
		{
		}

		public async Task<long> SearchCountAsync(long companyId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
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
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/add-password-policy", _parameters }
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
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/update-password-policy", _parameters }
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

		public async Task<dynamic> FetchPasswordPolicyAsync(long passwordPolicyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("passwordPolicyId", passwordPolicyId);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/fetch-password-policy", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, string name, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/passwordpolicy/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}