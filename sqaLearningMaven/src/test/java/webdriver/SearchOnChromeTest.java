package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchOnChromeTest {
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		   options.setBinary("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		driver = new ChromeDriver(options);
				   
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
