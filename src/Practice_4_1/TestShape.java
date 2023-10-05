package Practice_4_1;
public class TestShape {

    public static void main(String[] args) {
        Shape sh1 = new Circle(3);
        Shape sh2 = new Square(4);
        Shape sh3 = new Rectangle(3,2);
        System.out.println(sh1);
        System.out.println(sh2);
        System.out.println(sh3);
    }
}
