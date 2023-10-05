package Practice_4_1_abstract;

public class Car extends Vehicle{
    double cost; //Full cost of trip
    double costPerKM = 2; //How much will cost riding through whole road
    double BillRoadCost = 3;//How much cost to pass through special post
    int countOfBill = 0; //Amount of passed special posts
    public Car(double distance, double speed) {
        super(distance,speed);
    }
    @Override //Calculate whole cost of the trip
    void CostOfRoad() {
        cost = (getDistance() * costPerKM) + (countOfBill * BillRoadCost);
        System.out.println("Trip by car costs "+cost);
    }

    @Override
    void timeOfTrip() {
        System.out.println("Your trip by car lasts "+ getDistance()/getSpeed() + " hours");
    }

    public void setCountOfBill(int countOfBill) {
        this.countOfBill = countOfBill;
    }

    public void setBillRoadCost(double billRoadCost) {
        BillRoadCost = billRoadCost;
    }

    public void setCostPerKM(double costPerKM) {
        this.costPerKM = costPerKM;
    }
}
