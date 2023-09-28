package Practice_4_1;
import java.util.Scanner;
public class TestShape {

    public static void main(String[] args) {
        Shape sh1 = new Circle(3);
        Shape sh2 = new Square();
        Shape sh3 = new Rectangle(3,2);
        System.out.println(sh1.toString());
        System.out.println(sh3.toString());
    }
}
