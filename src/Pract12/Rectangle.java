package Pract12;

public class Rectangle extends Shape {
    String name = "Rectangle";
    double a;
    double b;

    public Rectangle(double a, double b, double posX, double posY) {
        super(posX,posY);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String getType() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString() + getType() + "\nIt's area is " + getArea()+"\nit's perimeter "+getPerimeter();
    }
}
