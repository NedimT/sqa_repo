package inheritence;

public class Person {
    private String gender;
    private int age;
    private String name;
    protected int minAge = 1;
    
    public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public Person(){
        System.out.println("This from default Constructor");
    }
    public Person(String gender, int age, String name, int minAge){
    	this.gender = gender;
    	this.age = age;
    	this.name = name;
    	
    }
    public void printSocialId(){
    	
    }
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


