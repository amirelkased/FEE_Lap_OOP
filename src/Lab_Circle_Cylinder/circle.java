package Lab_Circle_Cylinder;

public class circle {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double areaCircle() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
