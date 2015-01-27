package inheritence;

public abstract class RestaurantAbstract implements IBusiness {
	public boolean isOpen(){
		return false;
	}
	public int getCapacity(){
		return 8;
	}
    public  abstract String getContactInfo();
}
