/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.sdk.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.WordUtils;

/**
 * @author Bruno Farache
 */
public class LanguageUtil {

	public String getMethodName(String path) {
		String last = getMethodURL(path);

		String[] methodName = last.split("-");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < methodName.length; i++) {
			String word = methodName[i];

			if (i > 0) {
				word = WordUtils.capitalize(word);
			}

			sb.append(word);
		}

		return sb.toString();
	}

	public String getMethodURL(String path) {
		int index = path.lastIndexOf("/") + 1;

		return path.substring(index);
	}

	public String getServiceClassName(String serviceContext) {
		StringBuilder sb = new StringBuilder();

		String className = CLASS_NAMES.get(serviceContext);

		if (className == null) {
			className = WordUtils.capitalize(serviceContext);
		}

		sb.append(className);
		sb.append("Service");

		return sb.toString();
	}

	protected static final Map<String, String> CLASS_NAMES =
		new HashMap<String, String>();

	static {
		CLASS_NAMES.put("announcementsdelivery", "AnnouncementsDelivery");
		CLASS_NAMES.put("announcementsentry", "AnnouncementsEntry");
		CLASS_NAMES.put("announcementsflag", "AnnouncementsFlag");
		CLASS_NAMES.put("assetcategory", "AssetCategory");
		CLASS_NAMES.put("assetcategoryproperty", "AssetCategoryProperty");
		CLASS_NAMES.put("assetentry", "AssetEntry");
		CLASS_NAMES.put("assettag", "AssetTag");
		CLASS_NAMES.put("assettagproperty", "AssetTagProperty");
		CLASS_NAMES.put("assetvocabulary", "AssetVocabulary");
		CLASS_NAMES.put("backgroundtask", "BackgroundTask");
		CLASS_NAMES.put("blogsentry", "BlogsEntry");
		CLASS_NAMES.put("bookmarksentry", "BookmarksEntry");
		CLASS_NAMES.put("bookmarksfolder", "BookmarksFolder");
		CLASS_NAMES.put("classname", "ClassName");
		CLASS_NAMES.put("ddlrecord", "DDLRecord");
		CLASS_NAMES.put("ddlrecordset", "DDLRecordSet");
		CLASS_NAMES.put("ddmstructure", "DDMStructure");
		CLASS_NAMES.put("ddmtemplate", "DDMTemplate");
		CLASS_NAMES.put("dlapp", "DLApp");
		CLASS_NAMES.put("dlfileentry", "DLFileEntry");
		CLASS_NAMES.put("dlfileentrytype", "DLFileEntryType");
		CLASS_NAMES.put("dlfileshortcut", "DLFileShortcut");
		CLASS_NAMES.put("dlfileversion", "DLFileVersion");
		CLASS_NAMES.put("dlfolder", "DLFolder");
		CLASS_NAMES.put("emailaddress", "EmailAddress");
		CLASS_NAMES.put("expandocolumn", "ExpandoColumn");
		CLASS_NAMES.put("expandovalue", "ExpandoValue");
		CLASS_NAMES.put("flagsentry", "FlagsEntry");
		CLASS_NAMES.put("journalarticle", "JournalArticle");
		CLASS_NAMES.put("journalfeed", "JournalFeed");
		CLASS_NAMES.put("journalfolder", "JournalFolder");
		CLASS_NAMES.put("journalstructure", "JournalStructure");
		CLASS_NAMES.put("journaltemplate", "JournalTemplate");
		CLASS_NAMES.put("layoutbranch", "LayoutBranch");
		CLASS_NAMES.put("layoutprototype", "LayoutPrototype");
		CLASS_NAMES.put("layoutrevision", "LayoutRevision");
		CLASS_NAMES.put("layoutset", "LayoutSet");
		CLASS_NAMES.put("layoutsetbranch", "LayoutSetBranch");
		CLASS_NAMES.put("layoutsetprototype", "LayoutSetPrototype");
		CLASS_NAMES.put("listtype", "ListType");
		CLASS_NAMES.put("mbban", "MBBan");
		CLASS_NAMES.put("mbcategory", "MBCategory");
		CLASS_NAMES.put("mbmessage", "MBMessage");
		CLASS_NAMES.put("mbthread", "MBThread");
		CLASS_NAMES.put("mdraction", "MDRAction");
		CLASS_NAMES.put("mdrrule", "MDRRule");
		CLASS_NAMES.put("mdrrulegroup", "MDRRuleGroup");
		CLASS_NAMES.put("mdrrulegroupinstance", "MDRRuleGroupInstance");
		CLASS_NAMES.put("membershiprequest", "MembershipRequest");
		CLASS_NAMES.put("orglabor", "OrgLabor");
		CLASS_NAMES.put("passwordpolicy", "PasswordPolicy");
		CLASS_NAMES.put("pluginsetting", "PluginSetting");
		CLASS_NAMES.put("pollsquestion", "PollsQuestion");
		CLASS_NAMES.put("pollsvote", "PollsVote");
		CLASS_NAMES.put("portletpreferences", "PortletPreferences");
		CLASS_NAMES.put("ratingsentry", "RatingsEntry");
		CLASS_NAMES.put("resourceblock", "ResourceBlock");
		CLASS_NAMES.put("resourcepermission", "ResourcePermission");
		CLASS_NAMES.put("scframeworkversion", "SCFrameworkVersion");
		CLASS_NAMES.put("sclicense", "SCLicense");
		CLASS_NAMES.put("scproductentry", "SCProductEntry");
		CLASS_NAMES.put("scproductversion", "SCProductVersion");
		CLASS_NAMES.put("shoppingcategory", "ShoppingCategory");
		CLASS_NAMES.put("shoppingcoupon", "ShoppingCoupon");
		CLASS_NAMES.put("shoppingitem", "ShoppingItem");
		CLASS_NAMES.put("shoppingorder", "ShoppingOrder");
		CLASS_NAMES.put("socialactivitysetting", "SocialActivitySetting");
		CLASS_NAMES.put("socialrequest", "SocialRequest");
		CLASS_NAMES.put("syncdlobject", "SyncDLObject");
		CLASS_NAMES.put("trashentry", "TrashEntry");
		CLASS_NAMES.put("usergroup", "UserGroup");
		CLASS_NAMES.put("usergroupgrouprole", "UserGroupGroupRole");
		CLASS_NAMES.put("usergrouprole", "UserGroupRole");
		CLASS_NAMES.put("wikinode", "WikiNode");
		CLASS_NAMES.put("wikipage", "WikiPage");
	}

}