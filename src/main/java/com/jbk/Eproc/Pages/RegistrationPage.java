package com.jbk.Eproc.Pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.jbk.Eproc.PagesOR.RegistrationPageOR;
import com.jbk.Eproc.Util.ExtentLogsReport;

public class RegistrationPage extends RegistrationPageOR {
	
	public RegistrationPage(WebDriver driver, ExtentTest test) {
		super(driver,test);
	}

	public String getRegistrationPageTitle() {
		String registrationPageTitle = driver.getTitle();
		System.out.println(registrationPageTitle);
		return registrationPageTitle;

	}

	public boolean validateRegistrationPageTitle() {
		
		if (getRegistrationPageTitle().equals("JavaByKiran | Registration Page"))
		{
			ExtentLogsReport.info(test, "RegistrationPage Tittle is matched");
			return true;
		} else 
		   {
			ExtentLogsReport.info(test, "RegistrationPage Tittle is not matched");
			return false;
			}
	}

	public String getRegistrationPageHeader() {
		String a=headerText.getText();
		System.out.println( headerText.getText());
		ExtentLogsReport.info(test, a);
		return a;
		
	}

	public boolean validateRegistrationPageHeader() {
		if (getRegistrationPageHeader().equals("Java By Kiran")) {
			ExtentLogsReport.info(test, "RegistrationPageHeader is matched");
			return true;
		} else {
			ExtentLogsReport.info(test, "RegistrationPageHeader is not matched");
			return false;
		}
	}
	
	public void enterName(String Name){
		name.sendKeys(Name);
		
	}
	
	public String checkNameErrorMsg(){
		return nameError.getText();
	}
	
	public void enterMobile(String number){
		mobile.sendKeys(number);
		
	}
	
	public String checkMobileErrorMsg(){
		return mobileError.getText();
	}
	
	public void enterEmail(String Email){
		email.sendKeys(Email);
		
	}
	
	public void enterPassword(String Password){
		password.sendKeys(Password);
		
	}
	
	public void clickSigninButton(){
		test.info("Clicking Signin button");
		signinButton.submit();
		test.info("Clicked Signin button");
		
	}
	
	public LoginPage clickHaveAccount(ExtentTest test){
		haveAccount.click();
		return new LoginPage(driver, test);
		
	}
	


}
