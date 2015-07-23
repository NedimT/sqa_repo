package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NetflixPageObjectTester {
	private WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		//driver = new SafariDriver(
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test(invocationCount = 10)
	public void TestingNetflixPageObjects() throws InterruptedException{
		NetflixHomePageObject startNetflix = PageFactory.initElements(driver,NetflixHomePageObject.class);
		startNetflix.openNetflixHomePage();
		startNetflix.clincOnStartBtn();
		
		AccountCreationPageObject startEmailPass = PageFactory.initElements(driver, AccountCreationPageObject.class);
		startEmailPass.createAccount();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		CreditCardPageObject completePaymentInfo = PageFactory.initElements(driver, CreditCardPageObject.class);
		completePaymentInfo.clickOnCreditSelect();
		completePaymentInfo.enterFirstName();
		completePaymentInfo.enterLastName();
		completePaymentInfo.enterCreditCard();
		completePaymentInfo.enterZipcode();
		completePaymentInfo.selectExpMonth();
		completePaymentInfo.selectExpYear();
		completePaymentInfo.enterSecurityCode();
		completePaymentInfo.clickOnAgreement();
		completePaymentInfo.clickOnStartMembershipBtn();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		completePaymentInfo.checkErrorMessage();
		completePaymentInfo.clickOnSignOutLink();
		
			
	}

}
