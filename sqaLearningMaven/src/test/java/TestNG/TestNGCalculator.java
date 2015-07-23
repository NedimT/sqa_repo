package TestNG;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static_example.Calculator;

public class TestNGCalculator {
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
	
	@DataProvider
	public static Object[][] multData() {
		return new Object[][]{{2, 2, 4}, {3,3,9}};
		
	}
			
			
	@Test(dataProvider = "multData")
	public void testMulitply(int a, int b, int res){
		System.out.println("testing multiplying");
		Assert.assertEquals(res, calc.multiply(a,b));
			
	}
}



