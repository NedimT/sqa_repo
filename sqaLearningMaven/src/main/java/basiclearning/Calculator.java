package basiclearning;

public class Calculator {
    public static void main(String args[]){
    	int a = 2;
    	int b = 6;
    	float f1= 6.4f;
    	float f2 = 3.2f;
    	int addition =sum(a,b);
    	int subtraction = subtract(a,b);
    	int multiplied = multiply(a,b);
    	float divided = divide(f1,f2);
    	System.out.println(a+" + "+b+" = "+addition);
    	System.out.println(a+" - "+b+" = "+subtraction);
    	System.out.println(a+" * "+b+" = "+multiplied);
    	System.out.println(f1+" / "+f2+" = "+divided);


    }
    public static int sum(int a, int b){
    	int sum = a+b;
    	//System.out.println("sum of "+a+ " and "+b+" =" +sum);
    	return sum;
    }
    public static int subtract(int a, int b){
    	int result = a-b;
    	//System.out.println(a+ " - "+b+" =" +result);
    	return result;

    }
    public static int multiply(int a, int b){
    	int result = a*b;
    	//System.out.println(a+ " x "+b+" =" +result);
    	return result;

    }
    public static float divide(float a, float b){
    	float result = a/b;
    	//System.out.println(a+ " / "+b+" =" +result);
    	return result;

    }
}
