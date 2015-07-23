package JunitTest;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


//create java class verifies that 2 to power of x is calcluated 
//correctly

@RunWith(Parameterized.class)
public class TestTwoPower {

	private final double input;
	private final double resultExpected;
	
	@Parameters()
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {{2,4},{3,8},
		{16,65536}});
	}
	public TestTwoPower(final double input, final double resultExpected){
		this.input = input;
		this.resultExpected = resultExpected;
	}

	@Test
	public void testUserMapping(){
		System.out.println("input is "+input);
		Assert.assertEquals((int)Math.pow(2,input), (int)myPow(input));		
	}
	
	public double myPow(double input) {
		double result = 2;
		for(int i = 1; i < input; i++){
			result = result *2;
			System.out.println("myPow is input is "+ input+" result "+result);
		}
		return result;
	}
	
}
