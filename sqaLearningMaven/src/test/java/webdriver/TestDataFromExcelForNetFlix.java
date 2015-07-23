package webdriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataFromExcelForNetFlix {
	private WebDriver driver;

	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@DataProvider(name = "email")
	public Object[][] createData(){
		try{
			return ExcelReaderToDataProvider.getDataFromExcel("c:\\git_repo\\book1.xls","NetFlix","StartPoint","EndPoint");
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	@Test(dataProvider = "email")
	public void testAssignDataNetFlix(String email, String password, String firstName, String lastName, String zipCode) {
		final String partialtext = "You must acknowledge that you have read";
		
		//Wait for 20sec 
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://www.netflix.com/us/");
		driver.findElement(By.name("start")).click();

		driver.findElement(By.id("cont_tiers_button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("regFormButton")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("span.payment-type.payment-type-CC")).click();
		driver.findElement(By.id("firstName-CC")).sendKeys(firstName);
		driver.findElement(By.id("lastName-CC")).sendKeys(lastName);
		driver.findElement(By.id("zipcode")).sendKeys(zipCode);
		Select dropDownCC1 = new Select(driver.findElement(By.name("expirationMonth")));		
		dropDownCC1.selectByVisibleText("Jan (1)");
		dropDownCC1 = new Select(driver.findElement(By.name("expirationYear")));		
		dropDownCC1.selectByVisibleText("2020");
		
		
		driver.findElement(By.cssSelector("button.blue.btnlg")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		final String pageSource = driver.getPageSource();		
		Assert.assertTrue(pageSource.contains(partialtext));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		driver.findElement(By.cssSelector("span.text")).click();

	}
}
