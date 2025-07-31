package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class ProductsPage {
    WebDriver driver;

    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsLink;

    @FindBy(id = "search_product")
    WebElement searchBox;

    @FindBy(id = "submit_search")
    WebElement searchButton;

    @FindBy(xpath = "//h2[text()='Searched Products']")
    WebElement searchedProductsTitle;

    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement brandPolo;

    @FindBy(xpath = "//div[@class='features_items']")
    WebElement productResults;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToProducts() {
        productsLink.click();
    }

    public void searchProduct(String term) {
        searchBox.clear();
        searchBox.sendKeys(term);
        searchButton.click();
    }

    public boolean isSearchedProductVisible() {
        return searchedProductsTitle.isDisplayed();
    }

    public void clickBrandPolo() {
        brandPolo.click();
    }

    public boolean isProductResultDisplayed() {
        return productResults.isDisplayed();
    }
}
