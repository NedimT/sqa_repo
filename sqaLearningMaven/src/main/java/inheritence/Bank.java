package inheritence;

public class Bank {
    private String address;
    private int totalEmployees;
    
    public Bank(){
    
    }
    public Bank(String address, int totalEmployees){
    	this.address = address;
    	this.totalEmployees = totalEmployees;
    }
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTotalEmployees() {
		return totalEmployees;
	}
	public void setTotalEmployees(int totalEmployees) {
		this.totalEmployees = totalEmployees;
	}
    public   void makeDeposit(int depAmount){
    	System.out.println("printing from Bank for making deposit");
    }
    public void withdrawMoney(int withdrawAmount){
    	System.out.println("printing from Bank for withdraw money");
    }
}
