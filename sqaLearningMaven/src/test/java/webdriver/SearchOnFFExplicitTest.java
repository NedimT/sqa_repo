package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchOnFFExplicitTest {
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
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
		WebDriverWait wait = new WebDriverWait(driver,15);
		driver.findElement(By.id("gbqfq")).sendKeys("seafood city");
		driver.findElement(By.id("gbqfb")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gbqfq")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Yelp")));
		driver.findElement(By.partialLinkText("Yelp")).click();

		Assert.assertTrue(driver.findElement(By.linkText("Yelp")).isDisplayed());
		
	}
}
