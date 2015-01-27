package inheritence;

public interface FlyingObject {
    int maxSpeed =400;
    int maxAltitude = 20000;
    
    void takeOff();
    int land();
    int flyHigh();
    int currentAltitude();
    int getCapacity();
    public String getType();
}
