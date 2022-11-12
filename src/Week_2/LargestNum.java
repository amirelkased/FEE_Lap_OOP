package Week_2;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNum {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = scanner.nextInt();
        int[] array = new int[size];
        takeInput(array);
        findLargestNum(array);
    }

    private static void takeInput(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    private static void findLargestNum(int[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }
}
