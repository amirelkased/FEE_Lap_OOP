package Week_3;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = scanner.nextInt();
        int[] arr = new int[size];
        takeInput(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void takeInput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int pivot = partition(arr, l, r);
        quickSort(arr, l, pivot);
        quickSort(arr, pivot + 1, r);
    }

    private static int partition(int[] arr, int st, int end) { //o(n)
        int pivot = arr[st];
        int i = st;
        int j = end;
        while (i < j) {
            do {
                ++i;
            }
            while (arr[i] <= pivot);
            while (arr[j] > pivot) {
                --j;
            }
            if (i < j) swap(arr, i, j);
        }
        swap(arr, st, j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
