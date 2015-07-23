package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.Proxy;


public class SearchOnFFPhantomTest {
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		Capabilities caps = new DesiredCapabilities();
		  ((DesiredCapabilities) caps).setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\phantomjs-2.0.0-windows\\bin\\phantomjs");
		driver = new PhantomJSDriver(caps);
		//driver = new FirefoxDriver();
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
