package inheritence;

public class EmployeeOverridingCaller {
	public static void main(String args[]){
		EmployeeOverriding refEo = new EmployeeOverriding();
		System.out.println(refEo.minAge);
		refEo.printSocialId();
		System.out.println(refEo.minAge);
		
		Person refPer = new EmployeeOverriding();
		System.out.println(refPer.minAge);
		
	}
	
	
}
