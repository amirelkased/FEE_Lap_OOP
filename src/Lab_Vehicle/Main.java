package Lab_Vehicle;

public class Main {
    public static void main(String[] args) {
        bus Bus = new bus(14,2015,"KIA","Yellow");
        System.out.println("Production year = "+Bus.getProduction_year());
        car Car = new car(2016,2020,"Red","Honidi");
        System.out.println("colour = "+Car.getColor());
    }
}
