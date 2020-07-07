package Tests;

import java.util.function.Consumer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.BuyPage;
import TestBase.BaseTest;

public class TestCase1 extends BaseTest
{
	BuyPage buyPage;
	
	@Test(dataProvider = "testData")
	public void testCase(Consumer<BuyPage> buyPageConsumer)
	{
		this.buyPage = new BuyPage(driver);
		this.buyPage.goTo();
		buyPageConsumer.accept(buyPage);
	}
	
	@DataProvider
	public Object[] testData()
	{
		return new Object[]{
				
			Decorator.FREE_PROMO_PURCHASE,
			Decorator.PARTIAL_PROMO_PURCHASE_FAIL,
			Decorator.PARTIAL_PROMO_PURCHASE_INVALID_CC_FAIL,
			Decorator.PARTIAL_PROMO_PURCHASE_SUCCESS
		};
	}
}
