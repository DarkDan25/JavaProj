package Pract12;

public class Shape {
    public String getType()
    {
        return "Shape";
    }
    public double getPerimeter()
    {
        return 0;
    }
    public double getArea()
    {
        return 0;
    }
    public double posX;
    public double posY;
    public Shape(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }
    @Override
    public String toString() {
        return "Your shape is ";
    }
}
