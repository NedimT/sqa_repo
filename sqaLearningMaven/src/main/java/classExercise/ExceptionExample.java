package classExercise;
//Write a class ExceptionExample in which:
//Write a function “StringCheck” which takes a parameter of String
//StringCheck throws a new “Exception” if String is of more than 10 character.
//From the main method call StringCheck and enclose the caller with try/catch.
//Write another function “ArrayElement” which takes an int[] as parameter.
//ArrayElement return the element at index array.length.
//Put the function in try/catch.
//In catch block print the total length of array.
public class ExceptionExample {
	//From the main method call StringCheck and enclose the caller with try/catch.
    public static void main(String args[]){
        String str = "Example exception";
        try{
            StringCheck(str);
        }catch (Exception e){
            System.out.println("This is inside catch of StringCheck.");
            System.out.println(e.getMessage());  
        }
        System.out.println();
        int[] intArray = new int[]{1,2,3};
        int element = ArrayElement(intArray);      
    }
 
    //Write a function “StringCheck” which takes a parameter of String
    //StringCheck throws a new “Exception” if String is of more than 10 character.
    public static void StringCheck(String strVariable) throws Exception{
        Exception myException = new Exception("String should be <= 10 chars");
        if (strVariable.length() >10) {
            System.out.println("This is inside StringCheck before throw. String : "
                    +strVariable);
            throw myException;
            //throw new Exception("String should be <= 10 chars");
        }
    }
 
    //Write another function “ArrayElement” which takes an int[] as parameter.
    //ArrayElement return the element at index array.length.
    //Put the function in try/catch.
    //In catch block print the total length of array.
    public static int ArrayElement(int[] intArray){
        try{
            System.out.println("This is inside ArrayElement.");
            return intArray[intArray.length]; //intArray[3] // which will throw except.
        }catch(Exception e){
            System.out.println("This is inside catch of ArrayElement.");
            System.out.println("Total length of array "+intArray.length);
            return -999;
        }
        //return -9999;    
    }
	
}
