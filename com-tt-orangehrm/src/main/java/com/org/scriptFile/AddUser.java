package com.org.scriptFile;

import com.tt.libs.BasePage;
import com.tt.ui.Browser;

public class AddUser extends BasePage {

	String addBtnXP = "//input[@name='btnAdd']";
	String userRoleDropDownID = "systemUser_userType";
	String employeeNameTextBoxId = "systemUser_employeeName_empName";
	String userNameTextBoxID = "systemUser_userName";
	String statusDropDownID = "systemUser_status";
	String passwordTesxtBoxId = "systemUser_password";
	String confirmPasswordTextBoxID = "systemUser_confirmPassword";
	String saveBtnID = "btnSave";
	
	public AddUser(Browser browser) {
		super(browser);
	}
	
	public void clickOnAddBtn() {
		browser.getObjectByXP(addBtnXP).click();
	}
	
	public void setUserRole(String option) {
		browser.getObjectByid(userRoleDropDownID);
		browser.selectOption(option);
	}
	
	public void setEmployeeName(String data) {
		browser.getObjectByid(employeeNameTextBoxId);
		browser.setText(data);
	}
	public void setUserName(String data) {
		browser.getObjectByid(userNameTextBoxID);
		browser.setText(data);
	}
	public void setStatus(String option) {
		browser.getObjectByid(statusDropDownID);
		browser.selectOption(option);
	}
	public void setPassword(String data) {
		browser.getObjectByid(passwordTesxtBoxId);
		browser.setText(data);
	}
	public void setConfirmPassword(String data) {
		browser.getObjectByid(confirmPasswordTextBoxID);
		browser.setText(data);
	}
	public void clickOnSaveBtn() {
		browser.getObjectByid(saveBtnID).click();
	}
}
