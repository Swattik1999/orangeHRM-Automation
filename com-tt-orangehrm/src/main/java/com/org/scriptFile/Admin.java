package com.org.scriptFile;

import com.tt.libs.BasePage;
import com.tt.ui.Browser;

public class Admin extends BasePage {

	String adminOptionXP1 = "//a[@id='menu_admin_viewAdminModule']";
	String organizationOptionXP1 = "//a[@id='menu_admin_Organization']";
	String generalInformationXP1 = "//a[@id='menu_admin_viewOrganizationGeneralInformation']";
	String adminUserManagementId = "menu_admin_UserManagement";
	String userID = "menu_admin_viewSystemUsers";

	public Admin(Browser browser) 
	{
		super(browser);
	}

	public void selectDisplayOrder() 
	{
		browser.getObjectByXP(adminOptionXP1);
		browser.Mousehover();
		browser.getObjectByid(adminUserManagementId);
		browser.Mousehover();
		browser.getObjectByid(userID);
		browser.click();
	}
}
