package com.jbk.Eproc.PageBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.jbk.Eproc.Base.Base;


public class PageBase extends Base {

	public  WebDriver driver;
	public ExtentTest test;

	public PageBase(WebDriver driver,ExtentTest test) {
			this.driver=driver;
			this.test=test;
			PageFactory.initElements(driver, this);
	}

	
	

	
}
