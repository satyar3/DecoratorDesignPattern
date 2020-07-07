package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager
{
	private static WebDriver driver;

	public static WebDriver getDriver()
	{
		return driver;
	}

	public static void setDriver()
	{
		WebDriverManager.chromedriver().setup();
		DriverManager.driver = new ChromeDriver();
	}
}
