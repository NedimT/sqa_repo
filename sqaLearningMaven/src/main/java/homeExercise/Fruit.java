package homeExercise;

public class Fruit {
    public String name;
    public String taste;
    final static String originCountry = "USA";
    
    public Fruit(){
    	
    }
    public final String getSource(){
    	System.out.println("in Fruit getSource()");
    	return originCountry;
    }
    public String getWeight(){
    	System.out.println("in Fruit getWeight()");
    	return "2 lbs";
    }
    
}
