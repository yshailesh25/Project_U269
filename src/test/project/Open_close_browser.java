package test.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Open_close_browser {

	public static WebDriver driver;
	@BeforeTest
	public static void openbro()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");
                driver = new ChromeDriver(chromeOptions);
		driver.navigate().to("http://localhost:9090/Project_U269/"); 
		driver.manage().window().maximize();  
	}
	
	@AfterTest
	public static void closebro()
	{
		driver.quit();
	}
}

