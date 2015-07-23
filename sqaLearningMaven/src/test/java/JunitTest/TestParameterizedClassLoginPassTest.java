package JunitTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestParameterizedClassLoginPassTest {
	
	private WebDriver driver;
	private final String email;
	private final String password;
	//private final int resultExpected;
	public TestParameterizedClassLoginPassTest(String email, String password) {
		this.email= email;
		this.password = password;
	}
	
	@Before
	public void setup() {
		driver = new FirefoxDriver();
		//driver = new SafariDriver();
	}
	@After
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	@Parameters()
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {{"1st@lkjlj.com","lkjk"}, {"2nd@ljkj.com","lkjk"}, {"3rd@ljk.com","lkjlkj"}});
	}
	
	@Test
	public void testGoogleSearchOnFF(){
		
		
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
	   
	    final String pageSource =driver.getPageSource();
		AssertJUnit.assertTrue("The text is not present on the page", pageSource.contains(message));
       

	}
	
	
}
