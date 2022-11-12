package Week_2;

import java.util.Scanner;

public class transposition {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] numbers = new int[n][m];
        takeInput(numbers, n, m);
        transposition2D(numbers);
    }

    private static void takeInput(int[][] array, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    private static void transposition2D(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = array.length - 1; j > -1; j--) {
                System.out.printf("%d ", array[j][i]);
            }
            System.out.println();
        }
    }
}
