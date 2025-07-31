package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),' Signup / Login')]")
    WebElement signupLoginButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSignupLogin() {
        signupLoginButton.click();
    }
}
