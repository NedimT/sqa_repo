package basiclearning;

public class Exercise7 {
	public static void main(String args[]){
		String soccer = "Soccer";
		String cricket = "Cricket";
		String football = new String ("Football");
		compareMemEq(soccer,cricket);
		compareMemEq(football,cricket);
		compareMemEq(soccer,football);
		System.out.println("length of "+football+" is " +football.length());
		char subChar = football.charAt(football.length()-2);
		System.out.println(subChar);
		int length3 = cricket.length();
		System.out.println("second from last character of "+cricket+" is " +cricket.substring(length3-2, length3-1));
		System.out.println("Index of 1st letter c in Soccer is at "+soccer.indexOf("c"));
		
		
	}
	public static void compareMemEq(String a, String b){
		//compares value of strings
		System.out.println("Testing "+a+" and "+b+" for equality the result is "+a.equals(b));		
		System.out.println("Testing "+a+" and "+b+" for reference the result is "+(a==b));
				
	}
}
