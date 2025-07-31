package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.testng.Assert;


public class SignupPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement nameField;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailField;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signupButton;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterNameAndEmail(String name, String email) {
        nameField.sendKeys(name);
        emailField.sendKeys(email);
    }

    public void clickSignupButton() {
        signupButton.click();
    
    }
    
}
