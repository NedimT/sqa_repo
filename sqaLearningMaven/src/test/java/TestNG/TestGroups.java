package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestGroups {
	
	
    @Test(groups = {"group 1"})
    public void testTest1(){
    	System.out.println("in TEST 1 grp 1");
    }
    @Test(groups = {"group 1"})
    public void testTest2(){
    	System.out.println("in TEST 2 grp 1 ");
    }
    @Test(groups = {"group 1"})
    public void testTest3(){
    	System.out.println("in TEST 3 grp 1");
    }
    @Test(groups = {"group 2"})
    public void testTest4(){
    	System.out.println("in TEST 4 grp 2");
    }
    @Test(groups = {"group 2"})
    public void testTest5(){
    	System.out.println("in TEST 5 grp 2 ");
    }
    @Test(groups = {"group 2"})
    public void testTest6(){
    	System.out.println("in TEST 6 grp 2 ");
    }
}
