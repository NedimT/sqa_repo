package homeExercise;

public class Apple extends Fruit {
	public Apple() {
		
	}
	
	public String getWeight() {
		System.out.println(" printing from Apple getWeight");
		return "8 lbs";
		
	}
	@Override
	public String getSource() {
		System.out.println(" printing from Apple getSource");
		return "  ";
		
	}
	
}
