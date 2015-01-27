package static_example;

public class CalculaterOverload  {
	public int a;
	public int b;
	
	CalculaterOverload(){
		this.a = 0;
	    this.b = 0;
	    
    }
	public static double add(double a, double b){
		System.out.println("this is add from overload");
    	return(a+b);
    }
    public static double substract(double a, double b){
    	System.out.println("this is subs from overload");
    	return(a-b);
    }
    public static double divide(double a, double b){
    	System.out.println("this is div from overload");
    	return(a/b);
    }
    public static double multiply(double a, double b){
    	System.out.println("this is multip from overload");
    	return(a*b);
    }
    public static int add(int a, int b){
    	return(a+b);
    }
    public static int substract(int a, int b){
    	return(a-b);
    }
    public static int divide(int a, int b){
    	return(a/b);
    }
    public static int multiply(int a, int b){
    	return(a*b);
    }


}
