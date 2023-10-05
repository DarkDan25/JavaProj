package Practice_4_1_abstract;

public class Train extends Vehicle{
    double cost;
    double costPerKm = 5;
    double costOfStop = 2;
    double timeOfStops = 0.2; //Hours
    int numOfStops = 0;
    public Train(double distance, double speed) {
        super(distance,speed);
    }

    @Override
    void CostOfRoad() {
        cost = getDistance()*costPerKm + costOfStop*numOfStops;
        System.out.println("Trip by train costs "+cost);
    }

    @Override
    void timeOfTrip() {
        System.out.println("Your trip by train lasts "+ (getDistance()/getSpeed()+timeOfStops*numOfStops) + " hours");
    }

    public void setNumOfStops(int numOfStops) {
        this.numOfStops = numOfStops;
    }
}
