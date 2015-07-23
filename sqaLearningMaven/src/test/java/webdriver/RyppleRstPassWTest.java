package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RyppleRstPassWTest {
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

		RstPasswordPageObject passWRstObj = PageFactory.initElements(driver, RstPasswordPageObject.class);
		passWRstObj.navigateToLoginPage();
		passWRstObj.rstPassWord();
		passWRstObj.checkErrorMessage();
	}
}
