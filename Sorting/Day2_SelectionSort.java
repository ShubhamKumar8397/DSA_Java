package Sorting;

public class Day2_SelectionSort {

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 1,9 };
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
