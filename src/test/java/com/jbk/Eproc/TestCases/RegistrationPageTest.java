package com.jbk.Eproc.TestCases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.Eproc.Pages.LoginPage;
import com.jbk.Eproc.Pages.RegistrationPage;
import com.jbk.Eproc.TestBase.TestBase;
import com.jbk.Eproc.Util.ExtentLogsReport;

public class RegistrationPageTest extends TestBase {
	

//	@Test(priority=1)
//	public void clickNewRegister(){
//	}
	
	@Test(priority=1)
	public void checkRegistrationPageTitleTest(){
		loginPage.regester();
		ExtentLogsReport.info(test2, "Checking for Tittle");
		boolean condition=registrationPage.validateRegistrationPageTitle();
		ExtentLogsReport.IExtentResult(test2,condition ,"checkRegistrationPageTitleTest is passed", "checkRegistrationPageTitleTest is failed", "checkRegistrationPageTitleTest is skiped", driver, "YES", "YES");
		ExtentLogsReport.info(test2, "RegistrationLogin Page tittle test completed");
		Assert.assertTrue(condition);
	}
	
	@Test(priority=2)
	public void checkRegistrationPageHeaderTest(){
		loginPage.regester();
		ExtentLogsReport.info(test2, "Checking for PageHeader");
		boolean condition=registrationPage.validateRegistrationPageHeader();
		ExtentLogsReport.IExtentResult(test2, condition, "checkRegistrationPageHeaderTest is passed", "checkRegistrationPageHeaderTest is filed", "checkRegistrationPageHeaderTest is skiped", driver, "YES", "YES");
		ExtentLogsReport.info(test2, "PageHeader is completed");
		Assert.assertTrue(condition);
		}
	
	@Test(priority=3)
	public void registerPageTest(){
		loginPage.regester();
		ExtentLogsReport.info(test2, "Entered name");
		registrationPage.enterMobile("9876543210");
		ExtentLogsReport.info(test2, "Entered mobile number");
		registrationPage.enterEmail("kiran@gmail.com");
		ExtentLogsReport.info(test2, "Entered email");
		registrationPage.enterPassword("123456");
    	ExtentLogsReport.info(test2, "Entered password");
		registrationPage.clickSigninButton();
		ExtentLogsReport.pass(test2, "Submitting details successfully");
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
	}
	
//	@Test
//	public void clickAlreadyHaveAccountTest(){
//	 registrationPage.clickHaveAccount();
//	 System.out.println(driver.getTitle());
//		
//	}
	
	


}
