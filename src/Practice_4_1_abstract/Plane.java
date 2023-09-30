package Practice_4_1_abstract;

public class Plane extends Vehicle{
    double cost;
    double costOfTakeoff,costOfLanding = 10; //How much cost takeoff and landing
    double costPerKm = 6;
    public Plane(double distance, double speed) {
        super(distance, speed);
    }

    @Override
    void CostOfRoad() {
        cost = getDistance()*costPerKm + costOfLanding + costOfTakeoff;
        System.out.println("Trip by plane costs "+cost);
    }

    @Override
    void timeOfTrip() {
        System.out.println("Your trip by plane lasts "+ getDistance()/getSpeed() + " hours");
    }
}
