package com.Insurance.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Guru.project.Framework.Reporter;
import com.Insurance.webutilities.IP_webutilities;

public class IP_Register_Page extends IP_webutilities
{
	@FindBy(xpath = "/html/body/div[3]/a")
	private static WebElement Register;
	
	@FindBy(name = "title")
	private static WebElement W_Title;
	
	@FindBy(xpath = "//*[@id=\"new_user\"]/div[2]/b[2]/label")
	private static WebElement name;
	
	
	
	@FindBy(id = "user_firstname")
	private static WebElement W_Firstname;
	
	@FindBy(name = "lastname")
	private static WebElement W_Surname;
	
	@FindBy(name = "phone")
	private static WebElement W_Phone;
	
	
	@FindBy(name = "year")
	private static WebElement W_Dob_Y;
	
	@FindBy(name = "month")
	private static WebElement W_Dob_M;
	
	@FindBy(name = "date")
	private static WebElement W_Dob_D;
	
	@FindBy(name = "licencetype")
	private static WebElement W_Licencetype;
	
	@FindBy(name = "licenceperiod")
	private static WebElement W_Licence_Period;
	
	@FindBy(name = "occupation")
	private static WebElement W_Occupation;
	
	@FindBy(name = "street")
	private static WebElement W_Add_Street;
	
	@FindBy(name = "city")
	private static WebElement W_City;
	
	@FindBy(name = "county")
	private static WebElement W_County;
	
	@FindBy(name = "post_code")
	private static WebElement W_Postcode;
	
	@FindBy(name = "email")
	private static WebElement W_Email;
	
	@FindBy(name = "password")
	private static WebElement W_Password;
	
	@FindBy(name = "c_password")
	private static WebElement W_Cpassword;
	
	@FindBy(name = "submit")
	private static WebElement W_Create;
	
	
	
	
	public void rigisterpage(String Title, String Firstname, String Surname,String Phone,String Dob_Y, String Dob_M, String Dob_D,String Licence_Period,
			String Occupation,String Add_Street,String City,String County, String Postcode, String Email,String Password,String Cpassword ) throws InterruptedException 
	{
		
		boolean retVal;
		
		retVal = clickElement(Register);
		
		Reporter.log(retVal,"Clicked on Register Tab Succefully in Guru99 Insurance Register page",
				"Failed to Clicked on Register Tab in Guru99 Insurance Register page");
		
	//	driver.navigate().refresh();
		
	//	scrollToElement(W_Title);
	//	 mouseHover(W_Title);
				 
		retVal= selectItemWithText(W_Title,Title);
		
		clickElement(name);
	//	Reporter.log(retVal,"Title entered Succefully in Guru99 Insurancer Register page",
	//				"Failed to Enter Title in Guru99 Insurancer Register page");
		
		
		
	//	mouseHover(W_Firstname);
		retVal= setEditValue(W_Firstname, Firstname);
		Reporter.log(retVal,"Firstname entered Succefully in Guru99 Insurancer Register page",
					"Failed to Enter Firstname in Guru99 Insurancer Register page");
		
//		mouseHover(W_Surname);
        retVal= setEditValue(W_Surname, Surname);
		Reporter.log(retVal,"Surname entered Succefully in Guru99 Insurancer Register page",
					"Failed to Enter Surname in Guru99 Insurancer Register page");
		
//		mouseHover(W_Phone);
        retVal= setEditValue(W_Phone, Phone);
		Reporter.log(retVal,"Phone entered Succefully in Guru99 Insurancer Register page",
					"Failed to Enter Phone in Guru99 Insurancer Register page");
		
	//	mouseHover(W_Dob_Y);
        retVal= selectItemWithText(W_Dob_Y, Dob_Y);
	//	Reporter.log(retVal,"Dob_Y entered Succefully in Guru99 Insurancer Register page",
	//				"Failed to Enter Dob_Y in Guru99 Insurancer Register page");
	//	
		//mouseHover(W_Dob_M);
	    retVal= selectItemWithText(W_Dob_M, Dob_M);
//		Reporter.log(retVal,"Dob_M entered Succefully in Guru99 Insurancer Register page",
//						"Failed to Enter Dob_M in Guru99 Insurancer Register page");
		
	//	mouseHover(W_Dob_D);
		retVal= selectItemWithText(W_Dob_D, Dob_D);
//		Reporter.log(retVal,"Dob_D entered Succefully in Guru99 Insurancer Register page",
	//					"Failed to Enter Dob_D in Guru99 Insurancer Register page");
		
	//	mouseHover(W_Licencetype);
		retVal = clickElement(W_Licencetype);
		Reporter.log(retVal,"Licencetype entered Succefully in Guru99 Insurancer Register page",
				"Failed to Enter Licencetype in Guru99 Insurancer Register page");
		
	//	mouseHover(W_Licence_Period);
		retVal= selectItemWithText(W_Licence_Period, Licence_Period);
	//	Reporter.log(retVal,"Licence_Period entered Succefully in Guru99 Insurancer Register page",
	//					"Failed to Enter Licence_Period in Guru99 Insurancer Register page");
		
		retVal= selectItemWithText(W_Occupation, Occupation);
//		Reporter.log(retVal,"Occupation entered Succefully in Guru99 Insurancer Register page",
	//					"Failed to Enter Occupation in Guru99 Insurancer Register page");
		
		retVal= setEditValue(W_Add_Street, Add_Street);
		Reporter.log(retVal,"Add_Street entered Succefully in Guru99 Insurancer Register page",
						"Failed to Enter Add_Street in Guru99 Insurancer Register page");
		
		retVal= setEditValue(W_City, City);
		Reporter.log(retVal,"City entered Succefully in Guru99 Insurancer Register page",
						"Failed to Enter City in Guru99 Insurancer Register page");
		
		retVal= setEditValue(W_County, County);
		Reporter.log(retVal,"County entered Succefully in Guru99 Insurancer Register page",
						"Failed to Enter County in Guru99 Insurancer Register page");
		
		retVal= setEditValue(W_Postcode, Postcode);
		Reporter.log(retVal,"Postcode entered Succefully in Guru99 Insurancer Register page",
						"Failed to Enter Postcode in Guru99 Insurancer Register page");
		
		retVal= setEditValue(W_Email, Email);
		Reporter.log(retVal,"Email entered Succefully in Guru99 Insurancer Register page",
						"Failed to Enter Email in Guru99 Insurancer Register page");
		
		retVal= setEditValue(W_Password, Password);
		Reporter.log(retVal,"Password entered Succefully in Guru99 Insurancer Register page",
						"Failed to Enter Password in Guru99 Insurancer Register page");
		
		retVal= setEditValue(W_Cpassword, Cpassword);
		Reporter.log(retVal,"CPassword entered Succefully in Guru99 Insurancer Register page",
						"Failed to Enter CPassword in Guru99 Insurancer Register page");
		
		retVal = clickElement(W_Create);
		Reporter.log(retVal,"Create tab Clicked Succefully in Guru99 Insurancer Register page",
				"Failed to Create tab in Guru99 Insurancer Register page");
		
		driver.navigate().refresh();

		 
	}
		

}
