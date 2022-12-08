package Sheet_6.Problem_1.MyOnlineShop;

public class Main {
    public static void main(String[] args) {
        product[] array = new product[5];
        for (int i = 0; i < 5; i++) {
            array[i] = new ChildrenBook();
        }
        int i = 1;
        for (product it : array) {
            it.price = i;
            // simple hashing value
            i = (i * 2) + 5;
        }
        for (product it : array) {
            System.out.printf("%d -> ", it.price);
        }
    }
}
