package Practice_4_1_abstract;

public abstract class Vehicle {
    protected int distance;
    protected double speed;
    abstract void CostOfRoad();
    public Vehicle(int distance, float speed) {
        this.distance = distance;
        this.speed = speed;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public int getDistance() {
        return distance;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public double getSpeed() {
        return speed;
    }
}
