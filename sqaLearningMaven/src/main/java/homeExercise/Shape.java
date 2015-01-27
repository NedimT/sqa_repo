package homeExercise;

public  abstract class Shape {
    public String name;
    public Shape(String name){
    	this.name = name;
    }
    public abstract double getArea();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
