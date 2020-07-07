package TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.util.concurrent.Uninterruptibles;

public class BaseTest
{
	protected WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		DriverManager.setDriver();
		this.driver = DriverManager.getDriver();
		this.driver.manage().window().maximize();
	}
	
	
	@AfterTest
	public void tearDwon()
	{
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		this.driver.quit();
	}

}
