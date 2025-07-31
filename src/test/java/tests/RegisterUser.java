package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.*;

public class RegisterUser extends BaseTest {
    @Test
    public void registerUserTest() {
        ExcelReader reader = new ExcelReader("testdata/TestData.xlsx");

        String name = reader.getCellData("Register", 1, 0);
        String email = reader.getCellData("Register", 1, 1);
        String password = reader.getCellData("Register", 1, 2);
        String day = reader.getCellData("Register", 1, 3);
        String month = reader.getCellData("Register", 1, 4);
        String year = reader.getCellData("Register", 1, 5);
        String fname = reader.getCellData("Register", 1, 6);
        String lname = reader.getCellData("Register", 1, 7);
        String company = reader.getCellData("Register", 1, 8);
        String address = reader.getCellData("Register", 1, 9);
        String country = reader.getCellData("Register", 1, 10);
        String state = reader.getCellData("Register", 1, 11);
        String city = reader.getCellData("Register", 1, 12);
        String zip = reader.getCellData("Register", 1, 13);
        String mobile = reader.getCellData("Register", 1, 14);

        HomePage home = new HomePage(driver);
        home.clickSignupLogin();

        SignupPage signup = new SignupPage(driver);
        signup.enterNameAndEmail(name, email);
        signup.clickSignupButton();

        AccountInfoPage account = new AccountInfoPage(driver);
        account.fillDetails(password, day, month, year, fname, lname, company, address, country, state, city, zip, mobile);
        account.clickCreateAccount();
    }
}
