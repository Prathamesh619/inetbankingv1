package com.inetbanking.testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
			
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getpassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.Chrome.driver", readconfig.getChopath() );
		driver = new ChromeDriver();
		
	   logger =Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	

}
