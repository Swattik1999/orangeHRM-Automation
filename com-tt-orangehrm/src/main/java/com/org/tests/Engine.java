package com.org.tests;

import com.tt.libs.BaseTest;
import com.tt.util.DateUtil;
import com.tt.util.PropertiesUtil;
import com.tt.util.Reporter;

public class Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Calling the properties file from local directory...
		PropertiesUtil p = new PropertiesUtil("D:\\Selenium-Testing\\Selenium File Generate\\Properties\\env.properties");
		String appUrl = p.get("app_url");
		System.out.println(appUrl);

		// Extent report file from local directory...
		Reporter r = new Reporter("D:\\Selenium-Testing\\Selenium File Generate","DemoReport " + DateUtil.getCurrentDate("ddMMMyyy-HH-mm-ss")+".html");

		BaseTest org = new Home();

		org.setReporter(r);
		// TestCase data from excel file... 
		org.prepareTestData("D:\\Selenium-Testing\\Selenium File Generate\\resources\\TestData.xlsx");
		org.setTestData("user_name",p.get("user_name"));
		org.setTestData("user_password",p.get("user_password"));
		org.initializeTest(appUrl, "verify if we are able to add products to cart and checkout");
		org.executeTest();
//		org.closingTest();

//		r.flush();

	}

}
