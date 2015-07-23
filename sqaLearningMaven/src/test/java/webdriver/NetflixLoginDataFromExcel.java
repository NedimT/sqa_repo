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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NetflixLoginDataFromExcel {
	private WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		//driver = new SafariDriver();
	}
	
	@DataProvider(name= "input")
	public Object[][] createData() throws BiffException, IOException {
		return getDataFromExcel("C:\\sqa_space\\data.xls", "s1", "startPoint", "endPoint");
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
	public void testNetflixLoginDataFromExcel(String emailEntry, String passwordEntry) throws InterruptedException{
		
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
	    wait.until(ExpectedConditions.textToBePresentInElement(By.id("10f6097864cda4c2"), message));
	    
	}
	
	
}
