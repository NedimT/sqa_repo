package inheritence;

public class CarCaller {
	public static void main(String args[]){
		//Car myCar1 = new Car();
		Car myCar1 = new Car(5,true,20,"blue","Nisan");
		//Getting the properties from Car class.
		int myCap = myCar1.getEngineCap();
		boolean isFrWheel = myCar1.isFourWheel();
		
		//Getting the properties from super class. vechile
		String color = myCar1.getColor();
		String model = myCar1.getModel();
		int maxSpeed = myCar1.getMaxSpeed();
		
		System.out.println("color is : "+color+", model is : "+model
				+ " and engineCap is : "+myCap);		
	}
}
