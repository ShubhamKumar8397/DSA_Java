package Sorting;

public class Day6_QuickSort {

    static void swap(int[] arr, int st, int end) {
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    static int partitionAndArrangePivot(int[] arr, int st, int end) {
        
        int pivot = arr[st];
        int count = 0;

        // find the elements less than pivot 
        // in this = can do count the pivot element so find pivot index subtract 1 from this
        for (int i = st; i <= end; i++) {
            if (arr[i] <= pivot)  count++;

        }

        // find pivot index
        int pivotIndex = st + count - 1;

        // place the pivot element to correct place swap with pivot index
        swap(arr, st, pivotIndex);

        // arrange the elements before pivot small and after pivot greater

        int i = st;
        int j = end;

        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // return pivot index so next partition happen
        return pivotIndex;
    }

    static void quickSort(int[] arr, int st, int end) {
        if (st >= end)
            return;
        int pivotIndex = partitionAndArrangePivot(arr, st, end);
        quickSort(arr, st, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 5, 4, 1, 7, 8 };
        quickSort(arr, 0, arr.length - 1);

        System.out.println();
        for(int i : arr){
            System.out.print(i+  " ");
        }
    }
}
