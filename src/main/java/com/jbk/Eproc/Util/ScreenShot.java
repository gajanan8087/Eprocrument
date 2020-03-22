package com.jbk.Eproc.Util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;





public class ScreenShot  {
	
	public static void takeScreenshot(WebDriver driver,String screenShotName) {
		String dateName= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destination=System.getProperty("user.dir")+"/TestsScreenshots/"+ screenShotName+dateName+".png";
		File finalDestination= new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	
	public static void  extentScreenshot(WebDriver driver,ExtentTest test,String screenShotName,Status status) {
		
		String dateName= new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destination=System.getProperty("user.dir")+"/TestsScreenshots/"+ screenShotName+dateName+".png";
		File finalDestination= new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			MediaEntityModelProvider mediaModel =MediaEntityBuilder.createScreenCaptureFromPath(destination).build();
			test.log(status, screenShotName, mediaModel);
			//childtest.log(Status.PASS,"Screenshot For TestCase "+screenShotName, mediaModel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
