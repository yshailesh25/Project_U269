package test.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Open_close_browser {

	public static WebDriver driver;
	@BeforeTest
	public static void openbro()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://localhost:9090/Project_U269/"); 
		driver.manage().window().maximize();  
	}
	
	@AfterTest
	public static void closebro()
	{
		driver.quit();
	}
}

