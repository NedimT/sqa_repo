package automation;

import org.junit.Test;
import org.testng.Assert;



public class Test1 {
    final String text ="I love it";
	
    @Test
    public void testString() {
    	Assert.assertEquals(text, "I love it");
    }
    @Test
    public void textLengthTest() {
    	Assert.assertTrue(text.length() > 0);
    }
}
