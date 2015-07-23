package TestNG;

import org.testng.annotations.*;

public class TestClassAnnotations {
	
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("in Before Suite");
	}
	@AfterSuite
	public void AfterSuite(){
		System.out.println("in After Suite");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("in Before Method");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("in After Method");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("in Before Class");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("in After Class");
	}
    @Test(priority = 1)
    public void testTest1(){
    	System.out.println("in TEST 1 pri 1");
    }
    @Test(priority = 3)
    public void testTest2(){
    	System.out.println("in TEST 2 pri 3");
    }
    @Test(priority = 2)
    public void testTest3(){
    	System.out.println("in TEST 3 pri 2");
    }

}
