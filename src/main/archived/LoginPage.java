package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")
		WebElement signupLoginLink;
		
		@FindBy(xpath = "//input[@data-qa='login-email']")
		WebElement emailInput;
		
		@FindBy(xpath = "//input[@data-qa='login-password']")
		WebElement passwordInput;
		
		@FindBy(xpath = "//button[@data-qa='login-button']")
		WebElement loginBtn;
		
		@FindBy(xpath = "//a[text()=' Logout']")
		WebElement logoutLink;
		
		@FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
		WebElement errorMsg;
		
		public void goToLogin() {
			
			signupLoginLink.click();
		}
		public void login(String email, String password) {
			
			emailInput.sendKeys(email);
			passwordInput.sendKeys(password);
			loginBtn.click();
		} 
		
		public boolean isLogoutDisplayed() {
			
			return logoutLink.isDisplayed();
		}
		public boolean isErrorDisplayed() {
			
			return errorMsg.isDisplayed();
		}

}
