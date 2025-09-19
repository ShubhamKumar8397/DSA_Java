package Sorting;

public class Day1_BubbleSort {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] swapArrayElements(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }

    // Question - 1 // Sorting Algorithm 
    // Sort Array in Increasing Order 
    // hint - compare adjacent elements if smaller than swap
    static int[] sortIncreasing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapArrayElements(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 3, 2, 8, 9 };
        sortIncreasing(arr);
        printArray(arr);
    }
}


// In Bubble sort Time Complexity is - O(n^2)
// if we use flag variable that any swaps happens
// then the best case complexity is - o(n) - linear
