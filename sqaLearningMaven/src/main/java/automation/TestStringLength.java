package automation;
import org.junit.Test;
import org.testng.Assert;

public class TestStringLength {
    final String text ="I love it";
		
    @Test
	public void textLengthTest() {
    	Assert.assertTrue(text.length() > 0);
	   	Assert.assertFalse(text.length() == 0);
	}
	

}
