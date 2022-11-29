package Lab_Vehicle;

public class vehicle {
    private int production_year;
    private String color;
    private String brand;

    public vehicle(int production_year) {
        this.production_year = production_year;
    }

    public vehicle(int pro_year, String color, String brand) {
        this(pro_year);
        this.brand = brand;
        this.color = color;
    }

    public int getProduction_year() {
        return production_year;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
