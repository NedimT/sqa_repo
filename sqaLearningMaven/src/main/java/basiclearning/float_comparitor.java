package basiclearning;

public class float_comparitor {
	public static void main(String args[]){
		float a = 1.4f;
		float b = 2.3f;
		
		boolean isEqual = (a==b);
		boolean isNotEqual = (a!=b);
		boolean greaterThan = (a>b);
		boolean lessThan = (a<b);
		//boolean gtOrEq = (a>=b);
		//boolean lsOrEq = (a<=b);
		
		System.out.println(a+" isEqual "+b+" : "+isEqual);
		System.out.println(a+" isNotEqual "+b+" : "+isNotEqual);
		System.out.println(a+" greaterThan "+b+" : "+greaterThan);
		System.out.println(a+" lessThan "+b+" : "+lessThan);
		//System.out.println(a+" gtOrEq "+b+" : "+gtOrEq);
		//System.out.println(a+" lsOrEq "+b+" : "+lsOrEq);
		a = 2;
		b = 5;
		int c = 4;
		float d = 7;

		boolean orOperator = (a > b || a > c || a > d);
		boolean andOperator = (b > c && b > d && b < a);
		
		System.out.println(" orOperator is equal to "+orOperator);
		System.out.println(" andOperator is equal to "+andOperator);
	}
}