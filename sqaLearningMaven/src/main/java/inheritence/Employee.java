package inheritence;

public class Employee extends Person {
	private int idNum;
	private int exprYr;
	
	public Employee(){
		System.out.println("this is a call from Employee default");
	}
	
	public Employee(int idNum, int exprYr, 
			String gender, int age, String name, int minAge){
		super(gender, age, name, minAge);
		this.idNum = idNum;
		this.exprYr = exprYr;
		System.out.println("Your code entered Car's extended Constructor");
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public int getExprYr() {
		return exprYr;
	}

	public void setExprYr(int exprYr) {
		this.exprYr = exprYr;
	}

}
