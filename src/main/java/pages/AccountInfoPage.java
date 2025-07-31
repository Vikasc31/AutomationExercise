package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

public class AccountInfoPage {
    WebDriver driver;

    @FindBy(id = "id_gender1")
    WebElement mrTitle;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "days")
    WebElement dayDropdown;

    @FindBy(id = "months")
    WebElement monthDropdown;

    @FindBy(id = "years")
    WebElement yearDropdown;

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "company")
    WebElement company;

    @FindBy(id = "address1")
    WebElement address;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "state")
    WebElement state;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "zipcode")
    WebElement zipCode;

    @FindBy(id = "mobile_number")
    WebElement mobile;

    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    WebElement createAccountBtn;

    public AccountInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillDetails(String password, String day, String month, String year,
                            String fName, String lName, String comp, String addr,
                            String ctry, String st, String cty, String zip, String mob) {
        mrTitle.click();
        passwordField.sendKeys(password);
        new Select(dayDropdown).selectByVisibleText(day);
        new Select(monthDropdown).selectByVisibleText(month);
        new Select(yearDropdown).selectByVisibleText(year);
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        company.sendKeys(comp);
        address.sendKeys(addr);
        new Select(country).selectByVisibleText(ctry);
        state.sendKeys(st);
        city.sendKeys(cty);
        zipCode.sendKeys(zip);
        mobile.sendKeys(mob);
    }

    public void clickCreateAccount() {
        createAccountBtn.click();
    }
}
