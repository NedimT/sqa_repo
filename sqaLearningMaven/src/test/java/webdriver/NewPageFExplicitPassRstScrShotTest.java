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

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
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
import org.testng.annotations.Test;



public class NewPageFExplicitPassRstScrShotTest {
	private WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		//driver = new SafariDriver();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	
	@Test
	public void testScrShot() throws IOException{
		
		final String partialLinkText = "Forgot Password";
		final String email = "Igotit@autodq.com";
		final String message_part1 = "Please check your";
		final String message_part2 ="inbox for an email from Work.com containing your password reset instructions.";
		final String message ="Please check your "+email+" inbox for an email from Work.com containing your password reset instructions.";
		//20 second timeout
		WebDriverWait wait = new WebDriverWait(driver,20);
		//goto webpage
		driver.get("http://app.work.com/#login");
		takeScreenShot();
		//wait till page loads
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(partialLinkText)));
	    //click on forgot password
	    driver.findElement(By.partialLinkText(partialLinkText)).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.GPWX50PCPL.GPWX50PCLMD")));
	    takeScreenShot();
		//fill up email		
	    driver.findElement(By.cssSelector("input.gwt-TextBox.GPWX50PCPMD.GPWX50PCNMD")).sendKeys(email);
		
	    driver.findElement(By.cssSelector("button.GPWX50PCPL.GPWX50PCLMD")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("GPWX50PCEND")));
		final String pageSource =driver.getPageSource();
		
		AssertJUnit.assertTrue("The text is not present on the page", pageSource.contains(message_part1)&& 
				                                                      pageSource.contains(message_part2)&&
				                                                      pageSource.contains(email));
       

		
	}
	public void takeScreenShot() throws IOException {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File screenshot = ((TakesScreenshot)augmentedDriver).
		                            getScreenshotAs(OutputType.FILE);
		String path = "C:/selenium_eclipse";
		path = path +"/Screenshot."+getTime()+".png";
		FileUtils.copyFile(screenshot, new File(path));
	}
	
	private long getTime(){
	   Date date= new Date();
	   //getTime() returns current time in milliseconds
	   long time = date.getTime();
	   //Passed the milliseconds to constructor of Timestamp class 
	   return time;
	}
	
}
