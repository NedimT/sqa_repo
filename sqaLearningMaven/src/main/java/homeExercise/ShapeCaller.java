package homeExercise;

public class ShapeCaller {
	public static void main(String args[]){
		double areaCirc = 0;
		double areaTri = 0;
		Shape circle = new Circle("circle", 3.4);
		Shape triangle = new Triangle("triangle",3.5,2);
		//circle data
		
		System.out.println("Area of "+circle.getName()+ "= "+circle.getArea());
		System.out.println("Area of "+triangle.getName()+ "= "+triangle.getArea());
				
		
	}

}
