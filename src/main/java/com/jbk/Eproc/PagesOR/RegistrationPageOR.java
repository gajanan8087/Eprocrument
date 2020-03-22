package com.jbk.Eproc.PagesOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;
import com.jbk.Eproc.PageBase.PageBase;

public class RegistrationPageOR extends PageBase {
	public RegistrationPageOR(WebDriver driver,ExtentTest test) {
		super(driver,test);
	}


	@FindBy(xpath="//b[text()='Java By Kiran']")
	public WebElement headerText;
	
	@FindBy(xpath="//p[@ class='login-box-msg']")
	public WebElement registrationBoxMsg;
	
	@FindBy(id="name")
	public WebElement name;
	
	@FindBy(id="name_error")
	public WebElement nameError;
	
	@FindBy(id="mobile")
	public WebElement mobile;
	
	@FindBy(id="mobile_error")
	public WebElement mobileError;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="email_error")
	public WebElement emailError;	
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="password_error")
	public WebElement passwordError;
	
	@FindBy(xpath="//button")
	public WebElement signinButton;
	
	
	@FindBy(xpath="//a[@class='text-center']")
	public WebElement haveAccount;
	
	
	

}
