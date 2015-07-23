package TestNG;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestNGGitXml {
	@Test
    public void runTestNGTest() {
          
        //Create an instance on TestNG
         TestNG myTestNG = new TestNG();
         List<String> file = new ArrayList<String>();
            file.add("C:/git_repo/sqa_repo/sqaLearningMaven/src/test/java/TestNG/TestNGSuiteFromXMLWithGroups.xml");
            file.add("C:/git_repo/sqa_repo/sqaLearningMaven/src/test/java/TestNG/TestNGSuiteFromXMLWithMethods.xml");
         myTestNG.setTestSuites(file);
        //invoke run() - this will run your test suites.
         myTestNG.run();
        }       
}
