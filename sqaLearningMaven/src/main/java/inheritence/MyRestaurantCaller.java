package inheritence;

public class MyRestaurantCaller {
	public static void main(String args[]){
		//MyRestaurant obj= new MyRestaurant();
		IBusiness obj = new MyRestaurant();
		System.out.println(" MyRestaurant contact "+ obj.getContactInfo()+
				" capacity of "+obj.getCapacity()+
				" open status is "+ obj.isOpen());
		
	}

}
