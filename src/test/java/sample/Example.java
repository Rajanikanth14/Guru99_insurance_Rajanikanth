package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Insurance_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		driver.findElement(By.xpath("/html/body/div[3]/a")).click();
		
		WebElement Dd = driver.findElement(By.name("title"));
		Select s = new Select(Dd);
		s.selectByVisibleText("Doctor");
		
		driver.findElement(By.name("firstname")).sendKeys("kanth");
		driver.quit();

	}

}
