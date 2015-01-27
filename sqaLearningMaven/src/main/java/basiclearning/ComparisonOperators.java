package basiclearning;

public class ComparisonOperators {
	public static void main(String args[]){
		float a = 7;
		float b = 5;
		boolean isEqual = (a==b);
		boolean isNotEqual = (a!=b);
		boolean greaterThan = (a>b);
		boolean lessThan = (a<b);
		boolean gtOrEq = (a>=b);
		boolean lsOrEq = (a<=b);
		
		System.out.println(a+" isEqual "+b+" : "+isEqual);
		System.out.println(a+" isNotEqual "+b+" : "+isNotEqual);
		System.out.println(a+" isEqual "+b+" : "+greaterThan);
		System.out.println(a+" lessThan "+b+" : "+lessThan);
		System.out.println(a+" gtOrEq "+b+" : "+gtOrEq);
		System.out.println(a+" lsOrEq "+b+" : "+lsOrEq);

		boolean orOperator = (true || false || false);
		boolean andOperator = (true && false && false);
		
		System.out.println(" orOperator is equal to "+orOperator);
		System.out.println(" andOperator is equal to "+andOperator);

	}

}
