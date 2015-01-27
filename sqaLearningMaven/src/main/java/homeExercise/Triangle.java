package homeExercise;

public class Triangle extends Shape {
	public double height;
	public double width;	
	public Triangle(String name){
		super(name);
	
	}
	public Triangle(String name, double height, double width){
		super(name);
		this.height = height;
		this.width = width;
	}
	
    public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea(){
    	double area =0;
    	area = getHeight()*getWidth()/2;
    	System.out.println(" Triangle area is "+area);
    	return area;
    	
    }
}
