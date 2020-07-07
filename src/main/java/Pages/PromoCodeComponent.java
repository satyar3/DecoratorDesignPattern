package Pages;

import org.openqa.selenium.By;

import TestBase.DriverManager;

public class PromoCodeComponent
{
	
	private final By CUPON_CODE_INPUT = By.cssSelector("#coupon");
	private final By CUPON_CODE_APPLY_BTN = By.cssSelector("#couponbtn");
	
	public void enterPromoCode(String promoCode)
	{
		DriverManager.getDriver().findElement(CUPON_CODE_INPUT).sendKeys(promoCode);
		DriverManager.getDriver().findElement(CUPON_CODE_APPLY_BTN).click();
	}
}
