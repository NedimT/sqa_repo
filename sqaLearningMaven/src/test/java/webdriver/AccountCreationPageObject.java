package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationPageObject {
	
	@FindBy(id = "cont_tiers_button")
	private WebElement continutBtn;
	
	@FindBy(id = "email")
	private WebElement emailInput;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id ="regFormButton")
	private WebElement registerBtn;
	
	private WebDriver driver;
	
	public AccountCreationPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public CreditCardPageObject createAccount() throws InterruptedException{
		continutBtn.click();
		emailInput.sendKeys("kljlj@kjljj.com");
		password.sendKeys("lkjlkj");
		registerBtn.click();
		Thread.sleep(2000);
		return PageFactory.initElements(driver,CreditCardPageObject.class);
	}
	
	
	

}
