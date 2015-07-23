package webdriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.List;
import java.util.ArrayList;
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

public class NewePageFExplicitTest {
	private WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		//driver = new SafariDriver();
		driver.get("http://app.work.com/#login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	
	@Test
	public void testSwitchWindows(){
		
		List<String> list = new ArrayList<String>();
		WebDriverWait wait = new WebDriverWait(driver,10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("10f6097856296c02")));
		driver.findElement(By.id("10f6097856296c02")).click();
		list.addAll(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(list.get(1));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signIn")));
		Assert.assertTrue(driver.findElement(By.className("logo")).isDisplayed());
		
	}
}
