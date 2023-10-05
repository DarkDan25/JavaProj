package Practice_4_1_abstract;

public abstract class Vehicle {
    protected double distance;
    protected double speed;
    abstract void CostOfRoad();
    abstract void timeOfTrip();
    public Vehicle(double distance, double speed) {
        this.distance = distance;
        this.speed = speed;
    }
    public double getDistance() {
        return distance;
    }
    public double getSpeed() {
        return speed;
    }
}
