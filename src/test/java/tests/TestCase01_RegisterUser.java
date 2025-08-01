package tests;

import org.testng.annotations.Test;
import pages.UserPage;
import utils.BaseTest;
import data.UserTestData;
import validations.Validation;

public class TestCase01_RegisterUser extends BaseTest {

    @Test
    public void registerNewUser() {
        UserPage userPage = new UserPage(driver);

        userPage.clickSignupLogin();
        userPage.enterSignupDetails(UserTestData.getName(), UserTestData.getEmail());
        userPage.clickSignupButton();

        userPage.fillAccountDetails(
                UserTestData.getPassword(),
                UserTestData.getDay(),
                UserTestData.getMonth(),
                UserTestData.getYear(),
                UserTestData.getFirstName(),
                UserTestData.getLastName(),
                UserTestData.getCompany(),
                UserTestData.getAddress(),
                UserTestData.getCountry(),
                UserTestData.getState(),
                UserTestData.getCity(),
                UserTestData.getZip(),
                UserTestData.getMobile()
        );

        userPage.clickCreateAccount();

        Validation.validateAccountCreated(userPage);
    }
}
