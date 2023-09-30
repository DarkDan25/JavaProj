package Practice_4_1_abstract;

public abstract class Vehicle {
    public int distance;
    public float speed;

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

    public float getSpeed() {
        return speed;
    }
}
