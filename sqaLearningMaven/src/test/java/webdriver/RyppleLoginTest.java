package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RyppleLoginTest {
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	//	driver = new FirefoxDriver();
		//driver = new SafariDriver(
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testLogin_NegativeTC() throws InterruptedException{
		driver = new FirefoxDriver();

		LoginPageObject loginObj = PageFactory.initElements(driver, LoginPageObject.class);
		loginObj.navigateToLoginPage();
		loginObj.loginWithInvalidCredentials();
		loginObj.checkErrorMessage();
	}
}
