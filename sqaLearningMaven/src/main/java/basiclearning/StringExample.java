package basiclearning;

public class StringExample {
	public static void main(String args[]){
		//String literal
		String str1 = "test1";//into the pool
		String str2 = new String ("test1");// goes to mem
		String str4 = "test1"; //pool
		String str3 = new String ("test1"); // goes to mem because it is object
		
		//below true since both in pool at same location
		System.out.println("Testing string pool for str1 and str4 : "+(str1==str4));
		//compares mem addresses
		System.out.println("Testing references for str1 and str2 : "+(str1==str2));
		
		//compares value of strings
		System.out.println("Testing values for str1 and str2 : "+str1.equals(str2));
		System.out.println("Testing values for str1 and str4 : "+str1.equals(str4));
		System.out.println("Testing values for str2 and str3 : "+str2.equals(str3));
		System.out.println("Testing values for str2 and str3 : "+(str2==str3));

		
	}
}
