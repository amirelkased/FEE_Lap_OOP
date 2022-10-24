package Week_1;

import java.util.Scanner;

public class CombinationAndPermutation {
    static Scanner scanner = new Scanner(System.in);
    private static int n;
    private static int r;

    public static void entryPoint() {
        System.out.println("Enter n value : ");
        setN();
        System.out.println("%nEnter r value : ");
        setR();
        System.out.printf("%nThe nCr value is : %d%n", calculate_nCr());
        System.out.printf("The nPr value is : %d%n", calculate_nPr());
    }

    public static void setN() {
        CombinationAndPermutation.n = scanner.nextInt();
    }

    public static void setR() {
        CombinationAndPermutation.r = scanner.nextInt();
    }

    private static long calculate_nCr() {
        long n_factorial = factorial(n);
        long r_factorial = factorial(r);
        long nr_factorial = factorial(n - r);
        return n_factorial / (r_factorial * nr_factorial);
    }

    private static long calculate_nPr() {
        long n_factorial = factorial(n);
        long nr_factorial = factorial(n - r);
        return n_factorial / nr_factorial;
    }

    private static long factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

}
