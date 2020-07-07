package Pages;

import org.openqa.selenium.WebDriver;

public class BuyPage
{
	private final WebDriver DRIVER;
	private PaymentInfoComponent paymentInfoComponent;
	private PromoCodeComponent promoCodeComponent;
	private PurchaseComponent purchaseComponent;
	
	public BuyPage(final WebDriver driver)
	{
		this.DRIVER = driver;
		this.paymentInfoComponent = new PaymentInfoComponent();
		this.promoCodeComponent = new PromoCodeComponent();
		this.purchaseComponent = new PurchaseComponent();
	}
	
	public void goTo()
	{
		this.DRIVER.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-payment-screen.html");
	}

	public PaymentInfoComponent getPaymentInfoComponent()
	{
		return paymentInfoComponent;
	}

	public PromoCodeComponent getPromoCodeComponent()
	{
		return promoCodeComponent;
	}

	public PurchaseComponent getPurchaseComponent()
	{
		return purchaseComponent;
	}	
}
