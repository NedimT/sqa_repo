package JunitTest;
import static_example.Calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

public class TestCalculator {
	Calculator calc = new Calculator();
	
	@Test
	public void testAdd(){
		System.out.println("testing adding");
		Assert.assertEquals(6, calc.add(2,4));
	}
	@Test
	public void testSubstract(){
		System.out.println("testing substraction");
		Assert.assertEquals(2, calc.substract(4,2));
	}
	@Test
	public void testDivide(){
		System.out.println("testing dividing");
		Assert.assertEquals(2, calc.divide(4,2));
	}
	
	@Test
	public void testMulitply(){
		System.out.println("testing multiplying");
		Assert.assertEquals(8, calc.multiply(2,4));
			
	}
}
