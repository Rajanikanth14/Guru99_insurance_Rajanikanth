package com.Insurance.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Guru.project.Framework.Reporter;
import com.Insurance.webutilities.IP_webutilities;

public class Insurance_login  extends IP_webutilities
{
	@FindBy(xpath = "//*[@id=\"navbar-brand-centered\"]/ul/li[2]/a")
	private static WebElement WInsu;
	
	@FindBy(id = "email")
	private static WebElement Wemail;
	
	@FindBy(id = "password")
	private static WebElement Wpassword;
	
	@FindBy(name = "submit")
	private static WebElement Wsubbmit;
	
	public void loginpage(String Email, String Password) throws InterruptedException 
	{
		boolean retVal;
		
		
		retVal = clickElement(WInsu);
		
		driver.navigate().refresh();
		
		
		
		Reporter.log(retVal,"Clicked on login Tab Succefully in Guru99 Insurance page",
				"Failed to Clicked on login Tab in Guru99 Insurance Register page");
		
		retVal= setEditValue(Wemail, Email);
		Reporter.log(retVal,"Email entered Succefully in Guru99 Insurancer Login page",
					"Failed to Enter Email in Guru99 Insurancer Login page");
		
		retVal= setEditValue(Wpassword, Password);
		Reporter.log(retVal,"Password entered Succefully in Guru99 Insurancer Login page",
					"Failed to Enter Password in Guru99 Insurancer Login page");
		
        retVal = clickElement(Wsubbmit);
		
		Reporter.log(retVal,"Clicked on login Tab Succefully in Guru99 Insurance page",
				"Failed to Clicked on login Tab in Guru99 Insurance Register page");
		
	}
}

