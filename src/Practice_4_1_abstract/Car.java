package Practice_4_1_abstract;

public class Car extends Vehicle{
    double cost;
    double costPerKM;
    double BillRoadCost = 0;
    int countOfBill = 0;
    public Car(int distance, float speed) {
        super(distance,speed);
    }
    @Override
    void CostOfRoad() {
        cost = (getDistance() * costPerKM) + (countOfBill * BillRoadCost);
        System.out.println(cost);
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
