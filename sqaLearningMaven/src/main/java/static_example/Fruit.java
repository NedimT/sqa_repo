package static_example;

public class Fruit {
    public String name;
    public String taste;
    public String color;

    public Fruit(){
    	name = "apple";
    	taste = "sweet";
    	color = "red";
    }
    public Fruit(String name){
    	this(name,null,null);
    	
    }
    public Fruit(String name, String taste){
    	this(name,taste,null);
    	this.name = name;
    	this.taste = taste;
    }
    public Fruit(String name, String taste, String color){
    	    	//this(name,taste,color);
    	this.name = name;
    	this.taste = taste;
    	this.color = color;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
