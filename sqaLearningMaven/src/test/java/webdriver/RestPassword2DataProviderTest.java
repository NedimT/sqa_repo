package webdriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.File;
import java.security.Timestamp;
import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RestPassword2DataProviderTest {
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		//driver = new SafariDriver();
	}
	
	@DataProvider(name= "input")
	public Object[][] generateDataSet() {
		return new Object [][]{
		    new Object[] {"Imit@lkjlkj.com", "kjlkjl"},
	    	new Object[] {"yourit@lkjlkj.com", "kjlkjl"},
		    new Object[] {"heisit@lkjlkj.com", "kjlkjl"}
		};
	}
	@DataProvider(name= "username")
	public Object[][] generateDataSet1() {
		return new Object [][]{
		    new Object[] {"Imit@lkjlkj.com"},
	    	new Object[] {"yourit@lkjlkj.com"},
		    new Object[] {"heisit@lkjlkj.com"}
		};
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	@Test(dataProvider = "username")
	public void test2DDataProvider(String emailEntry){
		
		final String password = "";
		final String email = emailEntry;
		testLogin(email,password);
	}
	@Test(dataProvider = "input")
	public void testGoogleSearchOnFF(String emailEntry, String passwordEntry){
		
		final String password = passwordEntry;
		final String email = emailEntry;
		testLogin(email,password);
	}
	public void testLogin(String emailEntry, String passwordEntry){
		final String password = passwordEntry;
		final String email = emailEntry;
		final String message ="The email or password you entered is incorrect.";
				//20 second timeout
		WebDriverWait wait = new WebDriverWait(driver,20);
		//goto webpage
		driver.get("http://app.work.com/#login");
		//wait till page loads
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("10f60978316c0ffb")));
	    //fill in email
	    driver.findElement(By.id("10f609783b815858")).sendKeys(email);
	    //fill in password
	    driver.findElement(By.id("10f609781286c67a")).sendKeys(password);
	    driver.findElement(By.id("10f60978316c0ffb")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("10f6097864cda4c2")));
	    //String pageSource = driver.getPageSource();
	   // assertContains("")
	    final String pageSource =driver.getPageSource();
		AssertJUnit.assertTrue("The text is not present on the page", pageSource.contains(message));
   
	}
}
