package com.org.tests;

import java.util.HashMap;
import com.org.scriptFile.AddUser;
import com.org.scriptFile.Admin;
import com.org.scriptFile.UserLogin;
import com.tt.libs.BaseTest;
import com.tt.ui.Browser;
import com.tt.util.XLUtil;

public class Home extends BaseTest{

	Browser browser = null;
	UserLogin lg = null;
	Admin ap = null;
	AddUser au = null;


	public Home(){
		//This is a constructor of the child class...
	}
	public Home(HashMap<String, String> testdata) {
		setTestdata(testdata);
	}

	@Override
	public void initializeTest(String url, String testName) {
		// TODO Auto-generated method stub
		browser = new Browser();	
		browser.initBrowser();
		browser.launchBrowser(url);

		lg = new UserLogin(browser);
		ap = new Admin(browser);
		au = new AddUser(browser);
		
		r.startTest(testName);
		r.setDriver(browser.getDriver());
	}

	@Override
	public void executeTest() {
		// TODO Auto-generated method stub
		
		lg.setUserName(d("user_name"));
		r.info("entered username:" + (d("user_name")));
		lg.setPassword(d("user_password"));
		r.info("entered password:" + (d("user_password")));
		lg.clickLogin();
		r.info("Clicked login Button");

		ap.selectDisplayOrder();
		au.clickOnAddBtn();
		au.setUserRole(d("user_role"));
		au.setUserRole("ESS");
		au.setEmployeeName(d("employee_name"));
		au.setUserName(d("users_name"));
		au.setStatus("Enabled");
		au.setPassword(d("password"));
		au.setConfirmPassword(d("confirm_password"));

	}

	@Override
	public void setTestData(String... arg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void prepareTestData(String filePath) {
		// TODO Auto-generated method stub
		XLUtil xl = new XLUtil(filePath);
		testdata = new HashMap();


		//putting information from AddUser...
		
		testdata.put("user_role", xl.getCellValue("UserRole", 1));
		testdata.put("employee_name", xl.getCellValue("Employee Name", 1));
		testdata.put("users_name", xl.getCellValue("User Name", 1));
		testdata.put("user_status", xl.getCellValue("Status", 1));
		testdata.put("password", xl.getCellValue("Password", 1));
		testdata.put("confirm_password", xl.getCellValue("Confirm Password", 1));

		xl.close();
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
	}	
}
