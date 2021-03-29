package com.org.scriptFile;

import com.tt.libs.BasePage;
import com.tt.ui.Browser;

public class UserLogin extends BasePage{

	String usernameID = "txtUsername";
	String passwordID = "txtPassword";
	String loginbtnID = "btnLogin";
	String errorMsgID = "spanMessage";

	public UserLogin(Browser browser)
	{
		super(browser);
	}

	public void setUserName(String data)
	{
		browser.getObjectByid(usernameID);
		browser.setText(data);
	}

	public void setPassword(String data)
	{
		browser.getObjectByid(passwordID);
		browser.setText(data);
	}

	public void clickLogin()
	{
		browser.getObjectByid(loginbtnID);
		browser.click();
	}
	public String getErrorMessage()
	{
		browser.getObjectByXP(errorMsgID);
		String errorMsg = browser.getText();
		return errorMsg;
	}
}


