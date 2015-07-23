package classExercise;

public class FlowerComparison {
	 public static void main(String args[]){
	        FlowerEquals f1= new FlowerEquals("Rose","red","Summer");
	        FlowerEquals f2= new FlowerEquals("Rose","white","Summer");
	        FlowerEquals f3= new FlowerEquals("Rose","yellow","Summer");
	        FlowerEquals f4= new FlowerEquals("Rose","red","Summer");
	        FlowerEquals f5= new FlowerEquals("Lotus","white","Summer");
	        System.out.println("1 = 2 : "+ f1.equals(f2));
	        System.out.println("1 = 3 : "+ f1.equals(f3));
	        System.out.println("1 = 4 : "+ f1.equals(f4));
	        System.out.println("1 = 5 : "+ f1.equals(f5));
	        System.out.println("2 = 3 : "+ f2.equals(f3));
	        System.out.println("2 = 4 : "+ f2.equals(f4));
	        System.out.println("2 = 5 : "+ f2.equals(f5));
	        System.out.println("3 = 4 : "+ f3.equals(f4));
	        System.out.println("3 = 5 : "+ f3.equals(f5));
	        System.out.println("4 = 5 : "+ f4.equals(f5));
	    }
}
