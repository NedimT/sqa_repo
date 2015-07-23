package JunitTest;


import org.testng.AssertJUnit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestParameterizedClassTest {
	
	
	private final int input;
	private final int resultExpected;
	
	@Parameters()
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {{1,1},{2,4},
		{3,9},{4,16},{5,25}});
	}
	public TestParameterizedClassTest(final int input, final int resultExpected){
		this.input = input;
		this.resultExpected = resultExpected;
	}
	@Test
	public void testUserMapping(){
		Assert.assertEquals(resultExpected, input * input);
	}
	
	
}
