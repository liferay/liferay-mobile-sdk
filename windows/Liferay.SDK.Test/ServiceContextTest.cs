//------------------------------------------------------------------------------
// <copyright file="ServiceContextTest.cs">
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
using System.Threading.Tasks;
using Liferay.SDK.Service.V62.BookmarksEntry;
using Microsoft.VisualStudio.TestPlatform.UnitTestFramework;

namespace Liferay.SDK.Test
{
	[TestClass]
	public class ServiceContextTest : TestBase
	{
		public const long ParentFolderId = 0;

		[TestMethod]
		public async Task TestAddBookmarkEntry()
		{
			var random = new Random();

			var uuid = random.Next().ToString();

			var serviceContext = new JsonObjectWrapper();

			serviceContext.JsonObject.uuid = uuid;
			serviceContext.JsonObject.addGroupPermissions = true;
			serviceContext.JsonObject.addGuestPermissions = true;

			var entry = await this.AddBookmarkEntryAsync("test", serviceContext);

			Assert.AreEqual(uuid, entry.uuid);

			this.DeleteBookmarkEntryAsync(entry);
		}

		public async Task<dynamic> AddBookmarkEntryAsync(string name, JsonObjectWrapper serviceContext)
		{
			var service = new BookmarksEntryService(this.Session);

			return await service.AddEntryAsync(ServiceContextTest.GroupId, ServiceContextTest.ParentFolderId, name, "http://www.liferay.com", string.Empty, serviceContext);
		}

		public async Task DeleteBookmarkEntryAsync(dynamic entry)
		{
			var service = new BookmarksEntryService(this.Session);

			await service.DeleteEntryAsync(entry.entryId);
		}
	}
}
