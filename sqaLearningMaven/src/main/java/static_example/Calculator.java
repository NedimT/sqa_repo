package static_example;

public class Calculator {
	public int a;
	public int b;
	
    Calculator(){
    	this.a = 0;
    	this.b = 0;
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
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}

