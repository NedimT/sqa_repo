package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

public class CreditCardPageObject {
	//select payment Type
	@FindBy(css = "span.payment-type.payment-type-CC")
	private WebElement paymentSelect;
	
	//input name
	@FindBy(id = "firstName-CC")
	private WebElement firstName;
	
	//input lastname
	@FindBy(id = "lastName-CC")
	private WebElement lastName;
	
	//input card number
	@FindBy(id = "cardNumber-CC")
	private WebElement cardNumber;
	
	//input zipcode
	@FindBy(id = "zipcode")
	private WebElement zipcode;
	
	//Select exp month
	@FindBy(name = "expirationMonth")
	private WebElement expMonth;
	
	//Select exp year
	@FindBy(name = "expirationYear")
	private WebElement expYear;
	
	//Security Code input
	@FindBy(name = "securityCode")
	private WebElement securityCode;
	
	//select consent agreement
	@FindBy(className = "terms-checkbox")
	private WebElement checkBox;
	
	//start membership
	@FindBy(css = "button.blue.btnlg")
	private WebElement startMembershipBtn;
	
	//sign out
	@FindBy(css = "span.text")
	private WebElement signOutLink;
	
	private WebDriver driver;
	
	public CreditCardPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public CreditCardPageObject clickOnCreditSelect() {
		paymentSelect.click();
		return this;
	}
	
	public CreditCardPageObject enterFirstName(){
		firstName.clear();
		firstName.sendKeys("George");
		return this;
	}
	
	public CreditCardPageObject enterLastName(){
		lastName.clear();
		lastName.sendKeys("woods");
		return this;
	}
	
	public CreditCardPageObject enterCreditCard(){
		cardNumber.sendKeys("1111222233334444");
		return this;
	}
	
	public CreditCardPageObject enterZipcode(){
		zipcode.sendKeys("75767");
		return this;
	}
	
	public CreditCardPageObject selectExpMonth(){
		Select expirationMonth = new Select(expMonth);
		expirationMonth.selectByVisibleText("Jan (1)");
		//expirationMonth.selectByVisibleText("1");

		return this;
	}
	
	public CreditCardPageObject selectExpYear(){
		Select expirationYear = new Select(expYear);
		expirationYear.selectByVisibleText("2015");
		return this;
	}
	
	public CreditCardPageObject enterSecurityCode(){
		securityCode.sendKeys("888");
		return this;
	}
	
	public CreditCardPageObject clickOnAgreement(){
		checkBox.click();
		return this;
	}
	
	public CreditCardPageObject clickOnStartMembershipBtn() throws InterruptedException{
		startMembershipBtn.click();
		Thread.sleep(8000);
		return this;
	}
	
	public LogOutPageObject clickOnSignOutLink(){
		signOutLink.click();
		
		return PageFactory.initElements(driver,LogOutPageObject.class );
		 
	}
	
	public void checkErrorMessage(){
		final String error_message = "A valid expiration date must be entered into the form";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AssertJUnit.assertTrue(driver.getPageSource().contains(error_message));
	}
	

	
}
