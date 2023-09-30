package Practice_4_1_abstract;

public class Plane extends Vehicle{
    double cost;
    public Plane(int distance, float speed) {
        super(distance, speed);
    }

    @Override
    void CostOfRoad() {
        cost = getDistance()*getSpeed();
    }
}
