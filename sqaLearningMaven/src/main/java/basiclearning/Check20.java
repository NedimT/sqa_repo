package basiclearning;

public class Check20 {
    public static void main(String args[]){
    	int a = 8;
    	int b = 15;
    	int c = 10;
    	compareToTen(a);
    	compareToTen(b); 
    	compareToTen(c);  	 			

    }
    public static void compareToTen(int x){
    	if(x > 10) {
    		System.out.println("number "+x+" is greater then 10");
    	} else if(x <10){
    		System.out.println("number "+x+" is less then 10");
    	} else {
    		System.out.println("number "+x+" is 10");

    	}
    }
}
