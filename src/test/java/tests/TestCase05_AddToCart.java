package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import utils.BaseTest;

public class TestCase05_AddToCart extends BaseTest {

    @Test
    public void addFirstProductToCart() {
        CartPage cart = new CartPage(driver);
        cart.addFirstProductToCart();
        cart.viewCart();

        Assert.assertTrue(cart.isProductInCart(), "Product not added to cart");
    }
}
