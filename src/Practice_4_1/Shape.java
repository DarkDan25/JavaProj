package Practice_4_1;

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
    public Shape() {
    }
    @Override
    public String toString() {
        return "Your shape is ";
    }
}
