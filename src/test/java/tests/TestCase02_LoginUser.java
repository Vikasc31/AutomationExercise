package tests;

import org.testng.annotations.Test;
import pages.UserPage;
import utils.BaseTest;
import data.UserTestData;
import validations.Validation;

public class TestCase02_LoginUser extends BaseTest {

    @Test(priority = 1)
    public void loginWithInvalidCredentials() {
        UserPage user = new UserPage(driver);
        user.clickSignupLogin();
        user.login(UserTestData.getInvalidEmail(), UserTestData.getInvalidPassword());

        Validation.validateInvalidLogin(user);
    }

    @Test(priority = 2)
    public void loginWithValidCredentials() {
        UserPage user = new UserPage(driver);
        user.clickSignupLogin();
        user.login(UserTestData.getValidEmail(), UserTestData.getValidPassword());

        Validation.validateSuccessfulLogin(user);
    }
}
