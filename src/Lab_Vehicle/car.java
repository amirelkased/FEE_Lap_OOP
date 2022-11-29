package Lab_Vehicle;

public class car extends vehicle {
    private int model;

    public car(int model, int pro_year, String color, String brand) {
        super(pro_year, color, brand);
        this.model = model;
    }

    public int getModel() {
        return model;
    }
}
