package inheritence;

public class EmployeeCaller {
	public static void main(String args[]){
		Employee empOne = new Employee();
	    Employee empTwo = new Employee(99,2015,"Male",7,"dood",9);
	    
	    System.out.println("Printing employee One");
	    System.out.println("Employee One name: "+empOne.getName() 
	    		          +" gender: "+empOne.getGender()
	    		          +" age: "+empOne.getAge() 
	    		          +" Id: "+empOne.getIdNum()
	    		          +" expiration year ");	
	    
	    System.out.println("Printing employee Two");
	    System.out.println("Employee One name: "+empTwo.getName() 
	    		          +" gender: "+empTwo.getGender()
	    		          +" age: "+empTwo.getAge() 
	    		          +" Id: "+empTwo.getIdNum()
	    		          +" expiration year ");
	}
    
 }
