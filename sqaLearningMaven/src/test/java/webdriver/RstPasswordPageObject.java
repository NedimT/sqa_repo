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

	public class RstPasswordPageObject {
	//@FindBy(how = How.CSS, using = "a.login")
	@FindBy(id = "GPWX50PCBKD")
	private WebElement logInButton;
	
	//@FindBy(css = "div.GPWX50PCBKD")
	@FindBy(partialLinkText = "Forgot Password?" )
	private WebElement forgotPassWButton;
	
	@FindBy(css = "input.gwt-TextBox.GPWX50PCPMD.GPWX50PCNMD")
	private WebElement emailBox;
	
	@FindBy(css = "button.GPWX50PCPL.GPWX50PCLMD")
	private WebElement sendInstructions;
	
	private WebDriver driver;
	
	public RstPasswordPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public RstPasswordPageObject rstPassWord() throws InterruptedException {
		forgotPassWButton.click();
		Thread.sleep(3000);
		emailBox.click();
		emailBox.sendKeys("lkjl@lkjj.com");
		sendInstructions.click();
		//Thread.sleep(3000);
		return this;
	}
	
	public void navigateToLoginPage(){
		driver.get("http://app.work.com/#login");
	}
	
	public void checkErrorMessage(){
		final String error_message = "nbox for an email from Work.com containing your password reset instructions.";
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AssertJUnit.assertTrue(driver.getPageSource().contains(error_message));
	}
	
}
