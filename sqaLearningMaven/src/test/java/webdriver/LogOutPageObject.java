package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPageObject {

	@FindBy(css = "a.msil")
	WebElement signOutBtn;
	
	
}
