package inheritence;

public class GNexus implements CellPhone {
	int maxBatteryLife = 500;
	public int playGame(){
		maxBatteryLife -= 40;	
		return(maxBatteryLife);
	}
	public int playMovie(){
		maxBatteryLife -= 20;
		return(maxBatteryLife);
	}
		

}
