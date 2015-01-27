package basiclearning;

public class ArrayExample {
    public static void main(String[] args){
    	int[] intArr = new int[3];
    	intArr[0] = 456;
    	intArr[1] = 54;
    	intArr[2] = 23;
    	int[] anotherIntArr = new int[]{90,23,76,32,754,2432,543};
    	int secondIndex = intArr[1];
    	System.out.println("Value at 1st index is : "+intArr[0]);
    	System.out.println("Value at 2nd index is : "+secondIndex);
    	System.out.println("Value at 4th index is : "+anotherIntArr[3]);
    	System.out.println("Value at 6 index is : "+anotherIntArr[5]);
  	  	
        for(int i = 0; i<anotherIntArr.length; i++){
        	anotherIntArr[i] = i+10;
        }
        printSize(anotherIntArr);
         
    	for(int i=0; i<intArr.length; i++){
    		System.out.println("Value at "+i+" index is : "+intArr[i]);
    	}
    	printEachValue(anotherIntArr);
    	
    }
    
    public static void printSize(int[] inputArr){
    	System.out.println("size of array is: "+inputArr.length);
    }
    public static void printElement(int ele) {
    	System.out.println("value of element is "+ ele);
    }
    public static void printEachValue(int[] inputArr){
    	for(int arrValue : inputArr){
    		System.out.println("elements of array anotherIntArr " + arrValue);
    	}
    }
    
}
