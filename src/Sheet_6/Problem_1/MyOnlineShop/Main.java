package Sheet_6.Problem_1.MyOnlineShop;

public class Main {
    public static void main(String[] args) {
        Product[] array = new Product[5];
        for (int i = 0; i < 5; i++) {
            array[i] = new ChildrenBook();
        }
        int i = 1;
        for (Product it : array) {
            it.price = i;
            // simple hashing value
            i = (i * 2) + 5;
        }
        for (Product it : array) {
            System.out.printf("%d -> ", it.price);
        }
    }
}
