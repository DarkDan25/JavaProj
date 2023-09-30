package Practice_4_1_abstract;

public class Car extends Vehicle{
    float cost;
    float BillRoadCost = 0;
    int countOfBill = 0;
    public Car(int distance, float speed) {
        super(distance,speed);
    }
    @Override
    void CostOfRoad() {
        cost = (getDistance() * getSpeed()) + (countOfBill * BillRoadCost);
        System.out.println(cost);
    }
    public void setCountOfBill(int countOfBill) {
        this.countOfBill = countOfBill;
    }
}
