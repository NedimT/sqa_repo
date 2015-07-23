package TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

import classExercise.StringVar;

public class TestSimClassObjAnnotations {

	@Test
	public void testAssertTrue(){
		StringVar obj1 = new StringVar();
		obj1.setStr("mike");
		Assert.assertTrue(obj1.getStr().equals("mike"));
	}
	@Test
	public void testAssertFalse(){
		StringVar obj2 = new StringVar();
		obj2.setStr("mike");
		Assert.assertFalse(obj2.getStr().equals("joe"));
	}
	@Test
	public void testAssertNull(){
		StringVar objnull = new StringVar();
		Assert.assertNull(objnull.getStr());
	}
	@Test
	public void testAssertNotNull(){
		StringVar objNotNull = new StringVar();
		objNotNull.setStr("mike");
		Assert.assertNotNull(objNotNull.getStr());
	}
	@Test
	public void testAssertSame(){
		StringVar objSame1 = new StringVar();
		StringVar objSame2 = new StringVar();
		
		objSame1 = objSame2;
		Assert.assertSame(objSame1, objSame2);
	}
	@Test
	public void testAssertNotSame(){
		StringVar objSame1 = new StringVar();
		StringVar objSame2 = new StringVar();
		Assert.assertNotSame(objSame1, objSame2);
	}
	@Test
	public void testAssertEquals(){
		StringVar objEqual1 = new StringVar();
		StringVar objEqual2 = new StringVar();
		objEqual1.setStr("Jack");
		objEqual2.setStr("Jack");

		Assert.assertEquals(objEqual1.getStr(), objEqual2.getStr());
	}
	
	

	
	
	
	
	
}
