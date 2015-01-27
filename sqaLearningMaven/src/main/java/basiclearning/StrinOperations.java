package basiclearning;

public class StrinOperations {
    public static void main(String args[]){
    	
    
    	String str1 = "Java classes are funny";
    	String str2 = "are they really?";
    	
    	System.out.println(str1.lastIndexOf('s')); //  position of last s in str1
    	int length = str1.length();
    	System.out.println("length of st1 is : "+length); // get length of str1
    	
    	String subStr1 = str1.substring(1,length);
    	System.out.println("substring of str1 is : "+subStr1);
    	
    	int indexStr2 = str2.indexOf("b");
    	System.out.println("Index of b in str2 is : "+indexStr2);
    	
    	System.out.println(str1.substring(str1.indexOf("are ")+4));
    	String vowelStr= "vowel";
    	String nonVowelStr = "tcdfgh";
    	//checkVowel(vowelStr.length());
    } 	
//    	public static boolean checkvowel(String vowelStr){
//    		int length = vowelStr.length();
//    	
//    		if(length + vowelStr.indexOf('a') + vowelStr.indexOf('e') + 
//    				vowelStr.indexOf('i') + vowelStr.indexOf('o') +
//    				vowelStr.indexOf('u') > 0) {
//    					System.out.println(" got a vowel");
//    		}
//    	}
    	
    	
}
