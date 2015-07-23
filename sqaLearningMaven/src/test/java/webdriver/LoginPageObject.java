package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

	public class LoginPageObject {
	//@FindBy(how = How.CSS, using = "a.login")
	@FindBy(name = "j_username")
	private WebElement userNameInput;
	
	@FindBy(id = "10f609781286c67a")  
	private WebElement passwordInput;
	
	@FindBy(id = "10f60978316c0ffb")
	private WebElement loginBtn;
	
	private WebDriver driver;
	
	public LoginPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public LoginPageObject loginWithInvalidCredentials() throws InterruptedException{
	
		Thread.sleep(3000);
	    userNameInput.sendKeys("test@fake.com");
		passwordInput.sendKeys("passlkjkj");
	
		loginBtn.click();
        Thread.sleep(3000);
		return this;
	}
	
	public HomePageObject loginWithValidCredentials() throws InterruptedException{
		userNameInput.sendKeys("test@fake.com");
		passwordInput.sendKeys("passlkjkj");
		loginBtn.click();
		Thread.sleep(3000);
		return PageFactory.initElements(driver, HomePageObject.class);
	}
	
	public void navigateToLoginPage(){
		driver.get("http://app.work.com/#login");
	}
	
	public void checkErrorMessage(){
		final String error_message = "The email or password you entered is incorrect.";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AssertJUnit.assertTrue(driver.getPageSource().contains(error_message));
	}
	
}
