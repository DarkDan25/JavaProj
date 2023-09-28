package Practice_4_1;

public class Circle extends Shape {
    public String name = "Circle";
    int radius;
    public Circle(int radius) {
        super();
        this.radius = radius;
    }
    @Override
    public String getType() {
        return name;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
    @Override
    public double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return (super.toString() + getType() + "\nIt's area is " + getArea() + "\nIt's perimeter is " + getPerimeter());
    }
}
