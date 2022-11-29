package Lab_Circle_Cylinder;

public class cylinder extends circle {
    private int height;

    public cylinder(double radius, int height) {
        super(radius);
        this.height = height;
    }

    public double areaCylinder() {
        return 2 * areaCircle() + (2 * Math.PI * getRadius() * height);
    }
}
