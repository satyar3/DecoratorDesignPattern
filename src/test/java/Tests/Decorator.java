package Tests;

import java.util.function.Consumer;

import org.testng.Assert;

import Pages.BuyPage;

public class Decorator
{
	private static final Consumer<BuyPage> FREE_PROMO_CODE = b -> b.getPromoCodeComponent().enterPromoCode("FREEUDEMY");
	private static final Consumer<BuyPage> PARTIAL_PROMO_CODE = b -> b.getPromoCodeComponent().enterPromoCode("PARTIALUDEMY");
	
	private static final Consumer<BuyPage> VALID_CC_NUM = b -> b.getPaymentInfoComponent().enterPaymentInfomartion("4111111111111111", "2023", "123");
	private static final Consumer<BuyPage> INVALID_CC_NUM = b -> b.getPaymentInfoComponent().enterPaymentInfomartion("4111111111111111", "2020", "123");
	
	private static final Consumer<BuyPage> BUY_NOW = b -> b.getPurchaseComponent().buyNow();
	private static final Consumer<BuyPage> PURCHASE_STATUS_SUCCESS = b -> Assert.assertEquals("PASS", b.getPurchaseComponent().getPurchaseStatus());
	private static final Consumer<BuyPage> PURCHASE_STATUS_FAIL = b -> Assert.assertEquals("FAIL", b.getPurchaseComponent().getPurchaseStatus());

	
	public static final Consumer<BuyPage> FREE_PROMO_PURCHASE = FREE_PROMO_CODE.andThen(BUY_NOW).andThen(PURCHASE_STATUS_SUCCESS);
	public static final Consumer<BuyPage> PARTIAL_PROMO_PURCHASE_FAIL = PARTIAL_PROMO_CODE.andThen(BUY_NOW).andThen(PURCHASE_STATUS_FAIL);
	public static final Consumer<BuyPage> PARTIAL_PROMO_PURCHASE_INVALID_CC_FAIL = PARTIAL_PROMO_CODE.andThen(INVALID_CC_NUM).andThen(BUY_NOW).andThen(PURCHASE_STATUS_FAIL);
	public static final Consumer<BuyPage> PARTIAL_PROMO_PURCHASE_SUCCESS = PARTIAL_PROMO_CODE.andThen(VALID_CC_NUM).andThen(BUY_NOW).andThen(PURCHASE_STATUS_SUCCESS);
}
