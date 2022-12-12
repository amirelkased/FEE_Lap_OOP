package Sheet_6.Problem_3;

public class Main {
    public static void main(String[] args) {
        Book[] cartoon = new Book[3];
        for (int i = 0; i < cartoon.length; i++) {
            cartoon[i] = new Cartoon();
        }
        for (int i = 0; i < cartoon.length; i++) {
            System.out.printf("The obj%d : have default prices is %d%n", i, Book.price);
        }
    }
}

class Cartoon implements Book {
    public Cartoon() {
    }
}
