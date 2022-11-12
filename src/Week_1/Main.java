package Week_1;

import java.util.Scanner;

class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of your project 1 or 2 : ");
        int projectNum = scanner.nextInt();
        Menu.choiceProject(projectNum);
    }
}