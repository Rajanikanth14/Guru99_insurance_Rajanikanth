package com.Insurance.config;

import org.openqa.selenium.WebDriver;

public class Configures 
{
	public static WebDriver driver;
	
	public static String CURRENT_TESTCASE=null;
	
	public static String DEV_URL ="";
	
	public static String APP_URL="https://demo.guru99.com/insurance/v1/index.php";
	
	public static String BROWSER_NAME="CHROME";
	
	public static String PROJECTNAME="Insurance_Project";
	
	public static String RELEASENAME="First Release";
	
	public static String ENVIRONMENT ="QA";
	
	public static String TESTDATA_PATH=System.getProperty("user.dir") + "\\Testdata\\";
	
	public static String TESTDATA_FILE="\\IP_Testdatasheet.xlsx";
	
	public static String RESULTS_PATH =System.getProperty("user.dir") + "\\Reports\\";
	
	public static String RESULTS_FILE="\\IP_Report.html";
	
	public static  int MAX_WAIT_TIME=10;
	
	public static  int MID_WAIT_TIME=5;
	
	public static  int MIN_WAIT_TIME=2;

}
