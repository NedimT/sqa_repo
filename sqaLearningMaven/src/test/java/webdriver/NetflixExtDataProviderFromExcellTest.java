package webdriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
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
import java.io.IOException;
import java.security.Timestamp;
import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NetflixExtDataProviderFromExcellTest {
	private WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		//driver = new SafariDriver();
	}
	
	@DataProvider(name= "input") 
	public Object[][] createData() throws BiffException, IOException {
		return getDataFromExcel("C:\\sqa_space\\data.xls", "netpage", "startPoint", "endPoint");
	}
	
	private String[][] getDataFromExcel(String xlsFilePath, String sheetName, String startPoint, String endPoint) throws BiffException, IOException{
		 String[][] tabArray = null;
		 //open an workbook
		 Workbook workbook = Workbook.getWorkbook(new File(xlsFilePath));
		 //open a sheet 
		 Sheet sheet = workbook.getSheet(sheetName);
		 int startRow, startCol, endRow, endCol, ci, cj;
		 //find a cell labeled startPoint
		 Cell tableStart = sheet.findCell(startPoint);
		 //get a row of that cell
		 startRow = tableStart.getRow();
		 //get a column of that cell;
		 startCol = tableStart.getColumn();
		 
		 //find a cell #2 labeled with endPoint;
		 Cell tableEnd = sheet.findCell(endPoint);
	     //get a row of that cell
		 endRow = tableEnd.getRow();
		 //get a column of that cell;
		 endCol = tableEnd.getColumn();
		 //find a cell #2 labeled with endPoint;
		 ci = endCol-startCol-1;
		 cj = endRow-startRow-1;
		 String[][] myArray = new String[cj][ci] ;
		 for(int i = 0; i < (ci);i++){
			 for(int j = 0; j < (cj);j++) {
				 myArray[j][i] = sheet.getCell(startCol+i+1,startRow+j+1).getContents();
			 }
		 }
		 return myArray;
		 
	}
	 
		
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	
	@Test(dataProvider = "input")
	public void testNetflixDataProviderRegistration(String emailEntry, String passwordEntry, String firstName, String lastName, String zipCode, String cardNumber) throws InterruptedException{
		final String partialtext = "You must acknowledge that you have read";
		final String password = passwordEntry;
		final String email = emailEntry;
		final String message ="Enter your payment details";
		final String message1 = "Start Your Free Month";
				//20 second timeout
		WebDriverWait wait = new WebDriverWait(driver,20);
		//goto webpage
		driver.get("http://www.netflix.com");
		//wait till page loads
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("blue")));
		driver.findElement(By.className("blue")).click();
	    // click on continue
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cont_tiers_button")));
	    driver.findElement(By.id("cont_tiers_button")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("regFormButton")));

	    //fill in email
	    driver.findElement(By.id("email")).sendKeys(email);
	    //fill in password
	    driver.findElement(By.id("password")).sendKeys(password);
	    //click register
	    driver.findElement(By.id("regFormButton")).click();
	    //Wait till page comes up
	    driver.findElement(By.cssSelector("span.payment-type.payment-type-CC" ));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName-CC")));
	    //enter firstName
	    driver.findElement(By.id("firstName-CC")).sendKeys(firstName);
	    //enter lastname
	    driver.findElement(By.id("lastName-CC")).sendKeys(lastName);
	    // enter zipCode
	    driver.findElement(By.id("zipcode")).sendKeys(zipCode);
	    //enter credit card
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
