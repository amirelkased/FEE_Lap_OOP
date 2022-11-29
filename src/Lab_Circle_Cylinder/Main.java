package Lab_Circle_Cylinder;

public class Main {
    public static void main(String[] args) {
        circle obj = new circle(4);
        System.out.printf("The area of Circle %.2f%n", obj.areaCircle());

        cylinder obj2 = new cylinder(4, 5);
        System.out.printf("The area of Cylinder %.2f%n", obj2.areaCylinder());
    }
}
