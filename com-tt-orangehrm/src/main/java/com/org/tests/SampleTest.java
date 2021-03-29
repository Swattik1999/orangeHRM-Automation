package com.org.tests;

import com.org.scriptFile.UserLogin;
import com.tt.libs.BaseTest;
import com.tt.ui.Browser;

public abstract class SampleTest extends BaseTest{

	Browser browser = null;
	UserLogin lg = null;
	
	String username, password;
	String errorMsg;
	
	public SampleTest()
	{
		browser = new Browser();	
	}

	public void initializeTest(String url)
	{
		browser.initBrowser();
		browser.launchBrowser(url);
		lg = new UserLogin(browser);
	}
	public void executeTest()
	{
		lg.setUserName(this.username);
		lg.setPassword(this.password);
		lg.clickLogin();
		errorMsg = lg.getErrorMessage();		
		if(errorMsg.equals(this.errorMsg))
			System.out.println("Test case is passed !");
		else
			System.err.println("Error occured");
	}	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		browser.close();
	}

	public void setTestData(String...arg) {
		// TODO Auto-generated method stub
		this.username = arg[0];
		this.password = arg[1];
		this.errorMsg = arg[2];
	}

	public void initializeTest(String url, String testName) {
		// TODO Auto-generated method stub

	}
}

