package Practice_4_1_abstract;

public class Ship extends Vehicle{
    double cost;
    double costByKm = 7;
    double costByDay = 3;
    int days = 1;//Counts how many days trip goes
    public Ship(double distance, double speed) {
        super(distance,speed);
    }

    @Override
    void CostOfRoad() {
        cost = getDistance()*costByKm + days*costByDay;
        System.out.println("Trip by ship costs "+cost);
    }

    @Override
    void timeOfTrip() {

    }

    public void setDays(int days) {
        this.days = days;
    }
}
