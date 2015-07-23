package classObject;

public class Vehicle {
	private String color;
    private String make;
    private int model;
    
    //public static  void Vehicle(String color, String make, int model) {
    Vehicle() { 	
    	color = "blue";
    	make = "VW";
    	model = 2015;
    }
    public static void main(String args[]){
    	Vehicle vehicleObject = new Vehicle();
    	System.out.println("Vehicle default color is : "+vehicleObject.color);
    	System.out.println("Vehicle default make is : "+vehicleObject.make);
    	System.out.println("Vehicle default model is  :"+vehicleObject.model);
    	vehicleObject.color = "red";
    	vehicleObject.make = "toyota";
    	vehicleObject.model = 2011;
    	System.out.println("Vehicle color is : "+vehicleObject.getColor());
    	System.out.println("Vehicle make is : "+vehicleObject.getMake());
    	System.out.println("Vehicle model is  :"+vehicleObject.getModel());
    }
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
}
