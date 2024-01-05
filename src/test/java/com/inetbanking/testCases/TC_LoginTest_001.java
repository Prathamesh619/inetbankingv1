package com.inetbanking.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;




public class TC_LoginTest_001 extends BaseClass
{  
	@Test
	public void loginTest() 
	{
		driver.get(baseURL);
		logger.info("URl is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(username);
		logger.info("Entered Username");
		
		lp.setpassword(password);
		logger.info("Entered Password");
		
		lp.ClickSubmit();
		
		
		System.out.println(driver.getTitle());
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			
			AssertJUnit.assertTrue(true);
			logger.info("Login test Passed");
		}
		else
		{
			AssertJUnit.assertTrue(false);
			logger.info("Login test failed");
		} 
		
		
		
		
	}

}
