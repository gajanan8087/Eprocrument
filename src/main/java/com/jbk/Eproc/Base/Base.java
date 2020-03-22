 package com.jbk.Eproc.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.testng.annotations.BeforeSuite;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class Base {
	public static Properties prop;
	protected String currDir;
	Logger log;

	@BeforeSuite
	public void loadProperties() {
		
		//log4j
		/*log = Logger.getLogger("Base"); 
		 PropertyConfigurator.configure("log4j.properties");*/
		 
		//loadProperties();
		try {
			prop = new Properties();
			currDir = System.getProperty("user.dir");
			//System.out.println("currDir" + currDir);
			FileInputStream fis = new FileInputStream("F:\\Eprocrument\\src\\resource\\java\\com\\jbk\\Eproc\\PropertiesFile\\config.properties");
			try {
				prop.load(fis);
				System.out.println(prop.get("username"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
	}
	
		
	
	
	
	
	

}
