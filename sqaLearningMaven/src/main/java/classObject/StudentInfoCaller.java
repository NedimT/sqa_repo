package classObject;

public class StudentInfoCaller {
    public static void main(String args[]){
    	StudentInfoOverloaded objOne = new StudentInfoOverloaded();
    	StudentInfoOverloaded objTwo = new StudentInfoOverloaded(22 , "Lisa");
    	StudentInfoOverloaded objThree = new StudentInfoOverloaded(33, "julia", 33333);
    	
    	//getting default
    	System.out.println("default values of id is : "+objOne.getStudentId());
    	System.out.println("default values of name is : "+objOne.getStudentName());
    	System.out.println("default values of zip is : "+objOne.getStudentZip()+"\n");
    	
    	//getting objtwo values
    	
    	System.out.println(" values of id 2 is : "+objTwo.getStudentId());
    	System.out.println(" values of name 2 is : "+objTwo.getStudentName());
    	System.out.println(" values of zip  2is : "+objTwo.getStudentZip()+"\n");
    	
    	//getting objthree values
    	System.out.println(" values of id 3 is : "+objThree.getStudentId());
    	System.out.println(" values of name 3 is : "+objThree.getStudentName());
    	System.out.println(" values of zip  3 is : "+objThree.getStudentZip()+"\n");
    	    	

    	
    }
}

