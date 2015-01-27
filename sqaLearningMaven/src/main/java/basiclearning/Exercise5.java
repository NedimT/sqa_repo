package basiclearning;

public class Exercise5 {
    public static void main(String args[]){
    	int length = 0;
    	int[] arr = new int[]{90,23,76,32,754,2432,543};
    	int sum  = addArray(arr);
    	System.out.println("Sum of array elements = "+ sum);
    	
    }
    public static int addArray(int[] array){
    	
    	System.out.println("size of array is: "+array.length);
    	int sum = 0;
    	for(int i:array){
    		sum += i;
    	}
    	System.out.println("length of array = "+array.length);
    		
    	return(sum);
    }
}
