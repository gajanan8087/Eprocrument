package com.jbk.Eproc.Pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.jbk.Eproc.PagesOR.LoginPageOR;

public class LoginPage extends LoginPageOR {

	String loginPageTitle;

	// Action

	// public void enterEmail(String emailId){
	// email.sendKeys(emailId);
	// }
	// public void enterPassword(String loginPassword){
	// password.sendKeys(loginPassword);
	// }
	//
	// public HomePage clickLoginBut(){
	// submit.submit();
	// return new HomePage();
	// }

	public LoginPage(WebDriver driver,ExtentTest test2) {
		super(driver,test2);
	}

	public HomePage login(String emailId, String loginPassword) {
		test.log(Status.INFO,"login statrted..");
		email.sendKeys(emailId);
		test.info("sending password");
		password.sendKeys(loginPassword);
		submit.submit();
		test.info("submitted");
		
		return new HomePage(driver, test);

	}

	public RegistrationPage regester() {
		regesterPagelink.click();
     
		return new RegistrationPage(driver, test);
	}

	public String getLoginpageTitle() {
		test.log(Status.INFO, "Taking tittle frome url");
		String loginPageTitle = driver.getTitle();
		test.log(Status.INFO, "Getting tittle");
		test.log(Status.INFO, loginPageTitle);
		return loginPageTitle;
	}

	public boolean validateloginpageTitle() {
		
		//System.out.println();

		if (getLoginpageTitle().equals("JavaByKiran | Log in")) {
			test.log(Status.PASS, "Tittle matched..........");
			return true;
		} else {
			test.log(Status.FAIL, "not matched..........");
			return false;
		}
	}
	
	public String getLoginpageLogo(){
		
		test.log(Status.INFO, "Getting Login page logo ");
		String loginpageLogo=loginLogo.getText();
		System.out.println(loginpageLogo);
		return loginpageLogo;
		
	}
	
	public boolean validateloginpageLogo() {

		/*boolean Title = getLoginpageLogo().equals(getLoginpageLogo());
		if(true)
		{
			test.log(Status.INFO, "Login page logo is ["+Title+"]");

		}else
		{
			test.log(Status.INFO, "Login page logo is ["+Title+"]");

		}
		return Title;*/
		
		if (getLoginpageLogo().equals("Java By Kiran")) {
			test.log(Status.INFO, "Login page logo is matched");
			return true;
		} else {
			test.log(Status.INFO, "Login page logo is not matched");
			return false;
		}

	}
	
	public String getLoginpageLogoTagline(){
		String logoTaglone=tagLine.getText();
		System.out.println(logoTaglone);
		return logoTaglone;
		
	}
	
	public boolean validateloginpageLogoTagline() {
		
		if (getLoginpageLogoTagline().equals("JAVA | SELENIUM | PYTHON")) {
			test.log(Status.PASS, "Loginpage logo is matched");
			return true;
		} else {
			test.log(Status.PASS, "Loginpage logo is not matched");
			return false;
		}
		
	}
	
	public String getLoginBoxMsg(){
		String msg=loginBoxMsg.getText();
		System.out.println(msg);
		return msg;
		
	}
	
	public boolean validateLoginBoxMsg() {
		
		if (getLoginBoxMsg().equals("Sign in to start your session")) {
			return true;
		} else {
			return false;
		}
		
	}
	
//	public boolean  validateJBKlogoImg(){
//		return	logoImg.isDisplayed();
//		}
	
	
	
	


}
