package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.google.common.util.concurrent.Uninterruptibles;

import TestBase.DriverManager;

public class PurchaseComponent
{
	private final By BUY_NOW_BTN = By.cssSelector("#buy");
	private final By BUY_STATUS = By.cssSelector("table #status");
	
	public void buyNow()
	{
		DriverManager.getDriver().findElement(BUY_NOW_BTN).click();
	}
	
	public String getPurchaseStatus()
	{
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		return DriverManager.getDriver().findElement(BUY_STATUS).getText().trim();
	}
}
