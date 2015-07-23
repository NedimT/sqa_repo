package JunitTest;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

public class IndexOutOfBoundsException {

	
	int[] intArray = new int[2];
	
	
	@Test
	public void checkOutBounds(){
		try{
	        System.out.println("catch"+ intArray[3]);
	        
	        Assert.fail("we expect an exception, this is not an exception");
	    }catch (NullPointerException e){
	        System.out.println("This is inside catch.");
	        System.out.println(e.getMessage());  
	    }
	    System.out.println();
	}
    
}
