package Lab_Vehicle;

public class bus extends vehicle {
    private int no_of_sets;

    public bus(int no_of_sets, int pro_year, String brand, String color) {
        super(pro_year, color, brand);
        this.no_of_sets = no_of_sets;
    }

    public int getNo_of_sets() {
        return no_of_sets;
    }
}
