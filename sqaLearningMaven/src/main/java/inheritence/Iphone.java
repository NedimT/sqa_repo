package inheritence;

public class Iphone implements CellPhone  {
	int maxBatteryLife = 500;
	public int playGame(){
	    maxBatteryLife -= 50;
	    return(maxBatteryLife);
	}
	public int playMovie(){
		maxBatteryLife -= 30;
		return(maxBatteryLife);
	}
	
	
	

}
