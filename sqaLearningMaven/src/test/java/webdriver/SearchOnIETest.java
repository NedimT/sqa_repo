package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchOnIETest {
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.ie.driver", "C:/selenium/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		//driver = new SafariDriver();
		driver.get("http://www.google.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
	
	//@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testGoogleSearchOnFF(){
		driver.findElement(By.id("gbqfq")).sendKeys("seafood city");
		driver.findElement(By.id("gbqfb")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Yelp")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(By.linkText("Yelp")).isDisplayed());
		
	}
}
