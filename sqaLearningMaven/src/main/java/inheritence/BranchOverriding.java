package inheritence;

public class BranchOverriding extends Bank {
	public int timing;
	
	public BranchOverriding(){
		
	}
    public BranchOverriding(int timing, String address, int totalEmployees){
    	super(address, totalEmployees);
    	this.timing = timing;
    }
    
    public int getTiming() {
		return timing;
	}
	public void setTiming(int timing) {
		this.timing = timing;
	}
	@Override
    public void withdrawMoney(int withdrawAmount){
    	System.out.println("printing from withdrawMoney from branch override");
    	
    }
}
