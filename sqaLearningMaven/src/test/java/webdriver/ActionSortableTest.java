package webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionSortableTest {
	private WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		//driver = new SafariDriver();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	@Test
	private void testSorting() {
	
		driver.get("http://jqueryui.com/sortable");
		List<WebElement> myList = driver.findElements(By.cssSelector("ul#sortable li"));
		
		new Actions(driver).moveByOffset(0, -250).build().perform();
		new Actions(driver).clickAndHold(myList.get(5)).build().perform();
		new Actions(driver).release(myList.get(0)).build().perform();
		
	}
}
