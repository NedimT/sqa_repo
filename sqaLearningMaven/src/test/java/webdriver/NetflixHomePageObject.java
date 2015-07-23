package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetflixHomePageObject {
	@FindBy(name = "start")
	private WebElement startBtn;
	
	private WebDriver driver;
	
	public NetflixHomePageObject(WebDriver driver){
		this.driver = driver;
	}
	
	
	public NetflixHomePageObject openNetflixHomePage() throws InterruptedException{
		driver.get("http://netflix.com");
		Thread.sleep(2000);
		return this;
	}
	//public AccountCreationPageObject clincOnStartBtn(){
	public NetflixHomePageObject clincOnStartBtn(){

		startBtn.click();
		return PageFactory.initElements(driver, NetflixHomePageObject.class);
	}
	
	
}
