package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionResizabletest {
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
	private void testSliding(){
		int i;
		//String[] myList = new String[i];
		driver.get("http://jqueryui.com/selectable");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		List<WebElement> myList = driver.findElements(By.cssSelector("ol#selectable *"));
		//WebElement droppable = driver.findElement(By.id("droppable"));

		new Actions(driver).clickAndHold(myList.get(0)).build().perform();
		new Actions(driver).click(myList.get(1)).build().perform();
		new Actions(driver).keyDown(Keys.CONTROL).click(myList.get(5)).build().perform();


		
	}
	
}
