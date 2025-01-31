/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.install;

import java.util.ListResourceBundle;

/**
 *	Setup Resources
 *
 * 	@author 	Jorg Janke
 * 	@version 	$Id: SetupRes_ar.java,v 1.2 2006/07/30 00:57:42 jjanke Exp $
 */
public class SetupRes_ar extends ListResourceBundle
{
	/**	Translation Info	*/
	static final Object[][] contents = new String[][]{
	{ "AdempiereServerSetup", 	"\u0625\u0639\u062f\u0627\u062f \u0645\u0648\u0632\u0639 \u0643\u0645\u0628\u064a\u0631" },
	{ "Ok", 					"\u0646\u0639\u0645" },
	{ "File", 					"\u0645\u0644\u0641" },
	{ "Exit", 					"\u062e\u0631\u0648\u062c" },
	{ "Help", 					"\u0645\u0633\u0627\u0639\u062f\u0629" },
	{ "PleaseCheck", 			"\u0627\u0644\u0631\u0651\u064e\u062c\u0627\u0621 \u0627\u0644\u062a\u062d\u0642\u064a\u0642" },
	{ "UnableToConnect", 		"\u063a\u064a\u0631 \u0642\u0627\u062f\u0631 \u0639\u0644\u0649 \u0627\u0644\u062d\u0635\u0648\u0644 \u0639\u0644\u0649 \u0645\u0633\u0627\u0639\u062f\u0629 \u0645\u0646 \u0645\u0648\u0642\u0639 \u0643\u0645\u0628\u064a\u0631" },
	//
	{ "AdempiereHomeInfo", 		"\u0645\u0648\u0637\u0646 \u0643\u0645\u0628\u064a\u0631 \u0647\u0648 \u0627\u0644\u0645\u0644\u0641 \u0627\u0644\u0631\u0626\u064a\u0633\u064a" },
	{ "AdempiereHome", 			"\u0645\u0648\u0637\u0646 \u0643\u0645\u0628\u064a\u0631" },
	{ "WebPortInfo", 			"(HTML) \u0645\u0646\u0641\u0630 \u0648\u0627\u0628" },
	{ "WebPort", 				"\u0645\u0646\u0641\u0630 \u0627\u0644\u0648\u0627\u0628" },
	{ "AppsServerInfo", 		"\u0627\u0650\u0633\u0645 \u0645\u0648\u0632\u0639 \u0627\u0644\u062a\u0637\u0628\u064a\u0642" },
	{ "AppsServer", 			"\u0645\u0648\u0632\u0639 \u0627\u0644\u062a\u0637\u0628\u064a\u0642" },
	{ "DatabaseTypeInfo", 		"\u0646\u0648\u0639 \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "DatabaseType", 			"\u0646\u0648\u0639 \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "DatabaseNameInfo", 		"\u0627\u0650\u0633\u0645 (\u062e\u062f\u0645\u0629) \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "DatabaseName", 			"\u0627\u0650\u0633\u0645 \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "DatabasePortInfo", 		"\u0645\u0646\u0641\u0630 \u0645\u0633\u062a\u0645\u0639 \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "DatabasePort", 			"\u0645\u0646\u0641\u0630 \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "DatabaseUserInfo", 		"\u0645\u0639\u0631\u0641 \u0645\u0633\u062a\u0639\u0645\u0644 \u0642\u0627\u0639\u062f\u0629 \u0628\u064a\u0627\u0646\u0627\u062a \u0643\u0645\u0628\u064a\u0631" },
	{ "DatabaseUser", 			"\u0645\u0633\u062a\u0639\u0645\u0644 \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "DatabasePasswordInfo", 	"\u0643\u0644\u0645\u0629 \u0633\u0631 \u0645\u0633\u062a\u0639\u0645\u0644 \u0642\u0627\u0639\u062f\u0629 \u0628\u064a\u0627\u0646\u0627\u062a \u0643\u0645\u0628\u064a\u0631" },
	{ "DatabasePassword", 		"\u0643\u0644\u0645\u0629 \u0633\u0631 \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "TNSNameInfo", 			"\u0642\u0627\u0639\u062f\u0627\u062a \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a \u0627\u0644\u0645\u0633\u062a\u0643\u0634\u0641\u0629" },
	{ "TNSName", 				"\u0627\u0644\u0628\u062d\u062b \u0639\u0646 \u0642\u0627\u0639\u062f\u0629 \u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "SystemPasswordInfo", 	"\u0643\u0644\u0645\u0629 \u0633\u0631 \u0645\u0633\u062a\u0639\u0645\u0644 \u0627\u0644\u0646\u0638\u0627\u0645" },
	{ "SystemPassword", 		"\u0643\u0644\u0645\u0629 \u0633\u0631 \u0627\u0644\u0646\u0638\u0627\u0645" },
	{ "MailServerInfo", 		"\u0645\u0648\u0632\u0639 \u0627\u0644\u0628\u0631\u064a\u062f" },
	{ "MailServer", 			"\u0645\u0648\u0632\u0639 \u0627\u0644\u0628\u0631\u064a\u062f" },
	{ "AdminEMailInfo", 		"\u0628\u0631\u064a\u062f \u0645\u062f\u064a\u0631 \u0643\u0645\u0628\u064a\u0631" },
	{ "AdminEMail", 			"\u0628\u0631\u064a\u062f \u0627\u0644\u0645\u062f\u064a\u0631" },
	{ "DatabaseServerInfo", 	"\u0627\u0650\u0633\u0645 \u0645\u0648\u0632\u0639 \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "DatabaseServer", 		"\u0645\u0648\u0632\u0639 \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "JavaHomeInfo", 			"\u0645\u0644\u0641 \u0645\u0648\u0637\u0646 \u062c\u0627\u0641\u0627" },
	{ "JavaHome", 				"\u0645\u0648\u0637\u0646 \u062c\u0627\u0641\u0627" },
	{ "JNPPortInfo", 			"\u0644\u0645\u0648\u0632\u0639 \u0627\u0644\u062a\u0637\u0628\u064a\u0642\u0627\u062a JNP \u0645\u0646\u0641\u0630" },
	{ "JNPPort", 				"JNP \u0645\u0646\u0641\u0630" },
	{ "MailUserInfo", 			"\u0645\u0633\u062a\u0639\u0645\u0644 \u0628\u0631\u064a\u062f \u0643\u0645\u0628\u064a\u0631" },
	{ "MailUser", 				"\u0645\u0633\u062a\u0639\u0645\u0644 \u0627\u0644\u0628\u0631\u064a\u062f" },
	{ "MailPasswordInfo", 		"\u0643\u0644\u0645\u0629 \u0633\u0631 \u0645\u0633\u062a\u0639\u0645\u0644 \u0628\u0631\u064a\u062f \u0643\u0645\u0628\u064a\u0631" },
	{ "MailPassword", 			"\u0643\u0644\u0645\u0629 \u0633\u0631 \u0627\u0644\u0628\u0631\u064a\u062f" },
	{ "KeyStorePassword",		"\u0643\u0644\u0645\u0629 \u0633\u0631 \u0645\u0641\u062a\u0627\u062d \u0627\u0644\u062e\u0632\u0646" },
	{ "KeyStorePasswordInfo",	"SSL \u0643\u0644\u0645\u0629 \u0633\u0631 \u0645\u0641\u062a\u0627\u062d \u0627\u0644\u062e\u0632\u0646" },
	//
	{ "JavaType",				"\u0627\u0644\u0622\u0644\u0629 \u0627\u0644\u0648\u0647\u0645\u064a\u0651\u064e\u0629 \u062c\u0627\u0641\u0627"},
	{ "JavaTypeInfo",			"\u0628\u0627\u0626\u0639 \u0627\u0644\u0622\u0644\u0629 \u0627\u0644\u0648\u0647\u0645\u064a\u0651\u064e\u0629 \u062c\u0627\u0641\u0627"},
	{ "AppsType",				"\u0646\u0648\u0639 \u0627\u0644\u0645\u0648\u0632\u0639"},
	{ "AppsTypeInfo",			"J2EE \u0646\u0648\u0639 \u0645\u0648\u0632\u0639 \u0627\u0644\u062a\u0637\u0628\u064a\u0642"},
	{ "ServerDir",				"دليل خادم التطبيق"},
	{ "ServerDirInfo",			"دليل خادم تطبيق J2EE"},
	{ "ErrorServerDir",			"خطأ في دليل خادم التطبيق"},
	{ "DeployDir",				"\u0627\u0644\u0646\u0634\u0631"},
	{ "DeployDirInfo",			"J2EE \u0645\u0644\u0641 \u0627\u0644\u0646\u0634\u0631"},
	{ "ErrorDeployDir",			"\u062e\u0637\u0623 \u0641\u064a \u0645\u0644\u0641 \u0627\u0644\u0646\u0634\u0631"},
	//
	{ "TestInfo", 				"\u0627\u0650\u062e\u062a\u0628\u0631 \u0627\u0644\u0625\u0639\u062f\u0627\u062f" },
	{ "Test", 					"\u0627\u0650\u062e\u062a\u0628\u0631" },
	{ "SaveInfo", 				"\u0627\u0650\u062d\u0641\u0638 \u0627\u0644\u0625\u0639\u062f\u0627\u062f" },
	{ "Save", 					"\u0627\u0650\u062d\u0641\u0638" },
	{ "HelpInfo", 				"\u0623\u062d\u0635\u0644 \u0639\u0644\u0649 \u0645\u0633\u0627\u0639\u062f\u0629" },
	//
	{ "ServerError", 			"\u062e\u0637\u0623 \u0641\u064a \u0625\u0639\u062f\u0627\u062f \u0627\u0644\u0645\u0648\u0632\u0639" },
	{ "ErrorJavaHome", 			"\u062e\u0637\u0623 \u0641\u064a \u0645\u0648\u0637\u0646 \u062c\u0627\u0641\u0627" },
	{ "ErrorAdempiereHome", 		"\u062e\u0637\u0623 \u0641\u064a \u0645\u0648\u0637\u0646 \u0643\u0645\u0628\u064a\u0631" },
	{ "ErrorAppsServer", 		"\u062e\u0637\u0623 \u0641\u064a \u0645\u0648\u0632\u0639 \u0627\u0644\u062a\u0637\u0628\u064a\u0642" },
	{ "ErrorWebPort", 			"\u062e\u0637\u0623 \u0641\u064a \u0645\u0646\u0641\u0630 \u0627\u0644\u0648\u0627\u0628" },
	{ "ErrorJNPPort", 			"JNP \u062e\u0637\u0623 \u0641\u064a \u0645\u0646\u0641\u0630" },
	{ "ErrorDatabaseServer", 	"\u062e\u0637\u0623 \u0641\u064a \u0645\u0648\u0632\u0639 \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "ErrorDatabasePort", 		"\u062e\u0637\u0623 \u0641\u064a \u0645\u0646\u0641\u0630 \u0645\u0648\u0632\u0639 \u0642\u0627\u0639\u062f\u0629 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a" },
	{ "ErrorJDBC", 				"JDBC \u062e\u0637\u0623 \u0641\u064a \u0627\u0644\u0631\u0651\u064e\u0628\u0637" },
	{ "ErrorTNS", 				"TNS \u062e\u0637\u0623 \u0641\u064a \u0627\u0644\u0631\u0651\u064e\u0628\u0637" },
	{ "ErrorMailServer", 		"\u062e\u0637\u0623 \u0641\u064a \u0645\u0648\u0632\u0639 \u0627\u0644\u0628\u0631\u064a\u062f" },
	{ "ErrorMail", 				"\u062e\u0637\u0623 \u0641\u064a \u0627\u0644\u0628\u0631\u064a\u062f" },
	{ "ErrorSave", 				"\u062e\u0637\u0623 \u0641\u064a \u062d\u0641\u0638 \u0627\u0644\u0645\u0644\u0641" },

	{ "\u0627\u0644\u0645\u062d\u064a\u0637 \u0645\u062d\u0641\u0648\u0638", 		"\n \u0645\u0644\u0641 \u0627\u0644\u0645\u062d\u064a\u0637 \u0645\u062d\u0641\u0648\u0638 ... \u0628\u062f\u0627\u064a\u0629 \u0627\u0644\u0627\u0650\u0646\u062a\u0634\u0627\u0631"
		+ "\n \u064a\u0645\u0643\u0646\u0643 \u0625\u0639\u0627\u062f\u0629 \u062a\u0634\u063a\u064a\u0644 \u0645\u0648\u0632\u0639 \u0627\u0644\u062a\u0637\u0628\u064a\u0642 \u0628\u0639\u062f \u0627\u0650\u0646\u062a\u0647\u0627\u0621 \u0627\u0644\u0628\u0631\u0646\u0627\u0645\u062c"
		+ "\n \u0627\u0644\u0631\u0636\u062c\u0627\u0621 \u062a\u062d\u0642\u064a\u0642 \u0627\u0644\u0623\u062b\u0631 \u0644\u0644\u0623\u062e\u0637\u0627\u0621" }

	};

	/**
	 * 	Get Contents
	 * 	@return contents
	 */
	public Object[][] getContents()
	{
		return contents;
	}	//	getContents

}	//	SetupRes_ar_TN

