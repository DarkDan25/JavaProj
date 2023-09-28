package Practice_4_1_abstract;

public class Car extends Vehicle{
    double speed;

    public Car(int distance, double speed) {
        super(distance);
        this.speed = speed;
    }
}
