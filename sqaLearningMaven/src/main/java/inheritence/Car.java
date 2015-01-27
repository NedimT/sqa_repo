package inheritence;

public class Car extends Vehicle{
	private int engineCap;
	private boolean isFourWheel;	
	
	public Car(){		
		System.out.println("This is from Car");
		this.engineCap = 3;
	}
	
	public Car(int engineCap, boolean isFourWheel, int maxSpeed, 
			String color, String model){
		//Calling the parent class constructor
		super(maxSpeed, color, model);		
		this.engineCap = engineCap;
		this.isFourWheel = isFourWheel;
		System.out.println("This is from Car overloaded");
	}		
	
	public int getEngineCap() {
		return engineCap;		
	}
	public void setEngineCap(int engineCap) {
		this.engineCap = engineCap;
	}
	public boolean isFourWheel() {
		return isFourWheel;
	}
	public void setFourWheel(boolean isFourWheel) {
		this.isFourWheel = isFourWheel;
	}
}
