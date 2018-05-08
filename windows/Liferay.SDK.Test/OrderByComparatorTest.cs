//------------------------------------------------------------------------------
// <copyright file="OrderByComparatorTest.cs">
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

using System.Linq;
using System.Threading.Tasks;
using Liferay.SDK.Service.V62.BookmarksEntry;
using Microsoft.VisualStudio.TestPlatform.UnitTestFramework;

namespace Liferay.SDK.Test
{
	[TestClass]
	public class OrderByComparatorTest : TestBase
	{
		private dynamic entryA;
		private dynamic entryZ;
		private ServiceContextTest serviceContextTest;

		[TestCleanup]
		public async Task Cleanup()
		{
			await this.serviceContextTest.DeleteBookmarkEntryAsync(this.entryA);
			await this.serviceContextTest.DeleteBookmarkEntryAsync(this.entryZ);
		}

		[TestInitialize]
		public async Task Initialize()
		{
			this.serviceContextTest = new ServiceContextTest();

			this.entryA = await this.serviceContextTest.AddBookmarkEntryAsync("A", null);
			this.entryZ = await this.serviceContextTest.AddBookmarkEntryAsync("Z", null);
		}

		[TestMethod]
		public async Task TestGetEntriesDescending()
		{
			var service = new BookmarksEntryService(this.Session);

			var className = "com.liferay.portlet.bookmarks.util.comparator.EntryNameComparator";

			var orderByComparator = new JsonObjectWrapper(className);

			var entries = await service.GetEntriesAsync(OrderByComparatorTest.GroupId, ServiceContextTest.ParentFolderId, -1, -1, orderByComparator);

			var first = entries.First();
			var second = entries.ElementAt(1);

			Assert.AreEqual("Z", first.name);
			Assert.AreEqual("A", second.name);
		}

		[TestMethod]
		public async Task TestNullOrderByComparator()
		{
			var service = new BookmarksEntryService(this.Session);

			var entries = await service.GetEntriesAsync(OrderByComparatorTest.GroupId, ServiceContextTest.ParentFolderId, -1, -1, null);

			Assert.AreEqual(2, entries.Count());

			var first = entries.First();
			var second = entries.ElementAt(1);

			Assert.AreEqual("A", first.name);
			Assert.AreEqual("Z", second.name);
		}
	}
}
