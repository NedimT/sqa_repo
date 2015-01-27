package basiclearning;

public class SecondArray {
    public static void main(String args[]){
    	char[] arrayChar = new char[]{'a','b','c','d','e'};
    	int[] arrayInt = new int[]{90,23,76,32,754,2432,543};
    	
    	printArraySize(arrayInt);
    	//printArrayItems(arrayChar);
    	
    }
    public static void printArraySize(int[] inputArray){
    	System.out.println("Size of Integer Array is "+ inputArray.length );
    }
    public static void printArrayItems(String[] inputArray){
    	for(String str: inputArray){
    		System.out.println(" print items in String Array "+str );
    	}
    }
}
