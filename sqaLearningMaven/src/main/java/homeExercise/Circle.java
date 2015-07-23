package homeExercise;

public class Circle extends Shape {
	public  double radius;
	public Circle(String name){
		super(name);
	}
	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}
	
	//public double getArea(double radius){
	public double getArea(){
    	double area =0;
    	area = radius*radius*3.14;
    	System.out.println(" circle area is "+area);
    	return area;
    	
    }
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	

}
