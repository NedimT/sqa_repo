package inheritence;

public class OperateFlight {
	
    public static void main(String args[]){
    	
    	FlyingObject chopper = new Chopper();
    	FlyingObject plane = new Plane();
    	FlyingObject[] flightArr = new FlyingObject[]{chopper, plane};
    	flight(flightArr);
    }
    public static void flight(FlyingObject[] flightArr){
    	
    	for(FlyingObject type:flightArr){
    		int minutesFly = 1;
        	int minutesLand = 0;
    		while(type.flyHigh() <= 20000){
    			System.out.println("Taking off in "+type.getType()+
    					"current altitude is "+type.currentAltitude()+" at "+
    					(minutesFly++)+" minutes");
    			
    		}
    		while(type.land() >= 0){
    			System.out.println("landing off in "+type.getType()+
    					"current altitude is "+type.currentAltitude()+" at "+
    					(minutesLand++)+" minutes");
    		
    		}
    	}
    }
}
