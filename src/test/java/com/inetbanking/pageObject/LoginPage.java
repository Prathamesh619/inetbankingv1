package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver lDriver;
	
	public LoginPage(WebDriver rDriver) {
		
		        lDriver = rDriver ;
				PageFactory.initElements(rDriver,this);
	}

	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	public void setUsername(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void ClickSubmit()
	{
		btnLogin.click();
	}
	
	
}
