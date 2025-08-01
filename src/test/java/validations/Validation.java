package validations;

import org.testng.Assert;
import pages.UserPage;

public class Validation {

	// Login validations
    public static void validateSuccessfulLogin(UserPage userPage) {
        Assert.assertTrue(userPage.isLogoutDisplayed(), "Login failed with valid credentials");
    }

    public static void validateInvalidLogin(UserPage userPage) {
        Assert.assertTrue(userPage.isErrorDisplayed(), "Error message not displayed for invalid login");
    }
    
    //Registration validation
    public static void validateAccountCreated(UserPage userPage) {
        Assert.assertTrue(userPage.isLogoutDisplayed(), "User not logged in after account creation");
    }
}
