package com.Insurance.testcases;


import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Guru.project.Framework.EXcellib;
import com.Insurance.framework.BaseTestClass;
import com.Insurance.framework.Excel;
import com.Insurance.screenpages.IP_Register_Page;
import com.Insurance.screenpages.Insurance_login;


public class IP_testcases extends BaseTestClass
{
	@Test(priority =0)
	
	public static  void TC_001_Insurance_Register() throws InterruptedException
	{
		
		String filepath= TESTDATA_PATH + TESTDATA_FILE;
		
		HashMap<String,String> data = Excel.getRowData2(filepath, "Register", CURRENT_TESTCASE);
		
		IP_Register_Page R_page = PageFactory.initElements(driver, IP_Register_Page.class);
		
	    R_page.rigisterpage(data.get("Title"),data.get("Firstname"),data.get("Surname"),data.get("Phone"),data.get("Dob_Y"), data.get("Dob_M"), data.get("Dob_D"),
	    		data.get("Licence_Period"),data.get("Occupation"),data.get("Add_Street"),data.get("City"),data.get("County"), data.get("Postcode"), data.get("Email"),
	   		data.get("Password"),data.get("Cpassword"));
		
	}  
	
    @Test(priority =1)
	
	public static  void TC_002_Insurance_Register() throws InterruptedException
	{
		
		String filepath= TESTDATA_PATH + TESTDATA_FILE;
		
		HashMap<String,String> data1 = Excel.getRowData2(filepath, "Register", CURRENT_TESTCASE);
		
		IP_Register_Page R_page1 = PageFactory.initElements(driver, IP_Register_Page.class);
		
	    R_page1.rigisterpage(data1.get("Title"),data1.get("Firstname"),data1.get("Surname"),data1.get("Phone"),data1.get("Dob_Y"), data1.get("Dob_M"), data1.get("Dob_D"),
	    		data1.get("Licence_Period"),data1.get("Occupation"),data1.get("Add_Street"),data1.get("City"),data1.get("County"), data1.get("Postcode"), data1.get("Email"),
	   		data1.get("Password"),data1.get("Cpassword"));
	      
		
	}
    
    @Test(priority =2)
	
   	public static  void TC_003_Insurance_Register() throws InterruptedException
   	{
   		
   		String filepath= TESTDATA_PATH + TESTDATA_FILE;
   		
   		HashMap<String,String> data2 = Excel.getRowData2(filepath, "Register", CURRENT_TESTCASE);
   		
   		IP_Register_Page R_page2 = PageFactory.initElements(driver, IP_Register_Page.class);
   		
   	    R_page2.rigisterpage(data2.get("Title"),data2.get("Firstname"),data2.get("Surname"),data2.get("Phone"),data2.get("Dob_Y"), data2.get("Dob_M"), data2.get("Dob_D"),
   	    		data2.get("Licence_Period"),data2.get("Occupation"),data2.get("Add_Street"),data2.get("City"),data2.get("County"), data2.get("Postcode"), data2.get("Email"),
   	   		data2.get("Password"),data2.get("Cpassword"));
   	      
   		
   	}  
	
	 @Test(priority =3)
		
	   	public static  void TC_001_Insurance_Login() throws InterruptedException
	   	{
	   		
	   		String filepath= TESTDATA_PATH + TESTDATA_FILE;
	   		
	   		HashMap<String,String> ldata = Excel.getRowData2(filepath, "Login", "TC_001_Insurance_Login");
	   		
	   		com.Insurance.screenpages.Insurance_login login = PageFactory.initElements(driver, Insurance_login.class);
	   		
	   		login.loginpage(ldata.get("Email"),ldata.get("Password"));
	   	}
	

}
