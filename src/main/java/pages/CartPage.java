package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsLink;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
    WebElement firstProductAddBtn;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCart;

    @FindBy(xpath = "//td[@class='cart_description']")
    WebElement cartItem;

    public void addFirstProductToCart() {
        productsLink.click();
        firstProductAddBtn.click();
    }

    public void viewCart() {
        viewCart.click();
    }

    public boolean isProductInCart() {
        return cartItem.isDisplayed();
    }
}
