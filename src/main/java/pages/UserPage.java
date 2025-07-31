package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

public class UserPage {
    WebDriver driver;

    public UserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ========== Common Elements ==========
    @FindBy(xpath = "//a[contains(text(),' Signup / Login')]")
    WebElement signupLoginLink;

    // ========== Signup Page Elements ==========
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement nameField;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailField;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signupButton;

    // ========== Login Page Elements ==========
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement loginPassword;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[text()=' Logout']")
    WebElement logoutLink;

    @FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
    WebElement errorMsg;

    // ========== Account Info Page Elements ==========
    @FindBy(id = "id_gender1")
    WebElement mrTitle;

    @FindBy(id = "password")
    WebElement accountPassword;

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

    // ========== Methods ==========

    public void clickSignupLogin() {
        signupLoginLink.click();
    }

    public void enterSignupDetails(String name, String email) {
        nameField.sendKeys(name);
        emailField.sendKeys(email);
    }

    public void clickSignupButton() {
        signupButton.click();
    }

    public void fillAccountDetails(String password, String day, String month, String year,
                                   String fName, String lName, String comp, String addr,
                                   String ctry, String st, String cty, String zip, String mob) {
        mrTitle.click();
        accountPassword.sendKeys(password);
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

    public void login(String email, String password) {
        loginEmail.sendKeys(email);
        loginPassword.sendKeys(password);
        loginBtn.click();
    }

    public boolean isLogoutDisplayed() {
        return logoutLink.isDisplayed();
    }

    public boolean isErrorDisplayed() {
        return errorMsg.isDisplayed();
    }
}
