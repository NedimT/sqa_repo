package TestNG;

import org.testng.annotations.Test;

public class TestGroupDependsMethond {

	@Test(groups = {"group 1"})
    public void testTest1(){
    	System.out.println("in TEST 1 grp 1");
    }
    @Test(groups = {"group 1"})
    public void testTest2(){
    	System.out.println("in TEST 2 grp 1 ");
    }
    @Test(groups = {"group 1"})
    public void testTest3(){
    	System.out.println("in TEST 3 grp 1");
    }
    @Test(groups = {"group 2"})
    public void testTest4(){
    	System.out.println("in TEST 4 grp 2");
    }
    @Test(groups = {"group 2"})
    public void testTest5(){
    	System.out.println("in TEST 5 grp 2 ");
    }
    @Test(dependsOnMethods = {"testTest7"},groups = {"group 2"})
    public void testTest6(){
    	System.out.println("in TEST 6 grp 2 ");
    }
    @Test(dependsOnMethods = {"testTest6"},groups = {"group 2"})
    public void testTest7(){
    	
    	System.out.println("in TEST 7 depends on method 1 ");
    }
    @Test(dependsOnMethods = {"method2"},groups = {"group 1"})
    public void testTest8(){
    	
    	System.out.println("in TEST 8 depends on method 2 ");
    }
    @Test
    public static void method1() {
    	System.out.println("in method 1");
    }
    @Test
    public void method2() {
    	System.out.println("in method 2");    	
    }
}
