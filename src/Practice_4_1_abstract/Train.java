package Practice_4_1_abstract;

public class Train extends Vehicle{
    double speed;

    public Train(int distance, double speed) {
        super(distance);
        this.speed = speed;
    }
}
