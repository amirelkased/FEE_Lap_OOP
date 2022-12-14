package Sheet_6.Problem_2;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "The radius = " + super.getRadius()
                + " | The color = " + super.getColor()
                + " | The Height = " + getHeight();
    }

    public double getVolume() {
        return super.getArea() * getHeight();
    }
}
