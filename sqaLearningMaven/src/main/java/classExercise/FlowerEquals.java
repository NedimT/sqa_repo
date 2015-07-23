package classExercise;

public class FlowerEquals {
	 /*
     * Create a class “FlowerEquals” with properties:
     * Name
     * Color
     *  Season
     * Overloaded constructor that takes “name”, “color” and “season” as parameter
     * Write the getter and setters of these properties.
     * Generate “equals” and “hashcode” method using Name and Color properties.
     * Write a differentClass “FlowerComparision” and define a main method in it.
     * In method create 5 obejcts of FlowerEquals.
     *  1 - Rose, Red, Summer
     *  2- Rose, White, Summer
     *  3- Rose, Yellow, Summer
     *  4- Rose, Red, Summer
     *  5 - Lotus, white, Summer.
     * Compare objects 1 and 2, 1 and 3, 1 and 4, 1 and 5, 2 and 3, 2 and 4,
     * 2 and 5, 3 and 4, 3 and 5, 4 and 5.
     */
 
    private String name;
    private String color;
    private String season;
 
 
    public FlowerEquals(){}
 
    //Overload constructor
    public FlowerEquals(String name, String color, String season){
        this.name = name;
        this.color = color;
        this.season = season;
    }
 
    //“equals” and “hashcode” method using Name and Color
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FlowerEquals other = (FlowerEquals) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
 
    //Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }
}
