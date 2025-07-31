package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pages.LoginPage;
import utils.ExcelUtils;
import utils.ExtendReportManager;
import utils.configReader;

public class LoginTest {

	WebDriver driver;
	LoginPage loginPage;
//	ExtentReports extent;
	ExtentTest test;

//	@BeforeSuite
//	public void setupReport() {
//		
//		extent = ExtendReportManager.getreportInstance();
//	}

	@BeforeMethod
	public void setup() {
		
//		configReader.loadProperties();
//		
//		String browser = configReader.get("browser");
//		boolean headless = configReader.getBoolean("headless");
		
//		headless setup
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--disable-gpu");
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/");
		loginPage = new LoginPage(driver);
		
//		if(browser.equalsIgnoreCase("chrome")) {
//			
//			ChromeOptions options = new ChromeOptions();
//			if(headless) options.addArguments("--headless=new");
//			driver = new ChromeDriver(options);
//		}
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configReader.getInt("implicit.wait")));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(configReader.getInt("page.load.timeout")));
//		
//		driver.manage().window().maximize();
//		driver.get(configReader.get("base.url"));
//		
//		loginPage = new LoginPage(driver);

	}

	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {

		String path = System.getProperty("user.dir") + "/testdata/LoginData.xlsx";
		return ExcelUtils.getSheetData(path, "Sheet1");
		
//		String path = configReader.get("excel.path");
//		String sheet = configReader.get("excel.sheet");
//		return ExcelUtils.getSheetData(path, sheet);
	}

	@Test(dataProvider = "loginData", retryAnalyzer = utils.RetryAnalyzer.class)
	public void loginWithMultipleUsers(String email, String password, String expectedResult) {
		
		test = ExtendReportManager.createTest("Login Test - " +email + "| Expected: " +expectedResult);
//		try {
//			
//			loginPage.goToLogin();
//			loginPage.login(email, password);
//			Assert.assertTrue(loginPage.isLogoutDisplayed(), "Login failed for: " +email);
//			test.pass("Login successful for: " +email);
//		}catch (Exception e) {
//			test.fail("Login failed for: " + email + "| Error: " +e.getMessage());
//			Assert.fail();
//		}

		loginPage.goToLogin();
		loginPage.login(email, password);

		if (expectedResult.equalsIgnoreCase("success")) {

			Assert.assertTrue(loginPage.isLogoutDisplayed(), "Expected success but login failed");
		} else if (expectedResult.equalsIgnoreCase("failure")) {

			Assert.assertTrue(loginPage.isErrorDisplayed(), "Expected failure message not displayed");
		} else {

			Assert.fail("Unknown expected result: " + expectedResult);
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		ExtendReportManager.flush();
	}

//	@AfterSuite
//	public void flushReport() {
//		
//		extent.flush();
//	}
}
