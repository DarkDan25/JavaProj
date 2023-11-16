package Pract12;

public class Square extends Shape {
    String name = "Square";
    int a;
    public Square(int a,double posX, double posY) {
        super(posX, posY);
        this.a=a;
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }

    @Override
    public String getType() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.pow(a,2);
    }

    @Override
    public String toString() {
        return (super.toString()+ getType() + "\nIt's area is "+ getArea()+ "\nIt's perimeter is "+getPerimeter());
    }
}
