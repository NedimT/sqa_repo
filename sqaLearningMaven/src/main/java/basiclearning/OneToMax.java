package basiclearning;

public class OneToMax {
    public static void main(String args[]) {
    	System.out.println("first number is 5");
    	printNumbers(5);
    	System.out.println("second number is 10");
    	printNumbers(10);

    }
    public static void printNumbers(int max){
    	for(int i=1; i<=max;i++){
    		System.out.println(i);
    	}
    }
}
