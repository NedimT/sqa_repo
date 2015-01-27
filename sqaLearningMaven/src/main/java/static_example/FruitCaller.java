package static_example;

public class FruitCaller {
	public static void main(String args[]){
		Fruit obj0 = new Fruit();
		Fruit obj1 = new Fruit("mango","fruity","yellow");
		Fruit obj2 = new Fruit("tangerine","sweet");
		Fruit obj3 = new Fruit("orange");
		
		System.out.println("obj0 fruit name is "+obj0.getName()+
				" taste is "+obj0.getTaste()+
				" and color is "+obj0.getColor());
		System.out.println("obj1 fruit name is "+obj1.getName()+
				" taste is "+obj1.getTaste()+
						" and color is "+obj1.getColor());
		System.out.println("obj2 fruit name is "+obj2.getName()+
				" taste is "+obj2.getTaste()+
						" and color is "+obj2.getColor());
		System.out.println("obj3 fruit name is "+ obj3.getName()+
				" taste is "+obj3.getTaste()+
	                    " and color is " + obj3.getColor());
	}
}
