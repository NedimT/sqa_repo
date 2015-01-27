package inheritence;

public class Branch extends Bank {
    public int timing;
    
    public Branch(){
    	
    }
    public Branch(int timing, String address, int totalEmployees){
    	super(address, totalEmployees);
    	this.timing = timing;
    }
	public int getTiming() {
		return timing;
	}
	public void setTiming(int timing) {
		this.timing = timing;
	}
}
