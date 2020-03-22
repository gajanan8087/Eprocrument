package com.jbk.Eproc.TestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.jbk.Eproc.TestBase.TestBase;
import com.jbk.Eproc.Util.ExtentLogsReport;

public class LoginPageTest extends TestBase {
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		
		ExtentLogsReport.info(test2, "loginPageTitleTest is started");
		boolean condition=loginPage.validateloginpageTitle();
		ExtentLogsReport.IExtentResult(test2,condition , "loginPageTitle Test is passed", "loginPageTitle Test is Filed", "loginPageTitle Test is skipped", driver, "YES", "YES");
		ExtentLogsReport.info(test2, "loginPageTitleTest is completed");
		Assert.assertTrue(condition);
	}

	// ImageLogo check
	/*@Test(priority = 2)
        public void loginPageLogoImgTest() {
		Assert.assertTrue(loginPage.validateJBKlogoImg());
	}*/

	// Logo check
	@Test(priority = 2)
	public void loginPageLogoTest() {
		ExtentLogsReport.info(test2, "loginPageLogoTest started");
		boolean condition=loginPage.validateloginpageLogo();
		ExtentLogsReport.IExtentResult(test2,condition,"loginPageLogoTest is passed", "loginPageLogoTest is failed", "loginPageLogoTest is skiped", driver, "YES", "YES");
		ExtentLogsReport.info(test2, "loginPageLogoTest complieted");
		Assert.assertTrue(condition);
		
	}
	
 
	// Tagline check
	/*@Test(priority = 3)
	public void loginPageTaglineTest() {
		Assert.assertTrue(loginPage.validateloginpageLogoTagline());
	}*/

	/*@Test(priority = 5)
	public void loginPageLoginBoxMsg() {
		Assert.assertTrue(loginPage.validateLoginBoxMsg());
	}*/
	
/*	@Test(priority=6)
	public void loginTest(){
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		String actResult=driver.getTitle();
		ExtentLogsReport.IExtentResult(test1, actResult, "JavaByKiran | Dashboard",  "Login Successful", "Login get failed", "Login tes get skiped", driver, "YES", "YES");
		ExtentLogsReport.pass(test1, "Login Successfully");
		test1.info("LoginTest get complieted");
		//ExtentLogsReport.info(test1, "LoginTest get complieted");
		//Assert.assertEquals(actResult, "JavaByKiran | Dashboard");
			}
*/

}
