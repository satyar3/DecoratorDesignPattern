package Pages;

import org.openqa.selenium.By;

import TestBase.DriverManager;

public class PaymentInfoComponent
{
	private final By CC_NUM_INPUT = By.cssSelector("#cc");
	private final By CC_YEAR_INPUT = By.cssSelector("#year");
	private final By CC_CVV_INPUT = By.cssSelector("#cvv");
	
	public void enterPaymentInfomartion(String cardNumber, String year, String cvv)
	{
		DriverManager.getDriver().findElement(CC_NUM_INPUT).sendKeys(cardNumber);
		DriverManager.getDriver().findElement(CC_YEAR_INPUT).sendKeys(year);
		DriverManager.getDriver().findElement(CC_CVV_INPUT).sendKeys(cvv);
	}
}
