package TestNG;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestNGSuite {
	@Test
    public void testTestNGProgramatically(){
    TestNG  testng = new TestNG();
    testng.setTestClasses(new Class[] {TestSimClassObjAnnotations.class, TwotoPowerDProvider.class, TestGroupDepends.class});
    testng.run(); 
    }
}
