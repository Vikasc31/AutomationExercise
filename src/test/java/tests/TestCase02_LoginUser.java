package tests;

import org.testng.annotations.Test;
import pages.LoginPageData;
import utils.BaseTest;
import data.LoginTestData;

public class TestCase02_LoginUser extends BaseTest {

    @Test(priority = 2)
    public void loginWithValidCredentials() {
        LoginPageData user = new LoginPageData(driver);
        user.clickSignupLogin();
        user.login(LoginTestData.getValidEmail(), LoginTestData.getValidPassword());

        user.validateSuccessfulLogin();
    }

    @Test(priority = 1)
    public void loginWithInvalidCredentials() {
        LoginPageData user = new LoginPageData(driver);
        user.clickSignupLogin();
        user.login(LoginTestData.getInvalidEmail(), LoginTestData.getInvalidPassword());

        user.validateInvalidLogin();
    }
}
