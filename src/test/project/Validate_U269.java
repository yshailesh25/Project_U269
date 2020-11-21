package test.project;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validate_U269 extends Open_close_browser{
	static String yname="shailesh";
	@Test(priority=0)
	public static void sendName()
	{
		System.out.println("Running test case 1");
		driver.findElement(By.xpath("//input[@name='yourName']")).sendKeys(yname);
		driver.findElement(By.xpath("//input[@value='Call Servlet']")).click();
	}
	
	@Test(priority=1)
	public static void verifyName()
	{
		String aname="Hello "+yname;
		System.out.println("Running test case 2");
		String vname=driver.findElement(By.xpath("/html/body/h1")).getText();
		Assert.assertEquals(aname, vname);
	}
}
