package Sorting;

public class Day3_InsertionSort {

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 6, 2, 1, 8 };
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

// In insertion sort Time Complexity is - O(n^2)