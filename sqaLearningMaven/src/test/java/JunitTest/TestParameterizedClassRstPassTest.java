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
public class TestParameterizedClassRstPassTest {
	
	private WebDriver driver;
	private final String email;
	
	//private final int resultExpected;
	public TestParameterizedClassRstPassTest(String email) {
		this.email= email;
		
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
		return Arrays.asList(new Object[][] {{"1st@lkjlj.com"}, {"2nd@ljkj.com"}, {"3rd@ljk.com"}});
	}
	
	@Test
	public void testGoogleSearchOnFF(){
		
		final String partialLinkText = "Forgot Password";
		
		final String message_part1 = "Please check your";
		final String message_part2 ="inbox for an email from Work.com containing your password reset instructions.";
		final String message ="Please check your "+email+" inbox for an email from Work.com containing your password reset instructions.";
		//20 second timeout
		WebDriverWait wait = new WebDriverWait(driver,20);
		//goto webpage
		driver.get("http://app.work.com/#login");
		//wait till page loads
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(partialLinkText)));
	    //click on forgot password
	    driver.findElement(By.partialLinkText(partialLinkText)).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.GPWX50PCPL.GPWX50PCLMD")));
	    
		//fill up email		
	    driver.findElement(By.cssSelector("input.gwt-TextBox.GPWX50PCPMD.GPWX50PCNMD")).sendKeys(email);
		
	    driver.findElement(By.cssSelector("button.GPWX50PCPL.GPWX50PCLMD")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("GPWX50PCEND")));
		final String pageSource =driver.getPageSource();
		
		AssertJUnit.assertTrue("The text is not present on the page", pageSource.contains(message_part1)&& 
				                                                      pageSource.contains(message_part2)&&
				                                                      pageSource.contains(email));
   	}
	
	
}
