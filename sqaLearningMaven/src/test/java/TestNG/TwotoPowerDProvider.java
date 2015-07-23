package TestNG;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;




import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwotoPowerDProvider {
	
				
		@DataProvider(name= "input")
		public Object[][] generateDataSet() {
			return new Object [][]{
			    new Object[] {2},
		    	new Object[] {3},
			    new Object[] {16}
			};
		}
		
		@Test(dataProvider = "input")
		public void testUserMapping(int power){
			
			Assert.assertEquals((int)Math.pow(2,power), (int)myPow(power));		
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
