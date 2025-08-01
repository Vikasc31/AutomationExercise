package validations;

import org.testng.Assert;

import pages.ProductsPage;
import pages.UserPage;

public class Validation {

	// =================== User Validation ===================
    public static void validateSuccessfulLogin(UserPage userPage) {
        Assert.assertTrue(userPage.isLogoutDisplayed(), "Login failed with valid credentials");
    }

    public static void validateInvalidLogin(UserPage userPage) {
        Assert.assertTrue(userPage.isErrorDisplayed(), "Error message not displayed for invalid login");
    }
    
	// =================== Register Validation ===================
    public static void validateAccountCreated(UserPage userPage) {
        Assert.assertTrue(userPage.isLogoutDisplayed(), "User not logged in after account creation");
    }
    
	// =================== Product Validation ===================
    public static void validateSearchedProductVisible(ProductsPage page) {
        Assert.assertTrue(page.isSearchedProductVisible(), "Searched product title not visible");
    }

    public static void validateFilteredProductsByBrand(ProductsPage page) {
        Assert.assertTrue(page.isProductResultDisplayed(), "Filtered products by brand not visible");
    }
}