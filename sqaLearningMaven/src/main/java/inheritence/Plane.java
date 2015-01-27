package inheritence;

public class Plane implements FlyingObject {
    int currentAlt = 0;
    public int flyHigh(){
    	currentAlt += 400;
    	return currentAlt;
    	   	
    }
    public int land(){
    	currentAlt -= 400;
    	return currentAlt;
    }
    public String getType() {
    	return "Plane";
    }
    public int currentAltitude(){
    	return currentAlt;
    }
    public int getCapacity(){
    	return 8;
    }
    public void takeOff() {
    	System.out.println("taking off");
    }
}
