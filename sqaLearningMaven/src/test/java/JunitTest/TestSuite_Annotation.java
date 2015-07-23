package JunitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import automation.Test1;
import automation.TestStringLength;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	//ParameterizedClassTest.class,
	Test1.class,
	TestStringLength.class
})

public class TestSuite_Annotation {
}
