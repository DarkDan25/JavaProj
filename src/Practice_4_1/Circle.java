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
    public String getPerimeter() {
        return "Circle perimeter is " + Math.PI*2*radius;
    }

    @Override
    public String getArea() {
        return "Circle area is " + Math.pow(radius,2)*Math.PI;
    }
}
