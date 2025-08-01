package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageData {
    WebDriver driver;

    public LoginPageData(WebDriver driver) {
        this.driver = driver;
    }

    By signupLoginBtn = By.xpath("//a[normalize-space()='Signup / Login']"); 
    By logoutBtn = By.xpath("//a[normalize-space()='Logout']");           
    By errorMsg = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");   

    public void clickSignupLogin() {
        driver.findElement(signupLoginBtn).click();
    }

    public void login(String email, String password) {
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
    }

    public boolean isLogoutDisplayed() {
        return driver.findElement(logoutBtn).isDisplayed();
    }

    public boolean isErrorDisplayed() {
        return driver.findElement(errorMsg).isDisplayed();
    }

    public void validateSuccessfulLogin() {
        Assert.assertTrue(isLogoutDisplayed(), "Login failed with valid credentials");
    }

    public void validateInvalidLogin() {
        Assert.assertTrue(isErrorDisplayed(), "Error message not displayed for invalid login");
    }
}
